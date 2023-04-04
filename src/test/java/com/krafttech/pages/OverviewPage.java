package com.krafttech.pages;


import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{
@FindBy(xpath ="//div[@role='alert']")
    public WebElement helperText;
@FindBy(xpath = "//h5[.='About']")
public WebElement aboutText;
public String addedEducationName(String schoolName){
    return Driver.get().findElement(By.xpath("//span[text()='"+schoolName+"']")).getText();
}

@FindBy(xpath = "//span[text()='Krafttech']")
public WebElement schoolname;
public String getHelperTextString(){
    return helperText.getText();
}
public String getaboutText(){
    return aboutText.getText();
}

    public WebElement getSchoolname(String schoolName) {

        return Driver.get().findElement(By.xpath("//span[text()='"+schoolName+"']"));
    }

    public void schoolDelete(){
   BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//a[@data-id='485']")));
}
}
