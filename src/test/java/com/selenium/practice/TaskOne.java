package com.selenium.practice;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import com.selenium.practice.Pages.DashBoardPage;
import com.selenium.practice.Pages.IPDPatientPage;
import com.selenium.practice.Pages.LoginPage;

public class TaskOne {
    public static void main(String[] args) throws InterruptedException {

        CommonMethods.launchChrome(Constants.URL);
        LoginPage loginPage = new LoginPage();
        loginPage.userNameTexBox.sendKeys(Constants.USERNAME);
        loginPage.passwordTexBox.sendKeys(Constants.PASSWORD);
        String actualSignInButtonText = loginPage.signInButton.getText();
        System.out.println(actualSignInButtonText);
        String actualForgotPasswordLinkText = loginPage.forgotPasswordLink.getText();
        System.out.println(actualForgotPasswordLinkText);

        try {
            Assert.assertEquals(actualSignInButtonText, "sign In", "--- VERIFYING SIGN IN BUTTON TEXT ---");
        } catch (AssertionError e) {
            e.printStackTrace();
        }
        System.out.println("I AM TESTING");

        Assert.assertEquals(actualForgotPasswordLinkText, "Forgot Password?");

        boolean isSignInButtonDisplayed = loginPage.signInButton.isDisplayed();
        System.out.println(isSignInButtonDisplayed);
        Assert.assertTrue(isSignInButtonDisplayed);

        String actualTitle = CommonMethods.driver.getTitle();
        Assert.assertEquals(actualTitle, "Chroma Hospital");

        /** PART 1 of TASK 6 */
        loginPage.signInButton.click();


        /** PART 2 of TASK 6 */
        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.ipdInPatientLink.click();

        /** PART 3 of TASK 6 */
        IPDPatientPage ipdPatientPage = new IPDPatientPage();
        IPDPatientPage.dynamicTextLocator("  Add Patient").click();
        //ipdPatientPage.addPatientLink.click();

        /** PART 4 of TASK 6 */
        CommonMethods.waitForVisibilityOfElement(ipdPatientPage.newPatientLink);
        ipdPatientPage.newPatientLink.click();

        /** PART 5 OF TASK 6 */
        CommonMethods.waitForVisibilityOfElement(ipdPatientPage.addPatientModuleText);
        String actualAddPatientModuleText = ipdPatientPage.addPatientModuleText.getText();
        Assert.assertEquals(actualAddPatientModuleText, "Add Patient");

        /** PART 6 of TASK 6 */
        ipdPatientPage.nameTextBox.sendKeys("CHROMA TECH");

        /** PART 7 of TASK 6 */
        ipdPatientPage.guardianNameTextBox.sendKeys("CHROMA TECH GUARDIAN");

        /** PART 8 of TASK 6 */
        ipdPatientPage.phoneNumberTextBox.sendKeys("703-687-5816");

        /** PART 9 of TASK 6 */
        ipdPatientPage.emailTextBox.sendKeys("inquiries@chromatechacademy.com");
        Thread.sleep(2000);
        CommonMethods.driver.quit();
    }
}