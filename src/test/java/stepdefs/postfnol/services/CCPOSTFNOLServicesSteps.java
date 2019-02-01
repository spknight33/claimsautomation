package stepdefs.postfnol.services;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CCPOSTFNOLServicesSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Services screen$")
	public void i_will_see_post_FNOL_servicesscreen() throws Throwable {
		postFnolServicesPOM.isPageTitleDisplayed("Services");
	}
	
	
	
	@Given("^I will see the service progress \"([^\"]*)\" on the post FNOL Services screen$")
	public void i_will_see_the_service_progress_on_the_post_FNOL_Services_screen(String fieldValue) throws Throwable {
	    Assert.assertEquals(postFnolServicesPOM.getServiceProgressText(), fieldValue);
	}
	

	
	

	
	
	

}
