package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLPassengerSteps extends BaseTest {
	
	public void completeFNOLTPPassengerForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerPrefix");
		if (fieldValue !=null)
			fnolNewPassengerPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerFirstName");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerLastName");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerEmail");
		if (fieldValue !=null)
			fnolNewPassengerPOM.setEmail(fieldValue);
		
  
		// add injury if required 
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolNewPassengerPOM.selectInjured(true);
			fnolNewPassengerPOM.selectAddInjury();
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInjDesc");
				if (fieldValue !=null)
					fnolNewPassengerPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInj1BodyArea");
				if (fieldValue !=null)
					fnolNewPassengerPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPPassengerInj1Detailed");
				if (fieldValue !=null)
					fnolNewPassengerPOM.selectDetailedInjury(fieldValue, 1);
		     
		}
		else
		{
			fnolNewPassengerPOM.selectInjured(false);
		}
	
	
		fnolNewPassengerPOM.selectOK();
	}
	
	//TODO PH passnger
	
	
	@Then("^I will be on New Passenger screen for FNOL$")
	public void i_will_be_on_newpassenger_screen_for_FNOL() throws Throwable {
	    fnolNewPassengerPOM.isPageTitleDisplayed("Passenger Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on New Passenger screen on FNOL$")
	public void i_select_from_field_on_passenger_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Passenger Name":
	    	fnolNewPassengerPOM.selectPassengerName(fieldValue);
	    	break;
	       case "Prefix":
	    	fnolNewPassengerPOM.selectPrefix(fieldValue);
	    	break;
	    case "Address Type":
	    	fnolNewPassengerPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	fnolNewPassengerPOM.selectGender(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on passenger screen in FNOL$")
	public void next() {
		
		fnolNewPassengerPOM.selectOK();
	}
	
	
}
