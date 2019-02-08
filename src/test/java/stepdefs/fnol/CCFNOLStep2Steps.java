package stepdefs.fnol;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepdefs.common.CCLoginSteps;
import stepdefs.common.CCMenuBarSTeps;

public class CCFNOLStep2Steps extends BaseTest{
	
	CCLoginSteps loginSteps = new CCLoginSteps();
	CCMenuBarSTeps menuSteps = new CCMenuBarSTeps();
	CCFNOLStep1Steps step1Steps = new CCFNOLStep1Steps();
	CCFNOLPersonContactSteps personContactSteps = new CCFNOLPersonContactSteps();
	CCFNOLCompanyContactSteps companyContactSteps = new CCFNOLCompanyContactSteps();
	
	/**
	 * This method used for regression scripts, driven by scenario data
	 * @param scenarioData
	 * @throws Throwable
	 */
	public void completeFNOLStep2ForTestScenario()  throws Throwable
	{
		String fieldValue=null;
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_HowReported");
		if (fieldValue !=null)
			fnolStep2POM.selectHowReported(fieldValue);
		
		
		// check if new person or new company to be done
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_ReportedByNewPerson");
		String companyValue = ExcelUtil.getTestDataValue("Fnol_Step2_ReportedByNewCompany");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep2POM.selectNewPersonReporter();
			// goes to new contact page
			// on select new person page, complete the details
			   personContactSteps.completeFNOLClaimReporterForTestScenario();
			// must choose the relation   
			   fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_ReportedByNewPersonRelation");  
			   fnolStep2POM.selectRelationToInsured(fieldValue);  
		}
		else if (companyValue !=null && companyValue.equalsIgnoreCase("TRUE")){
			
			fnolStep2POM.selectNewCompanyReporter();
			// goes to new company contact page
			// on select new company page, complete the details
			   companyContactSteps.completeFNOLClaimReporterForTestScenario();
			// must choose the relation   
			   fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_ReportedByNewCompanyRelation");  
			   fnolStep2POM.selectRelationToInsured(fieldValue);  
			
		}
		else {
			fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_ReportedBy");
			if (fieldValue !=null)
				fnolStep2POM.selectReportedByName(fieldValue);
			//dont need to select relation in this case
			
		}
				
		// confirm section
		//------------------
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_Confirm_HasChanges");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
		
			fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_Confirm_Workphone");
			if (fieldValue !=null)
				fnolStep2POM.setWorkPhone(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_Confirm_Homephone");
			if (fieldValue !=null)
				fnolStep2POM.setHomePhone(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_Confirm_Mobile");
			if (fieldValue !=null)
				fnolStep2POM.setMobile(fieldValue);
			
			fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_Confirm_Email");
			if (fieldValue !=null)
				fnolStep2POM.setEmail(fieldValue);
			
			// bug on this - doesnt display unless moved to here!
					fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_Confirm_PhoneType");
					if (fieldValue !=null)
						fnolStep2POM.selectPhoneType(fieldValue);
		}
		
		//dont need to select relation in this case
		
		if (ExcelUtil.getTestDataValue("Fnol_Step2_AlertNotified").equalsIgnoreCase("TRUE"))
		{
			fnolStep2POM.selectAlert(true);
			fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_AlertId");
			if (fieldValue != null)
			    fnolStep2POM.setAlertId(fieldValue);
		}
		else
		{
			fnolStep2POM.selectAlert(false);
		}
		
		
		//Main contact section
		//-----------------------
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_MainContactSamePerson");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep2POM.selectMainContactSame(true);
		}
		else
		{
			fnolStep2POM.selectMainContactSame(false);
			// different person, fill in extra fields
			fnolStep2POM.selectNewPersonDiffContact();
			personContactSteps.completeFNOLClaimMainContactForTestScenario();
			// and set relatedto
			 fieldValue = ExcelUtil.getTestDataValue("Fnol_Step2_MainContactNewPersonRelation");  
			   fnolStep2POM.selectDiffContactRelation(fieldValue);  
		}
		
		
		
		
		if (!ExcelUtil.getTestDataValue("Fnol_Step2_PHVehicleRequired").equalsIgnoreCase("TRUE"))
		{
			this.unselectFirstInsuredVehicle();
		}
		
		
		this.next();
		
	
	}
	
	@Given("^As a \"([^\"]*)\" I am at step2 for FNOL$")
	public void as_a_user_I_am_at_step2_for_FNOL(String userType) throws Throwable {
		step1Steps.as_a_user_I_am_at_step1_for_FNOL(userType);
		step1Steps.iCompleteStep1FNOL();
	}

	@Then("^I will be on step2 for FNOL$")
	public void i_will_be_on_step2_for_FNOL() throws Throwable {
		fnolStep2POM.isPageTitleDisplayed("Step 2 of 5: Basic information");
	}
	
	@Then("I complete step2 for FNOL$")
	public void iCompleteStep2FNOL() throws Throwable 
	{
		completeFNOLStep2ForTestScenario();
		
	}
	
	//
	@Then("I complete step2 for FNOL without insured vehicle$")
	public void iCompleteStep2FNOLWithoutInsuredVehicle() throws Throwable 
	{
		// need to configure to get a specific configurable pilicy number

		this.i_select_from_field_on_step("Portal","How Reported");
		this.i_select_from_field_on_step(ExcelUtil.getTestDataValue("Fnol_Name"),"name");
		this.i_select_from_field_on_step("Policyholder","relationship to insured");
		this.i_input_into_the_box_on_step2("01912228888","Home Phone");
		this.i_input_into_the_box_on_step2("someguy@gmail.com","Email");
		this.i_select_from_field_on_step("Work","Phone Type");
		this.unselectFirstInsuredVehicle();
		this.next();
		
	}
	
	public void mandatoryFieldErrorMessagesAreShownForStep2() {
		this.next();
		// in step 2, check error messages
		Assert.assertTrue(fnolStep2POM.containsErrorMessage("Name : Missing required field \"Name\""));
		Assert.assertTrue(fnolStep2POM
				.containsErrorMessage("Relation to Insured : Missing required field \"Relation to Insured\""));
	}
	
	@Then("^Mandatory field error messages will be shown for step2 FNOL$")
	public void mandatory_field_error_messages_will_be_shown_forstep2(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(fnolStep2POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}

	@Given("^I select first insured vehicle on step2 FNOL$")
	public void selectFirstInsuredVehicle() {

		fnolStep2POM.selectVehicleCB();

	}

	@Given("^I deselect insured vehicle on step2 FNOL$")
	public void unselectFirstInsuredVehicle() {

		fnolStep2POM.deselectVehicleCB();

	}

	@Given("^I click next button on step2 FNOL$")
	public void next() {
		
		fnolStep2POM.next();
	}

	@Given("^I click previous button on step2 FNOL$")
	public void previous() {
		
		fnolStep2POM.back();
	}
	
	public void setReportedDate(String date)
	{
		
		fnolStep2POM.setReportedDateValue("21/11/2018");
	}
	
	@Given("^I click Edit Contact button on step2 FNOL$")
	public void editContact() {
		
		fnolStep2POM.clickEditContact();
	}
	
	@Then("^I select \"([^\"]*)\" from \"([^\"]*)\" field on step2 FNOL$")
	public void i_select_from_field_on_step(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
	    {
	    case "How Reported":
	    	fnolStep2POM.selectHowReported(fieldValue);
	    	break;
	    case "name":
	    	fnolStep2POM.selectReportedByName(fieldValue);
	    	break;
	    case "relationship to insured":
	    	fnolStep2POM.selectRelationToInsured(fieldValue);
	    	break;
	    case "Phone Type":
	    	fnolStep2POM.selectPhoneType(fieldValue);
	    	break;
	    case "Alert Notified":
	    	if (fieldValue.equalsIgnoreCase("true"))
	    	    fnolStep2POM.selectAlert(true);
	    	else
	    		fnolStep2POM.selectAlert(false);
	    	break;
	    
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Given("^I click \"([^\"]*)\" on reportby picker on step2 FNOL$")
	public void i_click_on_reportby_picker_on_step2(String option) throws Throwable {
		switch (option) {
		case "New Person":
			fnolStep2POM.selectNewPersonReporter();
			break;
		case "New Company":
			fnolStep2POM.selectNewCompanyReporter();
			break;
		case "Search":
			fnolStep2POM.selectSearchReporter();
			break;
		case "View Contact":
			fnolStep2POM.selectViewContactReporter();
			break;

		default:
			Assert.fail("unknown input field :" + option + " - check cucumber script!");
		}

	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" box on step2 FNOL$")
	public void i_input_into_the_box_on_step2(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Work Phone":
			fnolStep2POM.setWorkPhone(fieldValue);
			break;
		case "Home Phone":
			fnolStep2POM.setHomePhone(fieldValue);
			break;
		case "Mobile":
			fnolStep2POM.setMobile(fieldValue);
			break;
		case "Email":
			fnolStep2POM.setEmail(fieldValue);
			break;

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	

	

}
