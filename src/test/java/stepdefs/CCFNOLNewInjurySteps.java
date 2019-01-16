package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @deprecated
 * @author stephen.knight
 *
 */
public class CCFNOLNewInjurySteps extends BaseTest {
	
	CCFNOLPersonContactSteps personContactSteps = new CCFNOLPersonContactSteps();
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	@Then("^I will see FNOL new injury incident$")
	public void i_will_see_FNOL_newinjury_details() throws Throwable {
		fnolNewInjuryPOM.isPageTitleDisplayed("Injury Incident");
	}
	
	
	@Given("^I click ok button on FNOL new injury incident$")
	public void ok() {
		
		fnolNewInjuryPOM.selectOK();
	}
	
	@Given("^I complete all fields on FNOL new injury incident$")
	public void i_complete_all_fields() throws Throwable {
		
		
		fnolNewInjuryPOM.selectNewInjuredPerson();
		// on select new person page, complete the details
		personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Dora", "First Name");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Explorer", "Last Name");
		personContactSteps.i_select_on_persondetails_screen("Update");
		
		fnolNewInjuryPOM.setInjuryDesc("I have been badly injured");
		fnolNewInjuryPOM.selectSeverity("Major");
		
		fnolNewInjuryPOM.selectAddInjury();
		
		fnolNewInjuryPOM.selectAreaOfBody("Head", 1);
		fnolNewInjuryPOM.selectDetailedInjury("Brain Injury", 1);
		
		fnolNewInjuryPOM.selectAmbulanceAttended(true);
		fnolNewInjuryPOM.selectAirAmbulanceAttended(false);
		fnolNewInjuryPOM.selectHospitalAttended(false);
		
	   // search for hospital
		fnolNewInjuryPOM.selectHospitalAttended(true);
		fnolNewInjuryPOM.selectOvernightStay(true);
		fnolNewInjuryPOM.selectSearchHospital();
		
		// on search hospital page
		searchAddressBookSteps.i_will_be_on_search_address_book_screen();
		searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen("QUEEN ALEX", "Search Name");
		searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
		searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
		
		fnolNewInjuryPOM.selectOK();
	}
	
	
	

}
