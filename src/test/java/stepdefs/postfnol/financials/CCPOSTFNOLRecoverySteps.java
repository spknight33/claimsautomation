package stepdefs.postfnol.financials;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CCPOSTFNOLRecoverySteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Recovery screen$")
	public void i_will_see_post_FNOL_recoveryscreen() throws Throwable {
		postFnolRecoveryPOM.isPageTitleDisplayed("Create Recoveries");
	}
	
	
	@When("^I click \"([^\"]*)\" on post FNOL Recovery screen$")
	public void i_click_edit_onpost_FNOL_recovery(String fieldName) throws Throwable {
		switch (fieldName) {
		case "Update":
			postFnolRecoveryPOM.update();
			break;
		case "Cancel":
			postFnolRecoveryPOM.cancel();
			break;
		case "Add":
			postFnolRecoveryPOM.add();
			break;
		case "Remove":
			postFnolRecoveryPOM.remove();;
			break;
		
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
		
	}
	
	
	@Then("^I select \"([^\"]*)\" from \"([^\"]*)\" field on post FNOL Recovery screen$")
	public void i_select_from_field_on_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Payer":
			postFnolRecoveryPOM.selectPayer(fieldValue);
			break;
		
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}

@Given("^I create a recovery for reserve \"([^\"]*)\" and category \"([^\"]*)\" and amount \"([^\"]*)\"$")
public void i_create_a_recovery_reserve_for_category_and_amount(String reserve, String category, String amount) throws Throwable {
	postFnolRecoveryPOM.createRecovery(reserve, category, amount, "this is a test recovery");
}

}
