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

import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;


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
        BrowserUtils.wait(5);
        messagePage.verifyElements();
    }

    @When("user clicks upload files button")
    public void user_clicks_upload_files_button() {
//        BrowserUtils.clickWithJS(messagePage.uploadfiles);
//        BrowserUtils.wait(3);
    }

    @When("user upload the file")
    public void user_upload_the_file() {
//        try {
//            Runtime.getRuntime().exec(System.getProperty("user.dir")+"/FileUploud.exe");
//        }catch (IOException e) {
//            e.printStackTrace();
//        }

        messagePage.uploadfiles.sendKeys(System.getProperty("user.dir")+"testfile.txt");
        BrowserUtils.wait(3);
    }

    @Then("Verify that file is uploaded")
    public void verify_that_file_is_uploaded() {
        BrowserUtils.waitForVisibility(messagePage.file,20);
        Assert.assertTrue(messagePage.file.isDisplayed());
    }
////////////////LINK BUTTON /////////////////////////
    @When("user clicks link button")
    public void user_clicks_link_button() {
        messagePage.linkButton.click();
        BrowserUtils.wait(2);
    }

    @When("user insert link name")
    public void user_insert_link_name() {

        messagePage.linkText.sendKeys("Amazon link35");
   //     BrowserUtils.wait(2);
    }

    @When("user upload the link")
    public void user_upload_the_link() {
        messagePage.linkUrl.sendKeys("https://www.amazon.com/");
    //    BrowserUtils.wait(2);
    }

    @When("user clicks the save button")
    public void user_clicks_the_save_button() {
        messagePage.linkSaveButton.click();
      //  BrowserUtils.wait(3);
    }

    @Then("Verify that upload link")
    public void verify_that_upload_link() {
        messagePage.sendButton.click();
        Wait wait = new FluentWait(Driver.get())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);
        WebElement element = (WebElement) wait.until((Function<WebDriver, WebElement>) driver -> messagePage.verifyLink);

        Assert.assertEquals(messagePage.verifyLink.getText(),"Link to Amazon");
        Assert.assertTrue(messagePage.verifyLink.isDisplayed());
        BrowserUtils.wait(3);
    }
}
