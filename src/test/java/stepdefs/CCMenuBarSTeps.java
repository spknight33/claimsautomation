package stepdefs;
 
import java.util.Arrays;
import java.util.List;

import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
 
public class CCMenuBarSTeps extends BaseTest	{
	
	
	
	@Given("^I Select New Claim$")
	 public void selectClaimsMenu()
    {
    	
    	menuBarPOM.selectClaimsMenu();
    }

	
    
	@Then("^I will log off$")
	public void i_will_log_off() throws Throwable {
		menuBarPOM.logout();
	}	
   
	@Then("^I will see \"([^\"]*)\" relevant to my \"([^\"]*)\"$")
	public void i_will_see_menus_relevant_to_my_role(String menulist, String role) throws Throwable {

		SoftAssert softAssert = new SoftAssert();
		
		String[] items = menulist.split(",");
	     List<String> list = Arrays.asList(items);

		// loop round list to check menu options is on the page
		for(int i=0; i<list.size(); i++) {
			softAssert.assertTrue(menuBarPOM.menuOnMenuBar(list.get(i)),"For role: "+ role + " Menu item Check: "+ list.get(i));
					
			
		}
		
		softAssert.assertAll();
		
	}
	
	

@Then("^I will not see \"([^\"]*)\" which are not relevant to my \"([^\"]*)\"$")
public void i_will_not_see_which_are_not_relevant_to_my(String menulist, String role) throws Throwable {
SoftAssert softAssert = new SoftAssert();
		
		String[] items = menulist.split(",");
	     List<String> list = Arrays.asList(items);

		// loop round list to check menu options is on the page - dont check for empty entries
		for(int i=0; i<list.size(); i++) {
			
			if ( !list.get(i).isEmpty())
			{
			softAssert.assertTrue(menuBarPOM.menuNotOnMenuBar(list.get(i)),"For role: "+ role + " Menu item Check: "+ list.get(i));
			}
					
			
		}
		
		softAssert.assertAll();
	}
   
 
}