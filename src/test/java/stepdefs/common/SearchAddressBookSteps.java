package stepdefs.common;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchAddressBookSteps extends BaseTest {
	
	
	
	
	@Then("^I will be on the search address book screen$")
	public void i_will_be_on_search_address_book_screen() throws Throwable {
	    searchAddressBookPOM.isPageTitleDisplayed("Search Address Book");
	}
	
	@Then("^I will be on the search address book screen for Vendors$")
	public void i_will_be_on_search_address_book_screen_for_vendors() throws Throwable {
	    searchAddressBookPOM.isPageTitleDisplayed("Search Address Book For Vendors");
	}

	
	@Given("^I select \"([^\"]*)\" on search address book screen$")
	public void i_select_on_search_address_book_screen(String button) throws Throwable {
		switch(button)
	    {
	   case "Cancel":
	    	searchAddressBookPOM.selectCancel();
	    	break;
	   case "Search":
	    	searchAddressBookPOM.selectSearch();
	    	break;
	   case "Select First Result":
	    	searchAddressBookPOM.selectFirstResult();
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on search address book screen$")
	public void i_input_into_the_box_on_search_address_book_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Search Name":
	    	searchAddressBookPOM.setSearchName(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Then("^I select the first item on search results address book screen$")
	public void i_select_the_first_item_on_search_results_address_book_screen() throws Throwable {
		searchAddressBookPOM.selectFirstResult();
	}
	
	// to be called from other steps directly
	public void searchForContactAndSelectFirst(String type, String name)
	{
		searchAddressBookPOM.selectSearchType(type);
		searchAddressBookPOM.setSearchName(name);
		searchAddressBookPOM.selectSearch();
		searchAddressBookPOM.selectFirstResult();
	}
	
	// to be called from other steps directly
		public void searchForVendorAndSelectFirst()
		{
			searchAddressBookPOM.selectSearch();
			searchAddressBookPOM.selectFirstResult();
		}
		
		public void searchForVendorAndSelectFirst(String name)
		{
			searchAddressBookPOM.setSearchName(name);
			searchAddressBookPOM.selectSearch();
			searchAddressBookPOM.selectFirstResult();
		}
	

}
