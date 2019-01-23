package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLEditDriverSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	
	
	@Then("^I will be on edit Driver screen for post FNOL$")
	public void i_will_be_on_driver_screen_for_postFNOL() throws Throwable {
	    postFnolEditDriverPOM.isPageTitleDisplayed("Driver Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit driver screen for post FNOL$")
	public void i_select_from_field_on_driver_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Driver Name":
	    	postFnolEditDriverPOM.selectDriverName(fieldValue);
	    	break;
	    case "Related To":
	    	postFnolEditDriverPOM.selectRelationToOwner(fieldValue);
	    	break;
	    case "Prefix":
	    	postFnolEditDriverPOM.selectPrefix(fieldValue);
	    	break;
	    case "Address Type":
	    	postFnolEditDriverPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	postFnolEditDriverPOM.selectGender(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on edit driver screen for post FNOL$")
	public void okorupdate() {
		
		postFnolEditDriverPOM.selectOKOrUpdate();
	}
	
	@Given("^I click cancel button on edit driver screen for post FNOL$")
	public void cancel() {
		
		postFnolEditDriverPOM.cancel();
	}
	
	
}
