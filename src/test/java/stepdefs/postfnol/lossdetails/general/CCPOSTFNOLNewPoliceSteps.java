package stepdefs.postfnol.lossdetails.general;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

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
		
		String fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceDateReported");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setDateReported(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceTimeReported");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setTimeReported(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceIncidentRef");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setIncidentReference(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceCrimeRef");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setCrimeReference(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceDateOfficerName");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setOfficerName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceBadgeNumber");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setBadgeNumber(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceAttended");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) 
		{
			postFnolNewPolicePOM.selectPoliceAttended(true);
		
		}
		else
		{
			postFnolNewPolicePOM.selectPoliceAttended(false);
		}
		
		if (fieldValue !=null)
			postFnolNewPolicePOM.setBadgeNumber(fieldValue);
		
	
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceFutherAction");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) 
		{
			postFnolNewPolicePOM.selectFurtherAction(true);
			fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceFutherActionDetails");
			postFnolNewPolicePOM.setFurtherActionDetails(fieldValue);
		}
		else
		{
			postFnolNewPolicePOM.selectFurtherAction(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceApprehended");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) 
		{
			postFnolNewPolicePOM.selectApprehended(true);
			fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceApprehendedDetails");
			postFnolNewPolicePOM.setApprehendedDetails(fieldValue);
		}
		else
		{
			postFnolNewPolicePOM.selectApprehended(false);
		}
			
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceDateReported");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setBadgeNumber(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceDateReported");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setBadgeNumber(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceDateReported");
		if (fieldValue !=null)
			postFnolNewPolicePOM.setBadgeNumber(fieldValue);
		
		postFnolNewPolicePOM.selectSearchPoliceForce();
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PoliceForceSearchName");
		searchContactSteps.searchForContactAndSelectFirst("PoliceForce_itb", fieldValue);
		// search contact manager for force
	
		
		postFnolNewPolicePOM.selectOK();
		
	}

}
