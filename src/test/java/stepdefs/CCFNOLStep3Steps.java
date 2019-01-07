package stepdefs;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterData;
import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterDataBuilder;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * At step3 of FNOL, various incidents and information can be added. On the
 * step3 screen, it is possible to add:
 * 1) Selection of incident type/cause and loss cause
 * 2) Incident Questions and circumstances, location
 * 3) Witnesses
 * 4) Officials
 * 5) Police Details
 * 6) Categorisation details
 * 
 * From step3 screen it is also possible to add
 * 7) Insured Vehicle (and from that screen, Insured Driver, passenger etc)
 * 8) Additional Vehicles (usually third party)
 * 9) Pedestrian incidents
 * 10) Property incidents
 * 
 */
public class CCFNOLStep3Steps extends BaseTest {

	CCFNOLStep2Steps step2Steps = new CCFNOLStep2Steps();
	//CCFNOLStep4Steps step4Steps = new CCFNOLStep4Steps();

	CCFNOLPedestrianSteps pedestrianSteps = new CCFNOLPedestrianSteps();
	CCFNOLPropertySteps propertySteps = new CCFNOLPropertySteps();
	CCFNOLVehicleSteps vehicleSteps = new CCFNOLVehicleSteps();
	CCFNOLNewPoliceSteps policeSteps = new CCFNOLNewPoliceSteps();
	
	ClaimCenterData scenarioData = ClaimCenterDataBuilder.createDataSet();
	
