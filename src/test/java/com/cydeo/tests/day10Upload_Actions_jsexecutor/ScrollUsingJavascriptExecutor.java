package com.cydeo.tests.day10Upload_Actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollUsingJavascriptExecutor {

@Test
    public  void ScrollUsingJavascriptExecutor() throws InterruptedException {
    //2- Go to: https://practice.cydeo.com/large
    Driver.getDriver().get("https://practice.cydeo.com/large");

    WebElement element = Driver.getDriver().findElement(By.linkText("CYDEO"));
    ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    Thread.sleep(500);

    WebElement home = Driver.getDriver().findElement(By.linkText("Home"));
    ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", home);
    Thread.sleep(500);

   /*
    3- Scroll down to “Cydeo” link
    Actions actions=new Actions(Driver.getDriver());
   actions.moveToElement(Driver.getDriver().findElement(By.linkText("CYDEO"))).perform();
    4- Scroll up to “Home” link
    actions.moveToElement(Driver.getDriver().findElement(By.linkText("Home"))).perform();
    5- Use below provided JS method only
    JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
    for (int i = 0; i < 10; i++) {
        jse.executeScript("window.scrollBy(0,750)");
    }



    //JavaScript method to use : arguments[0].scrollIntoView(true)

    WebElement element = Driver.getDriver().findElement(By.linkText("Home"));
    ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    Thread.sleep(500);

    //Note: You need to locate the links as web elements and pass them as
    //arguments into executeScript() method

    */
}

}
