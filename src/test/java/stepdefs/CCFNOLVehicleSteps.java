package stepdefs;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLVehicleSteps extends BaseTest {
	
	
	
	
	@Then("^I will be on vehicle screen for FNOL$")
	public void i_will_be_on_vehicle_screen_for_FNOL() throws Throwable {
	    vehicleDetailsPOM.isPageTitleDisplayed("Vehicle Details");
	}

	
	
}