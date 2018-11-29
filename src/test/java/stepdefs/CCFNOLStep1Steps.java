package stepdefs;
 
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
 
public class CCFNOLStep1Steps extends BaseTest	{
	
	
	
	@Given("^I Try All Search Variations$")
public void searchForPolicyByAllVariations() {

		
		// search by EMPTY fields
		// claimCenterFNOLStep1POM.resetSearchPolicy(logger);
		// this causes stale elements - need to find out why

		// search by individual fields
		fnolStep1POM.clearSearchCriteria();
		fnolStep1POM.setSearchPolicyNumber("54-99999");
		fnolStep1POM.searchPolicy();

		fnolStep1POM.clearSearchCriteria();
		fnolStep1POM.setSearchFirstName( "Rayjaybay");
		fnolStep1POM.searchPolicy();

		fnolStep1POM.clearSearchCriteria();
		fnolStep1POM.setSearchLastName( "smithandjones");
		fnolStep1POM.searchPolicy();

		fnolStep1POM.clearSearchCriteria();
		fnolStep1POM.setSearchContactName( "Myorganisation");
		fnolStep1POM.searchPolicy();

		// TODO - policytype
		fnolStep1POM.clearSearchCriteria();
		fnolStep1POM.setSearchLossDate( "01/11/2018");
		fnolStep1POM.searchPolicy();

		// try {
		// Thread.sleep(10);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}
	
	@Given("^I Search For Policy With Default Criteria$")
	public void searchForPolicyDefaultCriteria() {

		
		fnolStep1POM.searchPolicy();

	}

	@Given("^I Select The First Policy$")
	public void selectFirstPolicy() {

		
		fnolStep1POM.selectFirstPolicy();
	}
	
	@Given("^I Set the lossdate to \"([^\"]*)\"$")
	public void setLossDate(String date)
	{
		
		fnolStep1POM.setLossDate( date);
	}

	@Given("^I click reset button on step1$")
	public void resetPolicySearch() {
		
		fnolStep1POM.resetSearchPolicy();
	}
	
	@Given("^I click next button on step1$")
	public void next()
	{
		
		fnolStep1POM.next();
	}
	

    
    	
   
    
 
   
 
}