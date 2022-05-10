package com.cydeo.review.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task1 {
    public static void main(String[] args) {


        //        open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //        go to https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com");

        //        then click on "forgot_password" link
        driver.findElement(By.linkText("Forgot Password")).click();

        //        enter any email
        WebElement emailBox = driver.findElement(By.name("email"));
        emailBox.sendKeys("any@email.com");

        //        verify that email is displayed in the input box
        String email = emailBox.getAttribute("value");// önce elementon üzerine tikla ardindan sag taraftan "propertiese" tikla orada bak
        System.out.println("email = " + email);//email = any@email.com

        String expectedEmail = "any@email.com";

        HandleWait.staticWait(1);

        if (email.equals(expectedEmail)) {
            System.out.println("Email verification Passed");
        } else {
            System.out.println("Email verification failed");

        }

        //        click on Retrieve password

        //driver.findElement(By.id("form_submit")).click();
        //driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath("//i[contains(text(),'Retrieve')]")).click();
        HandleWait.staticWait(1);

        //        verify that confirmation message says 'Your e-mail's been sent!'
        // String message=driver.findElement(By.name("confirmation_message")).getText();

        //System.out.println(message);
        if (driver.findElement(By.tagName("h4")).getText().equals("Your e-mail's been sent!")){
        //if (driver.findElement(By.name("confirmation_message")).getText().equals("Your e-mail's been sent!")) {

            System.out.println("Message confirmation passed!!Good Job");
        } else {
            System.out.println("Message confirmation failed!!Sorry");

        }


    }



}
