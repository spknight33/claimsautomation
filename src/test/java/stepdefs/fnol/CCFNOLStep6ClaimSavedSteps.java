package stepdefs.fnol;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCFNOLStep6ClaimSavedSteps extends BaseTest{
	
	
	@Then("^I will be on Claim Saved screen in FNOL$")
	public void i_will_be_on_claimsaved_for_FNOL() throws Throwable {
		fnolClaimSavedPOM.isPageTitleDisplayed("New Claim Saved");
	}
	
	
	@When("^I click on the created claim link on Claim Saved screen$")
	public void i_click_on_the_created_claim_lnik_on_Claim_Saved_screen() throws Throwable {
		fnolClaimSavedPOM.clickClaimLink();
	}

	
	
}
