package stepdefs.postfnol;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewServiceSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL New Service screen$")
	public void i_will_see_post_FNOL_service_details() throws Throwable {
		postFnolNewServicePOM.isPageTitleDisplayed("Create Service");
	}
	
	@Given("^I click submit button on New Service screen for post FNOL$")
	public void submit() {
		
		postFnolNewServicePOM.submit();
	}
	
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on New Service screen for post FNOL$")
	public void i_select_from_field_on_service_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Related To":
			postFnolNewServicePOM.selectRelatedTo(fieldValue);
		    	break;
		case "Request Type":
			postFnolNewServicePOM.selectRequestType(fieldValue);
		    	break;
		
	    
	
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on New Service screen for post FNOL$")
	public void i_input_into_the_box_on_service_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
	
		case "todo":
		//	postFnolNewServicePOM.setDescription(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
}
