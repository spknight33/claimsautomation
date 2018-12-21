package stepdefs;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLStep3Steps extends BaseTest {
	
	CCFNOLStep2Steps step2Steps = new CCFNOLStep2Steps();

	@Then("^I will be on step3 for FNOL$")
	public void i_will_be_on_step3_for_FNOL() throws Throwable {
		fnolStep3POM.isPageTitleDisplayed("Step 3 of 5: Add claim information");
	
		
	}
	

	
	@Given("^As a ClaimsHandler I am at step3 for FNOL$")
	public void as_a_ClaimsHandler_I_am_at_step3_for_FNOL() throws Throwable {
		step2Steps.as_a_ClaimsHandler_I_am_at_step2_for_FNOL();
		step2Steps.iCompleteStep2FNOL();
		i_will_be_on_step3_for_FNOL();
		// close any duplicate claim window
		fnolStep3POM.closeDuplicateClaimWindow();
	}
	@Given("^As a ClaimsHandler I am at step3 without insured vehicle for FNOL$")
	public void as_a_ClaimsHandler_I_am_at_step3_without_insured_vehiclefor_FNOL() throws Throwable {
		step2Steps.as_a_ClaimsHandler_I_am_at_step2_for_FNOL();
		step2Steps.iCompleteStep2FNOLWithoutInsuredVehicle();
		i_will_be_on_step3_for_FNOL();
		// close any duplicate claim window
		fnolStep3POM.closeDuplicateClaimWindow();
	}

	@Given("^I select the insureds vehicle at step3$")
	public void i_select_the_insureds_vehicle_at_step3() throws Throwable {
	    fnolStep3POM.selectInsuredVehicle();
	}

	
	@Then("^Mandatory field error messages will be shown for step3$")
	public void mandatory_field_error_messages_will_be_shown_forstep3(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(fnolStep2POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}
	
	public void mandatoryFieldErrorMessagesAreShown() {
		this.next();
		// in step 3, check error messages
		Assert.assertTrue(fnolStep3POM.containsErrorMessage("Incident Type : Missing required field \"Incident Type\""));
		Assert.assertTrue(fnolStep3POM
				.containsErrorMessage("Cause : Missing required field \"Cause\""));
		Assert.assertTrue(fnolStep3POM
				.containsErrorMessage("Sub Cause : Missing required field \"Sub Cause\""));
	}
	
	@Then("^the \"([^\"]*)\" list on step3 will contain options$")
	public void the_list_on_step3_will_contain_options(String fieldName,  DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				switch(fieldName)
			    {
			    case "Incident Type":
			    	//TODO change
			    	softAssert.assertTrue(fnolStep3POM.incidentTypeContainsOption(list.get(i)),fieldName + "Field option Check: "+ list.get(i));
			    	break;
			   
			    
			    default:
			    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
			    }
				
				
				
			}
			softAssert.assertAll();
	}
	
	@Then("^I select \"([^\"]*)\" from \"([^\"]*)\" field on step3$")
	public void i_select_from_field_on_step3(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Incident Type":
	    	fnolStep3POM.selectIncidentType(fieldValue);
	    	break;
	    case "Cause":
	    	fnolStep3POM.selectClaimCauseType(fieldValue);
	    	break;
	    case "Sub Cause":
	    	fnolStep3POM.selectClaimSubCauseType(fieldValue);
	    	break;
	    case "Vehicle Used For":
	    	fnolStep3POM.selectVehicleUsedFor(fieldValue);
	    	break;
	    case "Impact Speed":
	    	fnolStep3POM.selectImpactSpeed(fieldValue);
	    	break;
	    case "Weather":
	    	fnolStep3POM.selectWeather(fieldValue);
	    	break;
	    case "Road Conditions":
	    	fnolStep3POM.selectRoadConditions(fieldValue);
	    	break;
	    case "Photos":
	    	fnolStep3POM.selectPhotos(fieldValue);
	    	break;
	    case "cctv":
	    	fnolStep3POM.selectCctv(fieldValue);
	    	break;
	    case "Fault Type":
	    	fnolStep3POM.selectFaultType(fieldValue);
	    	break;
	    case "Address Location":
	    	fnolStep3POM.selectAddressLocation(fieldValue);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Then("^I will see fault based on loss causes$")
	public void i_will_see_fault_based_on_loss_causes(DataTable dt) throws Throwable {
		List<List<String>> list = dt.asLists(String.class);
		SoftAssert softAssert = new SoftAssert();
		String message;
		for(int i=1; i<list.size(); i++) { //i starts from 1 because i=0 represents the header
			// loop round each row in the test data table
			fnolStep3POM.selectIncidentType(list.get(i).get(0));
			fnolStep3POM.selectClaimCauseType(list.get(i).get(1));
			fnolStep3POM.selectClaimSubCauseType(list.get(i).get(2));
			
			message = "IncidentType[" + list.get(i).get(0) + "] Cause[ " + list.get(i).get(1) + "] subcause [ " + list.get(i).get(2) +"] fault [ " + list.get(i).get(3)+"]";
			softAssert.assertTrue(fnolStep3POM.faultTypeContainsOption(list.get(i).get(3)),"Fault option Check: "+ message);
		}
		softAssert.assertAll();
	}

	public void setIncidentOnly() {

		fnolStep3POM.selectIncidentOnlyCB();

	}

	public void unselectIncidentOnly() {

		fnolStep3POM.deselectIncidentOnlyCB();

	}

	@Given("^I click next button on step3$")
	public void next() {
		
		fnolStep3POM.next();
	}

	@Given("^I click previous button on step3$")
	public void previous() {
		
		fnolStep3POM.back();
	}
	
	@Given("^I click cancel button on step3$")
	public void cancel() {
	
		fnolStep3POM.cancel();
	}
	
	@Given("^I click finish button on step3$")
	public void finish() {
		
		fnolStep3POM.finish();
	}
	
	@Given("^I click add Vehicle on step3$")
	public void addVehicle() {
	
		fnolStep3POM.addVehicle();
	}
	
	@Given("^I click add Pedestrian on step3$")
	public void addPedestrian() {
	
		fnolStep3POM.addPedestrian();
	}
	
	@Given("^I click add Property Damage on step2$")
	public void addPropertyDamage() {
		
		fnolStep3POM.addPropertyDamage();
	}
	
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on step3$")
	public void i_input_into_the_box_onstep3(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Circumstances":
	    	fnolStep3POM.setCircumstancesValue(fieldValue);
	    	break;
	    case "Journey Purpose":
	    	fnolStep3POM.setJourneyPurpose(fieldValue);
	    	break;
	 
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	public void setCircumstances(String circumstances)
	{
		
		fnolStep3POM.setCircumstancesValue(circumstances);
	}
	

}
