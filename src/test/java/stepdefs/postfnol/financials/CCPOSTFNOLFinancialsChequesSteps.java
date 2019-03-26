package stepdefs.postfnol.financials;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CCPOSTFNOLFinancialsChequesSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Financials Cheques screen$")
	public void i_will_see_post_FNOLchequesscreen() throws Throwable {
		postFnolFinancialChequesPOM.isPageTitleDisplayed("Cheques");
	}
	
	@Given("^I will see cheque with status \"([^\"]*)\" for Payee \"([^\"]*)\" for amount \"([^\"]*)\" on Financials Cheques screen$")
	public void i_will_see_cheque(String status,String payee, String amount) throws Throwable {

		// TODO - sort out issue with passing £ from cucumber, must be an encoding issue
		// as coming across as ?
		amount = "£" + amount;

		

		boolean found = postFnolFinancialChequesPOM.containsCheque(status, payee, amount);

		Assert.assertTrue(found,
				"expected to find cheque for status:" + status + ",payee:"+payee+",amount:"+amount +"but none found");

	}
	
	
	

}
