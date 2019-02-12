package stepdefs.postfnol.history;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CCPOSTFNOLHistorySteps extends BaseTest {
	
	
	@Then("^I will see post FNOL History screen$")
	public void i_will_see_post_FNOL_historyscreen() throws Throwable {
		postFnolHistoryPOM.isPageTitleDisplayed("History");
	}
	
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on History screen for post FNOL$")
	public void i_select_from_field_on_history_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Filter":
			postFnolHistoryPOM.selectFilter(fieldValue);
		    	break;
		
	
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	
	
	

}
