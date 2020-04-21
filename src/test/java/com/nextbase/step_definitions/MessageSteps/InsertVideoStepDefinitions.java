package com.nextbase.step_definitions.MessageSteps;

import com.nextbase.pages.MessagePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InsertVideoStepDefinitions {

    MessagePage messagePage = new MessagePage();

    @When("user clicks video insert button")
    public void user_clicks_video_insert_button() {
       BrowserUtils.wait(3);
        messagePage.insertVideoButton.click();
    }

    @When("user enter the video URL in the video icon")
    public void user_enter_the_video_URL_in_the_video_icon() {
        messagePage.videoIcon.sendKeys("https://www.youtube.com/watch?v=ZRGTrGvUrUs");
       // BrowserUtils.wait(3);
    }

    @When("user clicks the video save button")
    public void user_clicks_the_video_save_button() {
        //   BrowserUtils.waitForPresenceOfElement(By.cssSelector("input[xpath=\"1\"]"),20);
       // BrowserUtils.wait(20);
        messagePage.videoSaveButton.click();
    }

    @Then("verify that video URL is entered")
    public void verify_that_video_URL_is_entered() {
       // BrowserUtils.wait(4);
       Assert.assertTrue(messagePage.verifyVideo.isDisplayed());
    }

}
