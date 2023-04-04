package com.krafttech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddExperiencePage extends BasePage{
    @FindBy(xpath = "//input[@placeholder='Job Title *']")
    public WebElement jobTitleİnput;
    @FindBy(xpath = "//input[@placeholder='Company *']")
    public WebElement companyInput;
    @FindBy(xpath = "//input[@placeholder='Location']")
    public WebElement locationInput;
    @FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
    public WebElement fromDateInput;
@FindBy(css = "#todateexp")
    public WebElement toDateInput;
@FindBy(xpath = "//textarea[@placeholder='Job Description']")
public WebElement jobDescriptionInput;
@FindBy(xpath = "//button[@value='experience']")
    public WebElement addExperienceBox;



}
