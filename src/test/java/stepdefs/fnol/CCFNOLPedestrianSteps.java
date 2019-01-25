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

public class CCFNOLPedestrianSteps extends BaseTest {
	SearchAddressBookSteps searchAddressBookSteps = new SearchAddressBookSteps();
	
	public void completeFNOLPedestrianForTestScenario() throws Throwable
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianPrefix");
		if (fieldValue !=null)
			fnolPedestrianPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianFirstName");
		if (fieldValue !=null)
			fnolPedestrianPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianLastName");
		if (fieldValue !=null)
			fnolPedestrianPOM.setLastName(fieldValue);
		
		// address fields
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianPostcodeSearch");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE")) {
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianPostcode");
			fnolPedestrianPOM.setPostcode(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianPostcodeAddress");
			fnolPedestrianPOM.selectPostcodeAddress(fieldValue);
		}
		else
		{
			fnolPedestrianPOM.setAddressLine1("some address line"); //TODO
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianEmail");
		if (fieldValue !=null)
			fnolPedestrianPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianMobile");
		if (fieldValue !=null)
			fnolPedestrianPOM.setMobile(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianNotes");
		if (fieldValue !=null)
			fnolPedestrianPOM.setNotes(fieldValue);
		
			
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolPedestrianPOM.selectInjured(true);
			fnolPedestrianPOM.selectAddInjury();
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInjDesc");
			if (fieldValue !=null)
				fnolPedestrianPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInj1BodyArea");
				if (fieldValue !=null)
					fnolPedestrianPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInj1Detailed");
				if (fieldValue !=null)
					fnolPedestrianPOM.selectDetailedInjury(fieldValue, 1);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInjHospAttend");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
		     
					fnolPedestrianPOM.selectHospitalAttend(true);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInjHospOvernight");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
						fnolPedestrianPOM.selectOvernightStay(true);
					else
						fnolPedestrianPOM.selectOvernightStay(false);
					
					fnolPedestrianPOM.selectSearchHospital();
					
					// on search hospital page
					searchAddressBookSteps.i_will_be_on_search_address_book_screen();
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInjHospSearchName");
			
					searchAddressBookSteps.i_input_into_the_box_on_search_address_book_screen(fieldValue, "Search Name");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Search");
					searchAddressBookSteps.i_select_on_search_address_book_screen("Select First Result");
				}
		     
		}
		else
		{
			fnolPedestrianPOM.selectInjured(false);
		}
	
		fnolPedestrianPOM.selectOK();
		
	}
	
	@Then("^I will be on pedestrian screen for FNOL$")
	public void i_will_be_on_pedestrian_screen_for_FNOL() throws Throwable {
		fnolPedestrianPOM.isPageTitleDisplayed("Pedestrian Details");
	}
	
	@Given("^I click ok button on FNOL new pedestrian incident$")
	public void ok() {
		
		fnolPedestrianPOM.selectOK();
	}

	
	@Given("^I select \"([^\"]*)\" on pedestrian details screen for FNOL$")
	public void i_select_on_pedestriandetails_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Ok":
	    	fnolPedestrianPOM.selectOK();
	    	break;
	    case "Cancel":
	    	fnolPedestrianPOM.selectCancel();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on pedestrian details screen for FNOL$")
	public void i_select_from_field_on_pedestriandetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Prefix":
			fnolPedestrianPOM.selectPrefix(fieldValue);
		    	break;
	    case "Address Type":
	    	fnolPedestrianPOM.selectAddressType(fieldValue);
	    	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on pedestrian details screen for FNOL$")
	public void i_input_into_the_box_on_pedestriandetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "First Name":
	    	fnolPedestrianPOM.setFirstName(fieldValue);
	    	break;
	    case "Last Name":
	    	fnolPedestrianPOM.setLastName(fieldValue);
	    	break;
	    case "Mobile":
	    	fnolPedestrianPOM.setMobile(fieldValue);
	    	break;
	    case "Email":
	    	fnolPedestrianPOM.setEmail(fieldValue);
	    	break;
	    case "Address Line1":
	    	fnolPedestrianPOM.setAddressLine1(fieldValue);
	    	break;
	    case "Address Line2":
	    	fnolPedestrianPOM.setAddressLine2(fieldValue);
	    	break;
	    case "Address Line3":
	    	fnolPedestrianPOM.setAddressLine3(fieldValue);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	

	@Given("^I complete fields on FNOL new pedestrian incident$")
	public void i_complete_all_fields() throws Throwable {
		
		fnolPedestrianPOM.setAddressLine1("1 Walkers Road");
		fnolPedestrianPOM.setFirstName("Jock");
		fnolPedestrianPOM.setLastName("JayWalker");
		
	
		fnolPedestrianPOM.selectOK();
		
	}
	
	
	@Then("^Mandatory field error messages will be shown for New Pedestrian screen in FNOL$")
	public void mandatory_field_error_messages_will_be_shown_forstep3newpedestrian(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolPedestrianPOM.containsErrorMessage(list.get(i)),
					"Error Message Check: " + list.get(i));

		}
		softAssert.assertAll();
	}

}
