package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewActivitySteps extends BaseTest {
	
	
	@Then("^I will see post FNOL New Activity screen$")
	public void i_will_see_post_FNOL_workplan_details() throws Throwable {
		postFnolNewActivityPOM.isPageTitleDisplayed("New Activity");
	}
	
	@Given("^I click update button on New Activity screen for post FNOL$")
	public void update() {
		
		postFnolNewActivityPOM.update();
	}
	
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on New Activity screen for post FNOL$")
	public void i_select_from_field_on_activity_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Related To":
			postFnolNewActivityPOM.selectRelatedTo(fieldValue);
		    	break;
		case "Priority":
			postFnolNewActivityPOM.selectPriority(fieldValue);
		    	break;
		case "Calendar Importance":
			postFnolNewActivityPOM.selectCalendarImportance(fieldValue);
		    	break;
		case "Assign To":
			postFnolNewActivityPOM.selectAssignedTo(fieldValue);
		    	break;
	    
	
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on New Activity screen for post FNOL$")
	public void i_input_into_the_box_on_activity_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
	
		case "Description":
			postFnolNewActivityPOM.setDescription(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
}
