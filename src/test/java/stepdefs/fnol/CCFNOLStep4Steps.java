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
import stepdefs.fnol.services.CCFNOLNewServiceSteps;

public class CCFNOLStep4Steps extends BaseTest{
	
	CCFNOLStep3Steps step3Steps = new CCFNOLStep3Steps();
	SearchAddressBookSteps searchAddressBook = new SearchAddressBookSteps();
	CCFNOLNewServiceSteps createService = new CCFNOLNewServiceSteps();
	
	/**
	 * for use by regression scripts
	 * @param scenarioData
	 * @throws Throwable
	 */
	public void completeFNOLStep4ForTestScenario()  throws Throwable
	{
		String fieldValue=null;
		
		// search for service if defined in sheet
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_PhClaiming");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.selectPhClaiming(true);
			
		
		
		}
		else
		{
			fnolStep4POM.selectPhClaiming(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_RepairServiceRequired");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.clickRepairServiceBox();
			fnolStep4POM.selectSearchRepairService();
			// use a method on address book to just select the first found vendor
			searchAddressBook.searchForVendorAndSelectFirst();
			
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_RecoveryServiceRequired");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.clickRecoveryServiceBox();
			fnolStep4POM.selectSearchRecoveryService();
			// use a method on address book to just select the first found vendor
			searchAddressBook.searchForVendorAndSelectFirst();
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_SalvageServiceRequired");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.clickSalvageServiceBox();
			fnolStep4POM.selectSearchSalvageService();
			// use a method on address book to just select the first found vendor
			searchAddressBook.searchForVendorAndSelectFirst();
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_InspectionServiceRequired");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.clickInspectionServiceBox();
			fnolStep4POM.selectSearchInspectionService();
			// use a method on address book to just select the first found vendor
			searchAddressBook.searchForVendorAndSelectFirst();
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_NonFaultReferralServiceRequired");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.clickNonFaultReferralServiceBox();
			fnolStep4POM.selectSearchNonFaultReferralService();
			// use a method on address book to just select the first found vendor
			searchAddressBook.searchForVendorAndSelectFirst();
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_NonFaultVehicleReferralServiceRequired");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.clickNonFaultVehicleReferralServiceBox();
			fnolStep4POM.selectSearchNonFaultVehicleReferralService();
			// use a method on address book to just select the first found vendor
			searchAddressBook.searchForVendorAndSelectFirst();
		}
		
	
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceRequired");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
				
			fnolStep4POM.clickOtherServiceBox();
			fnolStep4POM.clickAddOtherService();
			
			createService.completeFNOLOtherServiceForTestScenario();
	
		}
			
		fnolStep4POM.next();
	}
	
	@Given("^I click finish button on step4 FNOL$")
	public void finish() {
		
		fnolStep4POM.finish();
	}
	
	@Given("^I click next button on step4 FNOL $")
	public void next() {
		
		fnolStep4POM.next();
	}

	@Given("^I click previous button on step4 FNOL$")
	public void previous() {
		
		fnolStep4POM.back();
	}
	
	@Given("^As a \"([^\"]*)\" I am at step4 for FNOL$")
	public void as_a_user_I_am_at_step4_for_FNOL(String userType) throws Throwable {
		step3Steps.as_a_user_I_am_at_step3_for_FNOL(userType);
		step3Steps.completeFNOLStep3ForTestScenario();
	
	}
	

	@Then("^I will be on step4 for FNOL$")
	public void i_will_be_on_step4_for_FNOL() throws Throwable {
		fnolStep4POM.isPageTitleDisplayed("Step 4 of 5: Services");
	}
	
	// for use by step3 validation tests
	public boolean step4isDisplayed()
	{
		return fnolStep4POM.isPageTitleDisplayed("Step 4 of 5: Services");
	}
	
	
	@Then("^Mandatory field error messages will be shown for step4 FNOL$")
	public void mandatory_field_error_messages_will_be_shown_forstep4(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(fnolStep4POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}

	
	@Given("^I select \"([^\"]*)\" from field \"([^\"]*)\" at step4 FNOL$")
	public void i_select_from_field_on_step4fnol_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "PH Claiming":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolStep4POM.selectPhClaiming(true);
				else
					fnolStep4POM.selectPhClaiming(false);	
		    	break;
	
	
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	

	
	@Given("^I click the \"([^\"]*)\" service checkbox at step4 FNOL$")
	public void i_click_the_service_checkbox_at_step_FNOL(String fieldName) throws Throwable {
		switch(fieldName)
	    {
	case "Repair":
			fnolStep4POM.clickRepairServiceBox();	
	    	break;
	case "Recovery":
		fnolStep4POM.clickRecoveryServiceBox();	
    	break;
	case "Salvage":
		fnolStep4POM.clickSalvageServiceBox();	
    	break;
	case "Inspection":
		fnolStep4POM.clickInspectionServiceBox();	
    	break;
	case "Non Fault Referral":
		fnolStep4POM.clickNonFaultReferralServiceBox();
    	break;
	case "Non Fault Vehicle Referral":
		fnolStep4POM.clickNonFaultVehicleReferralServiceBox();
    	break;
	case "Other":
		fnolStep4POM.clickOtherServiceBox();
    	break;


    default:
    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
    }
	}
	
	@Given("^I click Add Other Service button on step4 FNOL$")
	public void addOtherService() {
		
		fnolStep4POM.clickAddOtherService();
	}
	
	@Given("^I click the Search menu for the \"([^\"]*)\" service at step4 FNOL$")
	public void i_click_the_Search_menu_for_the_service_at_step_FNOL(String fieldName) throws Throwable {
		switch(fieldName)
	    {
	case "Repair":
			fnolStep4POM.selectSearchRepairService();	
	    	break;
	case "Recovery":
		fnolStep4POM.selectSearchRecoveryService();
    	break;
	case "Salvage":
		fnolStep4POM.selectSearchSalvageService();
    	break;
	case "Inspection":
		fnolStep4POM.selectSearchInspectionService();
    	break;
	case "Non Fault Referral":
		fnolStep4POM.selectSearchNonFaultReferralService();
    	break;
	case "Non Fault Vehicle Referral":
		fnolStep4POM.selectSearchNonFaultVehicleReferralService();
    	break;


    default:
    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
    }
		
		
	}

	

}
