package com.cydeo.review.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PolymerTest {
    /*
   Here is this week's task:
Write a basic browser automation framework to validate a Polymer website.
The focus should be on the interaction with the browser.
The Web Application under test http://todomvc.com/
   The first step should be to load the website,
   click within the JavaScript tab,
   and select the Polymer link.
   The second step should be: Add one Todo item
   Then Verify that the item added.
    */
    static WebDriver driver;

    public static void main(String[] args) {

        // The first step should be to load the website
        // From Selenium Library (Version 3 - pom.xml: dependency) we use WebDriver Interface, and with a polymorphic way we create driver instance
        // driver instance initiates a 'session', until we say driver.close or driver.quit
        driver = WebDriverFactory.getDriver("chrome"); // opens an empty Chrome browser

        // our driver object brings us many useful methods from the library
        driver.get("http://todomvc.com/");
        // maximize page
        driver.manage().window().maximize();

        // click within the JavaScript tab
// (//div[contains(@class,'tab-content')])[1] with dynamic formula
        // WebElement JSElement = driver.findElement(By.xpath("//div[.='JavaScript']"));
        getTab("JavaScript");
        // why do we locate a webelement? to do an action on it
        // JSElement.click();

        // and select the Polymer link.
        WebElement polymerLink = driver.findElement(By.linkText("Polymer"));
        polymerLink.click();

        // The second step should be: Add one Todo item

        String toDoItem = "This Todo Item is added by user";

        HandleWait.staticWait(1);
        WebElement toDoBox = driver.findElement(By.id("new-todo"));
        toDoBox.sendKeys(toDoItem + Keys.ENTER);

        // to locate the weblement for item we entered: //label[.='customText']

        //  String locator = "//label[.='customText']";  // I want to use text I am sending as String variable
        String locator = "//label[.='" + toDoItem + "']";


        HandleWait.staticWait(1);
        WebElement customToDOItem = driver.findElement(By.xpath(locator));

        if (customToDOItem.isDisplayed()) {
            System.out.println("We added our toDO item successfully");
        }

        driver.close();  // driver.quit() to close all opened windows of that session

    }

    public static void getTab(String tab) {  // sayfada 3 tane tab var..
        // her biri icin ayri ayri kod yazmaya gerek yok sadece tab ismini tab b??l??m??ne girerek halledilebilir
        WebElement JSElement = driver.findElement(By.xpath("//div[.='" + tab + "']"));
        JSElement.click();
        // bu getTab calistirildiginda o tab bulunacak ve clicklenecek
    }
}
