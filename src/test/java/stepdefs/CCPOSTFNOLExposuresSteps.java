package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.config.UserToGroupMap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CCPOSTFNOLExposuresSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL exposures screen$")
	public void i_will_see_post_FNOL_exposurescreen() throws Throwable {
		postFnolExposuresPOM.isPageTitleDisplayed("Exposures");
	}
	
	
	
	@When("^I select the \"([^\"]*)\" exposure on the post FNOL exposures screen$")
	public void i_select_the_exposure_on_the_post_FNOL_exposures_screen(String type) throws Throwable {
		postFnolExposuresPOM.selectExposureOfType(type);
	}
	

	
	@Given("^I will see type \"([^\"]*)\" for coverage \"([^\"]*)\" has been assigned to a user in group \"([^\"]*)\"$")
	public void i_will_see_type_for_coverage_has_been_assigned_to_a_user_in_group(String type, String coverage, String group) throws Throwable {
	   
		String handler = postFnolExposuresPOM.getHandlerForExposure(type, coverage);
	   
	    // fail if handler not found
		Assert.assertNotNull(handler,"Cannot find exposure in exposure table");
	   
		Assert.assertTrue(UserToGroupMap.getGroupForUser(handler).equalsIgnoreCase(group),"Not in expected group:"+group);
	   // A handler will belong to a group
		
	   
	   
	}
	
	   

	
	
	

}
