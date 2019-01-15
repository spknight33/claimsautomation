package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLDriverSteps extends BaseTest {
	
	public void completeFNOLTPDriverForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverPrefix");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverFirstName");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverLastName");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverEmail");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setEmail(fieldValue);
		
  
		// add injury if required 
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			 fnolDriverDetailsPOM.selectInjured(true);
			 fnolDriverDetailsPOM.selectAddInjury();
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInjDesc");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInj1BodyArea");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverInj1Detailed");
				if (fieldValue !=null)
				     fnolDriverDetailsPOM.selectDetailedInjury(fieldValue, 1);
		     
		}
		else
		{
			fnolDriverDetailsPOM.selectInjured(false);
		}
	
	
		fnolDriverDetailsPOM.selectOK();
	}
	
	public void completeFNOLPHDriverForTestScenario()
	{
		if (ExcelUtil.getTestDataValue("Fnol_PHDriverIsInsuredPerson").equalsIgnoreCase("TRUE"))
		{
		     fnolDriverDetailsPOM.selectDriverName(ExcelUtil.getTestDataValue("Fnol_Name"));
		}
		//TODO else - create a new driver
	
		// add injury if required 
				String fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjured");
				if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
				{
					 fnolDriverDetailsPOM.selectInjured(true);
					 fnolDriverDetailsPOM.selectAddInjury();
					 
					 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInjDesc");
						if (fieldValue !=null)
						     fnolDriverDetailsPOM.setInjuryDesc(fieldValue);
					 
					 fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInj1BodyArea");
						if (fieldValue !=null)
						     fnolDriverDetailsPOM.selectAreaOfBody(fieldValue, 1);
						fieldValue = ExcelUtil.getTestDataValue("Fnol_PHDriverInj1Detailed");
						if (fieldValue !=null)
						     fnolDriverDetailsPOM.selectDetailedInjury(fieldValue, 1);
				     
				}
				else
				{
					fnolDriverDetailsPOM.selectInjured(false);
				}
	
		fnolDriverDetailsPOM.selectOK();
	}
	
	
	@Then("^I will be on Driver screen for FNOL$")
	public void i_will_be_on_driver_screen_for_FNOL() throws Throwable {
	    fnolDriverDetailsPOM.isPageTitleDisplayed("Driver Details");
	}

	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on driver screen$")
	public void i_select_from_field_on_driver_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
	    case "Driver Name":
	    	fnolDriverDetailsPOM.selectDriverName(fieldValue);
	    	break;
	    case "Related To":
	    	fnolDriverDetailsPOM.selectRelationToOwner(fieldValue);
	    	break;
	    case "Prefix":
	    	fnolDriverDetailsPOM.selectPrefix(fieldValue);
	    	break;
	    case "Address Type":
	    	fnolDriverDetailsPOM.selectAddressType(fieldValue);
	    	break;
	    case "Gender":
	    	fnolDriverDetailsPOM.selectGender(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I click ok button on driver screen$")
	public void next() {
		
		fnolDriverDetailsPOM.selectOK();
	}
	
	@Given("^I complete fields on FNOL new TP driver incident$")
	public void i_complete_all_fields() throws Throwable {
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverPrefix");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverFirstName");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_TPDriverLastName");
		if (fieldValue !=null)
		     fnolDriverDetailsPOM.setLastName(fieldValue);
		
		
	
		fnolDriverDetailsPOM.selectOK();
		
	}
}
