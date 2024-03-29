package stepdefs.postfnol.notes;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewNoteSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL New Note screen$")
	public void i_will_see_post_FNOL_note_details() throws Throwable {
		postFnolNewNotePOM.isPageTitleDisplayed("Note");
	}
	
	@Given("^I click update button on New Note screen for post FNOL$")
	public void update() {
		
		postFnolNewNotePOM.update();
	}
	@Given("^I click cancel button on New Note screen for post FNOL$")
	public void cancel() {
		
		postFnolNewNotePOM.cancel();
	}
	
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on New Note screen for post FNOL$")
	public void i_select_from_field_on_note_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Topic":
			postFnolNewNotePOM.selectTopic(fieldValue);
		    	break;
		case "Security Type":
			postFnolNewNotePOM.selectSecurityType(fieldValue);
		    	break;
		case "Related To":
			postFnolNewNotePOM.selectRelatedTo(fieldValue);
		    	break;
	
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on New Note screen for post FNOL$")
	public void i_input_into_the_box_on_note_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
	
		case "Subject":
			postFnolNewNotePOM.setSubject(fieldValue);
			break;
		case "Note Text":
			postFnolNewNotePOM.setNoteText(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
}
