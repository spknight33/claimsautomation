package stepdefs.postfnol.lossdetails.associations;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;

public class CCPOSTFNOLAssociationsSteps extends BaseTest {
	
	
	
	
	
	@Then("^I will see post FNOL loss details associations screen$")
	public void i_will_see_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsAssociationsPOM.isPageTitleDisplayed("Associations");
	}
	
	
	
	
	

	
	
	

}
