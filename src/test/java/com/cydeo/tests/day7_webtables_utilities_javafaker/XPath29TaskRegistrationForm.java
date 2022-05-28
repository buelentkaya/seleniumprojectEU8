package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class XPath29TaskRegistrationForm {


    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

    @Test
    public void testRegistrationForm() {
        driver.get("http://practice.cybertekschool.com/registration_form");

        WebElement header = driver.findElement(By.xpath("//h2[.='Registration form']"));  //"//h2[text()='Registration form']"
        System.out.println("header.isDisplayed() = " + header.isDisplayed());//header.isDisplayed() = true
        //HandleWait.staticWait(1);

        WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameField.sendKeys("Bulent");

       // HandleWait.staticWait(1);

        WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameField.sendKeys("Kaya");
        //HandleWait.staticWait(1);

        WebElement userNameField = driver.findElement(By.xpath("//input[@name='username']"));
        userNameField.sendKeys("mrRock");
       // HandleWait.staticWait(1);

        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.sendKeys("bkaya007@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("topsecreet");


        WebElement phoneField = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneField.sendKeys("120-123-12342");

        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='male']"));
        maleRadioBtn.click();


        WebElement birthField = driver.findElement(By.xpath("//input[@data-bv-field='birthday']"));
        birthField.sendKeys("07/24/1975");

        WebElement deparmentField = driver.findElement(By.xpath("//select[@name='department']"));
        Select selectDepartmentObj = new Select(deparmentField);
        selectDepartmentObj.selectByIndex(2);

        WebElement jobField = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select selectJobObj = new Select(jobField);
        selectJobObj.selectByIndex(2);

        WebElement javaCheckBox = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));

        javaCheckBox.click();
        HandleWait.staticWait(2);

        WebElement sigupBtn= driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        sigupBtn.click();


        System.out.println(driver.findElement(By.xpath("//h4[@class='alert-heading' and text()='Well done!']")).isDisplayed());


    }

}
