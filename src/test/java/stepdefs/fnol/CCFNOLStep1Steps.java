package stepdefs.fnol;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.config.UserConfig;
import com.big.automation.selenium_webdriver.common.config.UserFactory;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefs.common.CCLoginSteps;
import stepdefs.common.CCMenuBarSteps;

public class CCFNOLStep1Steps extends BaseTest {

	CCLoginSteps loginSteps = new CCLoginSteps();
	CCMenuBarSteps menuSteps = new CCMenuBarSteps();

	/**
	 * Used for regression runs
	 * @throws Throwable
	 */
	@Then("I complete step1 for FNOL$")
	public void iCompleteStep1FNOL() throws Throwable {

		i_set_the_policy_search_criteria_fields_to("policynumber", ExcelUtil.getTestDataValue("Fnol_PolicyNumber"));
		i_Click_Search();
		this.setLossDate(ExcelUtil.getTestDataValue("Fnol_Step1_LossDate"));
		this.setLossTime(ExcelUtil.getTestDataValue("Fnol_Step1_LossTime"));
		this.next();

	}

	@Given("^As a \"([^\"]*)\" I am at step1 for FNOL$")
	public void as_a_user_I_am_at_step1_for_FNOL(String userType) throws Throwable {
		loginSteps.i_access_claimcenter_login_page();
		UserConfig user = UserFactory.getUserConfig(userType);
		loginSteps.i_login_to_ClaimCenter_as_with(user.username, user.password);
		menuSteps.selectNewClaimsMenuItem();
	}

	@Then("^I will be on step1 for FNOL$")
	public void i_will_be_on_step1_for_FNOL() throws Throwable {
		fnolStep1POM.isPageTitleDisplayed("Step 1: Search or Create Policy");
	}

	@Then("^Mandatory field error message will be shown at step1 FNOL$")
	public void mandatory_field_error_message_will_be_shown() throws Throwable {
		Assert.assertTrue(fnolStep1POM.containsErrorMessage("Loss Date : Missing required field \"Loss Date\""),
				"Error Message For Loss Date expected");
		Assert.assertTrue(fnolStep1POM.containsErrorMessage("\"Loss Time : Missing required field \"Loss Time\""),
				"Error Message For Loss Time expected");
	}

	@Then("^Mandatory field error messages will be shown at step1 FNOL$")
	public void mandatory_field_error_messages_will_be_shown(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolStep1POM.containsErrorMessage(list.get(i)),
					"Error Message Check: " + list.get(i));

		}
		softAssert.assertAll();
	}

	@When("^I set the policy search criteria field at step1 FNOL \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_the_policy_search_criteria_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		case "policynumber":
			fnolStep1POM.setSearchPolicyNumber(fieldValue);
			break;
		case "firstname":
			fnolStep1POM.setSearchFirstName(fieldValue);
			break;
		case "lastname":
			fnolStep1POM.setSearchLastName(fieldValue);
			break;
		case "lossdate":
			fnolStep1POM.setSearchLossDate(fieldValue);
			break;
		case "city":
			fnolStep1POM.setSearchTownCity(fieldValue);
			break;
		case "county":
			fnolStep1POM.setSearchFirstName(fieldValue);
			break;
		case "postcode":
			fnolStep1POM.setSearchPostcode(fieldValue);
			break;
		case "vrn":
			fnolStep1POM.setSearchVRN(fieldValue);
			break;
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}

	@Then("^I will see policy search results at step1 FNOL which contains value \"([^\"]*)\" for the \"([^\"]*)\"$")
	public void i_will_see_policy_search_results_which_contains_value_for_the(String value, String resultscolumn)
			throws Throwable {
		Assert.assertTrue(fnolStep1POM.policySearchResultsShownForColumn(value, resultscolumn));

	}

	@Given("^I Search For Policy With Default Criteria at step1 FNOL$")
	public void searchForPolicyDefaultCriteria() {

		fnolStep1POM.searchPolicy();

	}

	@When("^I Click Search at step1 FNOL$")
	public void i_Click_Search() throws Throwable {
		fnolStep1POM.searchPolicy();
	}

	@When("^I select the first policy in the results at step1 FNOL$")
	public void selectFirstPolicy() {

		fnolStep1POM.selectFirstPolicy();
	}

	@Given("^I Set the Loss Date to \"([^\"]*)\" at step1 FNOL$")
	public void setLossDate(String date) {

		fnolStep1POM.setLossDate(date);
	}

	@Given("^I Set the Loss Time to \"([^\"]*)\" at step1 FNOL$")
	public void setLossTime(String time) {

		fnolStep1POM.setLossTime(time);
	}

	@Given("^I click reset button at step1 FNOL$")
	public void resetPolicySearch() {

		fnolStep1POM.resetSearchPolicy();
	}

	@Given("^I click next button at step1 FNOL$")
	public void next() {

		fnolStep1POM.next();
	}

	@Then("^I will see the policy search input fields at step1 FNOL$")
	public void i_will_see_the_policy_search_input_fields(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();

		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolStep1POM.inputFieldOnScreen(list.get(i)),
					"Policy Search Field Check: " + list.get(i));

		}
		softAssert.assertAll();

	}

	@Then("^I will not see the policy search input fields at step1 FNOL$")
	public void i_will_not_see_the_policy_search_input_fields(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);

		SoftAssert softAssert = new SoftAssert();

		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolStep1POM.inputFieldNotOnScreen(list.get(i)),
					"Policy Search Field NOT present Check: " + list.get(i));

		}
		softAssert.assertAll();
	}

	@Then("^I will see the New Claim fields at step1 FNOL$")
	public void i_will_see_the_New_Claim_fields(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolStep1POM.inputFieldOnScreen(list.get(i)),
					"New Claim Field Check: " + list.get(i));

		}
		softAssert.assertAll();
	}

}