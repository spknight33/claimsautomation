package stepdefs;

import java.util.List;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCPOSTFNOLWorkplanSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Workplan screen$")
	public void i_will_see_post_FNOL_workplan_details() throws Throwable {
		postFnolWorkplanPOM.isPageTitleDisplayed("Workplan");
	}
	
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on Workplan screen for post FNOL$")
	public void i_select_from_field_on_workplan_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Activities":
			postFnolWorkplanPOM.selectActivities(fieldValue);
		    	break;
	    
	
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@When("^I will see the \"([^\"]*)\" activity on Workplan screen for post FNOL")
	public void i_willsee_the_activity_on_the_post_FNOL_workplan_screen(String type) throws Throwable {
		Assert.assertTrue(postFnolWorkplanPOM.activityOfTypePresent(type), "expected activity to be present");
	}
	
	
	@When("^I select the \"([^\"]*)\" activity on Workplan screen for post FNOL")
	public void i_select_the_activity_on_the_post_FNOL_workplan_screen(String type) throws Throwable {
		postFnolWorkplanPOM.selectActivityOfType(type);
	}
	

	
	
}
