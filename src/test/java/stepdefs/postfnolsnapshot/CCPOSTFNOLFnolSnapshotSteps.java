package stepdefs.postfnolsnapshot;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;


public class CCPOSTFNOLFnolSnapshotSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Snapshot screen$")
	public void i_will_see_post_FNOL_snapshotscreen() throws Throwable {
		postFnolSnapshotPOM.isPageTitleDisplayed("Snapshot: Loss Details");
	}
	
	
	
	
	

}
