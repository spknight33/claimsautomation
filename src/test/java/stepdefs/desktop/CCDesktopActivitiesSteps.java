package stepdefs.desktop;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCDesktopActivitiesSteps extends BaseTest {
	
	
	
	@Then("^I will see desktop activities details screen$")
	public void i_will_see_desktop_activities_details() throws Throwable {
		desktopActivitiesPOM.isPageTitleDisplayed("Activities");
	}
	
	
	
	@When("^I click on claim on desktop activities screen$")
	public void i_click_onclaim_desktop_activities_screen() throws Throwable {
		desktopActivitiesPOM.clickOnClaimForActivity();
	}

	
	

}
