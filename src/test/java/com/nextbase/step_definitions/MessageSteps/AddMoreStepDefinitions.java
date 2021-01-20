package com.nextbase.step_definitions.MessageSteps;

import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.apache.log4j.Logger;

import java.util.List;

public class AddMoreStepDefinitions {
    private static Logger logger=Logger.getLogger(AddMoreStepDefinitions.class);
    MessagePage messagePage = new MessagePage();

    @When("user clicks Add more")
    public void user_clicks_Add_more() {
        logger.info("user clicks Add more");
        BrowserUtils.waitForClickablility(messagePage.addMore,5);
        messagePage.addMore.click();
    }

    @Then("Verify that options available")
    public void verify_that_options_available(List<String> dataTable) {
        logger.info("Verify that options available");
        int i=0;
        for (WebElement each:messagePage.options){
            Assert.assertEquals(dataTable.get(i),each.getText());
            i+=1;
        }
        System.out.println("It should print Recent: "+dataTable.get(0));
        System.out.println("It should print E-mail users: "+dataTable.get(2));
    }
}
