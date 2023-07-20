package com.selenium.practice;

import com.selenium.practice.Pages.LoginPage;

public class TaskOne {
    public static void main(String[] args) {

        CommonMethods.launchChrome(Constants.URL);
        LoginPage loginPage = new LoginPage();
        loginPage.userNameTexBox.sendKeys(Constants.USERNAME);
        loginPage.passwordTexBox.sendKeys(Constants.PASSWORD);
        String signInButtonText = loginPage.signInButton.getText();
        System.out.println(signInButtonText);
        String forgotPasswordLink = loginPage.forgotPasswordLink.getText();
        System.out.println(forgotPasswordLink);

    }
}