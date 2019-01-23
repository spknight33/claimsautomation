package stepdefs.fnol;

import org.testng.Assert;


import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCFNOLNewPoliceSteps extends BaseTest {
	
	
	SearchAddressBookSteps searchContactSteps = new SearchAddressBookSteps();
	
	/**
	 * Used for Regression scripts
	 * @param scenarioData
	 * @throws Throwable
	 */
	public void completeFNOLNewPoliceForTestScenario()  throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceDateReported");
		if (fieldValue !=null)
			fnolNewPolicePOM.setDateReported(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceTimeReported");
		if (fieldValue !=null)
			fnolNewPolicePOM.setTimeReported(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceIncidentRef");
		if (fieldValue !=null)
			fnolNewPolicePOM.setIncidentReference(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceCrimeRef");
		if (fieldValue !=null)
			fnolNewPolicePOM.setCrimeReference(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceDateOfficerName");
		if (fieldValue !=null)
			fnolNewPolicePOM.setOfficerName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceBadgeNumber");
		if (fieldValue !=null)
			fnolNewPolicePOM.setBadgeNumber(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceAttended");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) 
		{
			fnolNewPolicePOM.selectPoliceAttended(true);
		
		}
		else
		{
			fnolNewPolicePOM.selectPoliceAttended(false);
		}
		
		if (fieldValue !=null)
			fnolNewPolicePOM.setBadgeNumber(fieldValue);
		
	
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceFutherAction");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) 
		{
			fnolNewPolicePOM.selectFurtherAction(true);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceFutherActionDetails");
			fnolNewPolicePOM.setFurtherActionDetails(fieldValue);
		}
		else
		{
			fnolNewPolicePOM.selectFurtherAction(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceApprehended");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) 
		{
			fnolNewPolicePOM.selectApprehended(true);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceApprehendedDetails");
			fnolNewPolicePOM.setApprehendedDetails(fieldValue);
		}
		else
		{
			fnolNewPolicePOM.selectApprehended(false);
		}
			
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceDateReported");
		if (fieldValue !=null)
			fnolNewPolicePOM.setBadgeNumber(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceDateReported");
		if (fieldValue !=null)
			fnolNewPolicePOM.setBadgeNumber(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceDateReported");
		if (fieldValue !=null)
			fnolNewPolicePOM.setBadgeNumber(fieldValue);
		
		fnolNewPolicePOM.selectSearchPoliceForce();
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PoliceForceSearchName");
		searchContactSteps.searchForContactAndSelectFirst("PoliceForce_itb", fieldValue);
		// search contact manager for force
	
		
		fnolNewPolicePOM.selectOK();
	}
	
	
	
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
		
		this.completeFNOLNewPoliceForTestScenario();
		
	}

}
