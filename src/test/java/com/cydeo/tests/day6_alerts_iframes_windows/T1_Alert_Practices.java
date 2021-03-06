package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1.Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @AfterMethod
    public void tearsDownMethod() {
        driver.quit();
    }

    @Test
    public void Information_alert() {

        //3. Click to “Click for JS Alert” button
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        HandleWait.staticWait(1);

//To be able to click to Alert OK button we need to switch driver's focus to Alert itself.
        Alert alert = driver.switchTo().alert();
        //4. Click to OK button from the alert
        alert.accept();
//to easier mode
        //driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        //driver.switchTo().alert().accept();


        //5. Verify “You successfully clicked an alert” text is displayed.
        String expectedText = "You successfully clicked an alert";
        WebElement resultTest = driver.findElement(By.id("result"));
        // WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultTest.isDisplayed(), "Result text is NOT displayed.");

        String actualText = resultTest.getText();
        System.out.println("actualText = " + actualText);

        Assert.assertEquals(actualText, expectedText, "Text Verification failed");


    }


    @Test(priority = 2)
    public void Confirmation_alert() {
        //3. Click to “Click for JS Confirm” button
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();// orada yazan yaziyi direk al
        HandleWait.staticWait(1);

        Alert alert = driver.switchTo().alert();
        // 4. Click to OK button from the alert
        alert.accept();


         //driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        //driver.switchTo().alert().accept();

        //   5. Verify “You clicked: Ok” text is displayed.
        String expectedText = "You clicked: Ok";
        String actualText = driver.findElement(By.id("result")).getText();
        System.out.println("actualText = " + actualText);
        Assert.assertEquals(expectedText, actualText, " Verificaion Confirmation Alert Text failed!");


    }

    @Test(priority = 3)
    public void prompt_alert() {

        //Click to “Click for JS Prompt” button
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();


        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
        alert.accept();

        //6. Verify “You entered: hello” text is displayed.
        String expectedText = "You entered: hello";
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println("actualText = " + actualText);

        Assert.assertEquals(expectedText, actualText, " Verificaion Prompt Alert Text failed!");


    }


}
