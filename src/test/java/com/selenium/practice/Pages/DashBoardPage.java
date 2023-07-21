package com.selenium.practice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.practice.CommonMethods;

public class DashBoardPage {
    
    @FindBy(xpath = "//span[text()=' IPD - In Patient']")
    public WebElement ipdInPatientLink;


    public DashBoardPage(){
        PageFactory.initElements(CommonMethods.driver, this);
    }
}
