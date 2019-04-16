package stepdefs.postfnol.lossdetails.general;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLEditVehicleSteps extends BaseTest {

	@Then("^I will be on edit vehicle screen on post FNOL$")
	public void i_will_be_on_edit_vehicle_screen_for_post_FNOL() throws Throwable {
		postFnolEditVehiclePOM.isPageTitleDisplayed("Vehicle Details");
	}
	

	

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit vehicle screen on post FNOL$")
	public void i_select_from_field_on_vehicle_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Vehicle":
			postFnolEditVehiclePOM.selectVehicle(fieldValue);
			break;
		case "Vehicle Type":
			postFnolEditVehiclePOM.selectVehicleType(fieldValue);
			break;
		case "Style":
			postFnolEditVehiclePOM.selectStyle(fieldValue);
			break;
		case "Foreign":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolEditVehiclePOM.selectForeignVehicle(true);
			else
				postFnolEditVehiclePOM.selectForeignVehicle(false);
			break;
		case "Usual Location":
			postFnolEditVehiclePOM.selectUsualLocation(fieldValue);
			break;
		case "Actual Location":
			postFnolEditVehiclePOM.selectActualLocation(fieldValue);
			break;
		case "Vehicle Owner":
			postFnolEditVehiclePOM.selectTPVehicleOwner(fieldValue);;
			break;
		case "Airbags Deployed":
			postFnolEditVehiclePOM.selectAirbagsDeployed(fieldValue);;
			break;
		case "Credit Hire":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolEditVehiclePOM.selectCreditHire(true);
			else
				postFnolEditVehiclePOM.selectCreditHire(false);
			break;
		case "Protocol Hire":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolEditVehiclePOM.selectProtocolHire(true);
			else
				postFnolEditVehiclePOM.selectProtocolHire(false);
			break;
		// fire only ph
		case "Fire Visited Garage":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolEditVehiclePOM.selectFireVisitedGarage(true);
			else
				postFnolEditVehiclePOM.selectFireVisitedGarage(false);
			break;
		
		case "Fire Other Vehicles":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolEditVehiclePOM.selectFireOtherVehicles(true);
			else
				postFnolEditVehiclePOM.selectFireOtherVehicles(false);
		
			break;
		// theft only
		case "Theft Windows Locked":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolEditVehiclePOM.selectTheftWindowsLocked(true);
			else
				postFnolEditVehiclePOM.selectTheftWindowsLocked(false);
		
			break;
		case "Theft Security Devices":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolEditVehiclePOM.selectTheftSecurityFitted(true);
			else
				postFnolEditVehiclePOM.selectTheftSecurityFitted(false);
		
			break;
		case "Theft Keys Purchased":
			postFnolEditVehiclePOM.selectKeysPurchased(fieldValue);
			break;
		case "Theft Keys Possessed":
			postFnolEditVehiclePOM.selectKeysPossessed(fieldValue);
			break;
		
		

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on edit vehicle screen on post FNOL$")
	public void i_input_into_the_box_onvehiclescreen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "VRN":
			postFnolEditVehiclePOM.setVrn(fieldValue);
			break;
		case "Year":
			postFnolEditVehiclePOM.setYear(fieldValue);
			break;
		case "Make":
			postFnolEditVehiclePOM.setMake(fieldValue);
			break;
		case "Model":
			postFnolEditVehiclePOM.setModel(fieldValue);
			break;
		case "Color":
			postFnolEditVehiclePOM.setColor(fieldValue);
			break;
		case "Vin":
			postFnolEditVehiclePOM.setVin(fieldValue);
			break;
		case "Mileage":
			postFnolEditVehiclePOM.setVehicleMileage(fieldValue);
			break;
		case "Damage Description":
			postFnolEditVehiclePOM.setDamageDesc(fieldValue);
			break;
		case "Pre-existing Damage":
			postFnolEditVehiclePOM.setPreExistDamage(fieldValue);
			break;
		// fire only
		case "Fire Visited Garage Details":
			postFnolEditVehiclePOM.setFireGarageDetails(fieldValue);
			break;
		// theft only
		case "Theft Security Devices Details":
			postFnolEditVehiclePOM.setTheftSecurityDetails(fieldValue);
			break;
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}

	
	
	@Given("^I click \"([^\"]*)\" on edit vehicle screen on post FNOL$")
	public void i_click_on_vehicle_screen(String button) throws Throwable {
		switch (button) {
		case "Ok":
			postFnolEditVehiclePOM.selectOK();
			break;
		case "Cancel":
			postFnolEditVehiclePOM.cancel();
			break;
		case "AddDriver":
			postFnolEditVehiclePOM.selectAddDriver();
			break;
		case "AddPassenger":
			postFnolEditVehiclePOM.selectAddPassenger();
			break;
		case "AddModification":
			postFnolEditVehiclePOM.clickAddModification();
			break;
		case "Calculate Total Loss":
			postFnolEditVehiclePOM.clickCalculateTotalLoss();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	@Given("^I click \"([^\"]*)\" on TP owner picker on edit vehicle screen on post FNOL$")
	public void i_click_on_owner_picker(String option) throws Throwable {
		switch (option) {
		case "New Person":
			postFnolEditVehiclePOM.selectNewTPOwner();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}

}
