package com.selenium.practice;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    public static WebDriver driver;

    public static void launchChrome(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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

    public static void waitForVisibilityOfElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(CommonMethods.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
