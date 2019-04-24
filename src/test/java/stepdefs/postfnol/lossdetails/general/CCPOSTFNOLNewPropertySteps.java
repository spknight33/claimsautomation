package stepdefs.postfnol.lossdetails.general;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.postfnol.common.CCPOSTFNOLCompanyContactSteps;
import stepdefs.postfnol.common.CCPOSTFNOLPersonContactSteps;

public class CCPOSTFNOLNewPropertySteps extends BaseTest {
	
	CCPOSTFNOLPersonContactSteps personContactSteps = new CCPOSTFNOLPersonContactSteps();
	CCPOSTFNOLCompanyContactSteps companyContactSteps = new CCPOSTFNOLCompanyContactSteps();
	
	
	@Then("^I will be on new property screen on post FNOL$")
	public void i_will_see_post_FNOL_newproperty_details() throws Throwable {
		postFnolNewPropertyPOM.isPageTitleDisplayed("New Property Incident");
	}
	
	
	@Given("^I click \"([^\"]*)\" on new property screen on post FNOL$")
	public void i_click_on_new_property_screen(String button) throws Throwable {
		switch (button) {
		case "Update":
			postFnolNewPropertyPOM.update();
		case "Ok":
			postFnolNewPropertyPOM.ok();
			break;
		case "Cancel":
			postFnolNewPropertyPOM.cancel();
			break;
		case "New Person Owner":
			postFnolNewPropertyPOM.selectNewOwnerPerson();
			break;
		case "New Company Owner":
			postFnolNewPropertyPOM.selectNewOwnerCompany();
			break;
		
		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on new property screen on post FNOL$")
	public void i_select_from_field_on_new_property_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Postcode Address":
			postFnolNewPropertyPOM.selectPostcodeAddress(fieldValue);
			break;
			
		case "Property Owner":
			postFnolNewPropertyPOM.selectPropertyOwner(fieldValue);
			break;
			
		case "Estimate Received":
			postFnolNewPropertyPOM.selectEstimateReceived(fieldValue);
			break;
			
		case "Already Repaired":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolNewPropertyPOM.selectAlreadyRepaired(true);
			else
				postFnolNewPropertyPOM.selectAlreadyRepaired(false);
			break;
		

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on new property screen on post FNOL$")
	public void i_input_into_the_box_on_new_property_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Property Description":
			postFnolNewPropertyPOM.setPropertyDesc(fieldValue);
			break;
		case "Damage Description":
			postFnolNewPropertyPOM.setDamageDesc(fieldValue);
			break;
		case "Loss Estimate":
			postFnolNewPropertyPOM.setLossEstimate(fieldValue);
			break;
		case "Damage Extent":
			postFnolNewPropertyPOM.setExtentDamage(fieldValue);
			break;
		case "Address Line1":
			postFnolNewPropertyPOM.setAddressLine1(fieldValue);
			break;
		case "Address Line2":
			postFnolNewPropertyPOM.setAddressLine2(fieldValue);
			break;
		case "Address Line3":
			postFnolNewPropertyPOM.setAddressLine3(fieldValue);
			break;
		case "City":
			postFnolNewPropertyPOM.setCity(fieldValue);
			break;
		case "Postcode":
			postFnolNewPropertyPOM.setPostcode(fieldValue);
			break;
		case "Location Description":
			postFnolNewPropertyPOM.setLocationDescription(fieldValue);
			break;
		case "Estimated Repair Cost":
			postFnolNewPropertyPOM.setEstimatedRepairCost(fieldValue);
			break;
		case "Estimated Repair Time":
			postFnolNewPropertyPOM.setEstimatedRepairTime(fieldValue);
			break;
	
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	
	
	
	@Given("^I complete all fields on post FNOL new property incident$")
	public void i_complete_all_fields() throws Throwable {
		
		
		this.completePostFNOLPropertyForTestScenario();
	}
	
	public void completePostFNOLPropertyForTestScenario()  throws Throwable
	{
		
		
		String fieldValue = ExcelUtil.getTestDataValue("PostFnol_PropertyDesc");
		if (fieldValue !=null)
			postFnolNewPropertyPOM.setPropertyDesc(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PropertyDamageDesc");
		if (fieldValue !=null)
			postFnolNewPropertyPOM.setDamageDesc(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PropertyLossEstimate");
		if (fieldValue !=null)
			postFnolNewPropertyPOM.setLossEstimate(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PropertyExtDamage");
		if (fieldValue !=null)
			postFnolNewPropertyPOM.setExtentDamage(fieldValue);
		
		
		
		//TODO - get these from datasheet
		postFnolNewPropertyPOM.selectEstimateReceived("Yes");
		postFnolNewPropertyPOM.setEstimatedRepairCost("3000");
		postFnolNewPropertyPOM.setEstimatedRepairTime("1 hour");
		postFnolNewPropertyPOM.selectAlreadyRepaired(true);
		
		
		// some issue with the clicker on this page-
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PropertyNewOwner");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			postFnolNewPropertyPOM.selectNewOwnerPerson();
					// on select new person page, complete the details
			personContactSteps.completePostFNOLPropertyOwnerForTestScenario();
		}
		
		// OVERRIDE PERON WITH COMPNAY IT SET
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_PropertyNewCompany");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			postFnolNewPropertyPOM.selectNewOwnerCompany();
					// on select new company page, complete the details
			companyContactSteps.completePostFNOLPropertyOwnerForTestScenario();
		}
				
				
				
				
				// moved this to the end as was causing stale elements if done earlier!
				fieldValue = ExcelUtil.getTestDataValue("PostFnol_PropertyLocationDesc");
				if (fieldValue !=null)
					postFnolNewPropertyPOM.setLocationDescription(fieldValue);
				
		
				postFnolNewPropertyPOM.update();
	}
	
	
	

}
