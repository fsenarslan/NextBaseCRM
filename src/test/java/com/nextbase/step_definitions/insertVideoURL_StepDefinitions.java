package com.nextbase.step_definitions;

import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class insertVideoURL_StepDefinitions {

    MessagePage messagePage = new MessagePage();

    @When("user clicks video insert button")
    public void user_clicks_video_insert_button() {
        BrowserUtils.wait(3);
        messagePage.insertVideoButton.click();

    }

    @When("user enter the video URL in the video icon")
    public void user_enter_the_video_URL_in_the_video_icon() {
        messagePage.videoIcon.sendKeys("https://www.youtube.com/watch?v=f1wnYdLEpgI&feature=youtu.be");
        BrowserUtils.wait(20);
    }

    @Then("verify the video title")
    public void verify_the_video_title() {

         messagePage.saveButton.click();

    }

    @Then("verify that video URL is entered")
    public void verify_that_video_URL_is_entered() {

        String expectedURL = "https://www.youtube.com/watch?v=QJqNYhiHysM";
        String actualURL = messagePage.videoIcon.getText();
        System.out.println(actualURL);

        Assert.assertEquals( expectedURL,actualURL);
    }
}
