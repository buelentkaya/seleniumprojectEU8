package com.cydeo.tests.DAY8_WebTables_Properties;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod

    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void orderNameVerifyTest() {
        //Locate the cell that has Bob Martin text in it.
        //System.out.println(driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[2]")).getText());//Bob Martin
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
              //  driver.findElement(By.xpath("//td[.='Bob Martin']"));

        //System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        //2. Verify Bob’s name is listed as expected.
        String expectedText = "Bob Martin";
        String actualText = bobMartinCell.getText();
        Assert.assertEquals(actualText, expectedText);

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021

        // alternative locator to bobMartinDateCell = "//td[.='Bob Martin']/../td[5]"


        WebElement bobsDateCell =
                //driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/../td[5]"));
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        System.out.println(bobsDateCell.getText());//12/31/2021

        String expectedBobDate = "12/31/2021";
        String actualBobDate = bobsDateCell.getText();

        Assert.assertEquals(actualBobDate, expectedBobDate);

        //We use the utility method we created.












    }


}
