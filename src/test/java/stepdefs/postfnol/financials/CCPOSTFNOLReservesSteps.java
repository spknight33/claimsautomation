package stepdefs.postfnol.financials;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CCPOSTFNOLReservesSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL Reserves screen$")
	public void i_will_see_post_FNOL_reservesscreen() throws Throwable {
		postFnolSetReservesPOM.isPageTitleDisplayed("Reserves and Recovery Reserves");
	}
	
	
	@When("^I click \"([^\"]*)\" on post FNOL Reserves screen$")
	public void i_click_edit_onpost_FNOL_reserves(String fieldName) throws Throwable {
		switch (fieldName) {
		case "edit":
			postFnolSetReservesPOM.edit();
			break;
		case "save":
			postFnolSetReservesPOM.save();
			break;
		case "cancel":
			postFnolSetReservesPOM.cancel();
			break;
		case "add":
			postFnolSetReservesPOM.add();
			break;
		case "add recovery reserve":
			postFnolSetReservesPOM.addRecoveryReserve();
			break;
		
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
		
	}
	
	

}
