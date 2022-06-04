package com.cydeo.tests.DAY8_WebTables_Properties;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4ConfigPractice {

  // public WebDriver driver;

/*
    @BeforeMethod
    public void setupMethod() {
        //We are getting the browserType dynamically from our configuration.properties file
        String browserType= ConfigurationReader.getProperty("browser");


        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

*/

    @Test
    public void google_Search_Test(){

      //  Driver.getDriver()----> driver
       Driver.getDriver().get("https://google.com");
            //3- Write “apple” in search box

            WebElement googleSearchBox= Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        Driver.getDriver().findElement(By.xpath("//button[@id='L2AGLb']//div[.='Ich stimme zu']")).click();
      //  driver.findElement(By.xpath("//div[.='Ich stimme zu']")).click();
       // driver.findElement(By.id("L2AGLb")).click();

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle=ConfigurationReader.getProperty("searchValue")+" - Google Suche";

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle," Title Verification is failed!!!");


        }








}
