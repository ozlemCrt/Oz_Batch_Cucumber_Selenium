package com.krafttech.steps_defs;

import com.krafttech.pages.*;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Profile_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    OverviewPage overviewPage = new OverviewPage();
    EditProfilePage editProfilePage = new EditProfilePage();
    Actions actions = new Actions(Driver.get());
    AddEducationPage addEducationPage=new AddEducationPage();
    MyProfilePage myProfilePage=new MyProfilePage();



    @And("User should go to my profile with {string}")
    public void userShouldGoToMyProfileWith(String tabName) {
        dashboardPage.navigateToModule(tabName, "My Profile");

    }

    @And("User should navigate to {string}")
    public void userShouldNavigateTo(String tabName) {
myProfilePage.tapToTab(tabName);


    }


    @And("The user must fill in the input boxes with the texts {string} ,{string},{string},{string},{string},{string} and tap on save changes button")
    public void theUserMustFillInTheInputBoxesWithTheTextsAndTapOnSaveChangesButton(String about, String company, String job, String website, String location, String skills) {
        actions.moveToElement(editProfilePage.aboutInputBox).sendKeys(about + Keys.TAB)
                .sendKeys(company + Keys.TAB + Keys.TAB)
                .sendKeys(job + Keys.TAB)
                .sendKeys(website + Keys.TAB)
                .sendKeys(location + Keys.TAB)
                .sendKeys(skills + Keys.TAB + Keys.TAB + Keys.TAB + Keys.TAB + Keys.ENTER).perform();


    }

    @Then("User should verify the {string} message")
    public void userShouldVerifyTheMessage(String expected) {
        Assert.assertEquals(overviewPage.getHelperTextString(), expected);
    }


    @Then("User should be able to see {string} button")
    public void userShouldBeAbleToSeeButton(String buttonName) {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(addEducationPage.addEducationButton.isDisplayed());
    }

    @When("The user fill the form with followings : {string},{string},{string},{string},{string},{string}")
    public void theUserFillTheFormWithFollowings(String schoolName, String degree, String study, String fromDate, String toDate, String programDescription) {
        addEducationPage.addEducation(schoolName,degree,study,fromDate,toDate,programDescription);
    }

    @Then("The user should see added record with :{string}")
    public void theUserShouldSeeAddedRecordWith(String expectedSchoolName) {
       // BrowserUtils.waitForVisibility(addEducationPage.schoolorBootcampName,7);
        String actualSchoolName=overviewPage.getSchoolname("İTÜ").getText();
        Assert.assertEquals(expectedSchoolName,actualSchoolName);
    }

    @And("The user should be able to delete last added record with: {string}")
    public void theUserShouldBeAbleToDeleteLastAddedRecordWith(String expected) {

        BrowserUtils.scrollToElement(overviewPage.getSchoolname("İTÜ"));
        overviewPage.schoolDelete();

    }
}
