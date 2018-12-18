package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLVehicleSteps extends BaseTest {

	@Then("^I will be on vehicle screen for FNOL$")
	public void i_will_be_on_vehicle_screen_for_FNOL() throws Throwable {
		vehicleDetailsPOM.isPageTitleDisplayed("Vehicle Details");
	}

	@Given("^I select \"([^\"]*)\" on vehicle screen$")
	public void i_select_on_vehicle_screen(String button) throws Throwable {
		switch (button) {
		case "AddDriver":
			vehicleDetailsPOM.selectAddDriver();
			break;
		case "AddPassenger":
			vehicleDetailsPOM.selectAddPassenger();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on vehicle screen$")
	public void i_select_from_field_on_vehicle_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Usual Location":
			vehicleDetailsPOM.selectUsualLocation(fieldValue);
			break;
		case "Actual Location":
			vehicleDetailsPOM.selectActualLocation(fieldValue);
			break;
		case "Keys Purchased":
			vehicleDetailsPOM.selectKeysPurchased(fieldValue);
			break;
		case "Keys Possessed":
			vehicleDetailsPOM.selectKeysPossessed(fieldValue);
			break;
		case "Vehicle Type":
			vehicleDetailsPOM.selectVehicleType(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on vehicle screen$")
	public void i_input_into_the_box_onvehicvlescreen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "VRN":
			vehicleDetailsPOM.setVrn(fieldValue);
			break;
		case "Year":
			vehicleDetailsPOM.setYear(fieldValue);
			break;
		case "Make":
			vehicleDetailsPOM.setMake(fieldValue);
			break;
		case "Model":
			vehicleDetailsPOM.setModel(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}

	@Given("^I click ok button on vehicle screen$")
	public void next() {

		vehicleDetailsPOM.selectOK();
	}

	@Given("^I click \"([^\"]*)\" on owner picker$")
	public void i_click_on_owner_picker(String option) throws Throwable {
		switch (option) {
		case "New Person":
			vehicleDetailsPOM.selectNewOwner();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}

}
