package com.cydeo.tests.Day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1- Setting up the web driver manager
        //We create our " Browser Driver"

        WebDriverManager.chromedriver().setup();

        //2-Creat instance of the chrome driver
        WebDriver driver=new ChromeDriver();

        //3- Test if drive is working as we expected
        driver.get("https://www.google.com");
       // driver.get("https://www.facebook.com");
    }
}
