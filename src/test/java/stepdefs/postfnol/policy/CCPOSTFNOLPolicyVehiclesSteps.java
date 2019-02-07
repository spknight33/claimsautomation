package stepdefs.postfnol.policy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLPolicyVehiclesSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Policy Vehicles screen$")
	public void i_will_see_post_FNOL_policyvehiclesscreen() throws Throwable {
		postFnolPolicyVehiclesPOM.isPageTitleDisplayed("Policy: Vehicles");
	}
	
	
	
	
	

}
