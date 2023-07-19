package com.selenium.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTexBox;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}
