package com.dvn.automation.springBootSelenium.properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Prop {

    @Autowired
    Environment environment;

    public String getBrowser(){
        return environment.getProperty("browser");
    }
}
