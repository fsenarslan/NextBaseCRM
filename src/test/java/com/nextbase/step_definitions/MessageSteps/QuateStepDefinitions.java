package com.nextbase.step_definitions.MessageSteps;

import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class QuateStepDefinitions {
MessagePage messagePage=new MessagePage();


    @When("user clicks comma button")
    public void user_clicks_comma_button() throws InterruptedException {
        BrowserUtils.waitForClickablility(messagePage.quoteButton, 10);
        //  BrowserUtils.wait(3);
        messagePage.quoteButton.click();
        //BrowserUtils.wait(3);

    }

    @Then("quate should displayed")
    public void quate_should_displayed() {

        Driver.get().switchTo().frame(messagePage.iframe);
        BrowserUtils.waitForVisibility(messagePage.quoteFrame, 10);
        Assert.assertTrue(messagePage.quoteFrame.isDisplayed());

    }

    @When("user write text on quate")
    public void user_write_text_on_quate() {
messagePage.quoteFrame.sendKeys("Reminder monday meeting");
        BrowserUtils.wait(10);
    }

    @When("user clicks send button")
    public void user_clicks_send_button() {
        Driver.get().switchTo().parentFrame();
        messagePage.sendButton.click();
        BrowserUtils.wait(10);
    }

    @Then("verify that message is displayed")
    public void verify_that_message_is_displayed() {
        Assert.assertTrue(messagePage.blocquote.getText().contains("Reminder monday"));
    }


}
