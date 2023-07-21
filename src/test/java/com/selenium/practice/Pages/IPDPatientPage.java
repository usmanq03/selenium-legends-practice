package com.selenium.practice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.practice.CommonMethods;

public class IPDPatientPage {

    /** ADD PATIENT LINK */
    @FindBy(xpath = "//*[text()='  Add Patient']")
    public WebElement addPatientLink;

    /** NEW PATIENT LINK */
    @FindBy(xpath = "//*[text()='New Patient']")
    public WebElement newPatientLink;

    /** ADD PATIENT MODULE TEXT */
    @FindBy(xpath = "//*[text()='Add Patient']")
    public WebElement addPatientModuleText;

    /** NAME TEXT BOX */
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextBox;

    /** GUARDIAN NAME TEXT BOX */
    @FindBy(xpath = "(//input[@name='guardian_name'])[2]")
    public WebElement guardianNameTextBox;

    /** PHONE NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@id='number']")
    public WebElement phoneNumberTextBox;

    /** EMAIL TEXT BOX */
    @FindBy(xpath = "//input[@id='addformemail']")
    public WebElement emailTextBox;

    public IPDPatientPage() {
        PageFactory.initElements(CommonMethods.driver, this);
    }
}
