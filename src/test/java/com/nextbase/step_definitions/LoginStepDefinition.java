package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class LoginStepDefinition {
    private static Logger logger= Logger.getLogger(LoginStepDefinition.class);
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        logger.info("User is on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @When("User logs in as Human Resources")
    public void user_logs_in_as_Human_Resources() {
        logger.info("User logs in as Human Resources");
        loginPage.login();
    }

    @When("User logs in as {string}")
    public void user_logs_in_as(String role) {
        logger.info("User logs in as a" + role);
        loginPage.login(role);
    }

    @Then("Verify that page title is {string}")
    public void verify_that_page_title_is(String title) {
        logger.info("Verify that page title is" + title);
        loginPage.verifyPageTitle(title);
    }
}
