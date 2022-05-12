package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class T5SelectingState {

    static WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


    @Test
    public void selectingState() {
    /*    Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropdown.selectByValue("IL");
        HandleWait.staticWait(1);

        String actualNameOfState=stateDropdown.getFirstSelectedOption().getText();
        System.out.println("actualNameOfState = " + actualNameOfState);

        stateDropdown.selectByVisibleText("Virginia");
        HandleWait.staticWait(1);

        stateDropdown.selectByIndex(5); */

findTheStateWithIndex(5,"California");
findTheStateWithInitials("il","Illinois");
findTheStateWithNames("virginia","Virginia");

    }











    public static void findTheStateWithNames(String nameOfTheState,String expectedNameofState) {

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        nameOfTheState = nameOfTheState.substring(0, 1).toUpperCase() + nameOfTheState.substring(1).toLowerCase();
        stateDropdown.selectByVisibleText(nameOfTheState);
        HandleWait.staticWait(1);
        String actualNameOfState=stateDropdown.getFirstSelectedOption().getText();
       // System.out.println("actualNameOfState = " + actualNameOfState);
        Assert.assertEquals(actualNameOfState,expectedNameofState);
    }

    public static void findTheStateWithInitials(String initialsOfTheState,String expectedNameofState) {
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        initialsOfTheState = initialsOfTheState.toUpperCase();
        stateDropdown.selectByValue(initialsOfTheState);
        HandleWait.staticWait(1);
        String actualNameOfState=stateDropdown.getFirstSelectedOption().getText();
        //System.out.println("actualNameOfState = " + actualNameOfState);
        Assert.assertEquals(actualNameOfState,expectedNameofState);
    }

    public static void findTheStateWithIndex(int indexOfState,String expectedNameofState) {
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByIndex(indexOfState);
        HandleWait.staticWait(1);
        String actualNameOfState=stateDropdown.getFirstSelectedOption().getText();
       // System.out.println("actualNameOfState = " + actualNameOfState);
        Assert.assertEquals(actualNameOfState,expectedNameofState);

    }
}
