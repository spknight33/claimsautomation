package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLVehicleSteps extends BaseTest {

	@Then("^I will be on vehicle screen for FNOL$")
	public void i_will_be_on_vehicle_screen_for_FNOL() throws Throwable {
		fnolVehicleDetailsPOM.isPageTitleDisplayed("Vehicle Details");
	}
	
	@Then("^I will be on new vehicle screen$")
	public void i_will_be_on_vehicle_screen() throws Throwable {
		fnolVehicleDetailsPOM.isPageTitleDisplayed("New Vehicle Incident");
	}

	@Given("^I select \"([^\"]*)\" on vehicle screen$")
	public void i_select_on_vehicle_screen(String button) throws Throwable {
		switch (button) {
		case "AddDriver":
			fnolVehicleDetailsPOM.selectAddDriver();
			break;
		case "AddPassenger":
			fnolVehicleDetailsPOM.selectAddPassenger();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on vehicle screen$")
	public void i_select_from_field_on_vehicle_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Usual Location":
			fnolVehicleDetailsPOM.selectUsualLocation(fieldValue);
			break;
		case "Actual Location":
			fnolVehicleDetailsPOM.selectActualLocation(fieldValue);
			break;
		case "Keys Purchased":
			fnolVehicleDetailsPOM.selectKeysPurchased(fieldValue);
			break;
		case "Keys Possessed":
			fnolVehicleDetailsPOM.selectKeysPossessed(fieldValue);
			break;
		case "Vehicle Type":
			fnolVehicleDetailsPOM.selectVehicleType(fieldValue);
			break;
		case "Vehicle Owner":
			fnolVehicleDetailsPOM.selectOwnerName(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on vehicle screen$")
	public void i_input_into_the_box_onvehicvlescreen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "VRN":
			fnolVehicleDetailsPOM.setVrn(fieldValue);
			break;
		case "Year":
			fnolVehicleDetailsPOM.setYear(fieldValue);
			break;
		case "Make":
			fnolVehicleDetailsPOM.setMake(fieldValue);
			break;
		case "Model":
			fnolVehicleDetailsPOM.setModel(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}

	@Given("^I click ok button on vehicle screen$")
	public void next() {

		fnolVehicleDetailsPOM.selectOK();
	}

	@Given("^I click \"([^\"]*)\" on owner picker$")
	public void i_click_on_owner_picker(String option) throws Throwable {
		switch (option) {
		case "New Person":
			fnolVehicleDetailsPOM.selectNewOwner();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}

}
