package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");


        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        //                  tagName[attribute='value']

        //locating reset password button using class attribute and its value
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        //locating reset password button using VALUE attribute and its value
       // WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));


        WebElement resetButton= driver.findElement(By.cssSelector("button[class='login-btn']"));
        //String actualResetButton= resetButton.getAttribute("class");// login-btn bunu elde edersin
        String  actualResetButton= resetButton.getText();
        System.out.println("actualResetButton = " + actualResetButton);

        if(actualResetButton.equals("Reset password")){
            System.out.println("Button Text Verification Passed!");
        }else{
            System.out.println("Button Text Verification failed!");
        }



        WebElement emailInput= driver.findElement(By.className("login-inp"));
        emailInput.sendKeys("bkaya007gmail.com"+ Keys.ENTER);


//driver.close();


    }
}
