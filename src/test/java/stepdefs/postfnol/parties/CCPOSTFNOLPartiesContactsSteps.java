package stepdefs.postfnol.parties;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLPartiesContactsSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Parties Involved Contacts screen$")
	public void i_will_see_post_FNOL_partiescontactsscreen() throws Throwable {
		postFnolPartiesInvolvedPOM.isPageTitleDisplayed("Contacts");
	}
	
	
	
	
	

}
