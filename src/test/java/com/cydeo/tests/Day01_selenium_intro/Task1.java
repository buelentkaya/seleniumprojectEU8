package com.cydeo.tests.Day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Task1 {
    public static void main(String[] args) {

        WebDriverManager.operadriver().setup();// set up for browser

        WebDriver driver = new OperaDriver();//to open the browser

        driver.get("https://www.yahoo.com/");

        driver.manage().window().maximize();

        //WAIT 30 SECONDS
        //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        String expectedTitle = "Yahoo | Mail, Wetter, Suche, Nachrichten, Finanzen, Sport & mehr";

        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());

        if(actualTitle.equals(expectedTitle)){

            System.out.println("Title is as expected.Verification PASSED!");
        }else{
            System.out.println("Title is NOT as expected.Verification FAILED!");
        }

        //driver.close();
    }
}
