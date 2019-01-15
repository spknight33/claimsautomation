package stepdefs;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLPedestrianSteps extends BaseTest {
	
	public void completeFNOLPedestrianForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianPrefix");
		if (fieldValue !=null)
			fnolPedestrianPOM.selectPrefix(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianFirstName");
		if (fieldValue !=null)
			fnolPedestrianPOM.setFirstName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianLastName");
		if (fieldValue !=null)
			fnolPedestrianPOM.setLastName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianEmail");
		if (fieldValue !=null)
			fnolPedestrianPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianMobile");
		if (fieldValue !=null)
			fnolPedestrianPOM.setMobile(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianNotes");
		if (fieldValue !=null)
			fnolPedestrianPOM.setNotes(fieldValue);
		
			
		fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInjured");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolPedestrianPOM.selectInjured(true);
			fnolPedestrianPOM.selectAddInjury();
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInjDesc");
			if (fieldValue !=null)
				fnolPedestrianPOM.setInjuryDesc(fieldValue);
			 
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInj1BodyArea");
				if (fieldValue !=null)
					fnolPedestrianPOM.selectAreaOfBody(fieldValue, 1);
				fieldValue = ExcelUtil.getTestDataValue("Fnol_PedestrianInj1Detailed");
				if (fieldValue !=null)
					fnolPedestrianPOM.selectDetailedInjury(fieldValue, 1);
		     
		}
		else
		{
			fnolPedestrianPOM.selectInjured(false);
		}
	
		fnolPedestrianPOM.selectOK();
		
	}
	
	@Then("^I will be on pedestrian screen for FNOL$")
	public void i_will_be_on_pedestrian_screen_for_FNOL() throws Throwable {
		fnolPedestrianPOM.isPageTitleDisplayed("Pedestrian Details");
	}

	
	@Given("^I select \"([^\"]*)\" on pedestrian details screen for FNOL$")
	public void i_select_on_pedestriandetails_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Ok":
	    	fnolPedestrianPOM.selectOK();
	    	break;
	    case "Cancel":
	    	fnolPedestrianPOM.selectCancel();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on pedestrian details screen for FNOL$")
	public void i_select_from_field_on_pedestriandetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Prefix":
			fnolPedestrianPOM.selectPrefix(fieldValue);
		    	break;
	    case "Address Type":
	    	fnolPedestrianPOM.selectAddressType(fieldValue);
	    	break;
	    
	   //TODO
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on pedestrian details screen for FNOL$")
	public void i_input_into_the_box_on_pedestriandetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "First Name":
	    	fnolPedestrianPOM.setFirstName(fieldValue);
	    	break;
	    case "Last Name":
	    	fnolPedestrianPOM.setLastName(fieldValue);
	    	break;
	    case "Mobile":
	    	fnolPedestrianPOM.setMobile(fieldValue);
	    	break;
	    case "Email":
	    	fnolPedestrianPOM.setEmail(fieldValue);
	    	break;
	    case "Address Line1":
	    	fnolPedestrianPOM.setAddressLine1(fieldValue);
	    	break;
	    case "Address Line2":
	    	fnolPedestrianPOM.setAddressLine2(fieldValue);
	    	break;
	    case "Address Line3":
	    	fnolPedestrianPOM.setAddressLine3(fieldValue);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	

	@Given("^I complete fields on FNOL new pedestrian incident$")
	public void i_complete_all_fields() throws Throwable {
		
		fnolPedestrianPOM.setAddressLine1("1 Walkers Road");
		fnolPedestrianPOM.setFirstName("Jock");
		fnolPedestrianPOM.setLastName("JayWalker");
		
	
		fnolPedestrianPOM.selectOK();
		
	}

}
