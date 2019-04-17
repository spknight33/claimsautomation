package stepdefs.postfnol.lossdetails.general;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.postfnol.common.CCPOSTFNOLCompanyContactSteps;
import stepdefs.postfnol.common.CCPOSTFNOLPersonContactSteps;

public class CCPOSTFNOLEditPropertySteps extends BaseTest {
	
	CCPOSTFNOLPersonContactSteps personContactSteps = new CCPOSTFNOLPersonContactSteps();
	CCPOSTFNOLCompanyContactSteps companyContactSteps = new CCPOSTFNOLCompanyContactSteps();
	
	
	@Then("^I will be on edit property screen on post FNOL$")
	public void i_will_see_post_FNOL_editproperty_details() throws Throwable {
		postFnolEditPropertyPOM.isPageTitleDisplayed("Property Incident");
	}
	
	
	@Given("^I click \"([^\"]*)\" on edit property screen on post FNOL$")
	public void i_click_on_edit_property_screen(String button) throws Throwable {
		switch (button) {
		case "Update":
			postFnolEditPropertyPOM.update();
			break;
		case "Ok":
			postFnolEditPropertyPOM.ok();
			break;
		case "Cancel":
			postFnolEditPropertyPOM.cancel();
			break;
		case "New Person Owner":
			postFnolEditPropertyPOM.selectNewOwnerPerson();
			break;
		case "New Company Owner":
			postFnolEditPropertyPOM.selectNewOwnerCompany();
			break;
		
		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on edit property screen on post FNOL$")
	public void i_select_from_field_on_edit_property_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Postcode Address":
			postFnolEditPropertyPOM.selectPostcodeAddress(fieldValue);
			break;
			
		case "Property Owner":
			postFnolEditPropertyPOM.selectPropertyOwner(fieldValue);
			break;
			
		case "Estimate Received":
			postFnolEditPropertyPOM.selectEstimateReceived(fieldValue);
			break;
			
		case "Already Repaired":
			if (fieldValue.equalsIgnoreCase("Yes"))
				postFnolEditPropertyPOM.selectAlreadyRepaired(true);
			else
				postFnolEditPropertyPOM.selectAlreadyRepaired(false);
			break;
		

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on edit property screen on post FNOL$")
	public void i_input_into_the_box_on_edit_property_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Property Description":
			postFnolEditPropertyPOM.setPropertyDesc(fieldValue);
			break;
		case "Damage Description":
			postFnolEditPropertyPOM.setDamageDesc(fieldValue);
			break;
		case "Loss Estimate":
			postFnolEditPropertyPOM.setLossEstimate(fieldValue);
			break;
		case "Damage Extent":
			postFnolEditPropertyPOM.setExtentDamage(fieldValue);
			break;
		case "Address Line1":
			postFnolEditPropertyPOM.setAddressLine1(fieldValue);
			break;
		case "Address Line2":
			postFnolEditPropertyPOM.setAddressLine2(fieldValue);
			break;
		case "Address Line3":
			postFnolEditPropertyPOM.setAddressLine3(fieldValue);
			break;
		case "City":
			postFnolEditPropertyPOM.setCity(fieldValue);
			break;
		case "Postcode":
			postFnolEditPropertyPOM.setPostcode(fieldValue);
			break;
		case "Location Description":
			postFnolEditPropertyPOM.setLocationDescription(fieldValue);
			break;
		case "Estimated Repair Cost":
			postFnolEditPropertyPOM.setEstimatedRepairCost(fieldValue);
			break;
		case "Estimated Repair Time":
			postFnolEditPropertyPOM.setEstimatedRepairTime(fieldValue);
			break;
	
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	
	
	
	
	

}
