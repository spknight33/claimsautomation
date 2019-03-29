package stepdefs.policy;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.When;

public class createSubmissionSteps extends BaseTest {

	@When("^I select product at step1 of submission create$")
	public void i_Click_Search() throws Throwable {
		policyCreateStep1SubmissionPOM.clickSelectProduct();
		}
	
	

	@When("^I set the submission step2 field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_the_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		case "HeardAbout":
			policyCreateStep2PolicyInfoPOM.selectHowHeard(fieldValue);
			break;
		
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}


	@When("^I Click Next at submission step2$")
	public void i_Click_nextstep2() throws Throwable {
		policyCreateStep2PolicyInfoPOM.clickNext();
		}
	
	@When("^I Click AddDriver at submission step3$")
	public void i_Click_adddriverstep3() throws Throwable {
		policyCreateStep3DriversPOM.selectNamedDriver();
		}
	
	@When("^I set the submission step3 field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_thestep3_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		case "Title":
			policyCreateStep3DriversPOM.selectTitle(fieldValue);
			break;
		case "Occupation":
			policyCreateStep3DriversPOM.selecttOccupation(fieldValue);
			break;
		
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}

}