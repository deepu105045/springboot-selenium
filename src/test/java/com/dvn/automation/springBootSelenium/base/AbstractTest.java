package com.dvn.automation.springBootSelenium.base;

import com.dvn.automation.springBootSelenium.SpringBootSeleniumApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;

@SpringBootTest(classes = SpringBootSeleniumApplication.class)
public class AbstractTest  extends AbstractTestNGSpringContextTests{

    @AfterMethod
    public void close(){
        System.out.println("After test  " +  ". Thread id is: " + Thread.currentThread().getId());
        DriverFactory.getInstance().removeDriver();
    }
}
