package stepdefs.postfnol.financials;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLFinancialsTransactionsSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Financials Transactions screen$")
	public void i_will_see_post_FNOLtransactionsscreen() throws Throwable {
		postFnolFinancialTransactionsPOM.isPageTitleDisplayed("Financials");
	}
	
	
	
	
	

}
