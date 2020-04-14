package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenuItemsSubTitleStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("user navigates to {string}")
    public void user_navigates_to(String menuItem) {
        loginPage.menuNavigation(menuItem);
    }

    @Then("page subtitle should be {string}")
    public void page_subtitle_should_be(String pageSubTitle) {
        String expectedTitle = pageSubTitle;
        String actualTitle = loginPage.getPageSubTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
