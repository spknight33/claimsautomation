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
		
		// TODO the rest
		
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
