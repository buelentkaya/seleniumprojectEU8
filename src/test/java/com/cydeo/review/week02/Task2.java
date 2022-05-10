package com.cydeo.review.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //                  -Verify title equals: String expectedTitle = "Web Orders Login"
        //                - Enter username: Tester
        //                - Enter password: test
        //                - Click “Sign In” button
        //                - Verify title equals: String expectedHomePageTitle = "Web Orders"

        WebElement userNameBox = driver.findElement(By.id("ctl00_MainContent_username"));
        userNameBox.sendKeys("Tester" );

        WebElement passwordBox = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordBox.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();


        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.equals("Web Orders")) {
            System.out.println("Title verification passed,good job!");
        } else {
            System.out.println("Title verification failed,Sorry!");
        }

        HandleWait.staticWait(2);
        driver.close();
    }
}
