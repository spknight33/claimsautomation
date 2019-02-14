package stepdefs.fnol;

import java.util.List;

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
		
		
		
		//TODO - get these from datasheet
		fnolPropertyDetailsPOM.selectEstimateReceived("Yes");
		fnolPropertyDetailsPOM.setEstimateCost("3000");
		fnolPropertyDetailsPOM.setEstimateRepairTime("1 hour");
		fnolPropertyDetailsPOM.selectAlreadyRepaired(true);
		
		
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
					// select property owner from the list
					fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyOwner");
					fnolPropertyDetailsPOM.selectPropertyOwner(fieldValue);
				}
				
				// moved this to the end as was causing stale elements if done earlier!
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyLocationDesc");
				if (fieldValue !=null)
					fnolPropertyDetailsPOM.setLocationDescription(fieldValue);
				
		
		fnolPropertyDetailsPOM.selectOK();
	}
	
	@Then("^I will be on FNOL new property screen$")
	public void i_will_see_FNOL_newproperty_details() throws Throwable {
		fnolPropertyDetailsPOM.isPageTitleDisplayed("New Property Incident");
	}
	
	
	@Given("^I click ok button on FNOL new property incident$")
	public void ok() {
		
		fnolPropertyDetailsPOM.selectOK();
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
