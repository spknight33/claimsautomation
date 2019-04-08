package stepdefs.postfnol.lossdetails.general;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.postfnol.common.CCPOSTFNOLCompanyContactSteps;
import stepdefs.postfnol.common.CCPOSTFNOLPersonContactSteps;

public class CCPOSTFNOLNewPropertySteps extends BaseTest {
	
	CCPOSTFNOLPersonContactSteps personContactSteps = new CCPOSTFNOLPersonContactSteps();
	CCPOSTFNOLCompanyContactSteps companyContactSteps = new CCPOSTFNOLCompanyContactSteps();
	
	
	@Then("^I will be on new property screen$")
	public void i_will_see_post_FNOL_newproperty_details() throws Throwable {
		postFnolNewPropertyPOM.isPageTitleDisplayed("New Property Incident");
	}
	
	
	@Given("^I click ok button on post FNOL new property incident$")
	public void ok() {
		
		postFnolNewPropertyPOM.selectOK();
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
				
		
				postFnolNewPropertyPOM.selectOK();
	}
	
	
	

}
