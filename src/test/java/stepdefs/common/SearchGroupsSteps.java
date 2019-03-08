package stepdefs.common;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchGroupsSteps extends BaseTest {
	
	
	
	
	@Then("^I will be on the search Groups screen$")
	public void i_will_be_on_search_groups_screen() throws Throwable {
	    searchGroupsPOM.isPageTitleDisplayed("Search Groups");
	}
	

	
	@Given("^I select \"([^\"]*)\" on search Groups screen$")
	public void i_select_on_search_groups_screen(String button) throws Throwable {
		switch(button)
	    {
	 
	   case "Search":
		   searchGroupsPOM.selectSearch();
	    	break;
	
	  
	    default:
	    Assert.fail("unknown input field :"+ button+" - check cucumber script!");
	    }
	}
	
	
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on search Groups screen$")
	public void i_input_into_the_box_on_search_groups_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "Group Name":
	    	searchGroupsPOM.setGroupName(fieldValue);
	    	break;
	  
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	
	
	
	
	
	
	@Then("^I select the first item on search results Groups screen$")
	public void i_select_the_first_item_on_search_results_groups_screen() throws Throwable {
		searchGroupsPOM.selectFirstResult();
	}
	
	
	
	

}
