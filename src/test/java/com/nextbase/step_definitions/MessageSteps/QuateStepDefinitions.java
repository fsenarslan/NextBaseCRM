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
   BrowserUtils.waitForClickablility(messagePage.quoteButton,10);
 //  BrowserUtils.wait(3);
    messagePage.quoteButton.click();
//BrowserUtils.wait(3);

    }

    @Then("quate should displayed")
    public void quate_should_displayed() {

      Driver.get().switchTo().frame(messagePage.iframe);
       BrowserUtils.waitForVisibility(messagePage.quoteFrame,10);
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


    public static class insertVideoURL_StepDefinitions {

        MessagePage messagePage = new MessagePage();

        @When("user clicks video insert button")
        public void user_clicks_video_insert_button() {
            BrowserUtils.wait(3);
            messagePage.insertVideoButton.click();
        }

        @When("user enter the video URL in the video icon")
        public void user_enter_the_video_URL_in_the_video_icon() {
            messagePage.videoIcon.sendKeys("https://www.youtube.com/watch?v=oWySXqcCcxQ");
            BrowserUtils.wait(3);
        }

        @When("user clicks the video save button")
        public void user_clicks_the_video_save_button() {
            //   BrowserUtils.waitForPresenceOfElement(By.cssSelector("input[xpath=\"1\"]"),20);
            BrowserUtils.wait(20);
            messagePage.videoSaveButton.click();
        }

        @When("user clicks the send button")
        public void user_clicks_the_send_button() {
            messagePage.sendButton.click();
            BrowserUtils.wait(5);
        }

        @Then("verify that video URL is entered")
        public void verify_that_video_URL_is_entered() {

            Assert.assertTrue(messagePage.verifyVideo.isDisplayed());
        }


    }
}
