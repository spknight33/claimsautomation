package stepdefs.postfnol.policy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLPolicyGeneralSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Policy General screen$")
	public void i_will_see_post_FNOL_policygeneralscreen() throws Throwable {
		postFnolPolicyGeneralPOM.isPageTitleDisplayed("Policy: General");
	}
	
	
	
	
	

}
