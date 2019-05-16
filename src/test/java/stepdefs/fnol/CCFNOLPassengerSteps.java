package stepdefs.fnol;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCFNOLPassengerSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	/**
	 * used by regression features
	 * @throws Throwable
	 */
	public void completeFNOLTPPassengerForTestScenario() throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerPrefix");
		if (fieldValue !=null)
			fnolNewPassengerPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerFirstName");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerLastName");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerEmail");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setEmail(fieldValue);
		
		// address fields
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerPostcodeSearch");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) {
					fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerPostcode");
					fnolNewPassengerPOM.setPostcode(fieldValue);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerPostcodeAddress");
					fnolNewPassengerPOM.selectPostcodeAddress(fieldValue);
				}
				else
				{
					fnolNewPassengerPOM.setAddressLine1("some address line"); //TODO
				}
		
  
		// add injury if required 
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolNewPassengerPOM.selectInjured(true);
			fnolNewPassengerPOM.selectAddInjury();
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjDesc");
				if (fieldValue !=null)
					fnolNewPassengerPOM.setInjuryDesc(fieldValue);
			 
			    fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInj1BodyArea");
				if (fieldValue !=null)
					fnolNewPassengerPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInj1Detailed");
				if (fieldValue !=null)
					fnolNewPassengerPOM.selectDetailedInjury(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					fnolNewPassengerPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
						fnolNewPassengerPOM.selectOvernightStay(true);
					else
						fnolNewPassengerPOM.selectOvernightStay(false);
					
					fnolNewPassengerPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
				
				// air aumbulance
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjAirAmbAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
					fnolNewPassengerPOM.selectAirAmbulanceAttend(true);
				else
					fnolNewPassengerPOM.selectAirAmbulanceAttend(false);
				
				// if injury severity is overridden
				 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjSeverity");
					if (fieldValue !=null)
						fnolNewPassengerPOM.selectInjurySeverity(fieldValue);
		     
		}
		else
		{
			fnolNewPassengerPOM.selectInjured(false);
		}
	
	
		fnolNewPassengerPOM.selectOK();
	}
	
	/**
	 * used by regression features
	 * @throws Throwable
	 */
	public void completeFNOLPHPassengerForTestScenario() throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerPrefix");
		if (fieldValue !=null)
			fnolNewPassengerPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerFirstName");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerLastName");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerEmail");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setEmail(fieldValue);
		
		// address fields
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerPostcodeSearch");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) {
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerPostcode");
			fnolNewPassengerPOM.setPostcode(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerPostcodeAddress");
			fnolNewPassengerPOM.selectPostcodeAddress(fieldValue);
		}
		else
		{
			fnolNewPassengerPOM.setAddressLine1("some address line"); //TODO
		}
		
  
		// add injury if required 
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolNewPassengerPOM.selectInjured(true);
			fnolNewPassengerPOM.selectAddInjury();
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInjDesc");
				if (fieldValue !=null)
					fnolNewPassengerPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInj1BodyArea");
				if (fieldValue !=null)
					fnolNewPassengerPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInj1Detailed");
				if (fieldValue !=null)
					fnolNewPassengerPOM.selectDetailedInjury(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					fnolNewPassengerPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
						fnolNewPassengerPOM.selectOvernightStay(true);
					else
						fnolNewPassengerPOM.selectOvernightStay(false);
					
					fnolNewPassengerPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
				
				// air aumbulance
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInjAirAmbAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
					fnolNewPassengerPOM.selectAirAmbulanceAttend(true);
				else
					fnolNewPassengerPOM.selectAirAmbulanceAttend(false);
				
				// if injury severity is overridden
				 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerInjSeverity");
					if (fieldValue !=null)
						fnolNewPassengerPOM.selectInjurySeverity(fieldValue);
		     
		}
		else
		{
			fnolNewPassengerPOM.selectInjured(false);
		}
	
	
		fnolNewPassengerPOM.selectOK();
	}
	
	
	@Then("^I will be on New Passenger screen for FNOL$")
	public void i_will_be_on_newpassenger_screen_for_FNOL() throws Throwable {
	    fnolNewPassengerPOM.isPageTitleDisplayed("Passenger Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on New Passenger screen on FNOL$")
	public void i_select_from_field_on_passenger_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Passenger Name":
	    	fnolNewPassengerPOM.selectPassengerName(fieldValue);
	    	break;
	    case "Prefix":
	    	fnolNewPassengerPOM.selectPrefix(fieldValue);
	    	break;
	    case "Address Type":
	    	fnolNewPassengerPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	fnolNewPassengerPOM.selectGender(fieldValue);
	    	break;
	   
		case "Postcode Address":
			fnolNewPassengerPOM.selectPostcodeAddress(fieldValue);
		    	break;
	   
	    case "Primary Phone":
	    	fnolNewPassengerPOM.selectPrimaryPhone(fieldValue);
		    	break;
	    case "Injured":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolNewPassengerPOM.selectInjured(true);
			else
				fnolNewPassengerPOM.selectInjured(false);
			break;
		// injury section
	    case "Severity":
	    	fnolNewPassengerPOM.selectInjurySeverity(fieldValue);
		    	break;
	    case "Ambulance Attended":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolNewPassengerPOM.selectAmbulanceAttend(true);
			else
				fnolNewPassengerPOM.selectAmbulanceAttend(false);
			break;
	    case "Air Ambulance Attended":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolNewPassengerPOM.selectAirAmbulanceAttend(true);
			else
				fnolNewPassengerPOM.selectAirAmbulanceAttend(false);
			break;
	    case "Hospital Attended":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolNewPassengerPOM.selectHospitalAttend(true);
			else
				fnolNewPassengerPOM.selectHospitalAttend(false);
			break;
	  
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on New Passenger screen on FNOL$")
	public void i_input_into_the_box_on_passenger_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "First Name":
	    	fnolNewPassengerPOM.setFirstName(fieldValue);
	    	break;
	    case "Middle Name":
	    	fnolNewPassengerPOM.setMiddleName(fieldValue);
	    	break;
	    case "Last Name":
	    	fnolNewPassengerPOM.setLastName(fieldValue);
	    	break;
	    case "Dob":
	    	fnolNewPassengerPOM.setDob(fieldValue);
	    	break;
	    	
	    case "Address Line1":
	    	fnolNewPassengerPOM.setAddressLine1(fieldValue);
	    	break;
	    case "Address Line2":
	    	fnolNewPassengerPOM.setAddressLine2(fieldValue);
	    	break;
	    case "Address Line3":
	    	fnolNewPassengerPOM.setAddressLine3(fieldValue);
	    	break;
	    case "City":
	    	fnolNewPassengerPOM.setCity(fieldValue);
	    	break;
	    case "County":
	    	fnolNewPassengerPOM.setCounty(fieldValue);
	    	break;
	    case "Postcode":
	    	fnolNewPassengerPOM.setPostcode(fieldValue);
	    	break;
	    case "Location Description":
	    	fnolNewPassengerPOM.setLocationDesc(fieldValue);
	    	break;
	    case "Work Phone":
	    	fnolNewPassengerPOM.setWorkPhone(fieldValue);
	    	break;
	    case "Home Phone":
	    	fnolNewPassengerPOM.setHomePhone(fieldValue);
	    	break;
	    case "Mobile":
	    	fnolNewPassengerPOM.setMobile(fieldValue);
	    	break;
	    case "Email":
	    	fnolNewPassengerPOM.setEmail(fieldValue);
	    	break;
	    case "Alt Email":
	    	fnolNewPassengerPOM.setAltEmail(fieldValue);
	    	break;
	    case "NiNumber":
	    	fnolNewPassengerPOM.setNiNumber(fieldValue);
	    	break;
	    case "Notes":
	    	fnolNewPassengerPOM.setNotes(fieldValue);
	    	break;
	    	// injury section
	    case "Injury Description":
	    	fnolNewPassengerPOM.setInjuryDesc(fieldValue);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on passenger screen in FNOL$")
	public void next() {
		
		fnolNewPassengerPOM.selectOK();
	}
	
	@Then("^Mandatory field error messages will be shown for New Passenger screen in FNOL$")
	public void mandatory_field_error_messages_will_be_shown_forstep3newpassenger(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolNewPassengerPOM.containsErrorMessage(list.get(i)),
					"Error Message Check: " + list.get(i));

		}
	
		softAssert.assertAll();
}
}
