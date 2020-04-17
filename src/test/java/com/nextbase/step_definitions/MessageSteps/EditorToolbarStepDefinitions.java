package com.nextbase.step_definitions.MessageSteps;

import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class EditorToolbarStepDefinitions {

    MessagePage messagePage = new MessagePage();

    @When("user clicks editor Button")
    public void user_clicks_editor_Button() {
        BrowserUtils.waitForClickablility(messagePage.editorButton, 10);
        messagePage.editorButton.click();
    }

    @Then("Verify editor toolbar display")
    public void verify_editor_toolbar_display() {
        BrowserUtils.wait(10);
        messagePage.editorToolBar.isDisplayed();
    }

    @When("user clicks fontButton")
    public void user_clicks_fontButton() {
      // BrowserUtils.waitForClickablility(messagePage.fontButton,10);
      BrowserUtils.wait(10);
        messagePage.fontButton.click();

    }

    @Then("Verify that fontButtons are available")
    public void verify_that_fontButtons_are_available(List<String> dataTable) {
        int i=0;
        for (WebElement each:messagePage.fontOptions){
            Assert.assertEquals(dataTable.get(i),each.getText());
            i+=1;
        }
    }

}
