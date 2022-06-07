package com.cydeo.tests.day10Upload_Actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    @Test
    public void javascript_executor_test1() throws InterruptedException {

            //get the JavaScriptExecutor reference from driver variable
            Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
            // JavaScriptExecutor jse=(JavaScriptExecutor) driver;
            JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("window.scrollBy(0,10000)");

            for (int i = 0; i <10 ; i++) {
                jse.executeScript("window.scrollBy(0,10000)");
            }
            Thread.sleep(2);
        }


    }


