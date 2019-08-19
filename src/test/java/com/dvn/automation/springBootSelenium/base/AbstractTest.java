package com.dvn.automation.springBootSelenium.base;

import com.dvn.automation.springBootSelenium.SpringBootSeleniumApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;

@SpringBootTest(classes = SpringBootSeleniumApplication.class)
public class AbstractTest extends AbstractTestNGSpringContextTests{
    Logger logger = LoggerFactory.getLogger(this.getClass());


    @AfterMethod
    public void close(){
        logger.info("After Method :: Trying to close all web driver instances");
        DriverFactory.getInstance().removeDriver();
    }
}
