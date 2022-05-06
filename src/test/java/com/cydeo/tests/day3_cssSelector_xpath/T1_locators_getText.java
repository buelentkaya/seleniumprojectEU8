package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        //WebElement userName=driver.findElement(By.className("login-inp"));
        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("incorrect");


        //4- Enter incorrect password: “incorrect”
        //To auto generate local variable
        //Mac: option + enter
        //Windows: alt + enter
        //WebElement userPassword= driver.findElement(By.className("login-inp"));
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("incorrect");

        //5- Click to log in button.
        WebElement logIn = driver.findElement(By.className("login-btn"));
        logIn.click();


        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorAlert = driver.findElement(By.className("errortext"));
        String errorMessage = "Incorrect login or password";
        if (errorAlert.getText().equals(errorMessage)) {
            System.out.println("Error Message Verification Passed!!!");
        } else {
            System.out.println("Error Message Verification fAILED!!!!");
        }

        driver.close();
    }
}
