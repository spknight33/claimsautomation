package stepdefs;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.config.UserConfig;
import com.big.automation.selenium_webdriver.common.config.UserFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLStep2Steps extends BaseTest{
	
	CCLoginSteps loginSteps = new CCLoginSteps();
	CCMenuBarSTeps menuSteps = new CCMenuBarSTeps();
	CCFNOLStep1Steps step1Steps = new CCFNOLStep1Steps();
	
	
	@Given("^As a ClaimsHandler I am at step2 for FNOL$")
	public void as_a_ClaimsHandler_I_am_at_step2_for_FNOL() throws Throwable {
		step1Steps.as_a_ClaimsHandler_I_am_at_step1_for_FNOL();
		step1Steps.iCompleteStep1FNOL();
	}

	@Then("^I will be on step2 for FNOL$")
	public void i_will_be_on_step2_for_FNOL() throws Throwable {
		fnolStep2POM.isPageTitleDisplayed("Step 2 of 5: Basic information");
	}
	
	@Then("I complete step2 for FNOL$")
	public void iCompleteStep2FNOL() throws Throwable 
	{
		// need to configure to get a specific configurable pilicy number

		this.i_select_from_field_on_step("Portal","How Reported");
		this.i_select_from_field_on_step(testDataset.getFirstLastName(),"name");
		this.i_select_from_field_on_step("Policyholder","relationship to insured");
		this.next();
		
	}
	
	@Then("I complete step2 for FNOL without insured vehicle$")
	public void iCompleteStep2FNOLWithoutInsuredVehicle() throws Throwable 
	{
		// need to configure to get a specific configurable pilicy number

		this.i_select_from_field_on_step("Portal","How Reported");
		this.i_select_from_field_on_step(testDataset.getFirstLastName(),"name");
		this.i_select_from_field_on_step("Policyholder","relationship to insured");
		this.i_input_into_the_box_on_step2("01912228888","Home Phone");
		this.i_input_into_the_box_on_step2("someguy@gmail.com","Email");
		this.i_select_from_field_on_step("Work","Phone Type");
		this.unselectFirstInsuredVehicle();
		this.next();
		
	}
	
	public void mandatoryFieldErrorMessagesAreShownForStep2() {
		this.next();
		// in step 2, check error messages
		Assert.assertTrue(fnolStep2POM.containsErrorMessage("Name : Missing required field \"Name\""));
		Assert.assertTrue(fnolStep2POM
				.containsErrorMessage("Relation to Insured : Missing required field \"Relation to Insured\""));
	}
	
	@Then("^Mandatory field error messages will be shown for step2$")
	public void mandatory_field_error_messages_will_be_shown_forstep2(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(fnolStep2POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}

	@Given("^I select first insured vehicle on step2$")
	public void selectFirstInsuredVehicle() {

		fnolStep2POM.selectVehicleCB();

	}

	@Given("^I deselect insured vehicle on step2$")
	public void unselectFirstInsuredVehicle() {

		fnolStep2POM.deselectVehicleCB();

	}

	@Given("^I click next button on step2$")
	public void next() {
		
		fnolStep2POM.next();
	}

	@Given("^I click previous button on step2$")
	public void previous() {
		
		fnolStep2POM.back();
	}
	
	public void setReportedDate(String date)
	{
		
		fnolStep2POM.setReportedDateValue("21/11/2018");
	}
	
	
	
	@Then("^the \"([^\"]*)\" list on step2 will contain options$")
	public void the_list_on_step_will_contain_options(String fieldName,  DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				switch(fieldName)
			    {
			    case "How Reported":
			    	
			    	softAssert.assertTrue(fnolStep2POM.howReportedContainsOption(list.get(i)),fieldName + "Field option Check: "+ list.get(i));
			    	break;
			   
			    
			    default:
			    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
			    }
				
				
				
			}
			softAssert.assertAll();
	}
	
	
	@Then("^I select \"([^\"]*)\" from \"([^\"]*)\" field on step2$")
	public void i_select_from_field_on_step(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "How Reported":
	    	fnolStep2POM.selectHowReported(fieldValue);
	    	break;
	    case "name":
	    	fnolStep2POM.selectReportedByName(fieldValue);
	    	break;
	    case "relationship to insured":
	    	fnolStep2POM.selectRelationToInsured(fieldValue);
	    	break;
	    case "Phone Type":
	    	fnolStep2POM.selectPhoneType(fieldValue);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Given("^I click \"([^\"]*)\" on reportby picker on step2$")
	public void i_click_on_reportby_picker_on_step2(String option) throws Throwable {
		switch (option) {
		case "New Person":
			fnolStep2POM.selectNewPersonReporter();
			break;
		case "New Company":
			fnolStep2POM.selectNewCompanyReporter();
			break;
		case "Search":
			fnolStep2POM.selectSearchReporter();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on step2$")
	public void i_input_into_the_box_on_step2(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Work Phone":
			fnolStep2POM.setWorkPhone(fieldValue);
			break;
		case "Home Phone":
			fnolStep2POM.setHomePhone(fieldValue);
			break;
		case "Mobile":
			fnolStep2POM.setMobile(fieldValue);
			break;
		case "Email":
			fnolStep2POM.setEmail(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	

	

}
