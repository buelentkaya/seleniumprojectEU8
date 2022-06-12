package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Dynamically_Loaded_Page_SpongeBop {


@Test
    public void dynamic_Load_7_Test(){
    //TC#4 : Dynamically Loaded Page Elements 7
    //1. Go to https://practice.cydeo.com/dynamic_loading/7
    Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
    DynamicLoad7Page dynamicLoad7Page=new DynamicLoad7Page();

    //2. Wait until title is “Dynamic title”
    //creating the wait object to be able to create certain condition to wait
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);


    //use the "wait" object to create our expected condition
    wait.until(ExpectedConditions.titleIs("Dynamic title"));

    //3. Assert: Message “Done” is displayed.
    Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
    //4. Assert: Image is displayed.

Assert.assertTrue(dynamicLoad7Page.spongeBobImg.isDisplayed());
    //Note: Follow POM

}











}
