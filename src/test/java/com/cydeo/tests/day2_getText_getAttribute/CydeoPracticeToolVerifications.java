package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoPracticeToolVerifications {
    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");


        //   3. Verify URL contains
        //   Expected: cydeo
        String expectedUrl="cydeo";
        String currentUrl=driver.getCurrentUrl();

        if(currentUrl.contains(expectedUrl)){
            System.out.println("Url Verification Passed!");
        }else{
            System.out.println("Url Verification Passed!");
        }


        //    4. Verify title:
        //  Expected: Practic
        String expectedTitle="Practic";
        String currentTitle=driver.getCurrentUrl();

        if(currentTitle.equals(expectedTitle)){
            System.out.println("Title Verification Passed!");
        }else{
            System.out.println("TitleVerification Passed!");
        }
      driver.close();
    }
}
