package com.dvn.automation.springBootSelenium.page;

import com.dvn.automation.springBootSelenium.base.AbstractPage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;


@Component
public class GoogleSearch extends AbstractPage {

    public void launchGoogleSearch() {
        super.navigate("https://www.google.com/");
    }

    public void enterSearchTermAs(String text) {
        enterText(By.name("q"),text);
    }

    public void submit(){
        click(By.name("btnK"));
    }
}
