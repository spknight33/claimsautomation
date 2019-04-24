package stepdefs.postfnol.lossdetails.general;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewVehicleSteps extends BaseTest {

	@Then("^I will be on new vehicle screen on post FNOL$")
	public void i_will_be_on_vehicle_screen_for_post_FNOL() throws Throwable {
		postFnolNewVehiclePOM.isPageTitleDisplayed("New Vehicle Incident");
	}
	

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new vehicle screen on post FNOL$")
	public void i_select_from_field_on_vehicle_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Vehicle":
			postFnolNewVehiclePOM.selectVehicle(fieldValue);
			break;
		case "Vehicle Type":
			postFnolNewVehiclePOM.selectVehicleType(fieldValue);
			break;
		case "Style":
			postFnolNewVehiclePOM.selectStyle(fieldValue);
			break;
		case "Foreign":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectForeignVehicle(true);
			else
				postFnolNewVehiclePOM.selectForeignVehicle(false);
			break;
		case "Usual Location":
			postFnolNewVehiclePOM.selectUsualLocation(fieldValue);
			break;
		case "Actual Location":
			postFnolNewVehiclePOM.selectActualLocation(fieldValue);
			break;
		case "Vehicle Owner":
			postFnolNewVehiclePOM.selectTPVehicleOwner(fieldValue);;
			break;
		case "Airbags Deployed":
			postFnolNewVehiclePOM.selectAirbagsDeployed(fieldValue);;
			break;
		case "Credit Hire":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectCreditHire(true);
			else
				postFnolNewVehiclePOM.selectCreditHire(false);
			break;
		case "Protocol Hire":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectProtocolHire(true);
			else
				postFnolNewVehiclePOM.selectProtocolHire(false);
			break;
			
		case "Occupants Known":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectOccupantsKnown(true);
			else
				postFnolNewVehiclePOM.selectOccupantsKnown(false);
			break;
			
		// fire only
		case "Fire Visited Garage":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectFireVisitedGarage(true);
			else
				postFnolNewVehiclePOM.selectFireVisitedGarage(false);
			break;
		
		case "Fire Other Vehicles":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectFireOtherVehicles(true);
			else
				postFnolNewVehiclePOM.selectFireOtherVehicles(false);
		
			break;
		// theft only
		case "Theft Windows Locked":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectTheftWindowsLocked(true);
			else
				postFnolNewVehiclePOM.selectTheftWindowsLocked(false);
		
			break;
		case "Theft Security Devices":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectTheftSecurityFitted(true);
			else
				postFnolNewVehiclePOM.selectTheftSecurityFitted(false);
		
			break;
		case "Theft Keys Purchased":
			postFnolNewVehiclePOM.selectKeysPurchased(fieldValue);
			break;
		case "Theft Keys Possessed":
			postFnolNewVehiclePOM.selectKeysPossessed(fieldValue);
			break;
		
		case "TP Insurer Details Available":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewVehiclePOM.selectTPInsurerAvailable(true);
			else
				postFnolNewVehiclePOM.selectTPInsurerAvailable(false);
			break;

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on new vehicle screen on post FNOL$")
	public void i_input_into_the_box_onvehiclescreen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "VRN":
			postFnolNewVehiclePOM.setVrn(fieldValue);
			break;
		case "Year":
			postFnolNewVehiclePOM.setYear(fieldValue);
			break;
		case "Make":
			postFnolNewVehiclePOM.setMake(fieldValue);
			break;
		case "Model":
			postFnolNewVehiclePOM.setModel(fieldValue);
			break;
		case "Color":
			postFnolNewVehiclePOM.setColor(fieldValue);
			break;
		case "Vin":
			postFnolNewVehiclePOM.setVin(fieldValue);
			break;
		case "Mileage":
			postFnolNewVehiclePOM.setVehicleMileage(fieldValue);
			break;
		case "Damage Description":
			postFnolNewVehiclePOM.setDamageDesc(fieldValue);
			break;
		case "Pre-existing Damage":
			postFnolNewVehiclePOM.setPreDamageDesc(fieldValue);
			break;
		case "Occupants Number":
			postFnolNewVehiclePOM.setOccupantsNumber(fieldValue);
			break;
		// fire only
		case "Fire Visited Garage Details":
			postFnolNewVehiclePOM.setFireGarageDetails(fieldValue);
			break;
		// theft only
		case "Theft Security Devices Details":
			postFnolNewVehiclePOM.setTheftSecurityDetails(fieldValue);
			break;
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}

	
	
	@Given("^I click \"([^\"]*)\" on new vehicle screen on post FNOL$")
	public void i_click_on_vehicle_screen(String button) throws Throwable {
		switch (button) {
		case "Ok":
			postFnolNewVehiclePOM.selectOK();
			break;
		case "Update":
			postFnolNewVehiclePOM.selectOK();
			break;
		case "Cancel":
			postFnolNewVehiclePOM.cancel();
			break;
		case "AddDriver":
			postFnolNewVehiclePOM.selectAddDriver();
			break;
		case "AddPassenger":
			postFnolNewVehiclePOM.selectAddPassenger();
			break;
		case "AddModification":
			postFnolNewVehiclePOM.clickAddModification();
			break;
		case "Calculate Total Loss":
			postFnolNewVehiclePOM.clickCalculateTotalLoss();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	
	
	@Given("^The value is \"([^\"]*)\" for field \"([^\"]*)\" on new vehicle screen on post FNOL$")
	public void the_value_forfield_onvehiclescreen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Model":
			Assert.assertTrue(postFnolNewVehiclePOM.getModelValue().equalsIgnoreCase(fieldValue));
			break;
		}
	}
	
	@Given("^I click \"([^\"]*)\" on TP owner picker on new vehicle screen on post FNOL$")
	public void i_click_on_owner_picker(String option) throws Throwable {
		switch (option) {
		case "New Person":
			postFnolNewVehiclePOM.selectNewTPOwner();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	
	
	

}
