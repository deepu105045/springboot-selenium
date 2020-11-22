package com.dvn.automation.springBootSelenium.test;

import com.dvn.automation.springBootSelenium.base.AbstractTest;
import com.dvn.automation.springBootSelenium.page.GoogleSearch;
import com.dvn.automation.springBootSelenium.page.Pages;
import com.dvn.automation.springBootSelenium.page.Yahoo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;



public class WebPageTest  extends AbstractTest{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GoogleSearch googleSearch;

    @Autowired
    Yahoo yahoo;



    @Test
    public void verifyGoogleHomePage(){
        logger.info("Starting Google home page test");
        googleSearch.launchGoogleSearch();
        googleSearch.enterSearchTermAs("India");
        googleSearch.submit();

        logger.info("Google homepage test completed.");

    }

    @Test
    public void verifyYahooHomePage(){

        yahoo.launchYahoo();
        yahoo.enterSearchTermAs("India");
        yahoo.submit();

    }

    @Test
    public void verifyGoogleHomePageUS(){

        googleSearch.launchGoogleSearch();
        googleSearch.enterSearchTermAs("USA");
        googleSearch.submit();


    }

    @Test
    public void verifyYahooHomePageUS(){
        Pages.Yahoo.launchYahoo();
        Pages.Yahoo.enterSearchTermAs("USA");
        Pages.Yahoo.submit();


    }


}
