package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        buttonIsSelected("football");
        buttonIsSelected("hockey");
        buttonIsSelected("basketball");
        buttonIsSelected("water_polo");
        buttonIsSelected("blue");
        buttonIsSelected("red");
        buttonIsSelected("yellow");
        buttonIsSelected("black");
        buttonIsSelected("green");

        driver.close();


       /* //3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        Thread.sleep(2000);
        hockeyButton.click();

        if(hockeyButton.isSelected()){
            System.out.println("Button is selected.Verification passed!");
        }else{
            System.out.println("Button is selected.Verification failed!");
        }
*/
    }public static void buttonIsSelected(String button){
        button=button.toLowerCase();
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='"+button+"']"));

        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        radioButton.click();

        if(radioButton.isSelected()){
            System.out.println(button+"Button is selected.Verification passed!");
        }else{
            System.out.println(button+"Button is selected.Verification failed!");
        }
    }

}
