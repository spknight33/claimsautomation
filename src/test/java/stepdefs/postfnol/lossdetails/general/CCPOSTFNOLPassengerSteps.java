package stepdefs.postfnol.lossdetails.general;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCPOSTFNOLPassengerSteps extends BaseTest {

	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();

	@Then("^I will be on passenger screen on post FNOL$")
	public void i_will_be_on_passenger_screen_for_postFNOL() throws Throwable {
		postFnolPassengerPOM.isPageTitleDisplayed("Passenger Details");
	}
	
	@Given("^I click \"([^\"]*)\" on passenger screen on post FNOL$")
	public void i_click_on_passenger_screen(String button) throws Throwable {
		switch (button) {
		case "Ok":
			postFnolPassengerPOM.selectOKorUpdate();
			break;
		case "Edit":
			postFnolPassengerPOM.selectEdit();
			break;
		case "Update":
			postFnolPassengerPOM.selectOKorUpdate();
			break;
		case "Cancel":
			postFnolPassengerPOM.cancel();
			break;
		case "Injuries Tab":
			postFnolPassengerPOM.clickInjuryTab();
			break;
		case "Add Moj Status":
			postFnolPassengerPOM.selectAddMoj();
			break;
		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on passenger screen on post FNOL$")
	public void i_select_from_field_on_passenger_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Passenger Name":
			postFnolPassengerPOM.selectPassengerName(fieldValue);
			break;
		case "Prefix":
			postFnolPassengerPOM.selectPrefix(fieldValue);
			break;
		case "Address Type":
			postFnolPassengerPOM.selectAddressType(fieldValue);
			break;
		case "Gender":
			postFnolPassengerPOM.selectGender(fieldValue);
			break;
		
	    case "Primary Phone":
	    	postFnolPassengerPOM.selectPrimaryPhone(fieldValue);
	    	break;
	    case "ThirdParty Seatbelt":
	    	if (fieldValue.equalsIgnoreCase("Yes"))
	    		postFnolPassengerPOM.selectPassengerSeatBelt(true);
	    	else
	    		postFnolPassengerPOM.selectPassengerSeatBelt(false);
	    	break;
	    case "Postcode Address":
	    	postFnolPassengerPOM.selectPostcodeAddress(fieldValue);
	    	break;
	    case "Injured":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolPassengerPOM.selectInjured(true);
			else
				postFnolPassengerPOM.selectInjured(false);
			break;
		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}

	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on passenger screen on post FNOL$")
	public void i_input_into_the_box_on_passenger_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Firstname":
			postFnolPassengerPOM.setFirstName(fieldValue);
			break;
		case "Lastname":
			postFnolPassengerPOM.setLastName(fieldValue);
			break;
		case "Postcode":
			postFnolPassengerPOM.setPostcode(fieldValue);
			break;
		case "Email":
			postFnolPassengerPOM.setEmail(fieldValue);
			break;
		case "Mobile":
			postFnolPassengerPOM.setMobile(fieldValue);
			break;
		case "Notes":
			postFnolPassengerPOM.setNotes(fieldValue);
			break;
		// injury fields
		case "Injury Description":
			postFnolPassengerPOM.setInjuryDesc(fieldValue);
			break;
		case "Moj Insured Liability":
			postFnolPassengerPOM.setMojInsuredLiability(fieldValue);
			break;
		case "Moj Claimant Liability":
			postFnolPassengerPOM.setMojClaimantLiability(fieldValue);
			break;
		case "Moj Other Liability":
			postFnolPassengerPOM.setMojOtherLiability(fieldValue);
			break;
		case "Moj Low Damages":
			postFnolPassengerPOM.setMojLowDamages(fieldValue);
			break;
		case "Moj High Damages":
			postFnolPassengerPOM.setMojHighDamages(fieldValue);
			break;
		case "Moj Offer Damages":
			postFnolPassengerPOM.setMojOfferDamages(fieldValue);
			break;
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	
	
	@Given("^I change fields on post FNOL edit PH passenger incident$")
	public void changePostFNOLPHPassengerForTestScenario() throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerPrefix");
		if (fieldValue !=null)
			postFnolPassengerPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerFirstName");
		if (fieldValue !=null)
			postFnolPassengerPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerLastName");
		if (fieldValue !=null)
			postFnolPassengerPOM.setLastName(fieldValue);
		
		//TODO gender
		
		// address fields
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerPostcodeSearch");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) {
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerPostcode");
			postFnolPassengerPOM.setPostcode(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerPostcodeAddress");
			postFnolPassengerPOM.selectPostcodeAddress(fieldValue);
		}
		else
		{
			postFnolPassengerPOM.setAddressLine1("some address line"); //TODO
		}
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerEmail");
		if (fieldValue !=null)
			postFnolPassengerPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMobile");
		if (fieldValue !=null)
			postFnolPassengerPOM.setMobile(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerNotes");
		if (fieldValue !=null)
			postFnolPassengerPOM.setNotes(fieldValue);
		
		// injury is now on a tab
		postFnolPassengerPOM.clickInjuryTab();
		
		fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			postFnolPassengerPOM.selectInjured(true);
			//postFnolPassengerPOM.selectAddInjury(); - going to amend existing injury
			
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerInjDesc");
			if (fieldValue !=null)
				postFnolPassengerPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerInj1BodyArea");
				if (fieldValue !=null)
					postFnolPassengerPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerInj1Detailed");
				if (fieldValue !=null)
					postFnolPassengerPOM.selectDetailedInjury(fieldValue, 1);
				
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					postFnolPassengerPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
						postFnolPassengerPOM.selectOvernightStay(true);
					else
						postFnolPassengerPOM.selectOvernightStay(false);
					
					postFnolPassengerPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
				
				
				
				
			fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMojInsuredLiabilityPerc");
				if (fieldValue !=null)
					postFnolPassengerPOM.setMojInsuredLiability(fieldValue);
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMojClaimantLiabilityPerc");
				if (fieldValue !=null)
					postFnolPassengerPOM.setMojClaimantLiability(fieldValue);
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMojOtherLiabilityPerc");
				if (fieldValue !=null)
					postFnolPassengerPOM.setMojOtherLiability(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMojLowDamages");
				if (fieldValue !=null)
					postFnolPassengerPOM.setMojLowDamages(fieldValue);
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMojHighDamages");
				if (fieldValue !=null)
					postFnolPassengerPOM.setMojHighDamages(fieldValue);
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMojOfferDamages");
				if (fieldValue !=null)
					postFnolPassengerPOM.setMojOfferDamages(fieldValue);
				
				/*
				//MOJ stuff - get server response error currently when setting date
				//--------------------
				// need to determine which occurence as there nay already be one
				fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerAddMoj");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
					postFnolPassengerPOM.selectAddMoj();
					int sequence = postFnolPassengerPOM.getCountMoj();
					// now add an moj
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMojType");
					postFnolPassengerPOM.selectMojInjuryType(fieldValue, sequence);
					fieldValue = ExcelUtil.getTestDataValue("EditPostFnol_PHPassengerMojCreateDate");
					postFnolPassengerPOM.setMojCreationDate(fieldValue, sequence);
				}*/
			
		     
		}
		else
		{
			postFnolPassengerPOM.selectInjured(false);
		}
	
			
	}

	
}
