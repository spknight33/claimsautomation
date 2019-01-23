package stepdefs.postfnol;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCPOSTFNOLEditDriverSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	
	
	@Then("^I will be on edit Driver screen for post FNOL$")
	public void i_will_be_on_driver_screen_for_postFNOL() throws Throwable {
	    postFnolDriverPOM.isPageTitleDisplayed("Driver Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit driver screen for post FNOL$")
	public void i_select_from_field_on_driver_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Driver Name":
	    	postFnolDriverPOM.selectDriverName(fieldValue);
	    	break;
	    case "Related To":
	    	postFnolDriverPOM.selectRelationToOwner(fieldValue);
	    	break;
	    case "Prefix":
	    	postFnolDriverPOM.selectPrefix(fieldValue);
	    	break;
	    case "Address Type":
	    	postFnolDriverPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	postFnolDriverPOM.selectGender(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on edit driver screen for post FNOL$")
	public void okorupdate() {
		
		postFnolDriverPOM.selectOKOrUpdate();
	}
	
	@Given("^I click cancel button on edit driver screen for post FNOL$")
	public void cancel() {
		
		postFnolDriverPOM.cancel();
	}
	
	
}
