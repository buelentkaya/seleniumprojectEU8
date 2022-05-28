package com.cydeo.review.week04;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }


    @Test
    public void switch2Frame() {
        //2. Switch to iframe.
        driver.switchTo().frame("iframeResult");
        HandleWait.staticWait(1);

        driver.switchTo().parentFrame();
        HandleWait.staticWait(1);

        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();

        //3. Get the text “Double-click me to change my text color.” and verify the text
        String expectedText="Double-click me to change my text color.";

        driver.switchTo().frame("iframeResult");
        HandleWait.staticWait(1);

        String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
        //System.out.println("text = " + text);

        Assert.assertEquals(text,expectedText,"Text in the Iframe Verification Failed");
    }
@Ignore
    @Test
    public void iframeTest(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        // we need to change frame
        driver.switchTo().frame("iframeResult");

        HandleWait.staticWait(2);
        WebElement demoElement =    driver.findElement(By.id("demo"));

        String demoText = demoElement.getText();

        System.out.println("demoText = " + demoText);

        driver.close();


    }




}
