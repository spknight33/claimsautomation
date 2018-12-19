package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLLossDetailsSteps extends BaseTest {
	
	
	
	@Then("^I will see post FNOL loss details$")
	public void i_will_see_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.isPageTitleDisplayed("Loss Details");
	}
	
	@Given("^I click edit button on post FNOL loss details$")
	public void edit() {
		
		postFnolLossDetailsPOM.edit();
	}
	@Given("^I click update button on post FNOL loss details$")
	public void update() {
		
		postFnolLossDetailsPOM.update();
	}
	
	@Given("^I click add Vehicle on post FNOL loss details$")
	public void addVehicle() {
		
		postFnolLossDetailsPOM.addVehicle();
	}
	
	@Given("^I click add Property Damage on post FNOL loss details$")
	public void addPropertyDamage() {
		
		postFnolLossDetailsPOM.addPropertyDamage();
	}
	
	@Given("^I click add Injury on post FNOL loss details$")
	public void addInjury() {
		
		postFnolLossDetailsPOM.addInjury();
	}
	
	

}
