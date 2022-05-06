package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {

        // TC #3: Back and forth navigation
        // 1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com

        driver.get("https://google.com");

        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));// to click the I agree button
        agreeButton.click();// used to click on any button
        Thread.sleep(2000);

        driver.navigate().refresh();// to overcome the sign in issue


        // 3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.className("gb_d"));
        //WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        //  4- Verify title contains:
        String expectedTitle = "Gmail: kostenlose, vertrauliche und sichere E-Mails | Google Workspace";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }

        //   5- Go back to Google by using the .back();

        driver.navigate().back();
        //   6- Verify title equals:
        //  Expected: Googl

        expectedTitle = "Google";
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }
        driver.close();
    }
}
