package com.cydeo.review.week06.pomForReview;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitTasksPage {
    public WaitTasksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "alert")
    public WebElement alertActivate;

    @FindBy(xpath = "//button[contains(@id,'populate-text')]")
    public WebElement changeTextBtn;

    @FindBy(id="h2")
    public WebElement changedText;

    @FindBy(id="enable-button")
    public WebElement enableBtn;

    @FindBy(id="disable")
    public WebElement disableBtn;
}
