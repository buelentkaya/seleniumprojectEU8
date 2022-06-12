package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage {
    public DynamicallyLoadedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startBtn;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    @FindBy(css = "#username")
    public WebElement inputUserNameBox;

    @FindBy(css = "#pwd")
    public WebElement inputPassword;

    @FindBy(xpath= "//button[.='Submit']")
    public WebElement submitBtn;

    @FindBy(id = "flash")
    public WebElement errorMessage;
}
