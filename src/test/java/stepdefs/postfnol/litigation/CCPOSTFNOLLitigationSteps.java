package stepdefs.postfnol.litigation;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLLitigationSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Litigation screen$")
	public void i_will_see_post_FNOL_litigationscreen() throws Throwable {
		postFnolLitigationPOM.isPageTitleDisplayed("Matters");
	}
	
	
	
	
	

}
