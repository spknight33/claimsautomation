package stepdefs.postfnol;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCPOSTFNOLEditPedestrianSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	@Then("^I will be on edit pedestrian screen on post FNOL$")
	public void i_will_see_post_FNOL_editpedestrian_details() throws Throwable {
		postFnolPedestrianPOM.isPageTitleDisplayed("Pedestrian Details");
	}
	
	
	@Given("^I click cancel button on edit pedestrian screen on post FNOL$")
	public void cancel() {
		
		postFnolPedestrianPOM.selectCancel();
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
	
	
	//TODO general accessors for this page for individual field access
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit pedestrian details screen for post FNOL$")
	public void i_select_from_field_on_pedestriandetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Prefix":
			postFnolPedestrianPOM.selectPrefix(fieldValue);
		    	break;
	    case "Address Type":
	    	postFnolPedestrianPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	postFnolPedestrianPOM.selectGender(fieldValue);
	    	break;
	    
	   //TODO the rest
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on edit pedestrian details screen for post FNOL$")
	public void i_input_into_the_box_on_pedestriandetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "First Name":
	    	postFnolPedestrianPOM.setFirstName(fieldValue);
	    	break;
	    case "Last Name":
	    	postFnolPedestrianPOM.setLastName(fieldValue);
	    	break;
	    case "Mobile":
	    	postFnolPedestrianPOM.setMobile(fieldValue);
	    	break;
	    case "Email":
	    	postFnolPedestrianPOM.setEmail(fieldValue);
	    	break;
	    case "Address Line1":
	    	postFnolPedestrianPOM.setAddressLine1(fieldValue);
	    	break;
	    case "Address Line2":
	    	postFnolPedestrianPOM.setAddressLine2(fieldValue);
	    	break;
	    case "Address Line3":
	    	postFnolPedestrianPOM.setAddressLine3(fieldValue);
	    	break;
	    //TODO - the rest, injury/moj etc
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
}
