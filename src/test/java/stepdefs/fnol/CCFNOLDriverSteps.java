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

public class CCFNOLDriverSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	
	/**
	 * For regression script
	 * @throws Throwable
	 */
	public void completeFNOLPHDriverForTestScenario() throws Throwable
	{
		if (ExcelUtil.getTestDataValue("Fnol_PHDriverIsInsuredPerson").equalsIgnoreCase("TRUE"))
		{
		     fnolDriverDetailsPOM.selectDriverName(ExcelUtil.getTestDataValue("Fnol_Name"));
		}
		else
		{
			if (ExcelUtil.getTestDataValue("Fnol_PHDriverIsNamedPerson").equalsIgnoreCase("TRUE"))
			{
				fnolDriverDetailsPOM.selectDriverName(ExcelUtil.getTestDataValue("Fnol_Named_Driver"));	
			}
			else
			{
				// setup new non ph OR NAMED DRIVER
				String fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverPrefix");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.selectPrefix(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverFirstName");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.setFirstName(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverLastName");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.setLastName(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverEmail");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.setEmail(fieldValue);
				

				// address fields
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverPostcodeSearch");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) {
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverPostcode");
					fnolDriverDetailsPOM.setPostcode(fieldValue);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverPostcodeAddress");
					fnolDriverDetailsPOM.selectPostcodeAddress(fieldValue);
				}
				else
				{
					fnolDriverDetailsPOM.setAddressLine1("some address line"); //TODO
				}
				
				
			}
		}
		
		
	
		// add PH injury if required 
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			completeFNOLPHDriverInjuryForTestScenario();
				     
		}
		else
		{
			fnolDriverDetailsPOM.selectInjured(false);
		}
		
		
		completeFNOLPHDriverIndemnityForTestScenario();
		fnolDriverDetailsPOM.selectOK();
	}
	
	private void completeFNOLPHDriverInjuryForTestScenario() throws Throwable
	{
		String fieldValue = null;
		fnolDriverDetailsPOM.selectInjured(true);
		 fnolDriverDetailsPOM.selectAddInjury();
		 
		 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjDesc");
			if (fieldValue !=null)
			     fnolDriverDetailsPOM.setInjuryDesc(fieldValue);
		 
		 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInj1BodyArea");
			if (fieldValue !=null)
			     fnolDriverDetailsPOM.selectAreaOfBody(fieldValue, 1);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInj1Detailed");
			if (fieldValue !=null)
			     fnolDriverDetailsPOM.selectDetailedInjury(fieldValue, 1);
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjHospAttend");
			if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
			{
	     
				fnolDriverDetailsPOM.selectHospitalAttend(true);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjHospOvernight");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				    fnolDriverDetailsPOM.selectOvernightStay(true);
				else
					 fnolDriverDetailsPOM.selectOvernightStay(false);
				
				fnolDriverDetailsPOM.selectSearchHospital();
				
				// on search hospital page
				searchAddressBookSteps.i_will_be_on_search_address_book_screen();
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjHospSearchName");
		
				searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
				searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
				searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
			}
			
			// air aumbulance
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjAirAmbAttend");
			if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				fnolDriverDetailsPOM.selectAirAmbulanceAttend(true);
			else
				fnolDriverDetailsPOM.selectAirAmbulanceAttend(false);
			
			// if injury severity is overridden
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjSeverity");
				if (fieldValue !=null)
					fnolDriverDetailsPOM.selectInjurySeverity(fieldValue);
	
	}
	
	
	private void completeFNOLPHDriverIndemnityForTestScenario() throws Throwable
	{
		String fieldValue = null;
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverOccupation");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.selectFTOccupation(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverLicenseType");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.selectLicenseType(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverLicenseHeldLength");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.selectLicenseLength(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverResidentOver5years");
		if (fieldValue !=null)
		{
			if (fieldValue.equalsIgnoreCase("TRUE"))
			{
				fnolDriverDetailsPOM.selectResidentOver5Years(true);
			}
			else
			{
				fnolDriverDetailsPOM.selectResidentOver5Years(false);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverResidentSinceMonth");
				fnolDriverDetailsPOM.selectResidentSinceMonth(fieldValue);
		
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverResidentSinceYear");
				fnolDriverDetailsPOM.setResidentSinceYear(fieldValue);
			}
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverMedicalConditions");
		if (fieldValue !=null)
		{
		     fnolDriverDetailsPOM.selectMedicalConditions(fieldValue);
		     if (!fieldValue.equalsIgnoreCase("No"))
		     {
		    	 // anything other than no causes details box
		    	 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverMedicalConditionsDetails");
		 		if (fieldValue !=null)
		 		{
		 			fnolDriverDetailsPOM.setMedicalDetails(fieldValue);
		 		}
		     }
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverTestedAtScene");
		if (fieldValue !=null&& fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolDriverDetailsPOM.selectTestedAtScene(true);
		     
		    	 // anything other than no causes details box
		    	 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverTestedAtSceneDetails");
		 		if (fieldValue !=null)
		 		{
		 			fnolDriverDetailsPOM.setTestedAtSceneDetails(fieldValue);
		 		}
		   
		}
		else
		{
			fnolDriverDetailsPOM.selectTestedAtScene(false);
		}
		
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverIncidents5years");
		if (fieldValue !=null&& fieldValue.equalsIgnoreCase("TRUE"))
		{
			
			fnolDriverDetailsPOM.selectIncident5Years(true);
			fnolDriverDetailsPOM.clickAddIncident5Years();
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverIncidentDate");
			if (fieldValue !=null)
				fnolDriverDetailsPOM.setIncident5YearsDate(fieldValue, 1);
		
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverIncidentType");
			fnolDriverDetailsPOM.selectIncident5YearsType(fieldValue, 1);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverOffences5years");
		if (fieldValue !=null&& fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolDriverDetailsPOM.selectOffence5Years(true);
			fnolDriverDetailsPOM.clickAddOffence5Years();
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverOffenceDate");
			if (fieldValue !=null)
				fnolDriverDetailsPOM.setOffence5YearsDate(fieldValue, 1);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverOffenceCode");
			fnolDriverDetailsPOM.selectOffence5YearsCode(fieldValue, 1);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverOffencePoints");
			if (fieldValue !=null)
				fnolDriverDetailsPOM.setOffence5YearsPoints(fieldValue, 1);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverOffenceDisqual");
			if (fieldValue !=null)
			    fnolDriverDetailsPOM.selectOffence5YearsDisqual(fieldValue, 1);
		}
		
	}
	
	/**
	 * For Regression script
	 * @throws Throwable
	 */
	public void completeFNOLTPDriverForTestScenario() throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverPrefix");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverFirstName");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverLastName");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverEmail");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setEmail(fieldValue);
		

		// address fields
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverPostcodeSearch");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) {
			fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverPostcode");
			fnolDriverDetailsPOM.setPostcode(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverPostcodeAddress");
			fnolDriverDetailsPOM.selectPostcodeAddress(fieldValue);
		}
		else
		{
			fnolDriverDetailsPOM.setAddressLine1("some address line"); //TODO
		}
  
		// add injury if required 
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			 fnolDriverDetailsPOM.selectInjured(true);
			 fnolDriverDetailsPOM.selectAddInjury();
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjDesc");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInj1BodyArea");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInj1Detailed");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.selectDetailedInjury(fieldValue, 1);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					fnolDriverDetailsPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
					    fnolDriverDetailsPOM.selectOvernightStay(true);
					else
						 fnolDriverDetailsPOM.selectOvernightStay(false);
					
					fnolDriverDetailsPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
				
				// air aumbulance
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjAirAmbAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
					fnolDriverDetailsPOM.selectAirAmbulanceAttend(true);
				else
					fnolDriverDetailsPOM.selectAirAmbulanceAttend(false);
				
				// if injury severity is overridden
				 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjSeverity");
					if (fieldValue !=null)
						fnolDriverDetailsPOM.selectInjurySeverity(fieldValue);
				
		}
		else
		{
			fnolDriverDetailsPOM.selectInjured(false);
		}
	
	
		fnolDriverDetailsPOM.selectOK();
	}
	
	
	
	@Given("^I complete fields on FNOL new TP driver incident$")
	public void i_complete_all_fields() throws Throwable {
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverPrefix");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverFirstName");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverLastName");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setLastName(fieldValue);
		
		
	
		fnolDriverDetailsPOM.selectOK();
		
	}
	
	
	
	
	@Then("^I will be on Driver screen for FNOL$")
	public void i_will_be_on_driver_screen_for_FNOL() throws Throwable {
	    fnolDriverDetailsPOM.isPageTitleDisplayed("Driver Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on driver screen$")
	public void i_select_from_field_on_driver_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Driver Name":
	    	fnolDriverDetailsPOM.selectDriverName(fieldValue);
	    	break;
	    case "Related To":
	    	fnolDriverDetailsPOM.selectRelationToOwner(fieldValue);
	    	break;
	    case "Prefix":
	    	fnolDriverDetailsPOM.selectPrefix(fieldValue);
	    	break;
	    case "Address Type":
	    	fnolDriverDetailsPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	fnolDriverDetailsPOM.selectGender(fieldValue);
	    	break;
	    case "Primary Phone":
	    	fnolDriverDetailsPOM.selectPrimaryPhone(fieldValue);
	    	break;
	    	
	    case "ThirdParty Seatbelt":
	    	if (fieldValue.equalsIgnoreCase("Yes"))
	    		fnolDriverDetailsPOM.selectTPSeatBelt(true);
	    	else
	    		fnolDriverDetailsPOM.selectTPSeatBelt(false);
	    	break;
	    case "Indemnity Occupation":
	    	fnolDriverDetailsPOM.selectFTOccupation(fieldValue);
	    	break;
	    case "Indemnity License":
	    	fnolDriverDetailsPOM.selectLicenseType(fieldValue);
	    	break;
	    case "Indemnity License Length":
	    	fnolDriverDetailsPOM.selectLicenseLength(fieldValue);
	    	break;
	    case "Indemnity Medicals":
	    	fnolDriverDetailsPOM.selectMedicalConditions(fieldValue);
	    	break;
	    case "Indemnity Incidents 5Years":
	    	if (fieldValue.equalsIgnoreCase("Yes"))
	    		fnolDriverDetailsPOM.selectIncident5Years(true);
	    	else
	    		fnolDriverDetailsPOM.selectIncident5Years(false);
	    	break;
	    case "Indemnity Offences 5Years":
	    	if (fieldValue.equalsIgnoreCase("Yes"))
	    		fnolDriverDetailsPOM.selectOffence5Years(true);
	    	else
	    		fnolDriverDetailsPOM.selectOffence5Years(false);
	    	break;
	    	//TODO finish thes eoff
	    case "Indemnity Prosecutions":
	    	fnolDriverDetailsPOM.selectProsecuted(fieldValue);
	    	break;
	    case "Indemnity Seatbelt":
	    	fnolDriverDetailsPOM.selectIndemnitySeatbelt(fieldValue);
	    	break;
	    case "Indemnity Tested At Scene":
	    	if (fieldValue.equalsIgnoreCase("Yes"))
	    		fnolDriverDetailsPOM.selectTestedAtScene(true);
	    	else
	    		fnolDriverDetailsPOM.selectTestedAtScene(false);
	    	break;
	    case "Injured":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolDriverDetailsPOM.selectInjured(true);
			else
				fnolDriverDetailsPOM.selectInjured(false);
			break;
	    	
			// injury section
	    case "Severity":
	    	fnolDriverDetailsPOM.selectInjurySeverity(fieldValue);
		    	break;
	    case "Ambulance Attended":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolDriverDetailsPOM.selectAmbulanceAttend(true);
			else
				fnolDriverDetailsPOM.selectAmbulanceAttend(false);
			break;
	    case "Air Ambulance Attended":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolDriverDetailsPOM.selectAirAmbulanceAttend(true);
			else
				fnolDriverDetailsPOM.selectAirAmbulanceAttend(false);
			break;
	    case "Hospital Attended":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolDriverDetailsPOM.selectHospitalAttend(true);
			else
				fnolDriverDetailsPOM.selectHospitalAttend(false);
			break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on driver screen$")
	public void next() {
		
		fnolDriverDetailsPOM.selectOK();
	}
	
	@Given("^I click addinjury button on driver screen$")
	public void addinjury() {
		
		fnolDriverDetailsPOM.selectAddInjury();
	}
	
	
	@Given("^I select the insured as driver of PH vehicle$")
	public void selectinsureddriver() {
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_Name");
		fnolDriverDetailsPOM.selectDriverName(fieldValue);
	}
	
		
		
	
	
	
	@Then("^Mandatory field error messages will be shown for New Driver screen in FNOL$")
	public void mandatory_field_error_messages_will_be_shown_forstep3newdriver(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolDriverDetailsPOM.containsErrorMessage(list.get(i)),
					"Error Message Check: " + list.get(i));

		}
	    softAssert.assertAll();
	
}
}
