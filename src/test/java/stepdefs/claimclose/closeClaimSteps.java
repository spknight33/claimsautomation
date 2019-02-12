package stepdefs.claimclose;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class closeClaimSteps extends BaseTest{
	
	@Then("^I will be on Claim Close screen$")
	public void i_will_be_on_claimcloscreen() throws Throwable {
		closeClaimPOM.isPageTitleDisplayed("Close Claim");
	}
	
	@Then("^Error messages will be shown on Close Claim screen$")
	public void error_messages_will_be_shown(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(closeClaimPOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}

	

	@Given("^I click Close Claim button on Close Claim screen$")
	public void closeclaim() {
		
		closeClaimPOM.closeClaim();
	}

	@Given("^I click cancel button on Close Claim screen$")
	public void cancel() {
		
		closeClaimPOM.cancel();
	}
	
	
	
	
	@Then("^I select \"([^\"]*)\" from \"([^\"]*)\" field on Close Claim screen$")
	public void i_select_from_field_on_step(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Outcome":
	    	closeClaimPOM.selectOutcome(fieldValue);
	    	break;
	    	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
		
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on Close Claim screen$")
	public void i_input_into_the_box_on_step2(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Note":
			closeClaimPOM.setNoteText(fieldValue);
			break;
		

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	

	

}
