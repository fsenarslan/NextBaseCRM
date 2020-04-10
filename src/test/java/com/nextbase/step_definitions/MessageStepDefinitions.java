package com.nextbase.step_definitions;

import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class MessageStepDefinitions {

    MessagePage messagePage = new MessagePage();

    @When("user clicks message button")
    public void user_clicks_message_button() {
        //BrowserUtils.clickWithWait(messagePage.messageButton);
       BrowserUtils.clickWithJS(messagePage.messageButton);
    }

    @When("user clicks file upload button")
    public void user_clicks_file_upload_button() {
        messagePage.clickFileUploadButton();
    }

    @Then("user verifies that elements are displayed")
    public void user_verifies_that_elements_are_displayed() {
        messagePage.verifyElements();
    }
    @When("user clicks upload files button")
    public void user_clicks_upload_files_button() {
    }

    @When("user upload the file")
    public void user_upload_the_file() {
        messagePage.uploadfiles.sendKeys(System.getProperty("user.dir")+"/testfile.txt");
        BrowserUtils.wait(3);
    }

    @Then("Verify that file is uploaded")
    public void verify_that_file_is_uploaded() {
        BrowserUtils.waitForVisibility(messagePage.file,20);
        Assert.assertTrue(messagePage.file.isDisplayed());


        System.out.println("Conflict Practice");
    }

}
