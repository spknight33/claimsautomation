package stepdefs;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterData;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCPOSTFNOLEditExposureSteps extends BaseTest {
	
	public void completeFNOLExposureForTestScenario(ClaimCenterData scenarioData)
	{
		//TODO - change to use ScenarioData
		
		
	}
	
	
	
	
	@Given("^I select \"([^\"]*)\" on edit injury exposure screen for Post FNOL$")
	public void i_select_on_editinjuryexpsoure_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Update":
	    	postFnolEditInjuryExposurePOM.selectUpdate();
	    	break;
	    case "Cancel":
	    	postFnolEditInjuryExposurePOM.selectCancel();;
	    	break;
	    case "Edit":
	    	postFnolEditInjuryExposurePOM.selectEdit();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	@Given("^I select \"([^\"]*)\" on edit property exposure screen for Post FNOL$")
	public void i_select_on_editpropertyexpsoure_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Update":
	    	postFnolEditPropertyExposurePOM.selectUpdate();
	    	break;
	    case "Cancel":
	    	postFnolEditInjuryExposurePOM.selectCancel();;
	    	break;
	    case "Edit":
	    	postFnolEditInjuryExposurePOM.selectEdit();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	@Given("^I select \"([^\"]*)\" on edit vehicle exposure screen for Post FNOL$")
	public void i_select_on_editvehicleexposure_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Update":
	    	postFnolEditVehicleExposurePOM.selectUpdate();
	    	break;
	    case "Cancel":
	    	postFnolEditVehicleExposurePOM.selectCancel();;
	    	break;
	    case "Edit":
	    	postFnolEditVehicleExposurePOM.selectEdit();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	@When("^I click the uptoexposures link on \"([^\"]*)\" exposure screen for Post FNOL$")
	public void i_click_the_uptoexposures_link_on_exposure_screen_for_Post_FNOL(String exposureType) throws Throwable {
		switch(exposureType)
	    {
	    case "Vehicle":
	    	postFnolEditVehicleExposurePOM.selectUpToExposures();
	    	break;
	    case "Injury":
	    	postFnolEditInjuryExposurePOM.selectUpToExposures();
	    	break;
	    case "Property":
	    	postFnolEditPropertyExposurePOM.selectUpToExposures();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ exposureType+" - check cucumber script!");
	    }
		
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit injury exposure screen for Post FNOL$")
	public void i_select_from_field_on_injuryexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	    case "Claimant Type":
	    	postFnolEditInjuryExposurePOM.selectClaimantType(fieldValue);
	    	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit property exposure screen for Post FNOL$")
	public void i_select_from_field_on_propertyexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	    case "Claimant Type":
	    	postFnolEditPropertyExposurePOM.selectClaimantType(fieldValue);
	    	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit vehicle exposure screen for Post FNOL$")
	public void i_select_from_field_on_vehicleexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	    case "Claimant Type":
	    	postFnolEditVehicleExposurePOM.selectClaimantType(fieldValue);
	    	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	
	
	@Given("^I click \"([^\"]*)\" on claimant picker on edit injury exposure screen for Post FNOL$")
	public void i_click_on_injuryclaimant_picker(String option) throws Throwable {
		switch (option) {
		case "New Person":
			postFnolEditInjuryExposurePOM.selectNewClaimant();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	
	@Given("^I click \"([^\"]*)\" on injury picker on edit injury exposure screen for Post FNOL$")
	public void i_click_on_injury_picker(String option) throws Throwable {
		switch (option) {
		case "New Incident...":
			postFnolEditInjuryExposurePOM.selectNewInjury();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	@Given("^I click \"([^\"]*)\" on vehicle picker on edit vehicle exposure screen for Post FNOL$")
	public void i_click_on_vehicle_picker(String option) throws Throwable {
		switch (option) {
		case "New Incident...":
			postFnolEditVehicleExposurePOM.selectNewVehicle();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	
	@Then("^I will see the error messages on the edit injury exposure screen for Post FNOL$")
	public void i_will_see_the_error_messages_on_the_editinjury_Exposures_screen(DataTable dt) throws Throwable {
	  	List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(postFnolEditInjuryExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
	}
	@Then("^I will see the error messages on the edit vehicle exposure screen for Post FNOL$")
	public void i_will_see_the_error_messages_on_the_editvehicle_Exposures_screen(DataTable dt) throws Throwable {
	  	List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(postFnolEditVehicleExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
	}

}
