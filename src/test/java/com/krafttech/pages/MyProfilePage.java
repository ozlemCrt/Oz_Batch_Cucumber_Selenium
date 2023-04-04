package com.krafttech.pages;


import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;

public class MyProfilePage extends BasePage{
    public void tapToTab(String tab){
        Driver.get().findElement(By.xpath("//li/button[text()='"+tab+"']")).click();

    }
}
