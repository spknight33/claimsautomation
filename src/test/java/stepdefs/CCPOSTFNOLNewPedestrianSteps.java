package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewPedestrianSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	@Then("^I will be on new pedestrian screen on post FNOL$")
	public void i_will_see_post_FNOL_newpedestrian_details() throws Throwable {
		postFnolPedestrianPOM.isPageTitleDisplayed("Pedestrian Details");
	}
	
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
	
}
