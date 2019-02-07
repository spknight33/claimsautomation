package stepdefs.postfnol.summary;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;

public class CCPOSTFNOLSummaryMetricsSteps extends BaseTest {
	
	
	
	@Then("^I will see post FNOL summary health metrics screen$")
	public void i_will_see_post_FNOL_summarymetrics_details() throws Throwable {
		postFnolSummaryMetricsPOM.isPageTitleDisplayed("Claim Health Metrics");
	}
	
	
	
	

}
