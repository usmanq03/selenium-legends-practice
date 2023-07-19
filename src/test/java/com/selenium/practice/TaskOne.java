package com.selenium.practice;

import org.junit.Test;
import org.openqa.selenium.By;

public class TaskOne {
    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();
        CommonMethods.launchChrome(Constants.URL);
        // loginPage.userNameTexBox.sendKeys(Constants.USERNAME);
        CommonMethods.driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Constants.USERNAME);
        CommonMethods.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Constants.PASSWORD);
        String signInButtonText = CommonMethods.driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).getText();
        System.out.println(signInButtonText);

        String forgotPasswordLink = CommonMethods.driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).getText();
        System.out.println(forgotPasswordLink);

    }
}