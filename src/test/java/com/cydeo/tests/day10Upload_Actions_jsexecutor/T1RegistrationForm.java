package com.cydeo.tests.day10Upload_Actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class T1RegistrationForm {

    @Test
    public void registrationFormTest(){
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver

        //Driver.getDriver().get("https://practice.cydeo.com/registration_form");
        Driver.getDriver().get(ConfigurationReader.getProperty("webSite"));

        //Enter first name
        Faker faker=new Faker();
         Driver.getDriver().findElement(By.name("firstname")).sendKeys(faker.name().firstName());
        //4. Enter last name
        Driver.getDriver().findElement(By.name("lastname")).sendKeys(faker.name().lastName());
        //5. Enter username
        Driver.getDriver().findElement(By.name("username")).sendKeys(faker.name().username()+"0c");
        //6. Enter email address
        Driver.getDriver().findElement(By.name("email")).sendKeys(faker.internet().emailAddress());
        //7. Enter password
        Driver.getDriver().findElement(By.name("password")).sendKeys(faker.internet().password());
        //8. Enter phone number
       Driver.getDriver().findElement(By.name("phone")).sendKeys(faker.phoneNumber().phoneNumber());
        //9. Select a gender from radio buttons

        Driver.getDriver().findElement(By.xpath("//input[@value='male']")).click();
        //10. Enter date of birth
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        Driver.getDriver().findElement(By.name("birthday")).sendKeys(sdf.format(faker.date().birthday()));
        //11. Select Department/Office
        //12. Select Job Title
        //13. Select programming language from checkboxes
        //14. Click to sign up button
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
        //
        //
        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense



    }
}
