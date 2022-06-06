package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.BASE.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NestedFrame extends TestBase {

    @Test
    public void nestedFrames(){
       driver.get("https://practice.cydeo.com/nested_frames");

       //main content ---->   TOP  BOTTOM FRAME
        //TOP------->  left   -  middle-right frame

        //get the text out of bottom frame
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrmBodyElement= driver.findElement(By.tagName("body"));
        System.out.println(bottomFrmBodyElement.getText());

        //switcch out tothe parent frame

      //  driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //go to the middle frame and get the text
        //first goto top frame thengo to  middle frame
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrameDiv=driver.findElement(By.id("content"));
        System.out.println("middleFrameDiv.getText() = " + middleFrameDiv.getText());

        //to got the right frame and get the text
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");

        WebElement rightFrmBodyElmnt= driver.findElement(By.tagName("body"));
        System.out.println("rightFrmBodyElmnt.getText() = " + rightFrmBodyElmnt.getText());
        //go back to default content
        driver.switchTo().defaultContent();


    }



}
