package com.cydeo.review.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemoBlaze {
    public static void main(String[] args) throws InterruptedException {
        //https:www.demoblaze.com/index.html
        //verify Title "Store
        //Metaphor:Taxi drive example
        //taxi car=browser-chrome-C, txiDriver:Selenium Webdriver

        WebDriverManager.chromedriver().setup();// I am setting up my taxi driver

        WebDriver driver = new ChromeDriver();//the car itself
        //there is polymorphisim:Webdriver is an interface,CHROMEDRIVER IS THE CONCRETE CLASS

        //driver.get("https://www.demoblaze.com/index.html");
        driver.navigate().to("https:www.demoblaze.com/index.html");

        String expectedTitle="STORE";//comes from documentation.SRS system requeiment
        String currentTitle= driver.getTitle();
        System.out.println(currentTitle);
//As a tester , without verification what is your VALUE to the Company

        if(expectedTitle.equals(currentTitle)){

            System.out.println("Title is as expected.Verification PASSED!");
        }else{
            System.out.println("Title is NOT as expected.Verification FAILED!");
        }
        Thread.sleep(5000);

        driver.close();


        }
    }

