package stepdefs;

import static java.lang.String.format;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewPropertySteps extends BaseTest {
	
	CCFNOLPersonContactSteps personContactSteps = new CCFNOLPersonContactSteps();
	CCFNOLCompanyContactSteps companyContactSteps = new CCFNOLCompanyContactSteps();
	
	
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
		
		postFnolNewPropertyPOM.setPropertyDesc("Household residence");
		postFnolNewPropertyPOM.setDamageDesc("The fence was knocked down");
		postFnolNewPropertyPOM.setLossEstimate("500");
		postFnolNewPropertyPOM.setExtentDamage("Whole fence has been knocked down");
		postFnolNewPropertyPOM.setAddressLine1("55 The way");
		postFnolNewPropertyPOM.setAddressLine2("by the ford");
		postFnolNewPropertyPOM.setAddressLine3("By the stream");
		postFnolNewPropertyPOM.setCity("Newcastle Upon Tyne");
		postFnolNewPropertyPOM.setPostcode("NE41PC");
		postFnolNewPropertyPOM.setLocationDescription("Near the fire station");
		
		postFnolNewPropertyPOM.selectNewOwnerPerson();
		// on select new person page, complete the details
		personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Dora", "First Name");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Explorer", "Last Name");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("27 Industrial Estate", "Address Line1");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Waterside", "Address Line2");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("The Bridge", "Address Line3");
		personContactSteps.i_select_on_persondetails_screen("Update");
		
		// on select new company  page, complete the details
		postFnolNewPropertyPOM.selectNewOwnerCompany();
		companyContactSteps.i_input_into_the_box_on_companydetails_screen("Acme Limited", "Company Name");
		companyContactSteps.i_input_into_the_box_on_companydetails_screen("27 Industrial Estate", "Address Line1");
		companyContactSteps.i_input_into_the_box_on_companydetails_screen("Waterside", "Address Line2");
		companyContactSteps.i_input_into_the_box_on_companydetails_screen("The Bridge", "Address Line3");
		companyContactSteps.i_input_into_the_box_on_companydetails_screen("Portsmouth", "City");
		companyContactSteps.i_input_into_the_box_on_companydetails_screen("PE331PL", "Postcode");
		companyContactSteps.i_input_into_the_box_on_companydetails_screen("Acme Limited", "Company Name");
		companyContactSteps.i_select_from_field_on_companydetails_screen("Billing", "Address Type");
		companyContactSteps.i_input_into_the_box_on_companydetails_screen("This is a great company", "Notes");
		companyContactSteps.i_select_on_companydetails_screen("Update");
		
		postFnolNewPropertyPOM.selectEstimateReceived("Yes");
		postFnolNewPropertyPOM.setEstimatedRepairCost("400");
		postFnolNewPropertyPOM.setEstimatedRepairTime("1 hour");
		postFnolNewPropertyPOM.selectAlreadyRepaired(true);
		
		postFnolNewPropertyPOM.selectOK();
	}
	
	
	

}
