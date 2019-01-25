package stepdefs.fnol;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLPersonContactSteps extends BaseTest {
	
	
	public void completeFNOLPropertyOwnerForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerPrefix");
		if (fieldValue !=null)
			personContactDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerFirstName");
		if (fieldValue !=null)
			personContactDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerLastName");
		if (fieldValue !=null)
			personContactDetailsPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerEmail");
		if (fieldValue !=null)
			personContactDetailsPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerLocationDesc");
		if (fieldValue !=null)
			personContactDetailsPOM.setLocationDesc(fieldValue);
		
		
	
		personContactDetailsPOM.selectUpdate();
	}
	
	public void completeFNOLClaimReporterForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterPrefix");
		if (fieldValue !=null)
			personContactDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterFirstName");
		if (fieldValue !=null)
			personContactDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterLastName");
		if (fieldValue !=null)
			personContactDetailsPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterEmail");
		if (fieldValue !=null)
			personContactDetailsPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterLocationDesc");
		if (fieldValue !=null)
			personContactDetailsPOM.setLocationDesc(fieldValue);
		
		
	
		personContactDetailsPOM.selectUpdate();
	}
	
	public void completeFNOLClaimMainContactForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimMainContactPrefix");
		if (fieldValue !=null)
			personContactDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimMainContactFirstName");
		if (fieldValue !=null)
			personContactDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimMainContactLastName");
		if (fieldValue !=null)
			personContactDetailsPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimMainContactEmail");
		if (fieldValue !=null)
			personContactDetailsPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimMainContactLocationDesc");
		if (fieldValue !=null)
			personContactDetailsPOM.setLocationDesc(fieldValue);
		
		
	
		personContactDetailsPOM.selectUpdate();
	}
	
	@Then("^I will be on person contact screen for FNOL$")
	public void i_will_be_on_personcontact_screen_for_FNOL() throws Throwable {
	    personContactDetailsPOM.isPageTitleDisplayed("Person Details");
	}

	
	@Given("^I select \"([^\"]*)\" on person details screen$")
	public void i_select_on_persondetails_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Update":
	    	personContactDetailsPOM.selectUpdate();
	    	break;
	    case "Cancel":
	    	personContactDetailsPOM.selectCancel();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on person details screen$")
	public void i_select_from_field_on_persondetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Prefix":
		    	personContactDetailsPOM.selectPrefix(fieldValue);
		    	break;
	    case "Address Type":
	    	personContactDetailsPOM.selectAddressType(fieldValue);
	    	break;
	    
	   
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on person details screen$")
	public void i_input_into_the_box_on_persondetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "First Name":
	    	personContactDetailsPOM.setFirstName(fieldValue);
	    	break;
	    case "Last Name":
	    	personContactDetailsPOM.setLastName(fieldValue);
	    	break;
	    case "Mobile":
	    	personContactDetailsPOM.setMobile(fieldValue);
	    	break;
	    case "Email":
	    	personContactDetailsPOM.setEmail(fieldValue);
	    	break;
	    case "Address Line1":
	    	personContactDetailsPOM.setAddressLine1(fieldValue);
	    	break;
	    case "Address Line2":
	    	personContactDetailsPOM.setAddressLine2(fieldValue);
	    	break;
	    case "Address Line3":
	    	personContactDetailsPOM.setAddressLine3(fieldValue);
	    	break;
	    case "Location Description":
	    	personContactDetailsPOM.setLocationDesc(fieldValue);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Then("^I complete the \"([^\"]*)\" details on the new person contact screen$")
	public void i_complete_the_details_on_the_new_person_contact_screen(String type) throws Throwable {
		switch(type)
	    {
	    case "Claimant":
	    	//TODO get claimant from testdata scenario case
	    	personContactDetailsPOM.selectPrefix("Ms.");
	    	personContactDetailsPOM.setFirstName("Joan");
	    	personContactDetailsPOM.setLastName("Arc");
	    	personContactDetailsPOM.setMobile("07771438079");
	    	personContactDetailsPOM.setPostCode("NE31PX");
	    	personContactDetailsPOM.setAddressLine1("1 The stake");
	    	break;
	   
	    
	    default:
	    Assert.fail("unknown input field :"+ type+" - check cucumber script!");
	    }
		personContactDetailsPOM.selectUpdate();
	}
	

}
