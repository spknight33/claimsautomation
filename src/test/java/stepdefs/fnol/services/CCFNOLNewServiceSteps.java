package stepdefs.fnol.services;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.SearchAddressBookSteps;

public class CCFNOLNewServiceSteps extends BaseTest {
	
	SearchAddressBookSteps searchAddressBook = new SearchAddressBookSteps();
	
	@Then("^I will see FNOL New Service screen$")
	public void i_will_see_post_FNOL_service_details() throws Throwable {
		fnolNewServicePOM.isPageTitleDisplayed("Create Service");
	}
	
	public void completeFNOLOtherServiceForTestScenario()  throws Throwable
	{
		String fieldValue=null;
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceRelatedTo");
		if (fieldValue !=null )
		{
			fnolNewServicePOM.selectRelatedTo(fieldValue);
	
		}
		
		fnolNewServicePOM.clickAddService();
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceToPerformFilter");
		if (fieldValue !=null )
		{
			fnolNewServicePOM.setFilterText(fieldValue);
			fnolNewServicePOM.clickFilterService();
		}
		fnolNewServicePOM.selectServiceToAdd(); // just get the first for now
		fnolNewServicePOM.clickAddSelectedService();
		
		// back on create claim screen now
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceRequestType");
		if (fieldValue !=null )
		{
			fnolNewServicePOM.selectRequestType(fieldValue);
	
		}
		
		fnolNewServicePOM.selectSearchVendor();
		// ON addressbook search - just select the first
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceVendorSearch");
		if (fieldValue !=null )
		{
			searchAddressBook.searchForVendorAndSelectFirst(fieldValue);
	
		}
		else
		{
			searchAddressBook.searchForVendorAndSelectFirst();
		}
		
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceAddInstructions");
		if (fieldValue !=null )
		{
			fnolNewServicePOM.setAdditionalInstructions(fieldValue);
	
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceRequestedCompletionDate");
		if (fieldValue !=null )
		{
			fnolNewServicePOM.setRquestedCompletionDate(fieldValue);
	
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceCustomerContact");
		if (fieldValue !=null )
		{
			fnolNewServicePOM.selectCustomerContact(fieldValue);
	
		}
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_OtherServiceAddress");
		if (fieldValue !=null )
		{
			fnolNewServicePOM.selectServiceAddress(fieldValue);
	
		}
		
		fnolNewServicePOM.ok();
		
		
	}
	
	@Given("^I click ok button on New Service screen for FNOL$")
	public void submit() {
		
		fnolNewServicePOM.ok();
	}
	
	@Given("^I click Search Vendor on New Service screen for FNOL$")
	public void searchVendor() {
		
		fnolNewServicePOM.selectSearchVendor();
	}
	
	@Given("^I click Add Service to Perform on New Service screen for FNOL$")
	public void addServiceToPerform() {
		
		fnolNewServicePOM.clickAddService();
	}
	
	@Given("^I filter and select service \"([^\"]*)\" on New Service screen for FNOL$")
	public void i_filterandselect_service_screen(String fieldValue) throws Throwable {
		fnolNewServicePOM.setFilterText(fieldValue);
		fnolNewServicePOM.clickFilterService();
		fnolNewServicePOM.selectServiceToAdd();
		fnolNewServicePOM.clickAddSelectedService();
		
	}
	
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" on New Service screen for FNOL$")
	public void i_select_from_field_on_service_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Related To":
			fnolNewServicePOM.selectRelatedTo(fieldValue);
		    	break;
		case "Request Type":
			fnolNewServicePOM.selectRequestType(fieldValue);
		    	break;
		case "Customer Contact":
			fnolNewServicePOM.selectCustomerContact(fieldValue);
		    	break;
		case "Service Address":
			fnolNewServicePOM.selectServiceAddress(fieldValue);
		    	break;
	
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on New Service screen for FNOL$")
	public void i_input_into_the_box_on_service_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
	
		case "Additional":
			fnolNewServicePOM.setAdditionalInstructions(fieldValue);
			break;
		case "Completion Date":
			fnolNewServicePOM.setRquestedCompletionDate(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
}
