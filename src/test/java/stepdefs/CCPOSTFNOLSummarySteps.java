package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;

public class CCPOSTFNOLSummarySteps extends BaseTest {
	
	
	
	@Then("^I will see post FNOL summary details$")
	public void i_will_see_post_FNOL_loss_details() throws Throwable {
		postFnolSummaryPOM.isPageTitleDisplayed("Summary");
	}
	
	
	
	

}
