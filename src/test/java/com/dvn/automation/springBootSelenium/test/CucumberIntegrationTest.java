package com.dvn.automation.springBootSelenium.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.dvn.automation.springBootSelenium.stepDef"},
        plugin = {"pretty", "json:target/cucumber-report.json"}
        )


public class CucumberIntegrationTest {

}