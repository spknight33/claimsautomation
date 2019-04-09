package stepdefs.postfnol.lossdetails.siu;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;

public class CCPOSTFNOLSIUSteps extends BaseTest {
	
	
	
	
	
	@Then("^I will see post FNOL loss details SIU screen$")
	public void i_will_see_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsSIUPOM.isPageTitleDisplayed("Special Investigation DetailS");
	}
	
	
	
	
	

	
	
	

}
