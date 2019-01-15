package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLVehicleSteps extends BaseTest {
	
	CCFNOLDriverSteps driverSteps = new CCFNOLDriverSteps();

	
	public void completeFNOLPHVehicleForTestScenario()
	{
		// TODO - 
		// most cases will have insured vehicle already - so for now leave this and just do the driver checl
	if (ExcelUtil.getTestDataValue("Fnol_PHDriverRequired").equalsIgnoreCase("TRUE"))
	   {
		   fnolVehicleDetailsPOM.selectAddDriver();
		   driverSteps.completeFNOLPHDriverForTestScenario();
	   }
	
	String fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleDamageDesc");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.setDamageDesc(fieldValue);
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehiclePreDamage");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.setPreDamageDesc(fieldValue);
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleAirBags");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.selectAirbagsDeployed(fieldValue);
	
	
	   fnolVehicleDetailsPOM.selectOK();
	}
	

	public void completeFNOLTPVehicleForTestScenario()
	{
	  // add TP vehicle 
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleType");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.selectVehicleType(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleVrn");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setVrn(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleYear");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setYear(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleMake");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setMake(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleModel");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setModel(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleStyle");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.selectVehicleStyle(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleColor");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setColor(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleVin");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setVin(fieldValue);
			
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleDamageDesc");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setDamageDesc(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehiclePreDamage");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setPreDamageDesc(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPVehicleAirBags");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.selectAirbagsDeployed(fieldValue);
		// add TP driver if one is required
		if (ExcelUtil.getTestDataValue("Fnol_TPDriverRequired").equalsIgnoreCase("TRUE"))
	   {
		   fnolVehicleDetailsPOM.selectAddDriver();
		   driverSteps.completeFNOLTPDriverForTestScenario();
	   }
		
		// add TP passenger if one is requiredd
		if (ExcelUtil.getTestDataValue("Fnol_TPPassengerRequired").equalsIgnoreCase("TRUE"))
		   {
			   fnolVehicleDetailsPOM.selectAddPassenger();
			   // todo passenger screen
		   }
			   
		
	   fnolVehicleDetailsPOM.selectOK();
	}

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
