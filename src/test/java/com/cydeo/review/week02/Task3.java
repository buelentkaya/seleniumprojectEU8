package com.cydeo.review.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //You have to implement the following Web automated checks over our DEMO ONLINE SHOP: https://www.demoblaze.com/index.html

        driver.get("https://www.demoblaze.com/index.html");

        //Customer navigation through product categories: Phones, Laptops and Monitors
        //Navigate to "Laptop" → "Sony vaio i5" and verify the price is 790 dollars
        //driver.findElement(By.id("itemc")).click();
        // driver.findElement(By.linkText("Laptops")).click();
        // driver.findElement(By.linkText("Laptops")).click();
        driver.findElement(By.partialLinkText("Laptops")).click();
        HandleWait.staticWait(1);
        driver.findElement(By.partialLinkText("Sony vaio i5")).click();
        HandleWait.staticWait(3);// yogunluk oldugunda saniye koyarak calismasini saglayabiliyoruz

        String price = driver.findElement(By.tagName("h3")).getText();
        System.out.println(price);

        int Price = Integer.parseInt(price.substring(1, 4));

        System.out.println("Price = " + Price);

        if (Price == 790) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        HandleWait.staticWait(2);
        driver.close();
    }
}
