package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewInjurySteps extends BaseTest {
	
	CCFNOLPersonContactSteps personContactSteps = new CCFNOLPersonContactSteps();
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	@Then("^I will see post FNOL new injury incident$")
	public void i_will_see_post_FNOL_newinjury_details() throws Throwable {
		postFnolNewInjuryPOM.isPageTitleDisplayed("Injury Incident");
	}
	
	
	@Given("^I click ok button on post FNOL new injury incident$")
	public void ok() {
		
		postFnolNewInjuryPOM.selectOK();
	}
	
	@Given("^I complete all fields on post FNOL new injury incident$")
	public void i_complete_all_fields() throws Throwable {
		
		
		postFnolNewInjuryPOM.selectNewInjuredPerson();
		// on select new person page, complete the details
		personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Dora", "First Name");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Explorer", "Last Name");
		personContactSteps.i_select_on_persondetails_screen("Update");
		
		postFnolNewInjuryPOM.setInjuryDesc("I have been badly injured");
		postFnolNewInjuryPOM.selectSeverity("Major");
		postFnolNewInjuryPOM.selectAmbulanceAttended(true);
		postFnolNewInjuryPOM.selectAirAmbulanceAttended(false);
		postFnolNewInjuryPOM.selectHospitalAttended(false);
		
	   // search for hospital
		postFnolNewInjuryPOM.selectHospitalAttended(true);
		postFnolNewInjuryPOM.selectOvernightStay(true);
		postFnolNewInjuryPOM.selectSearchHospital();
		
		// on search hospital page
		searchAddressBookSteps.i_will_be_on_search_address_book_screen();
		searchAddressBookSteps.i_input_into_the_box_on_search_addres_book_screen("QUEEN ALEX", "Search Name");
		searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
		searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
		
		postFnolNewInjuryPOM.selectOK();
	}
	
	
	

}
