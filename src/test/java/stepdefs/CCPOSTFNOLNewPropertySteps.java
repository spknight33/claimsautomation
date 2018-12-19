package stepdefs;

import static java.lang.String.format;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLNewPropertySteps extends BaseTest {
	
	CCFNOLPersonContactSteps personContactSteps = new CCFNOLPersonContactSteps();
	
	
	@Then("^I will see post FNOL new property incident$")
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
		postFnolNewPropertyPOM.setLocationDescription("Near the fire statiocn");
		postFnolNewPropertyPOM.selectNewOwnerPerson();

		
		// on select new person page, complete the details
		personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Dora", "First Name");
		personContactSteps.i_input_into_the_box_on_persondetails_screen("Explorer", "Last Name");
		personContactSteps.i_select_on_persondetails_screen("Update");
		
		postFnolNewPropertyPOM.selectEstimateReceived("Yes");
		postFnolNewPropertyPOM.setEstimatedRepairCost("400");
		postFnolNewPropertyPOM.setEstimatedRepairTime("1 hour");
		postFnolNewPropertyPOM.selectAlreadyRepaired(true);
		
		postFnolNewPropertyPOM.selectOK();
	}
	
	
	

}
