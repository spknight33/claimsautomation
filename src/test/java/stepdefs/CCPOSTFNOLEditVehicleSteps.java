package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;

public class CCPOSTFNOLEditVehicleSteps extends BaseTest {

	@Then("^I will be on edit vehicle screen on post FNOL$")
	public void i_will_be_on_edit_vehicle_screen_for_post_FNOL() throws Throwable {
		postFnolEditVehiclePOM.isPageTitleDisplayed("Vehicle Details");
	}
	
	
	

}
