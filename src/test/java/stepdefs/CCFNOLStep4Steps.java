package stepdefs;

import java.util.List;

import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterData;
import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterDataBuilder;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLStep4Steps extends BaseTest{
	
	CCFNOLStep3Steps step3Steps = new CCFNOLStep3Steps();
	
	
	/**
	 * for use by regression scripts
	 * @param scenarioData
	 * @throws Throwable
	 */
	public void completeFNOLStep4ForTestScenario()  throws Throwable
	{
		fnolStep4POM.next();
	}
	
	@Given("^As a \"([^\"]*)\" I am at step4 for FNOL$")
	public void as_a_user_I_am_at_step4_for_FNOL(String userType) throws Throwable {
		step3Steps.as_a_user_I_am_at_step3_for_FNOL(userType);
		step3Steps.completeFNOLStep3ForTestScenario();
	
	}
	

	@Then("^I will be on step4 for FNOL$")
	public void i_will_be_on_step4_for_FNOL() throws Throwable {
		fnolStep4POM.isPageTitleDisplayed("Step 4 of 5: Services");
	}
	
	// for use by step3
	public boolean step4isDisplayed()
	{
		return fnolStep4POM.isPageTitleDisplayed("Step 4 of 5: Services");
	}
	
	
	@Then("^Mandatory field error messages will be shown for step4$")
	public void mandatory_field_error_messages_will_be_shown_forstep4(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(fnolStep4POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}

	

	@Given("^I click next button on step4$")
	public void next() {
		
		fnolStep4POM.next();
	}

	@Given("^I click previous button on step4$")
	public void previous() {
		
		fnolStep4POM.back();
	}
	
	

	

}
