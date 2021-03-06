package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form

        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        String expectedHeaderText = "Registration form";
        String actualHeaderText = driver.findElement(By.tagName("h2")).getText();
        System.out.println(actualHeaderText);

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header Text verification Passed!...Good Job!");
        } else {
            System.out.println("Header Text verification Failed!...Sorry!!");
        }


        //4- Locate “First name” input box
        // we are locating the web element using "name" locator
        // name attribute has "firstname" value


        WebElement FirstNameInput = driver.findElement(By.className("form-control"));
        //WebElement firstNameInput = driver.findElement(By.name("firstname"));

        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = FirstNameInput.getAttribute("placeholder");// elementi bulduk. oradaki yazinin ayni oldugunu ögrenecegiz simdi
        System.out.println(actualPlaceHolder);



        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("PlaceHolder verification Passed!...Good Job!");
        } else {
            System.out.println("PlaceHolder verification Failed!...Sorry!!");
        }
//driver.close();


    }
}
