package com.selenium.practice;

import org.testng.Assert;

import com.selenium.practice.Pages.LoginPage;

public class TaskOne {
    public static void main(String[] args) {

        CommonMethods.launchChrome(Constants.URL);
        LoginPage loginPage = new LoginPage();
        loginPage.userNameTexBox.sendKeys(Constants.USERNAME);
        loginPage.passwordTexBox.sendKeys(Constants.PASSWORD);
        String actualSignInButtonText = loginPage.signInButton.getText();
        System.out.println(actualSignInButtonText);
        String actualForgotPasswordLinkText = loginPage.forgotPasswordLink.getText();
        System.out.println(actualForgotPasswordLinkText);

        try {
            Assert.assertEquals(actualSignInButtonText, "sign In", "--- VERIFYING SIGN IN BUTTON TEXT ---");
        } catch (AssertionError e) {
            e.printStackTrace();
        }
        System.out.println("I AM TESTING");

        Assert.assertEquals(actualForgotPasswordLinkText, "Forgot Password?");

        boolean isSignInButtonDisplayed = loginPage.signInButton.isDisplayed();
        System.out.println(isSignInButtonDisplayed);
        Assert.assertTrue(isSignInButtonDisplayed);

        String actualTitle = CommonMethods.driver.getTitle();
        Assert.assertEquals(actualTitle, "Chroma Hospital");

    }
}