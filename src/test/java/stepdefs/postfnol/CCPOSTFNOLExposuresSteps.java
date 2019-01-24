package stepdefs.postfnol;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.config.UserToGroupMap;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CCPOSTFNOLExposuresSteps extends BaseTest {
	
	
	@Then("^I will see post FNOL exposures screen$")
	public void i_will_see_post_FNOL_exposurescreen() throws Throwable {
		postFnolExposuresPOM.isPageTitleDisplayed("Exposures");
	}
	
	
	
	@When("^I select the \"([^\"]*)\" exposure on the post FNOL exposures screen$")
	public void i_select_the_exposure_on_the_post_FNOL_exposures_screen(String type) throws Throwable {
		postFnolExposuresPOM.selectExposureOfType(type);
	}
	

	
	@Given("^I will see type \"([^\"]*)\" for coverage \"([^\"]*)\" has been assigned to a user in group \"([^\"]*)\"$")
	public void i_will_see_type_for_coverage_has_been_assigned_to_a_user_in_group(String type, String coverage, String group) throws Throwable {
	   
		String handler = postFnolExposuresPOM.getHandlerForExposure(type, coverage);
	   
	    // fail if handler not found
		Assert.assertNotNull(handler,"Cannot find exposure in exposure table");
	   
		Assert.assertTrue(UserToGroupMap.getGroupForUser(handler).equalsIgnoreCase(group),"Not in expected group:"+group);
	   // A handler will belong to a group
	}
	
	@Given("^I will see type \"([^\"]*)\" for coverage \"([^\"]*)\" has been assigned to a user in group \"([^\"]*)\" for Claimant \"([^\"]*)\"$")
	public void i_will_see_type_for_coverage_has_been_assigned_to_a_user_in_group_for_Claimant(String type, String coverage, String group, String claimant) throws Throwable {
		String handler = postFnolExposuresPOM.getHandlerForExposure(type, coverage);
		   
	    // fail if handler not found
		Assert.assertNotNull(handler,"Cannot find exposure in exposure table");
  		Assert.assertTrue(UserToGroupMap.getGroupForUser(handler).equalsIgnoreCase(group),"Not in expected group:"+group);
	   // A handler will belong to a group
		
  		String expClaimant = postFnolExposuresPOM.getClaimantForExposure(type, coverage);
  		Assert.assertNotNull(expClaimant,"Cannot find exposure in exposure table");
  		
  		
  		// detemrine which claimant type to check against
  		String fieldValue=null;
  		switch (claimant)
  		{
  		case ("TP Driver"):
  			fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverFullName");
  		    Assert.assertTrue(expClaimant.equalsIgnoreCase(fieldValue),"expected claimant to be :"+fieldValue+" but was:"+expClaimant);
  			break;
  		case ("PH Driver"):
  			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverFullName");
  		    Assert.assertTrue(expClaimant.equalsIgnoreCase(fieldValue),"expected claimant to be :"+fieldValue+" but was:"+expClaimant);
  			break;
  		case ("Pedestrian"):
  			fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianFullName");
  		    Assert.assertTrue(expClaimant.equalsIgnoreCase(fieldValue),"expected claimant to be :"+fieldValue+" but was:"+expClaimant);
  			break;
  		case ("TP Passenger"):
  			fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerFullName");
  		    Assert.assertTrue(expClaimant.equalsIgnoreCase(fieldValue),"expected claimant to be :"+fieldValue+" but was:"+expClaimant);
  			break;
  		case ("PH Passenger"):
  			fieldValue = ExcelUtil.getTestDataValue("Fnol_PHPassengerFullName");
  		    Assert.assertTrue(expClaimant.equalsIgnoreCase(fieldValue),"expected claimant to be :"+fieldValue+" but was:"+expClaimant);
  			break;
  		
  		}
  		
  		
  		
  		
		
	}

	
	
	

}
