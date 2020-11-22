package com.dvn.automation.springBootSelenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;

public enum DriverType  implements DriverSetup{

    CHROME{
        @Override
        public RemoteWebDriver getWebDriverObject(DesiredCapabilities desiredCapabilities) {
            HashMap<String, Object> chromePreferences = new HashMap<>();
            chromePreferences.put("profile.password_manager_enabled", false);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-default-browser-check");
            options.setExperimentalOption("prefs", chromePreferences);


            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

            return new ChromeDriver(options);
        }
    }


}
