package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLNewPoliceSteps extends BaseTest {
	
	
	SearchAddressBookSteps searchContactSteps = new SearchAddressBookSteps();
	
	@Then("^I will be on new police details screen for FNOL$")
	public void i_will_be_on_newpolice_screen_for_FNOL() throws Throwable {
		fnolNewPolicePOM.isPageTitleDisplayed("Police Details");
	}

	
	@Given("^I select \"([^\"]*)\" on new police details screen for FNOL$")
	public void i_select_on_policedetails_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Ok":
	    	fnolNewPolicePOM.selectOK();
	    	break;
	    case "Cancel":
	    	fnolNewPolicePOM.selectCancel();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on new police details screen for FNOL$")
	public void i_input_into_the_box_on_policedetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Date Reported":
	    	fnolNewPolicePOM.setDateReported(fieldValue);
	    	break;
	    case "Time Reported":
	    	fnolNewPolicePOM.setTimeReported(fieldValue);
	    	break;
	    case "Incident Reference":
	    	fnolNewPolicePOM.setIncidentReference(fieldValue);
	    	break;
	    case "Crime Reference":
	    	fnolNewPolicePOM.setCrimeReference(fieldValue);
	    	break;
	    case "Officer Name":
	    	fnolNewPolicePOM.setOfficerName(fieldValue);
	    	break;
	    case "Badge Number":
	    	fnolNewPolicePOM.setBadgeNumber(fieldValue);
	    	break;
	    case "Police Attended":
	    	fnolNewPolicePOM.selectPoliceAttended(true);
	    	break;
	    case "Police Not Attended":
	    	fnolNewPolicePOM.selectPoliceAttended(false);
	    	break;
	    //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	

	@Given("^I complete fields on FNOL new police details screen$")
	public void i_complete_all_fields() throws Throwable {
		
		fnolNewPolicePOM.setDateReported("01/01/2019");
		fnolNewPolicePOM.setTimeReported("10:00 AM");
		fnolNewPolicePOM.setIncidentReference("MYREF123");
		fnolNewPolicePOM.setCrimeReference("CR3444");
		fnolNewPolicePOM.setOfficerName("Officer Dibble");
		fnolNewPolicePOM.setBadgeNumber("999111");
		
		fnolNewPolicePOM.selectSearchPoliceForce();
		searchContactSteps.searchForContactAndSelectFirst("PoliceForce_itb", "Avon and somerset");
		// search contact manager for force
		fnolNewPolicePOM.selectPoliceAttended(true);
		fnolNewPolicePOM.selectFurtherAction(true);
		fnolNewPolicePOM.selectApprehended(true);
		fnolNewPolicePOM.setFurtherActionDetails("Further action will be required");
		fnolNewPolicePOM.setApprehendedDetails("The suspect has been apprehended");
		
		fnolNewPolicePOM.selectOK();
		
	}

}
