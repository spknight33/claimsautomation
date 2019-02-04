package stepdefs.postfnol.documents;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLDocumentSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Documents screen$")
	public void i_will_see_post_FNOL_documentsscreen() throws Throwable {
		postFnolDocumentsPOM.isPageTitleDisplayed("Documents");
	}
	
	
	
	
	

}
