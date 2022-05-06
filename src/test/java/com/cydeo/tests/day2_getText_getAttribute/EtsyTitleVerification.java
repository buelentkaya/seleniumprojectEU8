package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();

       // 3. Search for “wooden spoon”

        WebElement searchButton= driver.findElement(By.id("global-enhancements-search-query"));
        searchButton.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. Verify title:
       // Expected: “Wooden spoon | Etsy
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verificaion passed.");
        }else {System.out.println("Title verification failed.");
    }
   // driver.close();








    }
}
