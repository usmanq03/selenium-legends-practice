package com.selenium.practice.Pages;

import com.selenium.practice.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    /** USERNAME TEXT BOX */
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTexBox;

    /** PASSWORD TEXT BOX */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTexBox;

    /** SIGN IN BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    /** FORGOT PASSWORD LINK */
    @FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
    public WebElement forgotPasswordLink;

    public LoginPage() {
        PageFactory.initElements(CommonMethods.driver, this);
    }
}
