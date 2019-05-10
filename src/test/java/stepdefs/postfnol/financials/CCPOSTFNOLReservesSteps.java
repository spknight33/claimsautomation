package stepdefs.postfnol.financials;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CCPOSTFNOLReservesSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Reserves screen$")
	public void i_will_see_post_FNOL_reservesscreen() throws Throwable {
		postFnolSetReservesPOM.isPageTitleDisplayed("Reserves and Recovery Reserves");
	}
	
	
	@When("^I click \"([^\"]*)\" on post FNOL Reserves screen$")
	public void i_click_edit_onpost_FNOL_reserves(String fieldName) throws Throwable {
		switch (fieldName) {
		case "edit":
			postFnolSetReservesPOM.edit();
			break;
		case "save":
			postFnolSetReservesPOM.save();
			break;
		case "cancel":
			postFnolSetReservesPOM.cancel();
			break;
		case "add":
			postFnolSetReservesPOM.add();
			break;
		case "add recovery reserve":
			postFnolSetReservesPOM.addRecoveryReserve();
			break;
		
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
		
	}
	
	@When("^I select the reserve for exposure \"([^\"]*)\" and coverage \"([^\"]*)\" and sub type \"([^\"]*)\"$")
	public void i_select_the_reserve_for_exposure_and_coverage_and_sub_type(String exposure, String coverage, String coverageSubType) throws Throwable {
		postFnolSetReservesPOM.selectReserve(exposure, coverage, coverageSubType);
	}
	

@Given("^I create a recovery reserve for category \"([^\"]*)\" and amount \"([^\"]*)\"$")
public void i_create_a_recovery_reserve_for_category_and_amount(String category, String amount) throws Throwable {
	postFnolSetReservesPOM.createRecoveryReserve(category, amount);
}

}
