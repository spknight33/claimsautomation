package stepdefs;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCNavigatorSteps extends BaseTest {

	
	@Given("^I select \"([^\"]*)\" on the Claim Navigator$")
	public void i_select_on_the_Claim_Navigator(String link) throws Throwable {
	    
		
		switch(link)
	    {
	    case "Loss Details":
	    	navigatorBarPOM.clickTopLevelLossDetails("Loss Details");;
	    	break;
	    case "Summary":
	    	navigatorBarPOM.clickTopLevelLossDetails("Summary");;
	    	break;
	    case "Workplan":
	    	navigatorBarPOM.clickTopLevelLossDetails("Workplan");;
	    	break;
	    case "Exposures":
	    	navigatorBarPOM.clickTopLevelLossDetails("Exposures");;
	    	break;
	    case "Parties Involved":
	    	navigatorBarPOM.clickTopLevelLossDetails("Parties Involved");;
	    	break;
	    case "Policy":
	    	navigatorBarPOM.clickTopLevelLossDetails("Policy");;
	    	break;
	    	
	    	//TODO the rest
	   
	    default:
	    Assert.fail("unknown search field :"+ link+" - check cucumber script!");
	    }
	}

}