package com.nextbase.step_definitions;

import com.nextbase.pages.QuatePage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class QuateStepDefinitions {
QuatePage quatePage=new QuatePage();




@When("user clicks comma button")
    public void user_clicks_comma_button() throws InterruptedException {
   BrowserUtils.waitForClickablility(quatePage.quoteButton,10);
 //  BrowserUtils.wait(3);
    quatePage.quoteButton.click();
//BrowserUtils.wait(3);

    }

    @Then("quate should displayed")
    public void quate_should_displayed() {

      Driver.get().switchTo().frame(quatePage.iframe);
       BrowserUtils.waitForVisibility(quatePage.quoteFrame,10);
        Assert.assertTrue(quatePage.quoteFrame.isDisplayed());

}

    @When("user write text on quate")
    public void user_write_text_on_quate() {
quatePage.quoteFrame.sendKeys("Reminder monday meeting");
        BrowserUtils.wait(10);
    }

    @When("user clicks send button")
    public void user_clicks_send_button() {
   Driver.get().switchTo().parentFrame();
    quatePage.sendButton.click();
        BrowserUtils.wait(10);
    }
    @Then("verify that message is displayed")
    public void verify_that_message_is_displayed() {
     Assert.assertTrue(quatePage.blocquote.getText().contains("Reminder monday"));
    }




}
