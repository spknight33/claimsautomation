package stepdefs.postfnol.tpcare;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLTPCareSteps extends BaseTest{
	
	
	
	
	
	
	@Given("^I click edit button on TP Care screen$")
	public void edit() {
		
		postFnolTPCarePOM.edit();
	}
	@Given("^I click update button on TP Care screen$")
	public void update() {
		
		postFnolTPCarePOM.update();
	}
	@Given("^I click cancel button on TP Care screen$")
	public void cancel() {
		
		postFnolTPCarePOM.cancel();
	}
	
	

	@Then("^I will be on TP Care screen$")
	public void i_will_be_on_TPcare() throws Throwable {
		postFnolTPCarePOM.isPageTitleDisplayed("TP Care");
	}
	
	

	
	@Given("^I select \"([^\"]*)\" from field \"([^\"]*)\" on TP Care screen for row \"([^\"]*)\"\\)$")
	public void i_select_from_field_on_tpcare_screen(String fieldValue, String fieldName, String row) throws Throwable {
		switch(fieldName)
		    {
		    case "Capture Opportunity":
		    	postFnolTPCarePOM.selectCaptureOpporunityForRow(row, fieldValue);
		    	break;
		    case "Lead Type":
		    	postFnolTPCarePOM.selectCaptureLeadTypeForRow(row, fieldValue);
		    	break;
		    case "Reason (No Opportunity)":
		    	postFnolTPCarePOM.selectCaptureReasonForRow(row, fieldValue);
		    	break;
		    case "1st Call Attempt":
		    	postFnolTPCarePOM.select1stCallForRow(row, fieldValue);
		    	break;
		    case "2nd Call Attempt":
		    	postFnolTPCarePOM.select2ndCallForRow(row, fieldValue);
		    	break;
		    case "Captured?":
		    	postFnolTPCarePOM.selectCapturedForRow(row, fieldValue);
		    	break;
		    case "Capture Result":
		    	postFnolTPCarePOM.selectCaptureResultForRow(row, fieldValue);
		    	break;
		    case "Reason (Not Captured)":
		    	postFnolTPCarePOM.selectReasonNotCapturedForRow(row, fieldValue);
		    	break;
		    case "Intervention":
		    	postFnolTPCarePOM.selectInterventionForRow(row, fieldValue);
		    	break;
	
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	
	@Given("^I select \"([^\"]*)\" from field \"([^\"]*)\" on TP Care screen for claimant \"([^\"]*)\" role \"([^\"]*)\" and incident \"([^\"]*)\"$")
	public void i_select_from_field_on_tpcare_screen_for_claimant(String fieldValue, String fieldName, String claimant,String role, String incident) throws Throwable {
		switch(fieldName)
		    {
		    case "Capture Opportunity":
		    	postFnolTPCarePOM.selectCaptureOpportunity(claimant, role, incident, fieldValue);
		    	break;
		    case "Lead Type":
		    	postFnolTPCarePOM.selectCaptureLeadType(claimant, role, incident, fieldValue);
		    	break;
		    case "Reason (No Opportunity)":
		    	postFnolTPCarePOM.selectCaptureReason(claimant, role, incident,  fieldValue);
		    	break;
		    case "1st Call Attempt":
		    	postFnolTPCarePOM.select1stCall(claimant, role, incident,  fieldValue);
		    	break;
		    case "2nd Call Attempt":
		    	postFnolTPCarePOM.select2ndCall(claimant, role, incident,  fieldValue);
		    	break;
		    case "Captured?":
		    	postFnolTPCarePOM.selectCaptured(claimant, role, incident,  fieldValue);
		    	break;
		    case "Capture Result":
		    	postFnolTPCarePOM.selectCaptureResult(claimant, role, incident,  fieldValue);
		    	break;
		    case "Reason (Not Captured)":
		    	postFnolTPCarePOM.selectReasonNotCaptured(claimant, role, incident, fieldValue);
		    	break;
		    case "Intervention":
		    	postFnolTPCarePOM.selectIntervention(claimant, role, incident,  fieldValue);
		    	break;
	
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	


	

}
