package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TotalLossCalculatorSteps extends BaseTest {
	
	
	
	public void completeFNOLPHVehicleTotalCalcForTestScenario() throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCVehicleAge");
		if (fieldValue !=null)
			totalLossCalcPOM.selectVehicleAge(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCOver100k");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectOver100K(true);
		}
		else
		{
			totalLossCalcPOM.selectOver100K(false);
		}
			
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCAirbags");
		if (fieldValue !=null)
			totalLossCalcPOM.selectAirbagsDeployed(fieldValue);
		// TODO the rest
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCRollover");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectRollover(true);
		}
		else
		{
			totalLossCalcPOM.selectRollover(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCCosmetic");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectCosmeticDamage(true);
		}
		else
		{
			totalLossCalcPOM.selectCosmeticDamage(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCLight");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectLightDamage(true);
		}
		else
		{
			totalLossCalcPOM.selectLightDamage(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCMedium");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectMediumDamage(true);
		}
		else
		{
			totalLossCalcPOM.selectMediumDamage(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCHeavy");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectHeavyDamage(true);
		}
		else
		{
			totalLossCalcPOM.selectHeavyDamage(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCVeryHeavy");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectVeryHeavyDamage(true);
		}
		else
		{
			totalLossCalcPOM.selectVeryHeavyDamage(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCBurnEngine");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectBurnEngine(true);
		}
		else
		{
			totalLossCalcPOM.selectBurnEngine(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCBurnInterior");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectDamageInterior(true);
		}
		else
		{
			totalLossCalcPOM.selectDamageInterior(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCDrivenWater");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectDrivenIntoWater(true);
		}
		else
		{
			totalLossCalcPOM.selectDrivenIntoWater(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCSubmerged");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectSubmerged(true);
		}
		else
		{
			totalLossCalcPOM.selectSubmerged(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCWaterInCompartment");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectWaterPassengerCompartment(true);
		}
		else
		{
			totalLossCalcPOM.selectWaterPassengerCompartment(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHVehicleTLCWaterSeats");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			totalLossCalcPOM.selectWaterReachedSeats(true);
		}
		else
		{
			totalLossCalcPOM.selectWaterReachedSeats(false);
		}
		
		totalLossCalcPOM.selectUpdate();
	}
	
	
	
	@Then("^I will be on the total loss calculator screen$")
	public void i_will_be_on_totalloss_screen() throws Throwable {
	    totalLossCalcPOM.isPageTitleDisplayed("Total Loss Calculator");
	}

	
	@Given("^I select \"([^\"]*)\" on total loss calculator screen$")
	public void i_select_on_losscalc_screen(String button) throws Throwable {
		switch(button)
	    {
	   case "Cancel":
		   totalLossCalcPOM.selectCancel();
	    	break;
	   case "Update":
		   totalLossCalcPOM.selectUpdate();
	    	break;
	   
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	
	

}
