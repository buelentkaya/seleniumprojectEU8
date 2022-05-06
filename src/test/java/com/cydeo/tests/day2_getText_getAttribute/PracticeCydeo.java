package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCydeo {
    public static void main(String[] args) {
       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


       // 2- Go to: https://practice.cydeo.com/inputs

        driver.navigate().to("https://practice.cydeo.com/inputs");


        //3- Click to “Home” link
        WebElement clickHome= driver.findElement(By.className("nav-link"));
clickHome.click();
      //  4- Verify title is as expected:
      //  Expected: Practice
       // PS: Locate “Home” link using “className” locato
       String expectedTitle= "Practice";
     String actualTitle=driver.getTitle();

     if(actualTitle.equals(expectedTitle)){
         System.out.println("Title verification PASSED!");
     }else{
         System.out.println("Title verification FAILED!");
     }

driver.close();

    }
}
