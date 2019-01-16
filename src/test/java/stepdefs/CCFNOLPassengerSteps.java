package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLPassengerSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
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
		     
		}
		else
		{
			fnolNewPassengerPOM.selectInjured(false);
		}
	
	
		fnolNewPassengerPOM.selectOK();
	}
	
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
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on passenger screen in FNOL$")
	public void next() {
		
		fnolNewPassengerPOM.selectOK();
	}
	
	
}
