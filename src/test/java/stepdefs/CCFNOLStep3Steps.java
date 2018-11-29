package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;

public class CCFNOLStep3Steps extends BaseTest {

	

	public void mandatoryFieldErrorMessagesAreShown() {
		this.next();
		// in step 3, check error messages
		Assert.assertTrue(fnolStep3POM.containsErrorMessage("Incident Type : Missing required field \"Incident Type\""));
		Assert.assertTrue(fnolStep3POM
				.containsErrorMessage("Cause : Missing required field \"Cause\""));
		Assert.assertTrue(fnolStep3POM
				.containsErrorMessage("Sub Cause : Missing required field \"Sub Cause\""));
	}

	public void setIncidentOnly() {

		fnolStep3POM.selectIncidentOnlyCB();

	}

	public void unselectIncidentOnly() {

		fnolStep3POM.deselectIncidentOnlyCB();

	}

	@Given("^I click next button on step3$")
	public void next() {
		
		fnolStep3POM.next();
	}

	@Given("^I click previous button on step3$")
	public void previous() {
		
		fnolStep3POM.back();
	}
	
	@Given("^I click cancel button on step3$")
	public void cancel() {
	
		fnolStep3POM.cancel();
	}
	
	@Given("^I click finish button on step3$")
	public void finish() {
		
		fnolStep3POM.finish();
	}
	
	@Given("^I click add Vehicle on step3$")
	public void addVehicle() {
	
		fnolStep3POM.addVehicle();
	}
	
	@Given("^I click add Pedestrian on step3$")
	public void addPedestrian() {
	
		fnolStep3POM.addPedestrian();
	}
	
	@Given("^I click add Property Damage on step2$")
	public void addPropertyDamage() {
		
		fnolStep3POM.addPropertyDamage();
	}
	
	
	
	public void setCircumstances(String circumstances)
	{
		
		fnolStep3POM.setCircumstancesValue(circumstances);
	}
	

}