	// TODO - start of work for regression FNOL script to be driven by external configuration
	public void completeFNOLStep3ForTestScenario(ClaimCenterData scenarioData)  throws Throwable
	{
		// add pedestrian if required
		if (scenarioData.atStep3FNOLPedestrianRequired())
		{
			fnolStep3POM.addPedestrian();
			pedestrianSteps.completeFNOLPedestrianForTestScenario(scenarioData);
		}
		
		// add property if required
		if (scenarioData.atStep3FNOLPropertyRequired())
		{
			fnolStep3POM.addPropertyDamage();
			propertySteps.completeFNOLPropertyForTestScenario(scenarioData);
		}
		
		// add insured driver if required
		if (scenarioData.atPHVehicleStep3FNOLDriverRequired())
		{
			fnolStep3POM.selectInsuredVehicle();
			vehicleSteps.completeFNOLPHVehicleForTestScenario(scenarioData);
		}
		
		// add TP vehicle/driver if required
		if (scenarioData.atStep3FNOLTPVehicleRequired())
		{
			fnolStep3POM.addVehicle();
			vehicleSteps.completeFNOLTPVehicleForTestScenario(scenarioData);
		}
		
		// add police if required
		if (scenarioData.atStep3FNOLPoliceRequired())
		{
			fnolStep3POM.addPoliceDetails();
			policeSteps.completeFNOLNewPoliceForTestScenario(scenarioData);
		}
		
		
		// Add details to step3 fields
		//TODO get from scenarioData
		fnolStep3POM.setCircumstancesValue("Someone crashed into me");
		fnolStep3POM.selectIncidentType(scenarioData.getStep3FNOLIncidentType());
		fnolStep3POM.selectClaimCauseType(scenarioData.getStep3FNOLCause());
		fnolStep3POM.selectClaimSubCauseType(scenarioData.getStep3FNOLSubCause());
		
		//TODO OTHER FIELDS
		fnolStep3POM.selectVehicleUsedFor("Business");
		fnolStep3POM.setJourneyPurpose("Just mooching around");
		fnolStep3POM.selectImpactSpeed("21-30 MPH");
		fnolStep3POM.selectWeather("Fog");
		//fnolStep3POM.selectRoadConditions("Ice");
		//fnolStep3POM.selectCctv("Yes");
		
		// select the location
		fnolStep3POM.selectAddressLocation(scenarioData.getAddress());
		
		fnolStep3POM.next();
		
	}
	
	
	
	
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
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolStep2POM.containsErrorMessage(list.get(i)),
					"Error Message Check: " + list.get(i));

		}
		softAssert.assertAll();
	}

	public void mandatoryFieldErrorMessagesAreShown() {
		this.next();
		// in step 3, check error messages
		Assert.assertTrue(
				fnolStep3POM.containsErrorMessage("Incident Type : Missing required field \"Incident Type\""));
		Assert.assertTrue(fnolStep3POM.containsErrorMessage("Cause : Missing required field \"Cause\""));
		Assert.assertTrue(fnolStep3POM.containsErrorMessage("Sub Cause : Missing required field \"Sub Cause\""));
	}

	@Then("^the \"([^\"]*)\" list on step3 will contain options$")
	public void the_list_on_step3_will_contain_options(String fieldName, DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();
		for (int i = 0; i < list.size(); i++) {
			switch (fieldName) {
			case "Incident Type":
				// TODO change
				softAssert.assertTrue(fnolStep3POM.incidentTypeContainsOption(list.get(i)),
						fieldName + "Field option Check: " + list.get(i));
				break;

			default:
				Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
			}

		}
		softAssert.assertAll();
	}

	@Then("^I select \"([^\"]*)\" from \"([^\"]*)\" field on step3$")
	public void i_select_from_field_on_step3(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
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
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}

	@Then("^I will see fault based on loss causes$")
	public void i_will_see_fault_based_on_loss_causes(DataTable dt) throws Throwable {
		List<List<String>> list = dt.asLists(String.class);
		SoftAssert softAssert = new SoftAssert();
		String message;
		for (int i = 1; i < list.size(); i++) { // i starts from 1 because i=0 represents the header
			// loop round each row in the test data table
			fnolStep3POM.selectIncidentType(list.get(i).get(0));
			fnolStep3POM.selectClaimCauseType(list.get(i).get(1));
			fnolStep3POM.selectClaimSubCauseType(list.get(i).get(2));

			message = "IncidentType[" + list.get(i).get(0) + "] Cause[ " + list.get(i).get(1) + "] subcause [ "
					+ list.get(i).get(2) + "] fault [ " + list.get(i).get(3) + "]";
			softAssert.assertTrue(fnolStep3POM.faultTypeContainsOption(list.get(i).get(3)),
					"Fault option Check: " + message);
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

	@Given("^I click add Property Damage on step3$")
	public void addPropertyDamage() {

		fnolStep3POM.addPropertyDamage();
	}

	@Given("^I click add Police Details on step3$")
	public void addPoliceDetails() {

		fnolStep3POM.addPoliceDetails();
	}

	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on step3$")
	public void i_input_into_the_box_onstep3(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Circumstances":
			fnolStep3POM.setCircumstancesValue(fieldValue);
			break;
		case "Journey Purpose":
			fnolStep3POM.setJourneyPurpose(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}

	public void setCircumstances(String circumstances) {

		fnolStep3POM.setCircumstancesValue(circumstances);
	}

	@When("^I select the loss cause types and try to proceed past step3 I will see the validation error message \"([^\"]*)\"$")
	public void i_select_the_loss_cause_types_and_try_to_proceed_past_step_I_will_see_the_validation_error_message(
			String errorMessage, DataTable dt) throws Throwable {
		List<List<String>> list = dt.asLists(String.class);
		SoftAssert softAssert = new SoftAssert();
		String message;
		// close any duplicate claim window
		fnolStep3POM.closeDuplicateClaimWindow();
		// select the address so that erro is not generated from that
		fnolStep3POM.selectAddressLocation(testDataset.getAddress());
		for (int i = 1; i < list.size(); i++) { // i starts from 1 because i=0 represents the header
			// loop round each row in the test data table
			fnolStep3POM.selectIncidentType(list.get(i).get(0));
			fnolStep3POM.selectClaimCauseType(list.get(i).get(1));
			fnolStep3POM.selectClaimSubCauseType(list.get(i).get(2));
			next();
			message = "IncidentType[" + list.get(i).get(0) + "] Cause[ " + list.get(i).get(1) + "] subcause [ "
					+ list.get(i).get(2) + "]";
			softAssert.assertTrue(fnolStep3POM.containsErrorMessage(errorMessage), message);

		}
		softAssert.assertAll();
	}

	@When("^I select the loss causes I will be able to proceed past step3 with no validation error$")
	public void i_select_the_loss_causes_I_will_be_able_to_proceed_past_step_with_no_validation_error(DataTable dt)
			throws Throwable {
		List<List<String>> list = dt.asLists(String.class);
		SoftAssert softAssert = new SoftAssert();
		String message;
		// close any duplicate claim window
		fnolStep3POM.closeDuplicateClaimWindow();
		// select the address so that error is not generated from that
		fnolStep3POM.selectAddressLocation(testDataset.getAddress());
		for (int i = 1; i < list.size(); i++) { // i starts from 1 because i=0 represents the header
			// loop round each row in the test data table
			fnolStep3POM.selectIncidentType(list.get(i).get(0));
			fnolStep3POM.selectClaimCauseType(list.get(i).get(1));
			fnolStep3POM.selectClaimSubCauseType(list.get(i).get(2));
			next();
			message = "IncidentType[" + list.get(i).get(0) + "] Cause[ " + list.get(i).get(1) + "] subcause [ "
					+ list.get(i).get(2) + "]";
			softAssert.assertTrue(fnolStep4POM.isPageTitleDisplayed("Step 4 of 5: Services"), message);
			fnolStep4POM.back();

		}
		softAssert.assertAll();
	}

}
