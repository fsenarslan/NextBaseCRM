package com.nextbase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com\\nextbase\\step_definitions",

        dryRun = false,

        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"}
)
public class RegressionRunner{
}