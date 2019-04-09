package stepdefs.postfnol.lossdetails.liability;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLLiabilitySteps extends BaseTest {
	
	
	
	//----------------------------------------------------------------------------------------------------------------
	// These are all the general access methods for this screen
	
	@Then("^I will see post FNOL loss details liability screen$")
	public void i_will_see_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsLiabilityPOM.isPageTitleDisplayed("Liability");
	}
	
	@Given("^I click edit button on post FNOL loss details liability screen$")
	public void edit() {
		
		postFnolLossDetailsLiabilityPOM.edit();
	}
	@Given("^I click update button on post FNOL loss details liability screen$")
	public void update() {
		
		postFnolLossDetailsLiabilityPOM.update();
	}
	
	
	
	

	
	
	

}
