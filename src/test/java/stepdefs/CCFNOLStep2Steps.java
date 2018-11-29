package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;

public class CCFNOLStep2Steps extends BaseTest{

	
	
	public void mandatoryFieldErrorMessagesAreShown() {
		this.next();
		// in step 2, check error messages
		Assert.assertTrue(fnolStep2POM.containsErrorMessage("Name : Missing required field \"Name\""));
		Assert.assertTrue(fnolStep2POM
				.containsErrorMessage("Relation to Insured : Missing required field \"Relation to Insured\""));
	}

	@Given("^I select first insured vehicle on step2$")
	public void selectFirstInsuredVehicle() {

		fnolStep2POM.selectVehicleCB();

	}

	@Given("^I deselect insured vehicle on step2$")
	public void unselectFirstInsuredVehicle() {

		fnolStep2POM.deselectVehicleCB();

	}

	@Given("^I click next button on step2$")
	public void next() {
		
		fnolStep2POM.next();
	}

	@Given("^I click previous button on step2$")
	public void previous() {
		
		fnolStep2POM.back();
	}
	
	public void setReportedDate(String date)
	{
		
		fnolStep2POM.setReportedDateValue("21/11/2018");
	}
	
	public void setHowReported(String how)
	{
		
		fnolStep2POM.setHowReportedValue(how);
	}
	
	public void setReportedName(String name)
	{
		
		fnolStep2POM.setReportedByValue( name);
	}
	
	public void setReportedByRelationship(String relationship)
	{
		
		fnolStep2POM.setReportedByRelationship(relationship);
	}
	
	//temp
	public void clickNamePicker()
	{
		
		fnolStep2POM.clickNamePicker();
	}
	

}
