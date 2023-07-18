package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        WebElement hamburgerMenu = driver.findElement(By.xpath("(//button[@class='uicore-toggle uicore-ham'])[1]"));

        hamburgerMenu.click();

        driver.switchTo().defaultContent();
    }
    
}
