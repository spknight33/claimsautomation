package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewVehicleSteps extends BaseTest {

	@Then("^I will be on new vehicle screen on post FNOL$")
	public void i_will_be_on_vehicle_screen_for_post_FNOL() throws Throwable {
		postFnolNewVehiclePOM.isPageTitleDisplayed("New Vehicle Incident");
	}
	
	
	@Given("^I complete all fields on Post FNOL new vehicle incident$")
	public void i_complete_all_fields() throws Throwable {
		
		
		postFnolNewVehiclePOM.selectVehicleType("Owned");
		postFnolNewVehiclePOM.setVrn("PY63NBX");
		postFnolNewVehiclePOM.setMake("Jaguar");
		postFnolNewVehiclePOM.setModel("XJS");
		postFnolNewVehiclePOM.setYear("2013");
		
		
		postFnolNewVehiclePOM.selectOK();
	}
	
	
	

}
