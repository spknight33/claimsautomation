package stepdefs.postfnol.exposures;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCPOSTFNOLEditExposureSteps extends BaseTest {
	
	public void completeFNOLExposureForTestScenario()
	{
		//TODO - change to use ScenarioData
		
		
	}
	
	@Then("^I will see post FNOL edit exposure screen for \"([^\"]*)\"$")
	public void i_will_see_post_FNOL_exposure_screen_for(String type) throws Throwable {
	   switch (type)
	   {
	   case ("1st Party Vehicle"):
		   postFnolEditVehicleExposurePOM.isPageTitleDisplayed(type);
	   		break;
	   case ("3rd Party Vehicle"):
		   postFnolEditVehicleExposurePOM.isPageTitleDisplayed(type);
	   		break;
	   case ("3rd Party Bodily Injury"):
		   postFnolEditInjuryExposurePOM.isPageTitleDisplayed(type);
	   		break;
	   case ("3rd Party Property"):
		   postFnolEditPropertyExposurePOM.isPageTitleDisplayed(type);
	   		break;
	   case ("3rd Party Credit Hire"):
		   postFnolEditCreditHireExposurePOM.isPageTitleDisplayed(type);
	   		break;
	   case ("3rd Party Protocol Hire"):
		   postFnolEditProtocolHireExposurePOM.isPageTitleDisplayed(type);
	   		break;
	   case ("TP Capture"):
		   postFnolEditTPCaptureExposurePOM.isPageTitleDisplayed(type);
	   		break;
	   }
		
		
	}
	
	@Then("^I will see \"([^\"]*)\" is \"([^\"]*)\" on post FNOL \"([^\"]*)\" edit exposure screen$")
	public void i_will_see_is_on_post_FNOL_exposure_screen(String fieldName, String fieldValue, String exposureType) throws Throwable {
		switch (exposureType)
		   {
		   case ("1st Party Vehicle"):
			   checkFieldValueForVehicleExposure(fieldName,fieldValue);
		   		break;
		   case ("3rd Party Vehicle"):
			   checkFieldValueForVehicleExposure(fieldName,fieldValue);
		   		break;
		   case ("3rd Party Bodily Injury"):
			   checkFieldValueForInjuryExposure(fieldName,fieldValue);
		   		break;
		   case ("3rd Party Property"):
			   checkFieldValueForPropertyExposure(fieldName,fieldValue);
		   		break;
		   case ("3rd Party Credit Hire"):
			   checkFieldValueForCreditHireExposure(fieldName,fieldValue);
		   		break;
		   case ("3rd Party Protocol Hire"):
			   checkFieldValueForProtocolHireExposure(fieldName,fieldValue);
		   		break;
		   case ("TP Capture"):
			   checkFieldValueForTPCaptureExposure(fieldName,fieldValue);
		   		break;
		   }
	}
	
	private void checkFieldValueForVehicleExposure(String fieldName,String fieldValue)
	{
		switch(fieldName)
		{
		
		}
	}
	
	private void checkFieldValueForInjuryExposure(String fieldName,String fieldValue)
	{
		
	}
	private void checkFieldValueForPropertyExposure(String fieldName,String fieldValue)
	{
		
	}
	private void checkFieldValueForCreditHireExposure(String fieldName,String fieldValue)
	{
		
	}
	private void checkFieldValueForProtocolHireExposure(String fieldName,String fieldValue)
	{
		
	}
	private void checkFieldValueForTPCaptureExposure(String fieldName,String fieldValue)
	{
		
	}
	
	
	@Given("^I click \"([^\"]*)\" on post FNOL \"([^\"]*)\" edit exposure screen$")
	public void i_select_on_exposure_screen(String button, String exposureType) throws Throwable {
		switch (exposureType) {
		case ("1st Party Vehicle"):
			clickForVehicleExposure(button);
			break;
		case ("3rd Party Vehicle"):
			clickForVehicleExposure(button);
			break;
		case ("3rd Party Bodily Injury"):
			clickForInjuryExposure(button);
			break;
		case ("3rd Party Property"):
			clickForPropertyExposure(button);
			break;
		case ("3rd Party Credit Hire"):
			clickForCreditHireExposure(button);
			break;
		case ("3rd Party Protocol Hire"):
			clickForProtocolHireExposure(button);
			break;
			//TODO check title
		case ("TP Capture"):
			clickForTPCaptureExposure(button);
			break;

		}

	}
	
	private void clickForVehicleExposure(String button) {
		switch (button) {
		case "Update":
			postFnolEditVehicleExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolEditVehicleExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolEditVehicleExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	private void clickForInjuryExposure(String button) {
		switch (button) {
		case "Update":
			postFnolEditInjuryExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolEditInjuryExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolViewInjuryExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	private void clickForPropertyExposure(String button) {
		switch (button) {
		case "Update":
			postFnolEditPropertyExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolEditPropertyExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolEditPropertyExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	private void clickForCreditHireExposure(String button) {
		switch (button) {
		case "Update":
			postFnolEditCreditHireExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolEditCreditHireExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolEditCreditHireExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	private void clickForProtocolHireExposure(String button) {
		switch (button) {
		case "Update":
			postFnolEditProtocolHireExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolEditProtocolHireExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolEditProtocolHireExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	private void clickForTPCaptureExposure(String button) {
		switch (button) {
		case "Update":
			postFnolEditTPCaptureExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolEditTPCaptureExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolEditTPCaptureExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	
	
	@When("^I click the uptoexposures link on \"([^\"]*)\" edit exposure screen for Post FNOL$")
	public void i_click_the_uptoexposures_link_on_exposure_screen_for_Post_FNOL(String exposureType) throws Throwable {
		switch (exposureType) {
		case ("1st Party Vehicle"):
			postFnolEditVehicleExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Vehicle"):
			postFnolEditVehicleExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Bodily Injury"):
			postFnolEditInjuryExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Property"):
			postFnolEditPropertyExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Credit Hire"):
			postFnolEditCreditHireExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Protocol Hire"):
			postFnolEditProtocolHireExposurePOM.selectUpToExposures();
			break;
		case ("TP Capture"):
			postFnolEditTPCaptureExposurePOM.selectUpToExposures();
			break;

		default:
			Assert.fail("unknown input field :" + exposureType + " - check cucumber script!");
		}

	}
	
	@When("^I click the add representative button on \"([^\"]*)\" edit exposure screen for Post FNOL$")
	public void i_click_the_repbutton_on_exposure_screen_for_Post_FNOL(String exposureType) throws Throwable {
		switch (exposureType) {
		case ("1st Party Vehicle"):
			//postFnolEditVehicleExposurePOM.add;
			break;
		case ("3rd Party Vehicle"):
			postFnolEditVehicleExposurePOM.selectAddRepresentative();
			break;
		case ("3rd Party Bodily Injury"):
			postFnolEditInjuryExposurePOM.selectAddRepresentative();;
			break;
		case ("3rd Party Property"):
			//postFnolEditPropertyExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Credit Hire"):
		//	postFnolEditCreditHireExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Protocol Hire"):
			//postFnolEditProtocolHireExposurePOM.selectUpToExposures();
			break;
		case ("TP Capture"):
			//postFnolEditTPCaptureExposurePOM.selectUpToExposures();
			break;

		default:
			Assert.fail("unknown input field :" + exposureType + " - check cucumber script!");
		}

	}

	//TODO -refactor all of the following 
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit injury exposure screen for Post FNOL$")
	public void i_select_from_field_on_injuryexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	   
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit property exposure screen for Post FNOL$")
	public void i_select_from_field_on_propertyexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	   
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit vehicle exposure screen for Post FNOL$")
	public void i_select_from_field_on_vehicleexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	   // case "Claimant Type":
	   // 	postFnolEditVehicleExposurePOM.selectClaimantType(fieldValue);
	    //	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit Credit Hire exposure screen for Post FNOL$")
	public void i_select_from_field_on_credithireeexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	   // case "Claimant Type":
	   // 	postFnolEditCreditHireExposurePOM.selectClaimantType(fieldValue);
	   // 	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit Protocol Hire exposure screen for Post FNOL$")
	public void i_select_from_field_on_protocolhireeexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	  //  case "Claimant Type":
	  //  	postFnolEditProtocolHireExposurePOM.selectClaimantType(fieldValue);
	   // 	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit TP Capture exposure screen for Post FNOL$")
	public void i_select_from_field_on_tpcaptureeexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	  //  case "Claimant Type":
	  //  	postFnolEditTPCaptureExposurePOM.selectClaimantType(fieldValue);
	   // 	break;
	    
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
	@Given("^I click \"([^\"]*)\" on vehicle picker on edit Credit Hire exposure screen for Post FNOL$")
	public void i_click_on_credithirevehicle_picker(String option) throws Throwable {
		switch (option) {
		case "New Incident...":
			postFnolEditCreditHireExposurePOM.selectNewVehicle();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	@Given("^I click \"([^\"]*)\" on vehicle picker on edit Protocol Hire exposure screen for Post FNOL$")
	public void i_click_on_protocolhirevehicle_picker(String option) throws Throwable {
		switch (option) {
		case "New Incident...":
			postFnolEditProtocolHireExposurePOM.selectNewVehicle();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	@Given("^I click \"([^\"]*)\" on vehicle picker on edit TP Capture exposure screen for Post FNOL$")
	public void i_click_on_tpcapturevehicle_picker(String option) throws Throwable {
		switch (option) {
		case "New Incident...":
			postFnolEditTPCaptureExposurePOM.selectNewVehicle();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	
	@Then("^I will see the error messages on the \"([^\"]*)\" edit exposure screen for Post FNOL$")
	public void i_will_see_the_error_messages_on_the_editinjury_Exposures_screen(DataTable dt,String exposureType) throws Throwable {
	  	List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				switch (exposureType) {
				case ("1st Party Vehicle"):
					softAssert.assertTrue(postFnolEditVehicleExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
					break;
				case ("3rd Party Vehicle"):
					softAssert.assertTrue(postFnolEditVehicleExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
					break;
				case ("3rd Party Bodily Injury"):
					softAssert.assertTrue(postFnolEditInjuryExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
					break;
				case ("3rd Party Property"):
					softAssert.assertTrue(postFnolEditPropertyExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
					break;
				case ("3rd Party Credit Hire"):
					softAssert.assertTrue(postFnolEditCreditHireExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
					break;
				case ("3rd Party Protocol Hire"):
					softAssert.assertTrue(postFnolEditProtocolHireExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
					break;
				case ("TP Capture"):
					softAssert.assertTrue(postFnolEditTPCaptureExposurePOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
					break;

				default:
					Assert.fail("unknown input field :" + exposureType + " - check cucumber script!");
				}
				
			}
			softAssert.assertAll();
	}
	
	

}
