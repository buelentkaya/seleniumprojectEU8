package com.cydeo.tests.day10Upload_Actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC4_ScrollPractice {

    //TC #4: Scroll practice
    @Test
    public void ScrollPractice() throws InterruptedException {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”

        JavascriptExecutor jse= (JavascriptExecutor)Driver.getDriver();
       // for (int i = 0; i <10 ; i++) {
      //      jse.executeScript("window.scrollBy(0,750)");
      //      Thread.sleep(1);
      //  }


        //4- Scroll using Actions class “moveTo(element)” method
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.linkText("CYDEO"))).click().perform();


        //5- Scroll back up to “Home” link using PageUP button

        for (int i = 0; i <10 ; i++) {
            Thread.sleep(1);
            jse.executeScript("window.scrollBy(0,-500)");
        }
        Thread.sleep(1);
       Driver.getDriver().quit();
    }

}
