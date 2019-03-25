package stepdefs.postfnol.financials;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLFinancialsTransactionsSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Financials Transactions screen$")
	public void i_will_see_post_FNOLtransactionsscreen() throws Throwable {
		postFnolFinancialTransactionsPOM.isPageTitleDisplayed("Transactions");
	}
	
	
	@Then("^I select \"([^\"]*)\" from \"([^\"]*)\" field on post FNOL Financials Transactions screen$")
	public void i_select_from_field(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Transaction Type":
			postFnolFinancialTransactionsPOM.selectTransactionType(fieldValue);
			break;
		
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	

}
