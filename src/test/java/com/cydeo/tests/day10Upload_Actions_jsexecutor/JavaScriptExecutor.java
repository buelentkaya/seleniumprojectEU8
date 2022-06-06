package com.cydeo.tests.day10Upload_Actions_jsexecutor;

import com.cydeo.tests.BASE.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class JavaScriptExecutor extends TestBase {


@Test(priority = 1)
    public void test_Scroll() throws InterruptedException {

    //get the JavaScriptExecutor reference from driver variable
driver.get("http://practice.cybertekschool.com/infinite_scroll");
   // JavaScriptExecutor jse=(JavaScriptExecutor) driver;
    JavascriptExecutor jse= (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,10000)");

    for (int i = 0; i <10 ; i++) {
       jse.executeScript("window.scrollBy(0,10000)");
    }
    Thread.sleep(2);
}


    @Test (priority = 2)
    public void window_handling_test(){
        //2. Go to: https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Copy-paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open
        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");

    }


}
