package stepdefs.postfnol.lossdetails.general;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCPOSTFNOLEditDriverSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	
	
	@Then("^I will be on edit Driver screen for post FNOL$")
	public void i_will_be_on_driver_screen_for_postFNOL() throws Throwable {
	    postFnolDriverPOM.isPageTitleDisplayed("Driver Details");
	}
	
	@Given("^I change fields on post FNOL edit PH driver incident$")
	public void changePostFNOLPHDriverForTestScenario() throws Throwable
	{
		String fieldValue=null;
		
		//TODO driver name
		//TODO relation to insured
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverPrefix");
		if (fieldValue !=null)
			postFnolDriverPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverFirstName");
		if (fieldValue !=null)
			postFnolDriverPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverMiddleName");
		if (fieldValue !=null)
			postFnolDriverPOM.setMiddleName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverLastName");
		if (fieldValue !=null)
			postFnolDriverPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverGender");
		if (fieldValue !=null)
			postFnolDriverPOM.selectGender(fieldValue);
	
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverDob");
		if (fieldValue !=null)
			postFnolDriverPOM.setDob(fieldValue);
		
		//TODO address1
		//TODO address2
		//TODO address3
		//TODO city
		//TODO county
		//TODO postcode lookup and address choice
		//TODO address type
		//TODO location description
		//TODO valid until
		
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverWorkPhone");
		if (fieldValue !=null)
			postFnolDriverPOM.setWorkPhone(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverHomePhone");
		if (fieldValue !=null)
			postFnolDriverPOM.setHomePhone(fieldValue);
		
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverMobile");
		if (fieldValue !=null)
			postFnolDriverPOM.setMobile(fieldValue);


		// do before as there are issues with this call
		//fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverPrimaryPhone");
		//if (fieldValue !=null)
		//	postFnolDriverPOM.selectPrimaryPhone(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverEmail");
		if (fieldValue !=null)
			postFnolDriverPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverAltEmail");
		if (fieldValue !=null)
			postFnolDriverPOM.setAltEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverNiNo");
		if (fieldValue !=null)
			postFnolDriverPOM.setNiNumber(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverLicenseNo");
		if (fieldValue !=null)
			postFnolDriverPOM.setLicenseNo(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverNotes");
		if (fieldValue !=null)
			postFnolDriverPOM.setNotes(fieldValue);
		
		//TODO all the indemnity questions for a ph driver
		
		// injury is now on a tab
		postFnolDriverPOM.clickInjuryTab();
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			postFnolDriverPOM.selectInjured(true);
			// amend existing
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverInjDesc");
			if (fieldValue !=null)
				postFnolDriverPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverInj1BodyArea");
				if (fieldValue !=null)
					postFnolDriverPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverInj1Detailed");
				if (fieldValue !=null)
					postFnolDriverPOM.selectDetailedInjury(fieldValue, 1);
				
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					postFnolDriverPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
						postFnolDriverPOM.selectOvernightStay(true);
					else
						postFnolDriverPOM.selectOvernightStay(false);
					
					postFnolDriverPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
				
				//TODO get from excel
				//postFnolDriverPOM.selectAddMoj();
				// now add an moj
				//postFnolDriverPOM.selectMojInjuryType("MOJ Stage 3 Settled Infant Approval", 1);
				//postFnolDriverPOM.setMojCreationDate("29/01/2019", 1);
				//postFnolDriverPOM.setMojInsuredLiability("10");
				//postFnolDriverPOM.setMojClaimantLiability("20");
				//postFnolDriverPOM.setMojOtherLiability("5");
				//postFnolDriverPOM.setMojLowDamages("1000");
				//postFnolDriverPOM.setMojHighDamages("500");
				//postFnolDriverPOM.setMojOfferDamages("600");
				//postFnolDriverPOM.setMojTotal("1000");
		     
		}
		else
		{
			postFnolDriverPOM.selectInjured(false);
		}
	
		postFnolDriverPOM.selectOKOrUpdate();

	}
	
	@Given("^I change fields on post FNOL edit TP driver incident$")
	public void changePostFNOLTPDriverForTestScenario() throws Throwable
	{
		String fieldValue=null;
		
		//TODO driver name
		//TODO relation to insured
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverPrefix");
		if (fieldValue !=null)
			postFnolDriverPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverFirstName");
		if (fieldValue !=null)
			postFnolDriverPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverMiddleName");
		if (fieldValue !=null)
			postFnolDriverPOM.setMiddleName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverLastName");
		if (fieldValue !=null)
			postFnolDriverPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverGender");
		if (fieldValue !=null)
			postFnolDriverPOM.selectGender(fieldValue);
	
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverDob");
		if (fieldValue !=null)
			postFnolDriverPOM.setDob(fieldValue);
		
		//TODO address1
		//TODO address2
		//TODO address3
		//TODO city
		//TODO county
		//TODO postcode lookup and address choice
		//TODO address type
		//TODO location description
		//TODO valid until
		
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverWorkPhone");
		if (fieldValue !=null)
			postFnolDriverPOM.setWorkPhone(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverHomePhone");
		if (fieldValue !=null)
			postFnolDriverPOM.setHomePhone(fieldValue);
		
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverMobile");
		if (fieldValue !=null)
			postFnolDriverPOM.setMobile(fieldValue);


		// do before as there are issues with this call
		//fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHDriverPrimaryPhone");
		//if (fieldValue !=null)
		//	postFnolDriverPOM.selectPrimaryPhone(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverEmail");
		if (fieldValue !=null)
			postFnolDriverPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverAltEmail");
		if (fieldValue !=null)
			postFnolDriverPOM.setAltEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverNiNo");
		if (fieldValue !=null)
			postFnolDriverPOM.setNiNumber(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverLicenseNo");
		if (fieldValue !=null)
			postFnolDriverPOM.setLicenseNo(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverNotes");
		if (fieldValue !=null)
			postFnolDriverPOM.setNotes(fieldValue);
		
		//TODO all the indemnity questions for a ph driver
		
		// injury is now on a tab
		postFnolDriverPOM.clickInjuryTab();
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			postFnolDriverPOM.selectInjured(true);
			// amend existing
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverInjDesc");
			if (fieldValue !=null)
				postFnolDriverPOM.setInjuryDesc(fieldValue);
			 
			// just edit existing for now
			 fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverInj1BodyArea");
				if (fieldValue !=null)
					postFnolDriverPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverInj1Detailed");
				if (fieldValue !=null)
					postFnolDriverPOM.selectDetailedInjury(fieldValue, 1);
				
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					postFnolDriverPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
						postFnolDriverPOM.selectOvernightStay(true);
					else
						postFnolDriverPOM.selectOvernightStay(false);
					
					postFnolDriverPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_TPDriverInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
				
				//TODO get from excel
				//postFnolDriverPOM.selectAddMoj();
				// now add an moj
				//postFnolDriverPOM.selectMojInjuryType("MOJ Stage 3 Settled Infant Approval", 1);
				//postFnolDriverPOM.setMojCreationDate("29/01/2019", 1);
				//postFnolDriverPOM.setMojInsuredLiability("10");
				//postFnolDriverPOM.setMojClaimantLiability("20");
				//postFnolDriverPOM.setMojOtherLiability("5");
				//postFnolDriverPOM.setMojLowDamages("1000");
				//postFnolDriverPOM.setMojHighDamages("500");
				//postFnolDriverPOM.setMojOfferDamages("600");
				//postFnolDriverPOM.setMojTotal("1000");
		     
		}
		else
		{
			postFnolDriverPOM.selectInjured(false);
		}
	
		postFnolDriverPOM.selectOKOrUpdate();

	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit driver screen for post FNOL$")
	public void i_select_from_field_on_driver_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Driver Name":
	    	postFnolDriverPOM.selectDriverName(fieldValue);
	    	break;
	    case "Related To":
	    	postFnolDriverPOM.selectRelationToOwner(fieldValue);
	    	break;
	    case "Prefix":
	    	postFnolDriverPOM.selectPrefix(fieldValue);
	    	break;
	    case "Address Type":
	    	postFnolDriverPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	postFnolDriverPOM.selectGender(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on edit driver screen for post FNOL$")
	public void okorupdate() {
		
		postFnolDriverPOM.selectOKOrUpdate();
	}
	
	@Given("^I click cancel button on edit driver screen for post FNOL$")
	public void cancel() {
		
		postFnolDriverPOM.cancel();
	}
	
	
}
