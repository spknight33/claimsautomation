package stepdefs.fnol;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCFNOLCompanyContactSteps extends BaseTest {
	
	
	public void completeFNOLClaimReporterForTestScenario()
	{
		
		String fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterCompanyname");
		if (fieldValue !=null)
			companyContactDetailsPOM.setCompanyName(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterCompanyWorkphone");
		if (fieldValue !=null)
			companyContactDetailsPOM.setWorkPhone(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterCompanyMobile");
		if (fieldValue !=null)
			companyContactDetailsPOM.setMobile(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterCompanyEmail");
		if (fieldValue !=null)
			companyContactDetailsPOM.setEmail(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterCompanyLocationDesc");
		if (fieldValue !=null)
			companyContactDetailsPOM.setLocationDesc(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterCompanyAddressLine1");
		if (fieldValue !=null)
			companyContactDetailsPOM.setAddressLine1(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_ClaimReporterCompanyNotes");
		if (fieldValue !=null)
			companyContactDetailsPOM.setNotes(fieldValue);
		
	
    	companyContactDetailsPOM.selectUpdate();
	}
	
	
	@Then("^I will be on the new company contact screen$")
	public void i_will_be_on_companycontact_screen() throws Throwable {
	    companyContactDetailsPOM.isPageTitleDisplayed("New Company");
	}

	
	@Given("^I select \"([^\"]*)\" on company details screen$")
	public void i_select_on_companydetails_screen(String button) throws Throwable {
		switch(button)
	    {
	    case "Update":
	    	companyContactDetailsPOM.selectUpdate();
	    	break;
	    case "Cancel":
	    	companyContactDetailsPOM.selectCancel();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on company details screen$")
	public void i_select_from_field_on_companydetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		
	    case "Address Type":
	    	companyContactDetailsPOM.selectAddressType(fieldValue);
	    	break;
	    
	   
	    default:
	    Assert.fail("unknown input field :"+ fieldValue+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on company details screen$")
	public void i_input_into_the_box_on_companydetails_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Company Name":
	    	companyContactDetailsPOM.setCompanyName(fieldValue);
	    	break;
	    case "Work Phone":
	    	companyContactDetailsPOM.setWorkPhone(fieldValue);
	    	break;
	    case "Mobile":
	    	companyContactDetailsPOM.setMobile(fieldValue);
	    	break;
	    case "Email":
	    	companyContactDetailsPOM.setEmail(fieldValue);
	    	break;
	    case "Address Line1":
	    	companyContactDetailsPOM.setAddressLine1(fieldValue);
	    	break;
	    case "Address Line2":
	    	companyContactDetailsPOM.setAddressLine2(fieldValue);
	    	break;
	    case "Address Line3":
	    	companyContactDetailsPOM.setAddressLine3(fieldValue);
	    	break;
	    case "City":
	    	companyContactDetailsPOM.setCity(fieldValue);
	    	break;
	    case "Postcode":
	    	companyContactDetailsPOM.setPostCode(fieldValue);
	    	break;
	    case "Location Desc":
	    	companyContactDetailsPOM.setLocationDesc(fieldValue);
	    	break;
	    	
	    case "Notes":
	    	companyContactDetailsPOM.setNotes(fieldValue);
	    	break;
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	

}
