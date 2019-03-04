package stepdefs.common;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchChequesSteps extends BaseTest {
	
	
	
	
	@Then("^I will be on the search Cheques screen$")
	public void i_will_be_on_search_cheques_screen() throws Throwable {
	    searchChequesPOM.isPageTitleDisplayed("Search Cheques");
	}
	

	
	@Given("^I select \"([^\"]*)\" on search Cheques screen$")
	public void i_select_on_search_cheques_screen(String button) throws Throwable {
		switch(button)
	    {
	 
	   case "Search":
	    	searchChequesPOM.selectSearch();
	    	break;
	
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on search Cheques screen$")
	public void i_input_into_the_box_on_search_chequesk_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Claim Number":
	    	//searchChequesPOM.setChequeNumber(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" from field \"([^\"]*)\" on search Cheques screen$")
	public void i_select_from_field_on_searchcheques_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Cheque Status":
			searchChequesPOM.selectChequeStatus(fieldValue);
			break;
		case "Include Child Groups":
			if (fieldValue.equalsIgnoreCase("Yes"))
			searchChequesPOM.selectIncludeChildGroups(true);
			else
				searchChequesPOM.selectIncludeChildGroups(false);
			break;
	

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	
	@Given("^I search for \"([^\"]*)\" field \"([^\"]*)\" on search Cheques screen$")
	public void i_searchfor_field_on_searchcheques_screen(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Approved By Group":
			searchChequesPOM.searchForApprovedByGroup();
			// now fill in the search page
			break;
		
	

		default:
			Assert.fail("unknown input field :" + fieldValue + " - check cucumber script!");
		}
	}
	
	
	
	
	
	
	@Then("^I select the first item on search results Cheque screen$")
	public void i_select_the_first_item_on_search_results_cheques_screen() throws Throwable {
		searchChequesPOM.selectFirstResult();
	}
	
	
	
	

}
