package com.cydeo.review.week04;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTask {
     /*
    You have to implement the following Web automated checks over our DEMO ONLINE SHOP: https://www.demoblaze.com/index.html

• Customer navigation through product categories: Phones, Laptops and Monitors

• Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
     */

    static WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1.You have to implement the following Web automated checks over our DEMO ONLINE SHOP: https://www.demoblaze.com/index.html
        driver.get("https://www.demoblaze.com");

    }

    @AfterMethod
    public void tearDown() {
        //driver.close();
    }

    @Test(priority = 1)
    public void navigateThroughProductCategories() {

        //Customer navigation through product categories: Phones, Laptops and Monitors
        navigate("Phones");
        HandleWait.staticWait(1);

        navigate("Laptops");
        HandleWait.staticWait(1);

        navigate("Monitors");


    }


    @Test(priority = 2)
    public void add2Cart() {
        // Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.


        addItem("Laptops", "Sony vaio i5");




    }




    public static void navigate(String nameOfTheCategory) {

        driver.findElement(By.xpath("//a[.='" + nameOfTheCategory + "']")).click();


    }





    public static void addItem(String nameOfTheCategory, String item) {

        navigate(nameOfTheCategory);
        HandleWait.staticWait(1);
        driver.findElement(By.xpath("//a[.='" + item + "']")).click();
        HandleWait.staticWait(1);
        driver.findElement(By.xpath("//a[.='Add to cart']")).click();
        HandleWait.staticWait(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.navigate().back();


    }





}
