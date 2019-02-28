package stepdefs.postfnol.tpcare;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;
import stepdefs.fnol.services.CCFNOLNewServiceSteps;

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
	
	
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	


	

}
