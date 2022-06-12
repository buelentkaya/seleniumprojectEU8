package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.HandleWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_DragAndDrop {


    @Test
    public void drag_and_drop() {
        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement acceptBtn=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        HandleWait.staticWait(2);
        acceptBtn.click();
        //2. Drag and drop the small circle to bigger circle.

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());
        HandleWait.staticWait(2);
     //   actions.dragAndDrop(smallCircle, bigCircle).perform();
actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().build().perform();


// actions.clickAndHold(smallCircle)
//                .pause(2000)
//                .moveToElement(bigCircle)
//                .pause(2000)
//                .release()
//                .perform();


        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        //-Text in big circle changed to: “You did great!”

        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);

    }
}
