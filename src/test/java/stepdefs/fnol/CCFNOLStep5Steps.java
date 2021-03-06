package stepdefs.fnol;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCFNOLStep5Steps extends BaseTest{
	
	CCFNOLStep4Steps step4Steps = new CCFNOLStep4Steps();
	
	
	/**
	 * for use by regression scripts
	 * @param scenarioData
	 * @throws Throwable
	 */
	public void completeFNOLStep5ForTestScenario()  throws Throwable
	{
		
		String fieldValue=null;
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step5_Notes");
		
		String note = fieldValue +" - This Claim created by automated regression script using Excel file:"+BaseTest.testDataExcelFilename+ " and Excel sheet:"+ExcelUtil.testDataExcelSheet;
		
		fnolStep5POM.setNote(note);
		

		fnolStep5POM.finish();
		fnolClaimSavedPOM.isPageTitleDisplayed("New Claim Saved");
		String message = fnolClaimSavedPOM.getClaimNumberMessage();
		System.out.println(message);
	}
	
	@Given("^As a \"([^\"]*)\" I am at step5 for FNOL$")
	public void as_a_ClaimsHandler_I_am_at_step5_for_FNOL(String userType) throws Throwable {
		step4Steps.as_a_user_I_am_at_step4_for_FNOL(userType);
		step4Steps.completeFNOLStep4ForTestScenario();
	
	}
	
	@Then("I complete step5 for FNOL$")
	public void iCompleteStep5FNOL() throws Throwable 
	{
		completeFNOLStep5ForTestScenario();
		
	}
	
	@Then("^I will be on step5 for FNOL$")
	public void i_will_be_on_step5_for_FNOL() throws Throwable {
		fnolStep5POM.isPageTitleDisplayed("Step 5 of 5: Save and Assign Claim");
	}
	
	
	@When("^I select the Add Exposures Popup Menu Hierarchy \"([^\"]*)\"$")
	public void i_select_the_Add_Exposures_Popup_Menu_Hierarchy(String menulist) throws Throwable {
		String[] items = menulist.split(",");
		List<String> list = Arrays.asList(items);
		fnolStep5POM.selectExposureSubMenuHierarchy(list);
	}

	
	@Then("^Mandatory field error messages will be shown for step5$")
	public void mandatory_field_error_messages_will_be_shown_forstep5(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(fnolStep5POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}

	

	@Given("^I click finish button on step5$")
	public void next() {
		
		fnolStep5POM.finish();
		
	}

	@Given("^I click previous button on step5$")
	public void previous() {
		
		fnolStep5POM.back();
	}
	
	

	

}
