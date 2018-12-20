package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;

public class CCPOSTCFNOLVehicleSteps extends BaseTest {

	@Then("^I will be on new vehicle screen on post FNOL$")
	public void i_will_be_on_vehicle_screen_for_post_FNOL() throws Throwable {
		postFnolVehicleDetailsPOM.isPageTitleDisplayed("Vehicle Details");
	}
	
	
	

}
