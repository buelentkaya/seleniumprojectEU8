package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC4_5_ScrollPractice {
    @Test
    public void ScrollPractice() throws InterruptedException {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”


        //4- Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.linkText("CYDEO"))).pause(2000).perform();

        //5- Scroll back up to “Home” link using PageUP button
        Thread.sleep(3);

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();
        actions.moveToElement(Driver.getDriver().findElement(By.linkText("Home"))).pause(2000).perform();
      /*  JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1);
            jse.executeScript("window.scrollBy(0,-500)");
        }
    */


        Thread.sleep(2);
        Driver.getDriver().quit();
    }
}