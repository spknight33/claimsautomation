package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewPoliceSteps extends BaseTest {
	
	// this could be combined with new police on fnol later..
	
	SearchAddressBookSteps searchContactSteps = new SearchAddressBookSteps();
	
	@Then("^I will be on new police details screen for post FNOL$")
	public void i_will_be_on_newpolice_screen_for_FNOL() throws Throwable {
		postFnolNewPolicePOM.isPageTitleDisplayed("Police Details");
	}

	
	@Given("^I select \"([^\"]*)\" on new police details screen for post FNOL$")
	public void i_select_on_policedetails_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Ok":
	    	postFnolNewPolicePOM.selectOK();
	    	break;
	    case "Cancel":
	    	postFnolNewPolicePOM.selectCancel();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on new police details screen for post FNOL$")
	public void i_input_into_the_box_on_policedetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Date Reported":
	    	postFnolNewPolicePOM.setDateReported(fieldValue);
	    	break;
	    case "Time Reported":
	    	postFnolNewPolicePOM.setTimeReported(fieldValue);
	    	break;
	    case "Incident Reference":
	    	postFnolNewPolicePOM.setIncidentReference(fieldValue);
	    	break;
	    case "Crime Reference":
	    	postFnolNewPolicePOM.setCrimeReference(fieldValue);
	    	break;
	    case "Officer Name":
	    	postFnolNewPolicePOM.setOfficerName(fieldValue);
	    	break;
	    case "Badge Number":
	    	postFnolNewPolicePOM.setBadgeNumber(fieldValue);
	    	break;
	    case "Police Attended":
	    	postFnolNewPolicePOM.selectPoliceAttended(true);
	    	break;
	    case "Police Not Attended":
	    	postFnolNewPolicePOM.selectPoliceAttended(false);
	    	break;
	    //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	

	@Given("^I complete fields on post FNOL new police details screen$")
	public void i_complete_all_fields() throws Throwable {
		
		postFnolNewPolicePOM.setDateReported("01/01/2019");
		postFnolNewPolicePOM.setTimeReported("10:00 AM");
		postFnolNewPolicePOM.setIncidentReference("MYREF123");
		postFnolNewPolicePOM.setCrimeReference("CR3444");
		postFnolNewPolicePOM.setOfficerName("Officer Dibble");
		postFnolNewPolicePOM.setBadgeNumber("999111");
		
		postFnolNewPolicePOM.selectSearchPoliceForce();
		searchContactSteps.searchForContactAndSelectFirst("PoliceForce_itb", "Avon and somerset");
		// search contact manager for force
		postFnolNewPolicePOM.selectPoliceAttended(true);
		postFnolNewPolicePOM.selectFurtherAction(true);
		postFnolNewPolicePOM.selectApprehended(true);
		postFnolNewPolicePOM.setFurtherActionDetails("Further action will be required");
		postFnolNewPolicePOM.setApprehendedDetails("The suspect has been apprehended");
		postFnolNewPolicePOM.setNotes("Office Dibble works nights");
		postFnolNewPolicePOM.selectOK();
		
	}

}
