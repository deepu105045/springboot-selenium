package com.dvn.automation.springBootSelenium.page;

import com.dvn.automation.springBootSelenium.base.AbstractPage;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Yahoo extends AbstractPage{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private By searchBoxLocator = By.id("uh-search-box");
    private By searchButton = By.id("uh-search-button");
    String yahooURL="https://in.yahoo.com/";

    public void launchYahoo(){
        navigate(yahooURL);
        logger.info("Launch yahoo search page : " + yahooURL);

    }

    public void enterSearchTermAs(String text) {
        enterText(searchBoxLocator,text);
        logger.info("Yahoo enter search term : " + text);

    }

    public void submit(){
        click(searchButton);
        logger.info("Submit");

    }
}
