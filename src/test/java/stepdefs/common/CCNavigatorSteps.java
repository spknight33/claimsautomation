package stepdefs.common;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCNavigatorSteps extends BaseTest {

	
	@Given("^I select \"([^\"]*)\" on the Claim Navigator$")
	public void i_select_on_the_Claim_Navigator(String link) throws Throwable {
	    
		
		switch(link)
	    {
	    case "Loss Details":
	    	navigatorBarPOM.clickTopLevel("Loss Details");;
	    	break;
	    case "Summary":
	    	navigatorBarPOM.clickTopLevel("Summary");;
	    	break;
	    case "Workplan":
	    	navigatorBarPOM.clickTopLevel("Workplan");;
	    	break;
	    case "Exposures":
	    	navigatorBarPOM.clickTopLevel("Exposures");;
	    	break;
	    case "Parties Involved":
	    	navigatorBarPOM.clickTopLevel("Parties Involved");;
	    	break;
	    case "Policy":
	    	navigatorBarPOM.clickTopLevel("Policy");;
	    	break;
	    	
	    	//TODO the rest
	   
	    default:
	    Assert.fail("unknown field :"+ link+" - check cucumber script!");
	    }
	}
	
	@Given("^I select \"([^\"]*)\" on the Desktop Navigator$")
	public void i_select_on_the_Desktop_Navigator(String link) throws Throwable {
	    
		
		switch(link)
	    {
	    case "Activities":
	    	navigatorBarPOM.clickDesktopTopLevel("Activities");;
	    	break;
	    case "Claims":
	    	navigatorBarPOM.clickDesktopTopLevel("Claims");;
	    	break;
	    case "Queues":
	    	navigatorBarPOM.clickDesktopTopLevel("Queues");;
	    	break;
	    case "Subrogations":
	    	navigatorBarPOM.clickDesktopTopLevel("Subrogations");;
	    	break;
	    case "Exposures":
	    	navigatorBarPOM.clickDesktopTopLevel("Exposures");;
	    	break;
	    
	    	
	    	//TODO the rest
	   
	    default:
	    Assert.fail("unknown field :"+ link+" - check cucumber script!");
	    }
	}
	
	@When("^I select the Actions Popup Menu Hierarchy \"([^\"]*)\"$")
	public void i_select_the_Actiuons_Popup_Menu_Hierarchy(String menulist) throws Throwable {
		String[] items = menulist.split(",");
		List<String> list = Arrays.asList(items);
		navigatorBarPOM.selectActionsSubMenuHierarchy(list);
	}

}