package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLPassengerSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	
	
	
	@Then("^I will be on Edit Passenger screen for post FNOL$")
	public void i_will_be_on_editpassenger_screen_for_postFNOL() throws Throwable {
	    postFnolEditPassengerPOM.isPageTitleDisplayed("Passenger Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit Passenger screen for post FNOL$")
	public void i_select_from_field_on_passenger_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Passenger Name":
	    	postFnolEditPassengerPOM.selectPassengerName(fieldValue);
	    	break;
	       case "Prefix":
	    	   postFnolEditPassengerPOM.selectPrefix(fieldValue);
	    	break;
	    case "Address Type":
	    	postFnolEditPassengerPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	postFnolEditPassengerPOM.selectGender(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on edit passenger screen for post FNOL$")
	public void okorupdate() {
		
		postFnolEditPassengerPOM.selectOKorUpdate();
	}
	
	@Given("^I click cancel button on edit passenger screen for post FNOL$")
	public void cancel() {
		
		postFnolEditPassengerPOM.cancel();
	}
	
	
}
