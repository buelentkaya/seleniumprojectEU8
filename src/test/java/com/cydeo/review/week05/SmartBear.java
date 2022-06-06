package com.cydeo.review.week05;

import com.cydeo.tests.BASE.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SmartBear extends TestBase {
    /*
    Smartbear software order placing


     */

    @Test
    public void test(){

        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


        //3. Enter username: “Tester”
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //4. Enter password: “test”
driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("tester");
        //5. Click on Login button

        //6. Click on Order

        //7. Select familyAlbum from product, set quantity to 2

        //8. Click to “Calculate” button

        //9. Fill address Info with JavaFaker

        //• Generate: name, street, city, state, zip code

        //10. Click on “visa” radio button

        //11. Generate card number using JavaFaker

        //12. Click on “Process”

        //13. Verify success message “New order has been successfully added.”
    }
}
