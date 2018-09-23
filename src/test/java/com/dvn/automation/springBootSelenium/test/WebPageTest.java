package com.dvn.automation.springBootSelenium.test;

import com.dvn.automation.springBootSelenium.base.AbstractTest;
import com.dvn.automation.springBootSelenium.page.GoogleSearch;
import com.dvn.automation.springBootSelenium.page.Yahoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;



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
    }

    @Test
    public void verifyGoogleHomePageUS(){

        googleSearch.launchGoogleSearch();
        googleSearch.enterSearchTermAs("US");
        googleSearch.submit();
    }

    @Test
    public void verifyYahooHomePageUS(){

        yahoo.launchYahoo();
        yahoo.enterSearchTermAs("US");
        yahoo.submit();
    }


}
