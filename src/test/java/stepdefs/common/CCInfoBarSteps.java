package stepdefs.common;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;

public class CCInfoBarSteps extends BaseTest {

	
	
	@Given("^I will see \"([^\"]*)\" in field \"([^\"]*)\" on Claim Info Bar$")
	public void i_will_see_field_value(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Status":
	    	Assert.assertEquals(infoBarPOM.getClaimStatusText(),fieldValue);
	    	break;
	    case "Adjuster":
	    	Assert.assertTrue(infoBarPOM.getClaimAdjusterText().contains(fieldValue),"Could not find the adjuster text:"+fieldValue+" in infobar");
	    	break;
	    	//TODO the rest
	    default:
		    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
		    }
	}
	
	

	



}