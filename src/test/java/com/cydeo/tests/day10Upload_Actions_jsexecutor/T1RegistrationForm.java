package com.cydeo.tests.day10Upload_Actions_jsexecutor;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.HandleWait;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class T1RegistrationForm {

    @Test
    public void registrationFormTest(){
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver

        //Driver.getDriver().get("https://practice.cydeo.com/registration_form");
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

        //Enter first name
        Faker faker=new Faker();
         Driver.getDriver().findElement(By.name("firstname")).sendKeys(faker.name().firstName());

         //4. Enter last name
        Driver.getDriver().findElement(By.name("lastname")).sendKeys(faker.name().lastName());

        //5. Enter username
        String user = faker.bothify("helpdesk###");
        Driver.getDriver().findElement(By.name("username")).sendKeys(user);

        //6. Enter email address
        Driver.getDriver().findElement(By.name("email")).sendKeys(user+"@email.com");

        //7. Enter password
        Driver.getDriver().findElement(By.name("password")).sendKeys(faker.internet().password());
        //  inputPassword.sendKeys(faker.numerify("########"));

        //8. Enter phone number
       Driver.getDriver().findElement(By.name("phone")).sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons

        Driver.getDriver().findElement(By.xpath("//input[@value='male']")).click();

        //10. Enter date of birth
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        Driver.getDriver().findElement(By.name("birthday")).sendKeys(sdf.format(faker.date().birthday()));
        //11. Select Department/Office
       Select departmentDropDown=new Select(Driver.getDriver().findElement(By.name("department")));
         departmentDropDown.selectByIndex(faker.number().numberBetween(1,9));

        //12. Select Job Title
        Select selectJobObj=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        selectJobObj.selectByIndex(faker.number().numberBetween(1,8));

        Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']")).click();


        HandleWait.staticWait(2);

        Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']")).click();



        // System.out.println(driver.findElement(By.xpath("//h4[@class='alert-heading']")).isDisplayed());
        System.out.println( Driver.getDriver().findElement(By.xpath("//h4[@class='alert-heading' and text()='Well done!']")).isDisplayed());








    }
}
