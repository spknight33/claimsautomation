package stepdefs.desktop;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCDesktopQueuesSteps extends BaseTest {
	
	
	
	@Then("^I will see desktop queue details$")
	public void i_will_see_desktop_queue_details() throws Throwable {
		desktopQueuesPOM.isPageTitleDisplayed("Queued Activities");
	}
	
	
	
	@When("^I will click assign next on desktop queue screen$")
	public void i_will_click_assign_next_on_desktop_queue_screen() throws Throwable {
		desktopQueuesPOM.clickAssignNext();
	}

	
	

}
