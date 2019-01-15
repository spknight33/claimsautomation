package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterData;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLPropertySteps extends BaseTest {
	
	CCFNOLPersonContactSteps personContactSteps = new CCFNOLPersonContactSteps();
	CCFNOLCompanyContactSteps companyContactSteps = new CCFNOLCompanyContactSteps();
	
	public void completeFNOLPropertyForTestScenario()  throws Throwable
	{
		//TODO - get from scenarioData
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
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyLocationDesc");
		if (fieldValue !=null)
			fnolPropertyDetailsPOM.setLocationDescription(fieldValue);
		
	
		
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwner");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolPropertyDetailsPOM.selectNewOwnerPerson();
			// on select new person page, complete the details
			// TODO move this to person steps for fnol property owner
			personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
			personContactSteps.i_input_into_the_box_on_persondetails_screen("Dora", "First Name");
			personContactSteps.i_input_into_the_box_on_persondetails_screen("Explorer", "Last Name");
			
			personContactSteps.i_input_into_the_box_on_persondetails_screen("The Bridge", "Location Description");
			personContactSteps.i_select_on_persondetails_screen("Update");
		}
		
		//TODO - get these from datasheet
		fnolPropertyDetailsPOM.selectEstimateReceived("Yes");
		fnolPropertyDetailsPOM.setEstimateCost("3000");
		fnolPropertyDetailsPOM.setEstimateRepairTime("1 hour");
		fnolPropertyDetailsPOM.selectAlreadyRepaired(true);
		
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
	
	/*@Given("^I complete fields on FNOL new property incident$")
	public void i_complete_all_fields() throws Throwable {
		
		fnolPropertyDetailsPOM.setPropertyDesc("Household residence");
		fnolPropertyDetailsPOM.setDamageDesc("The fence was knocked down");
		fnolPropertyDetailsPOM.setLossEstimate("500");
		fnolPropertyDetailsPOM.setExtentDamage("Whole fence has been knocked down");
		fnolPropertyDetailsPOM.setAddressLine1("55 The way");
	
		
		fnolPropertyDetailsPOM.selectNewOwnerPerson();
		
		personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Dora", "First Name");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Explorer", "Last Name");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("27 Industrial Estate", "Address Line1");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Waterside", "Address Line2");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("The Bridge", "Address Line3");
		personContactSteps.i_select_on_persondetails_screen("Update");
		
		
		fnolPropertyDetailsPOM.selectOK();
		
	}*/
	
	@Then("^I complete the \"([^\"]*)\" details on the new property screen$")
	public void i_complete_the_details_on_the_new_property_contact_screen(String type) throws Throwable {
		switch(type)
	    {
	    case "Property":
	    	//TODO get property from testdata scenario case
	    	fnolPropertyDetailsPOM.setPropertyDesc("Household residence");
			fnolPropertyDetailsPOM.setDamageDesc("The fence was knocked down");
			fnolPropertyDetailsPOM.setLossEstimate("500");
			fnolPropertyDetailsPOM.setExtentDamage("Whole fence has been knocked down");
			fnolPropertyDetailsPOM.setAddressLine1("55 The way");
			fnolPropertyDetailsPOM.setAddressLine2("by the ford");
			fnolPropertyDetailsPOM.setAddressLine3("By the stream");
			fnolPropertyDetailsPOM.setCity("Newcastle Upon Tyne");
			fnolPropertyDetailsPOM.setPostcode("NE41PC");
			fnolPropertyDetailsPOM.setLocationDescription("Near the fire station");
			
			fnolPropertyDetailsPOM.selectNewOwnerPerson();
			// on select new person page, complete the details
			personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
			personContactSteps.i_input_into_the_box_on_persondetails_screen("Dora", "First Name");
			personContactSteps.i_input_into_the_box_on_persondetails_screen("Explorer", "Last Name");
			personContactSteps.i_input_into_the_box_on_persondetails_screen("27 Industrial Estate", "Address Line1");
			personContactSteps.i_input_into_the_box_on_persondetails_screen("Waterside", "Address Line2");
			personContactSteps.i_input_into_the_box_on_persondetails_screen("The Bridge", "Address Line3");
			personContactSteps.i_select_on_persondetails_screen("Update");
			
			fnolPropertyDetailsPOM.selectEstimateReceived("Yes");
			fnolPropertyDetailsPOM.setEstimateCost("400");
			fnolPropertyDetailsPOM.setEstimateRepairTime("1 hour");
			fnolPropertyDetailsPOM.selectAlreadyRepaired(true);
			fnolPropertyDetailsPOM.selectOK();
	    	break;
	   
	    
	    default:
	    Assert.fail("unknown input field :"+ type+" - check cucumber script!");
	    }
		fnolPropertyDetailsPOM.selectOK();;
	}
	

}
