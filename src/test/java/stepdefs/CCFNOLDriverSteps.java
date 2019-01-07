package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterData;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLDriverSteps extends BaseTest {
	
	public void completeFNOLDriverForTestScenario(ClaimCenterData scenarioData)
	{
		//TODO - use data from scenario
		fnolDriverDetailsPOM.setAddressLine1("9 Walkers Road");
		fnolDriverDetailsPOM.setFirstName("Jim");
		fnolDriverDetailsPOM.setLastName("Boyracer");
		
	
		fnolDriverDetailsPOM.selectOK();
	}
	
	
	@Then("^I will be on Driver screen for FNOL$")
	public void i_will_be_on_driver_screen_for_FNOL() throws Throwable {
	    fnolDriverDetailsPOM.isPageTitleDisplayed("Driver Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on driver screen$")
	public void i_select_from_field_on_driver_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Driver Name":
	    	fnolDriverDetailsPOM.selectDriverName(fieldValue);
	    	break;
	  
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on driver screen$")
	public void next() {
		
		fnolDriverDetailsPOM.selectOK();
	}
	
	@Given("^I complete fields on FNOL new TP driver incident$")
	public void i_complete_all_fields() throws Throwable {
		
		fnolDriverDetailsPOM.setAddressLine1("9 Walkers Road");
		fnolDriverDetailsPOM.setFirstName("Jim");
		fnolDriverDetailsPOM.setLastName("Boyracer");
		
	
		fnolDriverDetailsPOM.selectOK();
		
	}
}
