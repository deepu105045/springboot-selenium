package com.dvn.automation.springBootSelenium.base;

import com.dvn.automation.springBootSelenium.properties.Prop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static java.lang.ThreadLocal.withInitial;

@Component
public class DriverFactory {
    Logger logger = LoggerFactory.getLogger(this.getClass());


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
