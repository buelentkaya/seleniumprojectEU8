package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLogIngPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLogIngPage libraryLogIngPage;
    @BeforeMethod
    public void setUpMethod(){
        //TC #1: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/
        Driver.getDriver().get("https://library1.cydeo.com/");
        libraryLogIngPage=new LibraryLogIngPage();
    }

    @AfterMethod

    public void teardownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void required_field_error_message_test(){

        //3- Do not enter any information
        //4- Click to “Sign in” button

        libraryLogIngPage.signInButton.click();

        //5- Verify expected error is displayed:
        Assert.assertTrue(libraryLogIngPage.fieldRequiredErrorMessage.isDisplayed());
        //Expected: This field is required.

        //Driver.closeDriver();
    }


    @Test
    public void invalid_email_format_error_message_test() {


        //Enter invalid email format.

        libraryLogIngPage.inputPassword.sendKeys("somethingwrong");
        libraryLogIngPage.signInButton.click();
        //4-Verify expected error is displayed:
        //Expected:Please eneter a valid email address
        Assert.assertTrue(libraryLogIngPage.enterValidEmailErrorMessage.isDisplayed());

        //Driver.closeDriver();

    }


    @Test
    public void library_negative_login_test(){
        //3-Enter incorrect username and incoorrect password
        libraryLogIngPage.inputUsername.sendKeys("wrong@username.com");
        libraryLogIngPage.inputPassword.sendKeys("wrongpassword");

        libraryLogIngPage.signInButton.click();
        Assert.assertTrue(libraryLogIngPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

      //  Driver.closeDriver();

    }

}
