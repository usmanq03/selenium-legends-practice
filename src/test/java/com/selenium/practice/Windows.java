package com.selenium.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Windows {

    public static void main(String[] args) {
        CommonMethods.launchChrome("https://chroma-tech-academy.mexil.it/static_page/");

        WebElement openWindowButton = CommonMethods.driver.findElement(By.xpath("//*[contains(text(),'Open Window')]"));
        CommonMethods.scrollIntoView(openWindowButton);
        openWindowButton.click();
        CommonMethods.switchToNextWindow();
        CommonMethods.driver.close();
        CommonMethods.switchToNextWindow();
        WebElement openTabButton = CommonMethods.driver.findElement(By.xpath("//*[contains(text(),'Open Tab')]"));
        openTabButton.click();
        
        CommonMethods.driver.quit();

    }
}
