package com.nextbase.step_definitions.MessageSteps;

import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class InsertVideoStepDefinitions {

    MessagePage messagePage = new MessagePage();

    @When("user clicks video insert button")
    public void user_clicks_video_insert_button() {
        BrowserUtils.wait(3);
        messagePage.insertVideoButton.click();
    }

    @When("user enter the video URL in the video icon")
    public void user_enter_the_video_URL_in_the_video_icon() {


    }

    @When("user clicks the video save button")
    public void user_clicks_the_video_save_button() {
      BrowserUtils.waitForVisibility(messagePage.videoTitle,15);
      BrowserUtils.wait(20);
        messagePage.videoSaveButton.click();
    }

    @Then("verify that video URL is entered")
    public void verify_that_video_URL_is_entered() {
    BrowserUtils.waitForVisibility(messagePage.verifyVideo,15);
       Assert.assertTrue(messagePage.verifyVideo.isDisplayed());
    }

}
