package stepdefs.fnol;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.TotalLossCalculatorSteps;

public class CCFNOLVehicleSteps extends BaseTest {
	
	CCFNOLDriverSteps driverSteps = new CCFNOLDriverSteps();
	CCFNOLPassengerSteps passengerSteps = new CCFNOLPassengerSteps();
	TotalLossCalculatorSteps tlcSteps = new TotalLossCalculatorSteps();

	
	public void completeFNOLPHVehicleForTestScenario() throws Throwable
	{
		// TODO - 
		// most cases will have insured vehicle already - so for now leave this and just do the driver checl
		
	String fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverRequired");
	if (fieldValue !=null &&fieldValue.equalsIgnoreCase("TRUE"))
	   {
		   fnolVehicleDetailsPOM.selectAddDriver();
		   driverSteps.completeFNOLPHDriverForTestScenario();
	   }
	

	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleModified");
	if (fieldValue !=null &&fieldValue.equalsIgnoreCase("TRUE"))
	{
		fnolVehicleDetailsPOM.selectVehicleModified(true);
		
		fnolVehicleDetailsPOM.clickAddModification();
		// now choose modification
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleModificationType");
		if (fieldValue !=null)
		fnolVehicleDetailsPOM.selectModification(fieldValue, 1);
	}
	else
	{
		fnolVehicleDetailsPOM.selectVehicleModified(false);
	}
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleNormallyKept");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.selectUsualLocation(fieldValue);
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleCurrentLocation");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.selectActualLocation(fieldValue);
	//TODO set desc for different locations
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleMileage");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.setVehicleMileage(fieldValue);
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleDamageDesc");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.setDamageDesc(fieldValue);
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehiclePreDamage");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.setPreDamageDesc(fieldValue);
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleRoadWorthy");
	if (fieldValue !=null &&fieldValue.equalsIgnoreCase("TRUE"))
	{
		fnolVehicleDetailsPOM.selectRoadworthy(true);
	}
	else
	{
		fnolVehicleDetailsPOM.selectRoadworthy(false);
	}
	
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleAirBags");
	if (fieldValue !=null)
		fnolVehicleDetailsPOM.selectAirbagsDeployed(fieldValue);
	
	// INVOKE TLc
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleCallTotalLossCalc");
	if (fieldValue.equalsIgnoreCase("TRUE"))
	{
		fnolVehicleDetailsPOM.clickCalculateTotalLoss();
		tlcSteps.completeFNOLPHVehicleTotalCalcForTestScenario();
		
		// check the total loss number
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCPointsTotal");
		if (fieldValue !=null)
			Assert.assertTrue(fieldValue.equals(fnolVehicleDetailsPOM.getLossPoints()),"total loss points not correct, expected:"+fieldValue);
	}
	
	
	// OTHER section
	fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFinanceOnVehicle");
	if (fieldValue !=null&& fieldValue.equalsIgnoreCase("TRUE"))
	{
		fnolVehicleDetailsPOM.selectFinanceOnVehicle(true);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFinanceMonthly");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setFinanceMonthlyPayment(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFinanceMonthsRemaining");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setFinanceMonthsRemaining(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFinancePayOff");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setFinancePayoffAmount(fieldValue);
	}
	else
	{
		fnolVehicleDetailsPOM.selectFinanceOnVehicle(false);
	}
		
	
	//FIRE section
	// For PH, if accident type is fire then complete - se could have a flag on the testdata sheet instead, but we cn use this for now
	fieldValue = ExcelUtil.getTestDataValue("Fnol_Step3_IncidentType");
	if (fieldValue.equalsIgnoreCase("Fire"))
	{
		// use the Ph name as last in charge
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Name");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.selectFireLastInCharge(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Name");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.selectFireWhoDiscovered(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireWhenDate");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setFireWhenDiscovered(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireWhenTime");
		if (fieldValue !=null)
			fnolVehicleDetailsPOM.setFireTimeDiscovered(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireGarage");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolVehicleDetailsPOM.selectFireVisitedGarage(true);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireGarageDetails");
			fnolVehicleDetailsPOM.setFireGarageDetails(fieldValue);
		}
		else
		{
			fnolVehicleDetailsPOM.selectFireVisitedGarage(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireOtherVehicle");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolVehicleDetailsPOM.selectFireOtherVehicles(true);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireOtherVehicleDetails");
			fnolVehicleDetailsPOM.setFireOtherVehicleDetails(fieldValue);
		}
		else
		{
			fnolVehicleDetailsPOM.selectFireOtherVehicles(false);
		}
		
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireSuspected");
		if (fieldValue !=null&& fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolVehicleDetailsPOM.selectFireSuspected(true);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireSuspectNewPerson");
			if (fieldValue.equalsIgnoreCase("TRUE")) {
				
				//TODO
			}
			else
			{
				// use dropdown
			}
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireWhySuspect");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.setFireWhySuspected(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleFireHowSuspectKnown");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.selectFireHowSuspectKnown(fieldValue);
			
		}
		else {
			fnolVehicleDetailsPOM.selectFireSuspected(false);
			}
		}
	
	
	    //THEFT section
		// For PH, if accident type is THEFT then complete - se could have a flag on the testdata sheet instead, but we cn use this for now
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step3_IncidentType");
		if (fieldValue.equalsIgnoreCase("Theft"))
		{
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftLastSeenDate");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.setTheftLastSeenDate(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftLastSeenTime");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.setTheftLastSeenTime(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftLossDate");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.setTheftWhenDiscovered(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftLossTime");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.setTheftTimeDiscovered(fieldValue);
			
			
		
			fieldValue = ExcelUtil.getTestDataValue("Fnol_Name");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.selectTheftLastDriver(fieldValue);
			
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftWindowsLocked");
			if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
			{
				fnolVehicleDetailsPOM.selectTheftWindowsLocked(true);
			}
			else
			{
				fnolVehicleDetailsPOM.selectTheftWindowsLocked(false);
			}
          

			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftSecurityFitted");
			if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
			{
				fnolVehicleDetailsPOM.selectTheftSecurityFitted(true);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftSecurityDetails");
				if (fieldValue !=null)
					fnolVehicleDetailsPOM.setTheftSecurityDetails(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftSecurityActive");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
					fnolVehicleDetailsPOM.selectTheftSecurityActive(true);
				}
				else
				{
					fnolVehicleDetailsPOM.selectTheftSecurityActive(false);
				}
				
				
			}
			else
			{
				fnolVehicleDetailsPOM.selectTheftSecurityFitted(false);
			}
			
			
			
			
			// keys
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftKeysOnPurchase");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.selectKeysPurchased(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftKeysPossessed");
			if (fieldValue !=null)
				fnolVehicleDetailsPOM.selectKeysPossessed(fieldValue);
			
			//contactless
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftKeyContactless");
			if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
			{
				fnolVehicleDetailsPOM.selectTheftKeysContactless(true);
			}
			else
			{
				fnolVehicleDetailsPOM.selectTheftKeysContactless(false);
			}
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftKeyLeftInVehicle");
			if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
			{
				fnolVehicleDetailsPOM.selectTheftKeysLeft(true);
			}
			else
			{
				fnolVehicleDetailsPOM.selectTheftKeysLeft(false);
			}
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftGarage");
			if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
			{
				fnolVehicleDetailsPOM.selectTheftVisitedGarage(true);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftGarageDetails");
				fnolVehicleDetailsPOM.setTheftGarageDetails(fieldValue);
			}
			else
			{
				fnolVehicleDetailsPOM.selectTheftVisitedGarage(false);
			}
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftVehicleChanged");
			if (fieldValue !=null &&fieldValue.equalsIgnoreCase("TRUE"))
			{
				fnolVehicleDetailsPOM.selectTheftVehicleChanged(true);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftVehicleChangedDetails");
				fnolVehicleDetailsPOM.setTheftVehicleChangedDetails(fieldValue);
			}
			else
			{
				fnolVehicleDetailsPOM.selectTheftVehicleChanged(false);
			}
			
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftSuspected");
			if (fieldValue !=null &&fieldValue.equalsIgnoreCase("TRUE"))
			{
				fnolVehicleDetailsPOM.selectTheftSuspected(true);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftSuspectNewPerson");
				if (fieldValue.equalsIgnoreCase("TRUE")) {
					
					//TODO
				}
				else
				{
					// use dropdown
				}
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftWhySuspect");
				if (fieldValue !=null)
					fnolVehicleDetailsPOM.setTheftWhySuspected(fieldValue);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftHowSuspectKnown");
				if (fieldValue !=null)
					fnolVehicleDetailsPOM.selectTheftHowSuspectKnown(fieldValue);
				
			}
			else {
				fnolVehicleDetailsPOM.selectTheftSuspected(true);
				}
			
		
		// police
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftPoliceTreating");
			if (fieldValue !=null &&fieldValue.equalsIgnoreCase("FALSE"))
			{
				fnolVehicleDetailsPOM.selectTheftPoliceTreating(false);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTheftPoliceDetails");
				if (fieldValue !=null)
					fnolVehicleDetailsPOM.setTheftPoliceDetails(fieldValue);
			
				
			}
			else
			{
				fnolVehicleDetailsPOM.selectTheftPoliceTreating(true);
			}
		
		}
	
	
	
	// add TP passenger if one is requiredd
			if (ExcelUtil.getTestDataValue("Fnol_PHPassengerRequired").equalsIgnoreCase("TRUE"))
			   {
				   fnolVehicleDetailsPOM.selectAddPassenger();
				   passengerSteps.completeFNOLPHPassengerForTestScenario();
				  
			   }
	
	
	   fnolVehicleDetailsPOM.selectOK();
	}
	

	public void completeFNOLTPVehicleForTestScenario() throws Throwable
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
			   passengerSteps.completeFNOLTPPassengerForTestScenario();
			  
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