package com.cydeo.review.week06;

import com.cydeo.review.week06.pomForReview.WaitTasksPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.ReviewUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitlyWaitTest {
    WebDriverWait wait;
    WaitTasksPage page;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        page = new WaitTasksPage();
        wait = new WebDriverWait(Driver.getDriver(), 12);
    }

    @AfterMethod()
    public void tearDown() {
        // screenshot option - if your test case fail you will need screenshot
        ReviewUtils.staticWait(2); // optional
        // Driver.closeDriver();
    }

    @Test
    public void Task01() {
        page.alertActivate.click();

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        page.changeTextBtn.click();
    }

    @Test
    public void Task02() {
        page.changeTextBtn.click();

    }

    @Test
    public void Task03() {
        page.enableBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(page.disableBtn));
        Assert.assertTrue(page.disableBtn.isEnabled());
    }


}

