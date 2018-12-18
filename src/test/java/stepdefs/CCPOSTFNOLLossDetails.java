package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;

public class CCPOSTFNOLLossDetails extends BaseTest {
	
	
	
	@Then("^I will see post FNOL loss details$")
	public void i_will_see_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.isPageTitleDisplayed("Loss Details");
	}

}
