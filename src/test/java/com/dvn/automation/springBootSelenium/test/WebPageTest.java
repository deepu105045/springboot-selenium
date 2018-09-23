package com.dvn.automation.springBootSelenium.test;

import com.dvn.automation.springBootSelenium.base.AbstractTest;
import com.dvn.automation.springBootSelenium.base.DriverFactory;
import com.dvn.automation.springBootSelenium.page.GoogleSearch;
import com.dvn.automation.springBootSelenium.page.Yahoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.dvn.automation.springBootSelenium.base.AbstractPage.waitFor;


public class WebPageTest  extends AbstractTest{
    @Autowired
    GoogleSearch googleSearch;

    @Autowired
    Yahoo yahoo;

    @Test
    public void verifyGoogleHomePage(){

        googleSearch.launchGoogleSearch();
        googleSearch.enterSearchTermAs("India");
        googleSearch.submit();
    }

    @Test
    public void verifyYahooHomePage(){
        yahoo.launchYahoo();
        yahoo.enterSearchTermAs("India");
        yahoo.submit();
        waitFor(5000);
    }



}
