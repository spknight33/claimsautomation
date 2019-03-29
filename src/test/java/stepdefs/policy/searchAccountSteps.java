package stepdefs.policy;

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

public class searchAccountSteps extends BaseTest {

	

	@When("^I set the policy account field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_the_policy_search_criteria_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		case "FirstName":
			policyAccountPOM.setFirstName(fieldValue);
			break;
		case "LastName":
			policyAccountPOM.setLastName(fieldValue);
			break;
		
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}


	@When("^I Click Search at account create$")
	public void i_Click_Search() throws Throwable {
		policyAccountPOM.clickSearch();
		}
	
	@When("^I Click create new person account$")
	public void i_Click_newperson() throws Throwable {
		policyAccountPOM.clickNewPersonAccount();
		}

	
	
	

}