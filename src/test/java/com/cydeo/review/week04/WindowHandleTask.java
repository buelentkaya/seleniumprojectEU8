package com.cydeo.review.week04;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleTask {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. automate the following scenarios for this website https://shino.de/parkcalc/
        driver.get("https://shino.de/parkcalc/");

    }

    @AfterMethod
    public void tearDown() {
       // driver.close();
    }


    @Test
    public void scenario1() {
/* Using the Valet parking lot,
        set today as the entry date & time and tomorrow as the exit giving a full 24 hour window
        (you can attempt to use the DatePicker */

        driver.findElement(By.xpath("(//img[@src='cal.gif'])[1]")).click(); //  (//img[@alt='Pick a date])[1]  we use 1 because there is more than one

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("windowHandles = " + windowHandles);


        String mainWindowHandle = driver.getWindowHandle();

        for (String eachWindowHandle : windowHandles) {
            if (!eachWindowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(eachWindowHandle);
            }
        }
        //click on the element at the second window
        driver.findElement(By.linkText("24")).click();//the window closes itself, however I am still inside that closed window programatocally
        HandleWait.staticWait(1);


        driver.switchTo().window(mainWindowHandle);

        driver.findElement(By.xpath("//input[@id='StartingTime']")).clear();
        driver.findElement(By.xpath("//input[@id='StartingTime']")).sendKeys("10:00");




        

        //to set the leaving date


        driver.findElement(By.xpath("(//img[@src='cal.gif'])[2]")).click(); //  (//img[@alt='Pick a date])[1]  we use 1 because there is more than one

        for (String eachWindowHandle : windowHandles) {
            if (!eachWindowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(eachWindowHandle);
            }
        }


        driver.findElement(By.linkText("24")).click();//the window closes itself, however I am still inside that closed window programatocally
        HandleWait.staticWait(1);


        driver.switchTo().window(mainWindowHandle);

        driver.findElement(By.xpath("//input[@id='StartingTime']")).clear();

        driver.findElement(By.xpath("//input[@id='StartingTime']")).sendKeys("19:00");

        driver.findElement(By.xpath("//input[@value='PM']")).click();






    }


}



