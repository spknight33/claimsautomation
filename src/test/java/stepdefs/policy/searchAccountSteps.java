package stepdefs.policy;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.When;

public class searchAccountSteps extends BaseTest {

	/**
	 * Used for whole policy creation journey
	 * @throws Throwable
	 */
	public void iSearchForPolicyAccount() throws Throwable {
	
		this.i_set_the_policy_search_criteria_field_to("FirstName",ExcelUtil.getTestDataValue("Pol_AccountSearch_FirstName"));
		this.i_set_the_policy_search_criteria_field_to("LastName",ExcelUtil.getTestDataValue("Pol_AccountSearch_LastName"));
		this.i_Click_Search();

	}
	

	@When("^I set the policy account field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_the_policy_search_criteria_field_to(String fieldName, String fieldValue) throws Throwable {
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

	//TODO - select account if found
	
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
		//TODO - other fields
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
	public void i_Click_Update() throws Throwable {
		policyCreateAccountPOM.clickUpdate();
		}

}