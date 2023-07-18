package com.selenium.practice;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

    public static WebDriver driver;

    public static void launchChrome(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    public static void scrollIntoView(WebElement element) {
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void switchToNextWindow() {
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            CommonMethods.driver.switchTo().window(window);
        }
    }
}
