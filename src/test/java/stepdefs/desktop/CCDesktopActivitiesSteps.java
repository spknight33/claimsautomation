package stepdefs.desktop;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCDesktopActivitiesSteps extends BaseTest {
	
	
	
	@Then("^I will see desktop activities details screen$")
	public void i_will_see_desktop_activities_details() throws Throwable {
		desktopActivitiesPOM.isPageTitleDisplayed("Activities");
	}
	
	
	
	@Given("^I select the activity for subject \"([^\"]*)\" for claim \"([^\"]*)\" for insured \"([^\"]*)\" and for exposure \"([^\"]*)\"$")
	public void i_select_the_exposure_for_type_for_coverage_and_claimant(String subject, String claim, String insured, String exposure)
			throws Throwable {
		
		desktopActivitiesPOM.clickActivityToAction(subject, claim, insured, exposure);
	}
	
	
	
	
	
	
	@When("^I click on claim on desktop activities screen$")
	public void i_click_onclaim_desktop_activities_screen() throws Throwable {
		desktopActivitiesPOM.clickOnClaimForActivity();
	}

	
	

}
