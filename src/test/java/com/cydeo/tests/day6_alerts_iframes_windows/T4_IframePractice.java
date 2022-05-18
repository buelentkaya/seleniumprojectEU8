package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/iframe");
    }
//@Ignore  ifadesi konursa o test calismaz
    @Test
    public void iframe_Test(){

        //option #1- switching to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");// bununl sayfa icerisindeki iframe in icerisne girebildik..simdi kodlarla calisabiliriz

        //Locate the p tag
       WebElement yourContentGoeshere=driver.findElement(By.xpath("//p"));// malesef buraya ulasamiyoruz cunu bu iframe in icerisinde önce bu iframe girmemiz gerekiyor

        Assert.assertTrue(yourContentGoeshere.isDisplayed());


        //Veify "An iFrame containing the TinyMCE WYSIWYG Editor"
// to be able to verify the header, we must switch back to " main HTML

        driver.switchTo().parentFrame();

        //WebElement headerText=driver.findElement(By.xpath("//h3"));
        //WebElement headerText=driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        WebElement headerText=driver.findElement(By.xpath("//div[@class='example']"));
        headerText.getText();
        System.out.println("headerText = " + headerText);//headerText = [[ChromeDriver: chrome on WINDOWS (4a50755d8fdb920055701c8e74dc312e)] -> xpath: //h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']]

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());










    }
}
