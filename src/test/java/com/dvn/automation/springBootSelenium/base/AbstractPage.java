package com.dvn.automation.springBootSelenium.base;

import org.openqa.selenium.By;

public class AbstractPage {


    public void navigate(final String url){
        DriverFactory.getInstance().getDriver().navigate().to(url);
    }

    public void  enterText(By locator, String text){
        DriverFactory.getInstance().getDriver().findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        DriverFactory.getInstance().getDriver().findElement(locator).click();
    }

    public static void waitFor(int timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
