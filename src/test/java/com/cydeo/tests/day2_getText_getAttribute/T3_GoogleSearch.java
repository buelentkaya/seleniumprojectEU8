package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
       /* options.addArguments("disable-notifications");

        options.addArguments("disable-geolocation");
        options.addArguments("disable-media-stream");
        options.addArguments("--disable-extentions");
        options.addArguments("disable-infobars");*/

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.navigate().to("https://www.google.com");

        //3- Write “apple” in search box
        //4- PRESS ENTER using Keys.ENTER

        //driver.findElement(By.xpath("//span[text()='Ich stimme zu']")).click();
        //driver.findElement(By.xpath("//div[@id='introAgreeButton']")).sendKeys(Keys.ENTER);;

        // driver.findElement(By.id("id")).click();

        // driver.findElement(By.id("alert")).click();
        //Alert alert=driver.switchTo().alert();

        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();// used to click on any button
        Thread.sleep(5000);


        driver.navigate().refresh();

        Thread.sleep(5000);

        WebElement googleSearchBox = driver.findElement(By.linkText("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

         //5- Verify title:
        //Expected: Title should start with “apple” word

        String expectedInTitle = "apple";
        String actualInTitle = driver.getTitle();

        if (actualInTitle.startsWith("apple")) {
            System.out.println("Title verification Passed!");
        } else {
            System.out.println("Title verification failed.");
        }
        //driver.close();
    }
}


        //   WebElement neinButton = driver.findElement(By.linkText("Nein, danke"));
        //   neinButton.click();


        //WebElement neinButton= driver.findElement(By.xpath("html/body/div/c-wiz/div[2]/div/div/div/div/div[2]/form/div/div[2]"));
        //neinButton.click();
        /*WebElement nein = driver.findElement(By.partialLinkText("Nein, danke"));
        Point point = nein.getLocation();
        System.out.println(point.getX()+" " + point.getY());*/


        //Actions act=new Actions(driver);
        //act.moveByOffset(370,180).contextClick().build().perform();


        // WebElement neinButton = driver.findElement(By.className("QlyBfb"));
        // agreeButton.click();
        // WebElement neinButton= driver.findElement(By.className("rr4y5c"));
        // neinButton.click();

        //WebElement neinButton = driver.findElement(By.xpath("//button[contains(text(),'Nein, danke')]"));
        //neinButton.click();

        /*driver.switchTo().alert();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); */
        //WebElement neinButton=driver.findElement(By.xpath("//a[@]")





