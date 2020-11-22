package com.dvn.automation.springBootSelenium.stepDef;

import com.dvn.automation.springBootSelenium.page.GoogleSearch;
import com.dvn.automation.springBootSelenium.test.SpringIntegrationTest;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@CucumberContextConfiguration
@SpringBootTest
public class googleStepDef  {

    @Autowired
    GoogleSearch googleSearch;


    @When("I launch google.com")
    public void launchGoogle() {
        googleSearch.launchGoogleSearch();
    }



}
