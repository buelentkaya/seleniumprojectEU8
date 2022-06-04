package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");
    }
@AfterMethod
public void tearDownMethod(){
        driver.close();
}
    @Test
    public void simpleDropDropDownTest() {
        //3. Verify “Simple dropdown” default selected value is correct

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        //WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        //String actualSimpleDropdownText = currentlySelectedOption.getText();
        String actualSimpleDropdownText=simpleDropdown.getFirstSelectedOption().getText();

        System.out.println("actualSimpleDropdownText = " + actualSimpleDropdownText);//Please select an option
        String expectedSimpleDropdownText = "Please select an option";

        //Expected: “Please select an option”
        Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropdownText, "sorry it is not verrified");

        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String expectedStateDropdownText="Select a State";

        String actualStatDropdownText=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualStatDropdownText,expectedStateDropdownText,"sorry it is not verrified");




    }


}
