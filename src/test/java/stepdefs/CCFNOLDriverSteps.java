package stepdefs;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLDriverSteps extends BaseTest {
	
	
	
	
	@Then("^I will be on Driver screen for FNOL$")
	public void i_will_be_on_driver_screen_for_FNOL() throws Throwable {
	    driverDetailsPOM.isPageTitleDisplayed("Driver Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on driver screen$")
	public void i_select_from_field_on_driver_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Driver Name":
	    	driverDetailsPOM.selectDriverName(fieldValue);
	    	break;
	  
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on driver screen$")
	public void next() {
		
		driverDetailsPOM.selectOK();
	}
}
