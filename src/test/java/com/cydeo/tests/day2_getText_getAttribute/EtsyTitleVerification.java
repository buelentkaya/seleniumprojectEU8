package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {

       // TC #1: Etsy Title Verification
      //  1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();


       // 2. Go to https://www.etsy.com
        driver.navigate().to("https://www.etsy.com");



       // 3. Search for “wooden spoon”
        //4. Verify title:
       // Expected: “Wooden spoon | Etsy







    }
}
