package com.selenium.practice.Pages;

import com.selenium.practice.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTexBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTexBox;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
    public WebElement forgotPasswordLink;

    public LoginPage() {
        PageFactory.initElements(CommonMethods.driver, this);
    }
}
