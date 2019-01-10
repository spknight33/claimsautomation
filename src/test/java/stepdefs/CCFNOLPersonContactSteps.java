package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLPersonContactSteps extends BaseTest {
	
	
	
	
	@Then("^I will be on person contact screen for FNOL$")
	public void i_will_be_on_personcontact_screen_for_FNOL() throws Throwable {
	    personContactDetailsPOM.isPageTitleDisplayed("Person Details");
	}

	
	@Given("^I select \"([^\"]*)\" on person details screen$")
	public void i_select_on_persondetails_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Update":
	    	personContactDetailsPOM.selectUpdate();
	    	break;
	    case "Cancel":
	    	personContactDetailsPOM.selectCancel();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on person details screen$")
	public void i_select_from_field_on_persondetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Prefix":
		    	personContactDetailsPOM.selectPrefix(fieldValue);
		    	break;
	    case "Address Type":
	    	personContactDetailsPOM.selectAddressType(fieldValue);
	    	break;
	    
	   
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on person details screen$")
	public void i_input_into_the_box_on_persondetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "First Name":
	    	personContactDetailsPOM.setFirstName(fieldValue);
	    	break;
	    case "Last Name":
	    	personContactDetailsPOM.setLastName(fieldValue);
	    	break;
	    case "Mobile":
	    	personContactDetailsPOM.setMobile(fieldValue);
	    	break;
	    case "Email":
	    	personContactDetailsPOM.setEmail(fieldValue);
	    	break;
	    case "Address Line1":
	    	personContactDetailsPOM.setAddressLine1(fieldValue);
	    	break;
	    case "Address Line2":
	    	personContactDetailsPOM.setAddressLine2(fieldValue);
	    	break;
	    case "Address Line3":
	    	personContactDetailsPOM.setAddressLine3(fieldValue);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Then("^I complete the \"([^\"]*)\" details on the new person contact screen$")
	public void i_complete_the_details_on_the_new_person_contact_screen(String type) throws Throwable {
		switch(type)
	    {
	    case "Claimant":
	    	//TODO get claimant from testdata scenario case
	    	personContactDetailsPOM.selectPrefix("Ms.");
	    	personContactDetailsPOM.setFirstName("Joan");
	    	personContactDetailsPOM.setLastName("Arc");
	    	personContactDetailsPOM.setMobile("07771438079");
	    	personContactDetailsPOM.setPostCode("NE31PX");
	    	personContactDetailsPOM.setAddressLine1("1 The stake");
	    	break;
	   
	    
	    default:
	    Assert.fail("unknown input field :"+ type+" - check cucumber script!");
	    }
		personContactDetailsPOM.selectUpdate();
	}
	

}
