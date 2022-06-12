package com.cydeo.review.week06;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.HandleWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class webrestaurantstore {


    @Test
    public void searItem() {
        //Go to https://www.webstaurantstore.com/
        Driver.getDriver().get("https://www.webstaurantstore.com/");
       Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        //Search for 'ssearchvaltainless work table'
        Driver.getDriver().findElement(By.id("searchval")).sendKeys("stainles work table" + Keys.ENTER);
        HandleWait.staticWait(1);
        //Check the search result ensuring every product has the word 'Table' in its title
Driver.getDriver().findElement(By.id("search_within")).sendKeys("table"+Keys.ENTER);
HandleWait.staticWait(1);


       List<WebElement>  tableItems=Driver.getDriver().findElements(By.xpath("//a[@data-testid='itemDescription']"));
        System.out.println(tableItems.size());

        for(WebElement each:tableItems) {
           System.out.println(each.getText());
       }
        System.out.println(tableItems.get(59).getText());

//Regency 30" x 30" 18-Gauge 304 Stainless Steel Commercial Work Table with Galvanized Legs and Undershelf 60
        //Add the last of found items to Cart.

        //Empty Cart.
    }

}
