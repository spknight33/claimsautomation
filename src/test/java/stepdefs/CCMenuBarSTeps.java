package stepdefs;
 
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
 
public class CCMenuBarSTeps extends BaseTest	{
	
	
	
	@Given("^I Select New Claim$")
	 public void selectClaimsMenu()
    {
    	
    	menuBarPOM.selectClaimsMenu();
    }

	
    
	@Then("^I will log off$")
	public void i_will_log_off() throws Throwable {
		menuBarPOM.logout();
	}	
   
    
 
   
 
}