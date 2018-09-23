package com.dvn.automation.springBootSelenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.ThreadLocal.withInitial;

public class DriverFactory {
    private DriverFactory(){}

    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance(){
        return instance;
    }

    ThreadLocal<WebDriver> driver = withInitial(() -> {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        return new ChromeDriver();
    });

    public WebDriver getDriver(){
        return driver.get();
    }

    public void removeDriver(){
        driver.get().quit();
        driver.remove();
    }
}
