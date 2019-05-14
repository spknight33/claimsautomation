package stepdefs.fnol;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLPropertySteps extends BaseTest {
	
	CCFNOLPersonContactSteps personContactSteps = new CCFNOLPersonContactSteps();
	CCFNOLCompanyContactSteps companyContactSteps = new CCFNOLCompanyContactSteps();
	
	public void completeFNOLPropertyForTestScenario()  throws Throwable
	{
		
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyDesc");
		if (fieldValue !=null)
			fnolPropertyDetailsPOM.setPropertyDesc(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyDamageDesc");
		if (fieldValue !=null)
			fnolPropertyDetailsPOM.setDamageDesc(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyLossEstimate");
		if (fieldValue !=null)
			fnolPropertyDetailsPOM.setLossEstimate(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyExtDamage");
		if (fieldValue !=null)
			fnolPropertyDetailsPOM.setExtentDamage(fieldValue);
		
		
		

		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyEstimateReceived");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("Yes"))
		{
			fnolPropertyDetailsPOM.selectEstimateReceived("Yes");
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyEstimateCost");
			if (fieldValue !=null)
				fnolPropertyDetailsPOM.setEstimateCost(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyEstimateRepairTime");
			if (fieldValue !=null)
				fnolPropertyDetailsPOM.setEstimateRepairTime(fieldValue);
		}
		
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyAlreadyRepaired");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
		fnolPropertyDetailsPOM.selectAlreadyRepaired(true);
		}
		else
		{
			fnolPropertyDetailsPOM.selectAlreadyRepaired(false);
		}
		
		
		// some issue with the clicker on this page-
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwner");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
					fnolPropertyDetailsPOM.selectNewOwnerPerson();
					// on select new person page, complete the details
				   personContactSteps.completeFNOLPropertyOwnerForTestScenario();
				}
				else
				{
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyPHOwner");
					if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
					{
						// SET THE PH AS THE OWNER
						fieldValue = ExcelUtil.getTestDataValue("Fnol_Name");
						fnolPropertyDetailsPOM.selectPropertyOwner(fieldValue);
						
					}
					// select property owner from the list
					//fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyOwner");
					//fnolPropertyDetailsPOM.selectPropertyOwner(fieldValue);
				}
				
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyPostcodeSearch");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyPostcode");
					fnolPropertyDetailsPOM.setPostcode(fieldValue);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyPostcodeAddress");
					fnolPropertyDetailsPOM.selectPostcodeAddress(fieldValue);
				
				}
				else
				{
				
					// moved this to the end as was causing stale elements if done earlier!
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyAddress1");
					if (fieldValue !=null)
						fnolPropertyDetailsPOM.setAddressLine1(fieldValue);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyAddress2");
					if (fieldValue !=null)
						fnolPropertyDetailsPOM.setAddressLine2(fieldValue);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyCity");
					if (fieldValue !=null)
						fnolPropertyDetailsPOM.setCity(fieldValue);
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyLocationDesc");
					if (fieldValue !=null)
						fnolPropertyDetailsPOM.setLocationDescription(fieldValue);
				}
		
		fnolPropertyDetailsPOM.selectOK();
	}
	
	@Then("^I will be on FNOL new property screen$")
	public void i_will_see_FNOL_newproperty_details() throws Throwable {
		fnolPropertyDetailsPOM.isPageTitleDisplayed("New Property Incident");
	}
	
	
	
	
	@Given("^I click \"([^\"]*)\" on new property screen for FNOL$")
	public void i_click_on_property_screen(String button) throws Throwable {
		switch (button) {
		case "Update":
			//fnolPropertyDetailsPOM.selectuupdate();
			break;
		case "Ok":
			fnolPropertyDetailsPOM.selectOK();
			break;
		case "Cancel":
			fnolPropertyDetailsPOM.cancel();
			break;
		case "New Person Owner":
			fnolPropertyDetailsPOM.selectNewOwnerPerson();
			break;
		case "New Company Owner":
			fnolPropertyDetailsPOM.selectNewOwnerCompany();
			break;
		
		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new property screen for FNOL$")
	public void i_select_from_field_on_property_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Postcode Address":
			fnolPropertyDetailsPOM.selectPostcodeAddress(fieldValue);
			break;
			
		case "Property Owner":
			fnolPropertyDetailsPOM.selectPropertyOwner(fieldValue);
			break;
			
		case "Estimate Received":
			fnolPropertyDetailsPOM.selectEstimateReceived(fieldValue);
			break;
			
		case "Already Repaired":
			if (fieldValue.equalsIgnoreCase("Yes"))
				fnolPropertyDetailsPOM.selectAlreadyRepaired(true);
			else
				fnolPropertyDetailsPOM.selectAlreadyRepaired(false);
			break;
		

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on new property screen for FNOL$")
	public void i_input_into_the_box_on_property_screen(String fieldValue, String fieldName) throws Throwable {
		
	    	switch (fieldName) {
			case "Property Description":
				fnolPropertyDetailsPOM.setPropertyDesc(fieldValue);
				break;
			case "Damage Description":
				fnolPropertyDetailsPOM.setDamageDesc(fieldValue);
				break;
			case "Loss Estimate":
				fnolPropertyDetailsPOM.setLossEstimate(fieldValue);
				break;
			case "Damage Extent":
				fnolPropertyDetailsPOM.setExtentDamage(fieldValue);
				break;
			case "Address Line1":
				fnolPropertyDetailsPOM.setAddressLine1(fieldValue);
				break;
			case "Address Line2":
				fnolPropertyDetailsPOM.setAddressLine2(fieldValue);
				break;
			case "Address Line3":
				fnolPropertyDetailsPOM.setAddressLine3(fieldValue);
				break;
			case "City":
				fnolPropertyDetailsPOM.setCity(fieldValue);
				break;
			case "Postcode":
				fnolPropertyDetailsPOM.setPostcode(fieldValue);
				break;
			case "Location Description":
				fnolPropertyDetailsPOM.setLocationDescription(fieldValue);
				break;
			case "Estimated Repair Cost":
				fnolPropertyDetailsPOM.setEstimateCost(fieldValue);
				break;
			case "Estimated Repair Time":
				fnolPropertyDetailsPOM.setEstimateRepairTime(fieldValue);
				break;
		
			default:
				Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
			}
	}
	

	
	@Then("^I complete the new property screen for FNOL$")
	public void i_complete_the_details_on_the_new_property_contact_screen() throws Throwable {
		
		completeFNOLPropertyForTestScenario();
		
	}
	
	@Then("^Mandatory field error messages will be shown for New Property screen in FNOL$")
	public void mandatory_field_error_messages_will_be_shown_forstep3newproperty(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		SoftAssert softAssert = new SoftAssert();
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(fnolPropertyDetailsPOM.containsErrorMessage(list.get(i)),
					"Error Message Check: " + list.get(i));

		}
		softAssert.assertAll();
	}
	

}
