package stepdefs.postfnol.lossdetails.general;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCPOSTFNOLPedestrianSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	@Then("^I will be on pedestrian screen on post FNOL$")
	public void i_will_see_post_FNOL_newpedestrian_details() throws Throwable {
		postFnolPedestrianPOM.isPageTitleDisplayed("Pedestrian Details");
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on pedestrian screen on post FNOL$")
	public void i_select_from_field_on_new_pedestrian_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Prefix":
			postFnolPedestrianPOM.selectPrefix(fieldValue);
			break;
		case "Gender":
			postFnolPedestrianPOM.selectGender(fieldValue);
		    	break;
		case "Postcode Address":
			postFnolPedestrianPOM.selectAddress(fieldValue);
			break;
		case "Address Type":
			postFnolPedestrianPOM.selectAddressType(fieldValue);
	    	break;
		 case "Primary Phone":
			 postFnolPedestrianPOM.selectPrimaryPhone(fieldValue);
			    	break;
		case "Injured":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolPedestrianPOM.selectInjured(true);
			else
				postFnolPedestrianPOM.selectInjured(false);
			break;
		

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on pedestrian screen on post FNOL$")
	public void i_input_into_the_box_on_new_pedestrian_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Firstname":
			postFnolPedestrianPOM.setFirstName(fieldValue);
			break;
		case "Lastname":
			postFnolPedestrianPOM.setLastName(fieldValue);
			break;
		case "Postcode":
			postFnolPedestrianPOM.setPostcode(fieldValue);
			break;
		case "Email":
			postFnolPedestrianPOM.setEmail(fieldValue);
			break;
		case "Mobile":
			postFnolPedestrianPOM.setMobile(fieldValue);
			break;
		case "Notes":
			postFnolPedestrianPOM.setNotes(fieldValue);
			break;
		case "Injury Description":
			postFnolPedestrianPOM.setInjuryDesc(fieldValue);
			break;
		case "Moj Insured Liability":
			postFnolPedestrianPOM.setMojInsuredLiability(fieldValue);
			break;
		case "Moj Claimant Liability":
			postFnolPedestrianPOM.setMojClaimantLiability(fieldValue);
			break;
		case "Moj Other Liability":
			postFnolPedestrianPOM.setMojOtherLiability(fieldValue);
			break;
		case "Moj Low Damages":
			postFnolPedestrianPOM.setMojLowDamages(fieldValue);
			break;
		case "Moj High Damages":
			postFnolPedestrianPOM.setMojHighDamages(fieldValue);
			break;
		case "Moj Offer Damages":
			postFnolPedestrianPOM.setMojOfferDamages(fieldValue);
			break;
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	@Given("^I click \"([^\"]*)\" on pedestrian screen on post FNOL$")
	public void i_click_on_pnew_pedestrian_screen(String button) throws Throwable {
		switch (button) {
		case "Ok":
			postFnolPedestrianPOM.selectOK();
			break;
		case "Update":
			postFnolPedestrianPOM.selectOK();
			break;
		case "Cancel":
			postFnolPedestrianPOM.selectCancel();
			break;
		case "Injuries Tab":
			postFnolPedestrianPOM.clickInjuryTab();
			break;
		case "Add Moj Status":
			postFnolPedestrianPOM.selectAddMoj();
			break;
		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	
	
	@Given("^I set moj entry for status \"([^\"]*)\" and date \"([^\"]*)\" on pedestrian screen on post FNOL$")
	public void i_set_moj_entry_pedestrian_screen(String mojStatus, String creationDate) throws Throwable {
		postFnolPedestrianPOM.selectMojInjuryType(mojStatus, 1);
		postFnolPedestrianPOM.setMojCreationDate(creationDate, 1);
	
	}
	
	
	// This could be driven as shown from spreadsheet
	@Given("^I complete all fields on post FNOL new pedestrian incident$")
	public void completePostFNOLPedestrianForTestScenario() throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianPrefix");
		if (fieldValue !=null)
			postFnolPedestrianPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianFirstName");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianLastName");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setLastName(fieldValue);
		
		// address fields
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianPostcodeSearch");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) {
			fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianPostcode");
			postFnolPedestrianPOM.setPostcode(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianPostcodeAddress");
			postFnolPedestrianPOM.selectAddress(fieldValue);
		}
		else
		{
			postFnolPedestrianPOM.setAddressLine1("some address line"); //TODO
		}
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianEmail");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianMobile");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setMobile(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianNotes");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setNotes(fieldValue);
		
			
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			postFnolPedestrianPOM.selectInjured(true);
			postFnolPedestrianPOM.selectAddInjury();
			
			fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianInjDesc");
			if (fieldValue !=null)
				postFnolPedestrianPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianInj1BodyArea");
				if (fieldValue !=null)
					postFnolPedestrianPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianInj1Detailed");
				if (fieldValue !=null)
					postFnolPedestrianPOM.selectDetailedInjury(fieldValue, 1);
				
				fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					postFnolPedestrianPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
						postFnolPedestrianPOM.selectOvernightStay(true);
					else
						postFnolPedestrianPOM.selectOvernightStay(false);
					
					postFnolPedestrianPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("PostFnol_PedestrianInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
		     
		}
		else
		{
			postFnolPedestrianPOM.selectInjured(false);
		}
	
		postFnolPedestrianPOM.selectOK();
		
	}
	
	@Given("^I change fields on post FNOL edit pedestrian incident$")
	public void cohangePostFNOLPedestrianForTestScenario() throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianPrefix");
		if (fieldValue !=null)
			postFnolPedestrianPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianFirstName");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianLastName");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setLastName(fieldValue);
		
		//TODO gender
		
		// address fields
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianPostcodeSearch");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) {
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianPostcode");
			postFnolPedestrianPOM.setPostcode(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianPostcodeAddress");
			postFnolPedestrianPOM.selectAddress(fieldValue);
		}
		else
		{
			postFnolPedestrianPOM.setAddressLine1("some address line"); //TODO
		}
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianEmail");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianMobile");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setMobile(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianNotes");
		if (fieldValue !=null)
			postFnolPedestrianPOM.setNotes(fieldValue);
		
		// injury is now on a tab
		postFnolPedestrianPOM.clickInjuryTab();
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			postFnolPedestrianPOM.selectInjured(true);
			//postFnolPedestrianPOM.selectAddInjury(); - going to amend existing injury
			
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianInjDesc");
			if (fieldValue !=null)
				postFnolPedestrianPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianInj1BodyArea");
				if (fieldValue !=null)
					postFnolPedestrianPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianInj1Detailed");
				if (fieldValue !=null)
					postFnolPedestrianPOM.selectDetailedInjury(fieldValue, 1);
				
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					postFnolPedestrianPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
						postFnolPedestrianPOM.selectOvernightStay(true);
					else
						postFnolPedestrianPOM.selectOvernightStay(false);
					
					postFnolPedestrianPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PedestrianInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
				
				//TODO get from excel
				postFnolPedestrianPOM.selectAddMoj();
				// now add an moj
				postFnolPedestrianPOM.selectMojInjuryType("MOJ Stage 3 Settled Infant Approval", 1);
				postFnolPedestrianPOM.setMojCreationDate("29/01/2019", 1);
				postFnolPedestrianPOM.setMojInsuredLiability("10");
				postFnolPedestrianPOM.setMojClaimantLiability("20");
				postFnolPedestrianPOM.setMojOtherLiability("5");
				postFnolPedestrianPOM.setMojLowDamages("1000");
				postFnolPedestrianPOM.setMojHighDamages("500");
				postFnolPedestrianPOM.setMojOfferDamages("600");
				postFnolPedestrianPOM.setMojTotal("1000");
		     
		}
		else
		{
			postFnolPedestrianPOM.selectInjured(false);
		}
	
		postFnolPedestrianPOM.selectOK();
		
	}
	
	
}
