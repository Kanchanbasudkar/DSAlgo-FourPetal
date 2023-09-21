package com.dsalgo.util;

import com.dsalgo.factory.BrowserDriver;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    public static BrowserDriver driver;
    @Before
    public void setup(){
        driver = new BrowserDriver();
    }
    @After
    public void teardown(){
        driver.close();
    }
}
