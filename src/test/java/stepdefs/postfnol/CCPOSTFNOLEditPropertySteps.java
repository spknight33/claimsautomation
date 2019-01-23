package stepdefs.postfnol;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLEditPropertySteps extends BaseTest {
	
	CCPOSTFNOLPersonContactSteps personContactSteps = new CCPOSTFNOLPersonContactSteps();
	CCPOSTFNOLCompanyContactSteps companyContactSteps = new CCPOSTFNOLCompanyContactSteps();
	
	
	@Then("^I will be on edit property screen on post FNOL$")
	public void i_will_see_post_FNOL_editproperty_details() throws Throwable {
		postFnolEditPropertyPOM.isPageTitleDisplayed("Property Incident");
	}
	
	
	@Given("^I click update button edit property on post FNOL$")
	public void update() {
		
		postFnolEditPropertyPOM.update();
	}
	
	@Given("^I click cancel button on edit property screen on post FNOL$")
	public void cancel() {
		
		postFnolEditPropertyPOM.cancel();
	}
	

	
	
	
	

}
