package com.cydeo.tests.DAY8_WebTables_Properties;

import com.cydeo.tests.BASE.TestBase;
import com.cydeo.utilities.CustomMethod;
import org.testng.annotations.Test;

public class Test1 extends TestBase {


//public WebDriver driver;
/*
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
*/

    @Test
   public void getEmail() {


        CustomMethod.getTableGetEmail(driver,"table1","Tim");



/*
     driver.get("https://practice.cydeo.com/tables");

    WebElement emailCell = driver.findElement(By.xpath("//table[@id='table2']/tbody//td[.='Jason']/../td[3]"));

      System.out.println("emailCell.getText() = " + emailCell.getText());
*/
   }

   //emailCell.getText() = tconway@earthlink.net
//emailCell.getText() = fbach@yahoo.com
    //emailCell.getText() = jsmith@gmail.com
//emailCell.getText() = jdoe@hotmail.com










}
