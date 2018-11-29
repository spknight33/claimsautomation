package com.big.automation.selenium_webdriver.common.rules;

import java.util.logging.Level;
import java.util.logging.Logger;



import static java.lang.String.format;

public class LoggerRule  {
    private Logger logger;

    public Logger getLogger() {
        return this.logger;
    }
    
    public LoggerRule() {
		// TODO Auto-generated constructor stub
    	 logger = Logger.getLogger(Logger.class.getName());
         logger.log(Level.INFO, format("Starting test: %s ", "Test started"));
         logger.log(Level.INFO, format("Ending test: %s ", "Test End"));
    	
	}

}
