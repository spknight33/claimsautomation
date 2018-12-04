package com.big.automation.selenium_webdriver.TestScripts.ClaimCenter.cucumberHook;

import org.openqa.selenium.NoAlertPresentException;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario(Scenario scenario){
        System.out.println("Cucumber Hook before the Scenario: "+scenario.getName());
        // needed before each scenario to allow login each time
        BaseTest.driver.manage().deleteAllCookies();
        
        try {
   
        	BaseTest.driver.switchTo().alert().accept();
        	
        
     	   }
     	   catch(NoAlertPresentException e) {
     		   System.out.print("Cucumber Hook before - No alert is present");
     	   }
    } 
 
    @After
    public void afterScenario(Scenario scenario){
        System.out.println("Cucumber Hook after the Scenario: "+scenario.getName());
             
         
 
        
        try {
        	
        	BaseTest.driver.switchTo().alert().accept();
        	
     	   }
     	   catch(NoAlertPresentException e) {
     		  System.out.print("Cucumber Hook after - No alert is present");
     	   }
        
        BaseTest.driver.manage().deleteAllCookies();
    }

}
