package stepdefs.postfnol.financials;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLFinancialsChequesSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Financials Cheques screen$")
	public void i_will_see_post_FNOLchequesscreen() throws Throwable {
		postFnolFinancialChequesPOM.isPageTitleDisplayed("Financials");
	}
	
	
	
	
	

}
