package stepdefs;

import static java.lang.String.format;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewPedestrianSteps extends BaseTest {
	
	
	
	@Then("^I will be on new pedestrian screen on post FNOL$")
	public void i_will_see_post_FNOL_newpedestrian_details() throws Throwable {
		postFnolPedestrianPOM.isPageTitleDisplayed("Pedestrian Details");
	}
	
	
	
}
