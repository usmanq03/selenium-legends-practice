package com.selenium.practice.Pages;

import org.openqa.selenium.support.PageFactory;

import com.selenium.practice.CommonMethods;

public class DashBoardPage {
    
    public DashBoardPage(){
        PageFactory.initElements(CommonMethods.driver, this);
    }
}
