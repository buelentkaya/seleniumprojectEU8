package com.cydeo.review.week04;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        //driver.close();
    }


    @Test
    public void scenario1() {
        // Using the Valet parking lot, set today as the entry date & time
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);//CDwindow-4DEA27DF8D2BB7AF167AE3DF219435E1
        System.out.println("actualWindowTitle  " + driver.getTitle());   //Parking Cost Calculator

        driver.findElement(By.xpath("//img[@src='cal.gif'][1]")).click();// we find the input entry date and time link and clik it
        HandleWait.staticWait(2);

        driver.findElement(By.xpath("//table[@border='1']/tbody//tr[6]//td[6]")).click();

    }
        /*
        Set<String> allWindowsHandles=driver.getWindowHandles(); // we we save all the oppened windows

        System.out.println("allWindowsHandles = " + allWindowsHandles);

        HandleWait.staticWait(2);
        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            //if (driver.getCurrentUrl().contains(expectedInUrl)){
         //       break;
            }
        }

        //5. Assert:Title contains “expectedInTitle”
     //   String actualTitle = driver.getTitle();
     //   Assert.assertTrue(actualTitle.contains(expectedInTitle));


*/

        // and tomorrow as the exit giving a full 24 hour window (you can attempt to use the DatePicker).


    }



