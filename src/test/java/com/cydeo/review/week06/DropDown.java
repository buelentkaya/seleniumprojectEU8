package com.cydeo.review.week06;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown {

    @Test
    public void Task03() {
        //Task3:
        //    1. Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //    2. Login with username: Tester, password: test


        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test", Keys.ENTER);
        //    3. Click  Order button
        Driver.getDriver().findElement(By.linkText("Order")).click();

        //    4. Verify under Product Information, selected option is “MyMoney”
        Select dropDown = new Select(Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));

        Assert.assertTrue(dropDown.getFirstSelectedOption().getText().equals("MyMoney"));
        ;//this gives us the name of the dropdown"Money"

        //    5. Then select FamilyAlbum, make quantity 2, and click Calculate,
        // dropDown.selectByIndex(1);
        dropDown.selectByValue("FamilyAlbum");

        //    6. Then verify Total is equal to Quantity*PricePerUnit
        Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).clear();

       // Actions actions = new Actions(Driver.getDriver());
      //  actions.doubleClick(Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2")).perform();


        Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");

        Driver.getDriver().findElement(By.className("btn_dark")).click();


    }


}
