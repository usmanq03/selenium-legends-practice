package com.selenium.practice.Pages;

import org.openqa.selenium.support.PageFactory;

import com.selenium.practice.CommonMethods;

public class IPDPatientPage {
    
    public IPDPatientPage(){
        PageFactory.initElements(CommonMethods.driver, this);
    }
}
