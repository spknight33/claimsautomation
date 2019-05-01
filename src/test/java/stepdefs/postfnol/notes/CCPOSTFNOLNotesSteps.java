package stepdefs.postfnol.notes;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNotesSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Notes screen$")
	public void i_will_see_post_FNOL_notes_details() throws Throwable {
		postFnolNotesPOM.isPageTitleDisplayed("Notes");
	}
	
	@Given("^I click search button on Notes screen for post FNOL$")
	public void search() {
		
		postFnolNotesPOM.search();
	}

	@Given("^I set the find text box to Doc Type: \"([^\"]*)\" with the Subtype: \"([^\"]*)\" on post FNOL Notes Screen$")
	public void search_for_document(String docType, String docSubType) throws Throwable {
		String input = postFnolNotesPOM.concatenateDocTypeAndDocSubType(docType,docSubType);
		postFnolNotesPOM.setFindTextInput(input);
	}
	
}
