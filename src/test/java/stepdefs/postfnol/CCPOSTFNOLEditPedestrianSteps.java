package stepdefs.postfnol;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCPOSTFNOLEditPedestrianSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	@Then("^I will be on edit pedestrian screen on post FNOL$")
	public void i_will_see_post_FNOL_editpedestrian_details() throws Throwable {
		postFnolPedestrianPOM.isPageTitleDisplayed("Pedestrian Details");
	}
	
	
	@Given("^I click cancel button on edit pedestrian screen on post FNOL$")
	public void cancel() {
		
		postFnolPedestrianPOM.selectCancel();
	}
}
