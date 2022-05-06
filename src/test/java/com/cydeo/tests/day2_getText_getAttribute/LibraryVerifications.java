package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

       // WebElement emailAddressInput= driver.findElement(By.className("form-control"));
       WebElement emailAddressInput= driver.findElement(By.id("inputEmail"));
        emailAddressInput.sendKeys("incorrect@email.com"+ Keys.ENTER);

        WebElement password= driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();





    }
}
