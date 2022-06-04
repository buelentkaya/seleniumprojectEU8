package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomMethod {

    public static void getTableGetEmail(WebDriver driver,String tableNum,String firstNameOfThePerson){

        driver.get("https://practice.cydeo.com/tables");

        WebElement emailCell = driver.findElement(By.xpath("//table[@id='"+tableNum+"']/tbody//td[.='"+firstNameOfThePerson+"']/../td[3]"));

        System.out.println("emailCell.getText() = " + emailCell.getText());

    }
}
