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

public class createPersonAccountSteps extends BaseTest {

	

	@When("^I set the policy create account field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_the_policy_search_criteria_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		case "Brand":
			policyCreateAccountPOM.selectBrand(fieldValue);
			break;
		case "AddressType":
			policyCreateAccountPOM.selectAddressType(fieldValue);
			break;
		case "Postcode":
			policyCreateAccountPOM.setPostcode(fieldValue);
			break;
		case "PostcodeAddress":
			policyCreateAccountPOM.selectPostcodeAddress(fieldValue);
			break;
		
		case "PrimaryPhone":
			policyCreateAccountPOM.selectPrimaryPhone(fieldValue);
			break;
		case "Email":
			policyCreateAccountPOM.setEmail(fieldValue);
			break;
		case "Mobile":
			policyCreateAccountPOM.setMobile(fieldValue);
			break;
		
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}


	@When("^I Click Update at create person account$")
	public void i_Click_Search() throws Throwable {
		policyCreateAccountPOM.clickUpdate();
		}
	

}