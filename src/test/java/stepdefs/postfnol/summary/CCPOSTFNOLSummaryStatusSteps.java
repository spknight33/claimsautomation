package stepdefs.postfnol.summary;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCPOSTFNOLSummaryStatusSteps extends BaseTest {
	
	
	
	@Then("^I will see post FNOL summary status screen$")
	public void i_will_see_post_FNOL_claim_status() throws Throwable {
		postFnolSummaryStatusPOM.isPageTitleDisplayed("Claim Status");
	}
	
	@Then("^I click edit on post FNOL summary status screen$")
	public void i_clickedit_on_post_FNOL_claim_status() throws Throwable {
		postFnolSummaryStatusPOM.edit();
	}
	
	@Then("^I click update on post FNOL summary status screen$")
	public void i_clickupdate_on_post_FNOL_claim_status() throws Throwable {
		postFnolSummaryStatusPOM.update();
	}
	
	
	
	@When("^I set the post FNOL claim status screen field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_postfnol_claimstatus_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		
		 case "IncidentOnly":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		postFnolSummaryStatusPOM.selectIncidentOnly(true);
		    	else
		    		postFnolSummaryStatusPOM.selectIncidentOnly(false);
		    	break;
		 case "DateReported":
			 postFnolSummaryStatusPOM.setDateReported(fieldValue);
				break;
		 case "CoverageInQuestion":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		postFnolSummaryStatusPOM.selecCoverageInQuestion(true);
		    	else
		    		postFnolSummaryStatusPOM.selecCoverageInQuestion(false);
		    	break;
				
				
				
				
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}
	

}
