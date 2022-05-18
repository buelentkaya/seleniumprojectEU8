package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void multipleWindow_test() {
        //Storing the main page's window handle as string is good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        //mainHandle = CDwindow-4ECB1B9D3ED5B14811956D4FA6A526D6   alphenumarical  randomly generated

        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualWindowTitle = driver.getTitle();
        System.out.println("Title before click: " + actualWindowTitle);

        Assert.assertEquals(expectedTitle, actualWindowTitle);


        //5. Click to: “Click Here” link
        WebElement clickTheLink = driver.findElement(By.linkText("Click Here"));
        clickTheLink.click();

        actualWindowTitle = driver.getTitle();
        System.out.println("ActualWindowTitle after click = " + actualWindowTitle);//HER NEKADAR YENI PENCERE ACILSA DA
        // malesef yeni pencereninkini vermedi..cunku biz clik leyip yeni pencere acsakda
        // selenium yeni pencereye daha gecmedi cunku


        //6. Switch to new Window
        Set<String>allWindowHandles=driver.getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window

        int window = 0;
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            window++;
            System.out.println(window + ".  actualWindowTitle while switching windows = " + driver.getTitle());
        }


        //7. Assert: Title is “New Window”
         String expectedTitleAfterClick="New Window";
        actualWindowTitle= driver.getTitle();

        Assert.assertEquals(expectedTitleAfterClick,actualWindowTitle);

        System.out.println("actualWindowTitle = " + actualWindowTitle);

        //If we want to go back to main page, we can use already stored main handle
       // driver.switchTo().window(mainHandle);  // bu bizi ilk basladigimiz yere döndürüyor


    }


}
