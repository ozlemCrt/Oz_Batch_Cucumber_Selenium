package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        // System.out.println("Open browser and navigate to login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("The user enters valid credentials that belongs to Mike")
    public void the_user_enters_valid_credentials_that_belongs_to_Mike() {
        //cu   System.out.println("Enter valid credentials that belongs to Mike");
        loginPage.login();

    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        // System.out.println("Verify that user successfully logs in ");
        //String actualUserAccountName=dashboardPage.userAccountName.getText();
        Assert.assertTrue(dashboardPage.dashboardPageSubTitle.isDisplayed());


    }




    @When("The user enters valid credentials that belongs to SDET")
    public void the_user_enters_valid_credentials_that_belongs_to_SDET() {
        System.out.println("Enter valid credentials that belongs to SDET");
    }


    @When("The user enters valid credentials that belongs to Jhon")
    public void theUserEntersValidCredentialsThatBelongsToJhon() {
        loginPage.login(ConfigurationReader.get("userEmail2"),ConfigurationReader.get("password2"));
    }

    @When("The user enters valid credentials that belongs to Eddie Murphy")
    public void theUserEntersValidCredentialsThatBelongsToEddieMurphy() {
        loginPage.login(ConfigurationReader.get("userEmail3"),ConfigurationReader.get("password3"));
    }

    @When("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String email, String password) {
        loginPage.login(email,password);

    }

    @And("The user name should be {string}")
    public void theUserNameShouldBe(String expextedUserName) {
        String actualUserName = dashboardPage.userAccountName.getText();
        Assert.assertEquals(expextedUserName,actualUserName);
    }

    @When("The user enters valid credentials that belongs to Morgan Freeman")
    public void theUserEntersValidCredentialsThatBelongsToMorganFreeman() {
        loginPage.login(ConfigurationReader.get("UserEmail4"),ConfigurationReader.get("password4"));
    }

    @When("Enter credentials as {string} and {string}")
    public void enterCredentialsAsAnd(String userEmail, String password) {
        loginPage.login(userEmail,password);

    }

    }
