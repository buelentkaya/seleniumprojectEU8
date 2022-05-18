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

public class TC6_SelectingDate {
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
       // driver.close();
    }

    @Test
    public void selectingDate() {

        selectTheDate("year", "1923", "month", "11", "day", 1);

    }



    public static void selectTheDate(String year, String Year, String month, String indexOftheMonth, String day, int Day) {
        Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='" + year + "']")));
        yearDropDown.selectByVisibleText(Year);


        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id='" + month + "']")));
        monthDropDown.selectByValue(indexOftheMonth);

        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='" + day + "']")));
        Day = Day - 1;
        dayDropDown.selectByIndex(Day);


        String expectedYear = Year;
        String actualYear = yearDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualYear, expectedYear, "Year Verification failed!!!");


        int n = Integer.parseInt(indexOftheMonth) + 1;

        String expectedMonth = (n == 1) ? "January" : (n == 2) ? "February" : (n == 3) ? "March" : (n == 4) ? "April" : (n == 5) ? "May" : (n == 6) ? "June"
                : (n == 7) ? "July" : (n == 8) ? "August" : (n == 9) ? "September" : (n == 10) ? "October" : (n == 11) ? "November" : "December";

        String actualMonth = monthDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualMonth, expectedMonth, "Month Verification FAILED!");


        int actualDay = Integer.parseInt(dayDropDown.getFirstSelectedOption().getText());
        int expectedDay = Day + 1;
        Assert.assertEquals(actualDay, expectedDay, "Day of the Month verifying FAILED!");




    }

}
