package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

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
	

	

	   

	
	
	

}
