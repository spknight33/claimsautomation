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
			// theft only
		case "Keys Purchased":
			postFnolNewVehiclePOM.selectKeysPurchased(fieldValue);
			break;
		case "Keys Possessed":
			postFnolNewVehiclePOM.selectKeysPossessed(fieldValue);
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
	
	
	
	
	
	
	
	

}
