package stepdefs;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterData;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCFNOLNewExposureSteps extends BaseTest {
	
	public void completeFNOLExposureForTestScenario(ClaimCenterData scenarioData)
	{
		//TODO - change to use ScenarioData
		
		
	}
	
	@Then("^I will be on the new exposure screen for FNOL$")
	public void i_will_be_on_newexposure_screen_for_FNOL() throws Throwable {
		fnolNewExposurePOM.isPageTitleDisplayed("New Exposure");
	}
	
	
	
	@Given("^I select \"([^\"]*)\" on new exposure screen for FNOL$")
	public void i_select_on_expsoure_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Ok":
	    	fnolNewExposurePOM.selectOK();
	    	break;
	    case "Cancel":
	    	fnolNewExposurePOM.selectCancel();;
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new exposure screen for FNOL$")
	public void i_select_from_field_on_exposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	    case "Address Type":
	    	//fnolPedestrianPOM.selectAddressType(fieldValue);
	    	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on new exposure screen for FNOL$")
	public void i_input_into_the_box_on_exposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	   //TODO
	    case "Address Line3":
	    	fnolPedestrianPOM.setAddressLine3(fieldValue);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	

	@Given("^I complete fields on FNOL new exposure screen$")
	public void i_complete_all_fields() throws Throwable {
		
	
	
		fnolNewExposurePOM.selectOK();
		
	}
	
	@Then("^I will see the error messages on the New Exposures screen$")
	public void i_will_see_the_error_messages_on_the_New_Exposures_screen(DataTable dt) throws Throwable {
	  	List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(fnolNewExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
	}

}
