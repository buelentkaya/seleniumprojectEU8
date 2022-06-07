package com.cydeo.tests.day10Upload_Actions_jsexecutor;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.HandleWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {
    @Test
    public void hovering_test() {
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //Locate all images under here:


        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
//2. Hover over to first image
        //WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        // WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user1 = Driver.getDriver().findElement(By.tagName("h5"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions actions = new Actions(Driver.getDriver());
//3. Assert:
        HandleWait.staticWait(1);
        actions.moveToElement(img1).perform();
//a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
//b. “view profile” is displayed


//4. Hover over to second image
        HandleWait.staticWait(1);
        actions.moveToElement(img2).perform();
//5. Assert:
//a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());
//b. “view profile” is displayed

//6. Hover over to third image
        HandleWait.staticWait(1);
        actions.moveToElement(img3).perform();
//7. Confirm:
//a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());
//b. “view profile” is displayed

        Assert.assertTrue(Driver.getDriver().findElement(By.linkText("View profile")).isDisplayed());
        System.out.println(Driver.getDriver().findElement(By.linkText("View profile")).getText());


    }
}
