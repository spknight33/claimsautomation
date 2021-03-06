package stepdefs.fnol;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCFNOLNewExposureSteps extends BaseTest {

	public void completeFNOLExposureForTestScenario() {
		// TODO - change to use ScenarioData

	}

	@Then("^I will be on the new exposure screen for FNOL$")
	public void i_will_be_on_newexposure_screen_for_FNOL() throws Throwable {
		// should be common to all exposure poms
		fnolNewExposurePOM.isPageTitleDisplayed("New Exposure");
	}

	@Given("^I select \"([^\"]*)\" on new exposure screen for FNOL$")
	public void i_select_on_expsoure_screen(String button) throws Throwable {
		switch (button) {
		case "Ok":
			fnolNewExposurePOM.selectOK();
			break;
		case "Cancel":
			fnolNewExposurePOM.selectCancel();
			;
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new exposure screen for FNOL$")
	public void i_select_from_field_on_exposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {

		

		// TODO
		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new property exposure screen for FNOL$")
	public void i_select_from_field_on_propertyexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {


		// TODO
		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new injury exposure screen for FNOL$")
	public void i_select_from_field_on_injuryexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {


		// TODO
		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new vehicle exposure screen for FNOL$")
	public void i_select_from_field_on_vehicleexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {

	

		case "Coverage":
			fnolNewVehicleExposurePOM.selectCoverage(fieldValue);
			break;

		// TODO
		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new Credit Hire exposure screen for FNOL$")
	public void i_select_from_field_on_credithireexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {

	//	case "Claimant Type":
	//		fnolNewCreditHireExposurePOM.selectClaimantType(fieldValue);
	//		break;
		// has been removed from page

		case "Coverage":
			fnolNewCreditHireExposurePOM.selectCoverage(fieldValue);
			break;

		// TODO
		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new Protocol Hire exposure screen for FNOL$")
	public void i_select_from_field_on_protocolhireexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {

		
		case "Coverage":
			fnolNewProtocolHireExposurePOM.selectCoverage(fieldValue);
			break;

		// TODO
		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new TP Capture exposure screen for FNOL$")
	public void i_select_from_field_on_tpcatptuereexposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {

	

		case "Coverage":
			fnolNewTPCaptureExposurePOM.selectCoverage(fieldValue);
			break;

		// TODO
		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	

	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on new exposure screen for FNOL$")
	public void i_input_into_the_box_on_exposure_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		// TODO
		case "Address Line3":
			fnolPedestrianPOM.setAddressLine3(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}

	@Given("^I complete fields on FNOL new exposure screen$")
	public void i_complete_all_fields() throws Throwable {

		fnolNewExposurePOM.selectOK();

	}

	@Given("^I click \"([^\"]*)\" on claimant picker on new exposure screen$")
	public void i_click_on_claimant_picker(String option) throws Throwable {
		switch (option) {
		case "New Person":
			fnolNewExposurePOM.selectNewClaimant();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}

	@Given("^I click \"([^\"]*)\" on claimant picker on new property exposure screen$")
	public void i_click_on_propertyclaimant_picker(String option) throws Throwable {
		switch (option) {
		case "New Person":
			fnolNewPropertyExposurePOM.selectNewClaimant();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}

	@Given("^I click \"([^\"]*)\" on claimant picker on new injury exposure screen$")
	public void i_click_on_injuryclaimant_picker(String option) throws Throwable {
		switch (option) {
		case "New Person":
			fnolNewInjuryExposurePOM.selectNewClaimant();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}

	@When("^I select the Insured as Claimant on new vehicle exposure screen for FNOL$")
	public void i_select_the_Insured_as_Claimant_on_new_vehicle_exposure_screen_for_FNOL() throws Throwable {
		fnolNewVehicleExposurePOM.selectClaimant(ExcelUtil.getTestDataValue("Fnol_Name")); // use insured from testdata
	}
	@When("^I select the Insured as Claimant on new Credit Hire exposure screen for FNOL$")
	public void i_select_the_Insured_as_Claimant_on_new_credithirer_exposure_screen_for_FNOL() throws Throwable {
		fnolNewCreditHireExposurePOM.selectClaimant(ExcelUtil.getTestDataValue("Fnol_Name")); // use insured from testdata
	}

	@When("^I select the Insured as Claimant on new Protocol Hire exposure screen for FNOL$")
	public void i_select_the_Insured_as_Claimant_on_new_protocolhire_exposure_screen_for_FNOL() throws Throwable {
		fnolNewProtocolHireExposurePOM.selectClaimant(ExcelUtil.getTestDataValue("Fnol_Name")); // use insured from testdata
	}
	@When("^I select the Insured as Claimant on new TP Capture exposure screen for FNOL$")
	public void i_select_the_Insured_as_Claimant_on_new_tpcapture_exposure_screen_for_FNOL() throws Throwable {
		fnolNewTPCaptureExposurePOM.selectClaimant(ExcelUtil.getTestDataValue("Fnol_Name")); // use insured from testdata
	}
	@When("^I select the Insured as Claimant on new injury exposure screen for FNOL$")
	public void i_select_the_Insured_as_Claimant_on_new_injury_exposure_screen_for_FNOL() throws Throwable {
		fnolNewInjuryExposurePOM.selectClaimant(ExcelUtil.getTestDataValue("Fnol_Name")); // use insured from testdata
	}
	@When("^I select the Insured as Claimant on new property exposure screen for FNOL$")
	public void i_select_the_Insured_as_Claimant_on_new_property_exposure_screen_for_FNOL() throws Throwable {
		fnolNewPropertyExposurePOM.selectClaimant(ExcelUtil.getTestDataValue("Fnol_Name")); // use insured from testdata
	}



	@Given("^I click \"([^\"]*)\" on property name picker$")
	public void i_click_on_property_picker(String option) throws Throwable {
		switch (option) {
		case "New Incident...":
			fnolNewPropertyExposurePOM.selectNewProperty();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}

	@Given("^I click \"([^\"]*)\" on injury picker$")
	public void i_click_on_injury_picker(String option) throws Throwable {
		switch (option) {
		case "New Incident...":
			fnolNewInjuryExposurePOM.selectNewInjury();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}

	@Then("^I will see the error messages on the New Exposures screen$")
	public void i_will_see_the_error_messages_on_the_New_Exposures_screen(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolNewExposurePOM.containsErrorMessage(list.get(i)),
					"Error Message Check: " + list.get(i));

		}
		softAssert.assertAll();
	}

}
