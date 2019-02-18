package stepdefs.postfnol.reserves;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLReservesSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Reserves screen$")
	public void i_will_see_post_FNOL_reservesscreen() throws Throwable {
		postFnolSetReservesPOM.isPageTitleDisplayed("Set Reserves");
	}
	
	
	
	
	

}
