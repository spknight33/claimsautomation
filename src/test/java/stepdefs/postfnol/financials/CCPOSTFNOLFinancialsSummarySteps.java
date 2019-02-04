package stepdefs.postfnol.financials;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLFinancialsSummarySteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Financials Summary screen$")
	public void i_will_see_post_FNOL_documentsscreen() throws Throwable {
		postFnolFinancialSummaryPOM.isPageTitleDisplayed("Financials");
	}
	
	
	
	
	

}
