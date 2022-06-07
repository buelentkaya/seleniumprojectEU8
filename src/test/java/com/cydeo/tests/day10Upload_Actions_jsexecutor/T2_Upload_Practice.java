package com.cydeo.tests.day10Upload_Actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {
    @Test
    public void uploadTest() {

//1. Go to https://practice.cydeo.com/upload
        //  Driver.getDriver().get(ConfigurationReader.getProperty("webSite"));
        Driver.getDriver().get("https://practice.cydeo.com/upload");

//2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\bulen\\OneDrive\\Dokumente\\CYDEO\\HTML\\HTML YAZI VE RESİM ORTALAMA.txt";
//3. Upload the file.
        Driver.getDriver().findElement(By.id("file-upload")).sendKeys(path);
        BrowserUtils.sleep(1);

        Driver.getDriver().findElement(By.id("file-submit")).click();


//4. Assert:
//-File uploaded text is displayed on the page
      // WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
     //  Assert.assertTrue(fileUploadedHeader.isDisplayed());
       Assert.assertTrue(Driver.getDriver().findElement(By.tagName("h3")).isDisplayed());


        System.out.println(Driver.getDriver().findElement(By.className("example")).getText());



    }
}
