package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {


      //  1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        // 2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");


        //  3- Click to A/B Testing from top of the list.
        WebElement clickAB= driver.findElement(By.linkText("A/B Testing"));
clickAB.click();

        // 4- Verify title is:
        //  Expected: No A/B Test
        if((driver.getTitle()).equals("No A/B Test")){
            System.out.println("Title Verification Passed!");
        }else{
            System.out.println("Title Verification Failed!");
        }

        //   5- Go back to home page by using the .back();

        driver.navigate().back();
        //  6- Verify title equals:
        //  Expected: Practic
        if((driver.getTitle()).equals("Practice")){
            System.out.println("Title Verification Passed!");
        }else{
            System.out.println("Title Verification Failed!");
        }
        driver.close();
    }
}
