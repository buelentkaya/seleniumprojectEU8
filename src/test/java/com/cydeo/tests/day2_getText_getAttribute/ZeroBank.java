package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {
      //  TC #2: Zero Bank header verification
      //  1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html

driver.get("http://zero.webappsecurity.com/login.html");


      //  3. Verify header text
        //   Expected: “Log in to ZeroBank
        String expectedHeaderText="Log in to ZeroBank";
String headerText=driver.findElement(By.tagName("h3")).getText();
System.out.println(headerText);//Log in to ZeroBank
        if(headerText.equals(expectedHeaderText)){
            System.out.println("Header Text Verification Passed!");
        }else{
            System.out.println("Header Text Verification Failed!");
        }

driver.close();

    }
}
