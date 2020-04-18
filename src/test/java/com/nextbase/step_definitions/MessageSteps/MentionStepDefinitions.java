package com.nextbase.step_definitions.MessageSteps;

import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MentionStepDefinitions {

    MessagePage messagePage = new MessagePage();

    @When("user clicks mention button")
    public void user_clicks_mention_button() {
        BrowserUtils.waitForVisibility(messagePage.mentionButton,10);
       messagePage.mentionButton.click();
        BrowserUtils.wait(3);
    }

    @When("user clicks contact button")
    public void user_clicks_contact_button() {
//        BrowserUtils.waitForClickablility(messagePage.selectContactButton,10);
//        messagePage.selectContactButton.click();
//        BrowserUtils.wait(3);
        BrowserUtils.clickWithJS(messagePage.selectContactButton);
        BrowserUtils.wait(3);
    }

//    @When("user clicks cyberVet button")
//    public void user_clicks_cyberVet_button() {
//        BrowserUtils.waitForVisibility(messagePage.cyberVetButton,10);
//        messagePage.cyberVetButton.click();
//        BrowserUtils.wait(3);
//    }

    @When("user choose mail address")
    public void user_choose_mail_address() {
        BrowserUtils.waitForVisibility(messagePage.usersMailAddress,10);
        messagePage.usersMailAddress.click();
        BrowserUtils.wait(3);
    }

    @Then("verify that mention is displayed")
    public void verify_that_mention_is_displayed() {
        BrowserUtils.waitForVisibility(messagePage.sendButton,10);
        messagePage.sendButton.click();
        BrowserUtils.waitForVisibility(messagePage.checkMessage,10);
        Assert.assertTrue(messagePage.checkMessage.isDisplayed());
        BrowserUtils.wait(5);
    }


}