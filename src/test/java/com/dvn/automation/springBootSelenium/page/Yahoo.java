package com.dvn.automation.springBootSelenium.page;

import com.dvn.automation.springBootSelenium.base.AbstractPage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Yahoo extends AbstractPage{

    private By searchBoxLocator = By.id("uh-search-box");
    private By searchButton = By.id("uh-search-button");

    public void launchYahoo(){
        navigate("https://in.yahoo.com/");
    }

    public void enterSearchTermAs(String text) {
        enterText(searchBoxLocator,text);
    }

    public void submit(){
        click(searchButton);
    }
}
