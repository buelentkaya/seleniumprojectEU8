package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //Locate homeLink using cssSelector, class value

        //WebElement homeLink1= driver.findElement(By.cssSelector("a[class='nav-link']"));
        // WebElement homeLink2= driver.findElement(By.cssSelector("a.nav-link");
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']"));
        // homeLink3.click();
        // WebElement homeLink4=driver.findElement(By.linkText("Home"));
        //homeLink4.click();

        //b. “Forgot password” header
        //Locate header using cssSelector: locate parent element and move down to h2

        WebElement header1 = driver.findElement(By.cssSelector("div.example>h2"));

        //Locate header using xpath, and using web elements text "Forgot Password"
        //  WebElement header2= driver.findElement(By.xpath("//h2[.='Forgot Password']"));////tagName[@attribute='value']

        //   WebElement header3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));//   //tagName[@attribute='value']

        //d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));//  //tagName[@attribute='value']

        //Locate inputBox using xpath contains method

        //tagName[contains(@attribute,'value')]
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrieveButton1 = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text

        WebElement poweredByCydeo=driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.

        System.out.println("homeLink3.isDisplayed() = " + homeLink3.isDisplayed());
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("retrieveButton1.isDisplayed() = " + retrieveButton1.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("inputBox_ex2.isDisplayed() = " + inputBox_ex2.isDisplayed());

    }
}
