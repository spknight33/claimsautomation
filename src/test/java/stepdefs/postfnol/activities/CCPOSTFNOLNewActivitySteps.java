package stepdefs.postfnol.activities;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.TimeStampUtils;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewActivitySteps extends BaseTest {
	
	public static String nowStamp=null;
	
	@Then("^I will see post FNOL New Activity screen$")
	public void i_will_see_post_FNOL_workplan_details() throws Throwable {
		postFnolNewActivityPOM.isPageTitleDisplayed("New Activity");
	}
	
	@Given("^I click update button on New Activity screen for post FNOL$")
	public void update() {
		
		postFnolNewActivityPOM.update();
	}
	@Given("^I click cancel button on New Activity screen for post FNOL$")
	public void cancel() {
		
		postFnolNewActivityPOM.cancel();
	}
	
	@Given("^I click find External Owner icon on New Activity screen for post FNOL$")
	public void findExternalOwner() {
		
		postFnolNewActivityPOM.selectExternalOwnerSearch();
	}
	@Given("^I click External Owner New Person icon on New Activity screen for post FNOL$")
	public void externalOwnerNewPerson() {
		
		postFnolNewActivityPOM.selectExternalOwnerNewPerson();
	}
	
	@Given("^I click find Document Template icon on New Activity screen for post FNOL$")
	public void findDocument() {
		
		postFnolNewActivityPOM.clickFindDocumentTemplate();
	}
	@Given("^I click find Email Template icon on New Activity screen for post FNOL$")
	public void findEmail() {
		
		postFnolNewActivityPOM.clickFindEmailTemplate();
	}
	
	
	@Given("^Field \"([^\"]*)\" is set to \"([^\"]*)\" on New Activity screen for post FNOL$")
	public void fieldissetto_on_activity_screen(String fieldName, String fieldValue) throws Throwable {
		switch(fieldName)
		    {
		case "Priority":
			Assert.assertTrue(postFnolNewActivityPOM.priorityIsSetTo(fieldValue));
		    	break;
		
	
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
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
		case "External Owner":
			postFnolNewActivityPOM.selectExternalOwner(fieldValue);
		    	break;
		case "Externally Owned":
			if (fieldValue.equalsIgnoreCase("yes"))
			    postFnolNewActivityPOM.selectExternalOwned(true);
			else
				postFnolNewActivityPOM.selectExternalOwned(false);
		    	break;
	    
	
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on New Activity screen for post FNOL$")
	public void i_input_into_the_box_on_activity_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
	
		case "Subject":
			postFnolNewActivityPOM.setSubject(fieldValue);
			break;
		case "Description":
			postFnolNewActivityPOM.setDescription(fieldValue);
			break;
		case "Due Date":
			postFnolNewActivityPOM.setDueDate(fieldValue);
			break;
		case "Overdue Date":
			if (fieldValue.equalsIgnoreCase("now")) 
			{
				nowStamp = TimeStampUtils.timeHoursMinutes();
				postFnolNewActivityPOM.setOverdueDate(nowStamp);
			}
			else {
			  postFnolNewActivityPOM.setOverdueDate(fieldValue);}
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	@Then("^field error messages will be shown on New Activity screen for post FNOL$")
	public void field_error_messages_will_be_shown(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(postFnolNewActivityPOM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}
	
}
