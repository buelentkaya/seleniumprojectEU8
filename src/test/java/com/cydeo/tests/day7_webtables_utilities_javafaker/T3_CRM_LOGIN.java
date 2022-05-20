package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

@AfterMethod
    public void tearDown() {
        driver.close();
    }

    //TC #3: Login scenario
    @Test(priority = 1)
    public void crm_login_test() {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser


        //3. Enter valid username

        WebElement userNameElement = driver.findElement(By.className("login-inp"));
        //WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameElement.sendKeys("helpdesk1@cybertekschool.com");


        //4. Enter valid password

        WebElement passwordElement = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordElement.sendKeys("UserUser");

        HandleWait.staticWait(1);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();


        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver, "Portal");


    }


    @Test(priority = 2)
    public void crm_login_test_2() {
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");


        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver, "Portal");


    }


}
