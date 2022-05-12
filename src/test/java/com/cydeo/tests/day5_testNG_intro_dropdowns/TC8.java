package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC8 {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com//dropdown");
    }

    @AfterClass
    public void finish() {
        driver.quit();
    }

    @Test
    public void test1() {
        Select multipleDropDown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> allOptions = multipleDropDown.getOptions();

        // Select all the options from multiple select dropdown.
        multipleDropDown.selectByIndex(0);
        HandleWait.staticWait(1);
        multipleDropDown.selectByValue("js");
        HandleWait.staticWait(1);
        multipleDropDown.selectByVisibleText("C#");
        HandleWait.staticWait(1);
        multipleDropDown.selectByIndex(3);
        HandleWait.staticWait(1);
        multipleDropDown.selectByValue("ruby");
        HandleWait.staticWait(1);
        multipleDropDown.selectByVisibleText("C");
        HandleWait.staticWait(1);

        // Print out all selected values.
        for (WebElement each : allOptions) {
            if (each.isSelected()) {

                System.out.println(each.getText());
            }
        }

        // Deselect all values.
        multipleDropDown.deselectByIndex(0);
        HandleWait.staticWait(1);
        multipleDropDown.deselectByIndex(1);
        HandleWait.staticWait(1);
        multipleDropDown.deselectByIndex(2);
        HandleWait.staticWait(1);
        multipleDropDown.deselectByIndex(3);
        HandleWait.staticWait(1);
        multipleDropDown.deselectByIndex(4);
        HandleWait.staticWait(1);
        multipleDropDown.deselectByIndex(5);
        HandleWait.staticWait(1);


    }
}
