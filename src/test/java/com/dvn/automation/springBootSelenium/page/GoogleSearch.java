package com.dvn.automation.springBootSelenium.page;

import com.dvn.automation.springBootSelenium.base.AbstractPage;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class GoogleSearch extends AbstractPage {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void launchGoogleSearch() {
        super.navigate("https://www.google.com/");
        logger.info("Launch google search page " + Thread.currentThread().getId());

    }

    public void enterSearchTermAs(String text) {
        enterText(By.name("q"),text);
        logger.info("Google enter search term " + Thread.currentThread().getId());

    }

    public void submit(){
        click(By.name("btnK"));
        logger.info("Google submit " + Thread.currentThread().getId());

    }
}
