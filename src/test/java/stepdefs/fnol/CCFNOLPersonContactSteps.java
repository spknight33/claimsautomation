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
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerMiddleName");
		if (fieldValue !=null)
			personContactDetailsPOM.setMiddleName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerLastName");
		if (fieldValue !=null)
			personContactDetailsPOM.setLastName(fieldValue);
		
		
		// phone section
		//----------------
		// do primary first
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerPrimaryPhone");
		if (fieldValue !=null)
			personContactDetailsPOM.selectPrimaryPhone(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerWorkPhone");
		if (fieldValue !=null)
			personContactDetailsPOM.setWorkPhone(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerHomePhone");
		if (fieldValue !=null)
			personContactDetailsPOM.setHomePhone(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerMobile");
		if (fieldValue !=null)
			personContactDetailsPOM.setMobile(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerFax");
		if (fieldValue !=null)
			personContactDetailsPOM.setFax(fieldValue);
		
		
		
		// email section
		//-----------------
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerEmail");
		if (fieldValue !=null)
			personContactDetailsPOM.setEmail(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerAltEmail");
		if (fieldValue !=null)
			personContactDetailsPOM.setAltEmail(fieldValue);
		
		// put first as other address setter cause stale element
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerAddressType");
		if (fieldValue !=null)
			personContactDetailsPOM.selectAddressType(fieldValue);
		
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerPostcodeSearch");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerPostcode");
			personContactDetailsPOM.setPostCode(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerPostcodeAddress");
			personContactDetailsPOM.selectPostcodeAddress(fieldValue);
		
		}
		else
		{
		
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerAddress1");
			if (fieldValue !=null)
				personContactDetailsPOM.setAddressLine1(fieldValue);
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerAddress2");				
			if (fieldValue !=null)
				personContactDetailsPOM.setAddressLine2(fieldValue);
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerAddress3");
			if (fieldValue !=null)
				personContactDetailsPOM.setAddressLine3(fieldValue);
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerCity");
			if (fieldValue !=null)
				personContactDetailsPOM.setAddressCity(fieldValue);
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerCounty");
			if (fieldValue !=null)
				personContactDetailsPOM.setAddressCounty(fieldValue);
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerLocationDesc");
			if (fieldValue !=null)
				personContactDetailsPOM.setLocationDesc(fieldValue);
		}
		
		
		// TODO add bank details - currently fault in automation in this
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerAddBank");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			personContactDetailsPOM.clickAddBank();
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerBankAcctName");
			personContactDetailsPOM.setBankAccountName(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerBankName");
			personContactDetailsPOM.setBankName(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerBankAcctNumber");
			personContactDetailsPOM.setBankAccountNumber(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerBankSortcode");
			personContactDetailsPOM.setBankSortcode(fieldValue);
			
		}
		
	
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
	
	public void completeFNOLWitnessForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessPrefix");
		if (fieldValue !=null)
			personContactDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessFirstName");
		if (fieldValue !=null)
			personContactDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessLastName");
		if (fieldValue !=null)
			personContactDetailsPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessEmail");
		if (fieldValue !=null)
			personContactDetailsPOM.setEmail(fieldValue);
		
		

		// use postcode if present, otherwise location
		fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessPostcodeSearch");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessPostcode");
			personContactDetailsPOM.setPostCode(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessPostcodeAddress");
			personContactDetailsPOM.selectPostcodeAddress(fieldValue);
		
		}
		else
		{
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessLocationDesc");
		if (fieldValue !=null)
			personContactDetailsPOM.setLocationDesc(fieldValue);
		}
		
		// phone section
				//----------------
				// do primary first
				fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessPrimaryPhone");
				if (fieldValue !=null)
					personContactDetailsPOM.selectPrimaryPhone(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessWorkPhone");
				if (fieldValue !=null)
					personContactDetailsPOM.setWorkPhone(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessHomePhone");
				if (fieldValue !=null)
					personContactDetailsPOM.setHomePhone(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessMobile");
				if (fieldValue !=null)
					personContactDetailsPOM.setMobile(fieldValue);
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_WitnessFax");
				if (fieldValue !=null)
					personContactDetailsPOM.setFax(fieldValue);
		
		
		
		
		
		
		
		
		
	
		personContactDetailsPOM.selectUpdate();
	}
	
	public void completePostFNOLClaimReporterForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_ReporterPrefix");
		if (fieldValue !=null)
			personContactDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_ReporterFirstName");
		if (fieldValue !=null)
			personContactDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_ReporterLastName");
		if (fieldValue !=null)
			personContactDetailsPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_ReporterEmail");
		if (fieldValue !=null)
			personContactDetailsPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_ReporterLocationDesc");
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
	
	public void completePostFNOLClaimMainContactForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_MainContactPrefix");
		if (fieldValue !=null)
			personContactDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_MainContactFirstName");
		if (fieldValue !=null)
			personContactDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_MainContactLastName");
		if (fieldValue !=null)
			personContactDetailsPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_MainContactEmail");
		if (fieldValue !=null)
			personContactDetailsPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_MainContactLocationDesc");
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
