package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC7_SelectingValue {
    static WebDriver driver;


    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void tearDownMethod() {
        //0driver.close();
    }


    @Test
    public void selectingValuefromNonSelectDropdown() {

        selectingTheLinkFromTheDropdonLink("Facebook");
    }

    public static void selectingTheLinkFromTheDropdonLink(String nameOfTheWebSite) {

        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();   // finds the dropdown menü
        HandleWait.staticWait(2);
        nameOfTheWebSite = nameOfTheWebSite.substring(0, 1).toUpperCase() + nameOfTheWebSite.substring(1).toLowerCase();

        WebElement eachItemOnTheDropdownMenu = driver.findElement(By.xpath("//a[text()='" + nameOfTheWebSite + "']"));// finds the element on the dropdown menu
        //WebElement eachItemOnTheDropdownMenu = driver.findElement(By.xpath("//a[.='" + nameOfTheWebSite + "']"));// finds the element on the dropdown menu
        eachItemOnTheDropdownMenu.click(); // then click the item on the dropdown menu

        HandleWait.staticWait(2);

        driver.findElement(By.xpath("//button[@value='1']")).submit();

        String expectedTitle = "Bei Facebook anmelden";
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title Verification Failed!!!");
    }

}
