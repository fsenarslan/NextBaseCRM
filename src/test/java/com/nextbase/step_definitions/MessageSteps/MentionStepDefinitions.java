package com.nextbase.step_definitions.MessageSteps;

import com.github.javafaker.Faker;
import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MentionStepDefinitions {

    MessagePage messagePage = new MessagePage();
    Faker faker = new Faker();

    @When("user clicks mention button")
    public void user_clicks_mention_button() {
        BrowserUtils.waitForVisibility(messagePage.mentionButton,10);
       messagePage.mentionButton.click();
        //BrowserUtils.wait(3);
    }

    @When("user clicks contact button")
    public void user_clicks_contact_button() {
        BrowserUtils.waitForClickablility(messagePage.selectContactButton,10);
        BrowserUtils.clickWithJS(messagePage.selectContactButton);
        //BrowserUtils.wait(3);
    }

    @When("user choose mail address")
    public void user_choose_mail_address() {
        BrowserUtils.waitForVisibility(messagePage.usersMailAddress,10);
        messagePage.usersMailAddress.click();
        //BrowserUtils.wait(3);
    }

    @When("user enter a fake email")
    public void user_enter_a_fake_email() {
        String email = faker.internet().emailAddress();
        //BrowserUtils.wait(2);
        BrowserUtils.waitForVisibility(messagePage.addEmployer,10);
        messagePage.addEmployer.click();
        BrowserUtils.waitForVisibility(messagePage.toInbox,10);
        //BrowserUtils.wait(3);
        messagePage.toInbox.clear();
        messagePage.toInbox.sendKeys(email);
        BrowserUtils.waitForVisibility(messagePage.emailPopUp,15);
        messagePage.toInbox.click();
        BrowserUtils.waitForVisibility(messagePage.emailPopUpClose,15);
        messagePage.emailPopUpClose.click();
        //BrowserUtils.wait(3);
    }



    @Then("verify that mention is displayed")
    public void verify_that_mention_is_displayed() {
        BrowserUtils.waitForVisibility(messagePage.sendButton,10);
        messagePage.sendButton.click();
        BrowserUtils.waitForStaleElement(messagePage.checkMessage);
        Assert.assertTrue(messagePage.checkMessage.isDisplayed());
        BrowserUtils.wait(5);
    }




}
