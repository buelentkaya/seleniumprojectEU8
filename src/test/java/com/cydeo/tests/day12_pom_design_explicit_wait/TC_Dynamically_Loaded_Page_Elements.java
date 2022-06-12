package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicallyLoadedPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Dynamically_Loaded_Page_Elements {


    @Test
    public void dynamicLoad1Test(){
        //TC#5 : Dynamically Loaded Page Elements 1
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start
        DynamicallyLoadedPage dynamicallyLoadedPage=new DynamicallyLoadedPage();
        dynamicallyLoadedPage.startBtn.click();

        //3. Wait until loading bar disappears
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage.loadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicallyLoadedPage.inputUserNameBox.isDisplayed());
        //5. Enter username: tomsmith
      dynamicallyLoadedPage.inputUserNameBox.sendKeys("tomsmith");
        //6. Enter password: incorrectpassword
       dynamicallyLoadedPage.inputPassword.sendKeys("incorrectpassword");
        //7. Click to Submit button
       dynamicallyLoadedPage.submitBtn.submit();
        //8. Assert “Your password is invalid!” text is displayed.
        //Assert.assertTrue(dynamicallyLoadedPage.errorMessage.isDisplayed());
        //Note: Follow POM Design Pattern
    }


}
