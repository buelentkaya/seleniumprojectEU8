package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
  WebElement password= driver.findElement(By.id("inputPassword"));
  password.sendKeys("incorrect password");

        //5. Click to Sign in button
        WebElement signInButton= driver.findElement(By.tagName("button"));
        signInButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password”
        //displayed




        String expectedText="Sorry, Wrong Email or Password";
        String actualText=driver.findElement(By.tagName("button")).getText();
        System.out.println(actualText);// Sign in
    }
}
