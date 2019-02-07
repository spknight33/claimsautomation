package stepdefs.postfnol.summary;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;

public class CCPOSTFNOLSummaryStatusSteps extends BaseTest {
	
	
	
	@Then("^I will see post FNOL summary status screen$")
	public void i_will_see_post_FNOL_loss_details() throws Throwable {
		postFnolSummaryStatusPOM.isPageTitleDisplayed("Claim Status");
	}
	
	
	
	

}
