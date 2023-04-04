package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Dashboard_StepsDefs {
    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginPage=new LoginPage();
    @Then("Validate all tabs are on the page")
    public void validateAllTabsAreOnThePage(List<String> tabNames) {
        List<String>expected=tabNames;
        List<String>actual= BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expected,actual);


    }

    @Then("Enter credentials and validate that user is on the home page")
    public void enterCredentialsAndValidateThatUserIsOnTheHomePage(Map<String,String>map) {
        loginPage.login(
                map.get("userEmail"),
                map.get("password")
        );
String expected=map.get("name");
String actual= loginPage.getAccountName();
Assert.assertEquals(expected,actual);

    }
    @Then("Verify that {string} is visible on the dashboard")
    public void verifyThatIsVisibleOnTheDashboard(String name) {
        String expectedName=name;
        String actualName=dashboardPage.getAccountName();
        Assert.assertEquals(expectedName,actualName);

    }

    @And("Go to {string} and {string}")
    public void goToAnd(String tab, String module) {
        dashboardPage.navigateToModule2(tab,module);
    }

    @Then("Verify that {string} and {string} and {string}")
    public void verifyThatAndAnd(String str, String str1, String str2) {
        String expected1=str;
        String expected2=str1;
        String expected3=str2;
        String actual1=dashboardPage.firstTitle.getText();
        String actual2=dashboardPage.secondTitle.getText();
        String actual3=dashboardPage.thirdTitle.getText();
        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);


    }
}
