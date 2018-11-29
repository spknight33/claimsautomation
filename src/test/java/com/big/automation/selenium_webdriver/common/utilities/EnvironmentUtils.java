package com.big.automation.selenium_webdriver.common.utilities;

import com.big.automation.selenium_webdriver.common.types.Environment;

public class EnvironmentUtils {

    public static Environment getEnvironment(){

        String environmentProperty =  System.getProperty("environment");

        if(environmentProperty == null){
            throw new IllegalStateException("Environment system property not set");
        }

        return Environment.valueOf(environmentProperty);
    }
}
