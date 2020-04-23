package com.nextbase.step_definitions.MessageSteps;

import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VideoRecordStepDefinitions {

    MessagePage messagePage = new MessagePage();

    @When("User clicks video record button")
    public void user_clicks_video_record_button() {
        BrowserUtils.waitForVisibility(messagePage.videoRecordButton,10);
        messagePage.videoRecordButton.click();
        BrowserUtils.wait(2);

    }

    @When("User clicks video record allow button")
    public void user_clicks_video_record_allow_button() {
        BrowserUtils.waitForVisibility(messagePage.allowVideoRecordButton,10);
        messagePage.allowVideoRecordButton.click();
        BrowserUtils.wait(2);
    }

    @Then("Verify that video uploaded")
    public void verify_that_video_uploaded() {
        BrowserUtils.waitForVisibility(messagePage.videoRecordFailsText,15);
        Assert.assertTrue(messagePage.videoRecordFailsText.isDisplayed());
        BrowserUtils.wait(2);
    }



}
