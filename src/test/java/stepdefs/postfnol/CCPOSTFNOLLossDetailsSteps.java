package stepdefs.postfnol;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefs.fnol.CCFNOLPersonContactSteps;

public class CCPOSTFNOLLossDetailsSteps extends BaseTest {
	
	CCFNOLPersonContactSteps personContactSteps = new CCFNOLPersonContactSteps();
	
	@Then("^I will see post FNOL loss details$")
	public void i_will_see_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.isPageTitleDisplayed("Loss Details");
	}
	
	@Given("^I click edit button on post FNOL loss details$")
	public void edit() {
		
		postFnolLossDetailsPOM.edit();
	}
	@Given("^I click update button on post FNOL loss details$")
	public void update() {
		
		postFnolLossDetailsPOM.update();
	}
	
	@Given("^I click add Vehicle on post FNOL loss details$")
	public void addVehicle() {
		
		postFnolLossDetailsPOM.addVehicle();
	}
	
	@Given("^I click add Property Damage on post FNOL loss details$")
	public void addPropertyDamage() {
		
		postFnolLossDetailsPOM.addPropertyDamage();
	}
	
	@Given("^I click add Pedestrian on post FNOL loss details$")
	public void addPedestrian() {
		
		postFnolLossDetailsPOM.addPedestrian();
	}
	
	@When("^I click edit PH Vehicle on post FNOL loss details$")
	public void i_click_edit_PH_Vehicle_on_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.selectEditPHVehicle();
	}
	@When("^I click edit PH Driver on post FNOL loss details$")
	public void i_click_edit_PH_Driver_on_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.selectEditPHDriver();
	}
	@When("^I click edit PH Passenger on post FNOL loss details$")
	public void i_click_edit_PH_passenger_on_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.selectEditPHPassenger();
	}
	
	@When("^I click edit TP Vehicle on post FNOL loss details$")
	public void i_click_edit_TP_Vehicle_on_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.selectEditTPVehicle();
	}
	@When("^I click edit TP Driver on post FNOL loss details$")
	public void i_click_edit_TP_Driver_on_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.selectEditTPDriver();
	}
	@When("^I click edit TP Passenger on post FNOL loss details$")
	public void i_click_edit_TP_passenger_on_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.selectEditTPPassenger();
	}
	
	@When("^I click edit Pedestrian on post FNOL loss details$")
	public void i_click_edit_Pedestrian_on_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.selectEditPedestrian();
	}
	
	@When("^I click edit Property on post FNOL loss details$")
	public void i_click_edit_Property_on_post_FNOL_loss_details() throws Throwable {
		postFnolLossDetailsPOM.selectEditProperty();
	}
	
	
	@Given("^I click add Police details on post FNOL loss details$")
	public void addPoliceDetails() {
		
		postFnolLossDetailsPOM.addPolice();
	}
	
	/**
	 * choose from dropdowns or radio selections
	 * @param fieldValue
	 * @param fieldName
	 * @throws Throwable
	 */
	@Then("^I select \"([^\"]*)\" from \"([^\"]*)\" field on Loss Details post FNOL$")
	public void i_select_from_field_on_lossdetials(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		//loss details section
		case "Incident Type":
			postFnolLossDetailsPOM.selectIncidentType(fieldValue);
			break;
		case "Cause":
			postFnolLossDetailsPOM.selectClaimCauseType(fieldValue);
			break;
		case "Sub Cause":
			postFnolLossDetailsPOM.selectClaimSubCauseType(fieldValue);
			break;
		case "Catastrophe":
			postFnolLossDetailsPOM.selectCatastrophe(fieldValue);
			break;
		case "Fault Type":
			postFnolLossDetailsPOM.selectFaultType(fieldValue);
			break;
			// incident questions section
		case "Vehicle Used For":
			postFnolLossDetailsPOM.selectVehicleUsedFor(fieldValue);
			break;
		case "Know Other Driver":
	    	if (fieldValue.equalsIgnoreCase("true"))
	    		postFnolLossDetailsPOM.selectKnowOtherDriver(true);
	    	else
	    		postFnolLossDetailsPOM.selectKnowOtherDriver(false);
	    	break;
		case "Impact Speed":
			postFnolLossDetailsPOM.selectImpactSpeed(fieldValue);
			break;
		case "Weather":
			postFnolLossDetailsPOM.selectWeather(fieldValue);
			break;
		case "Road Conditions":
			postFnolLossDetailsPOM.selectRoadConditions(fieldValue);
			break;
		case "Photos":
			postFnolLossDetailsPOM.selectPhotos(fieldValue);
			break;
		case "Cctv":
			postFnolLossDetailsPOM.selectCctv(fieldValue);
			break;
		//loss location section
		case "Address Location":
			postFnolLossDetailsPOM.selectAddressLocation(fieldValue);
			break;
		case "Postcode Address":
			postFnolLossDetailsPOM.selectPostCodeAddress(fieldValue);
			break;
		case "Jurisdiction":
			postFnolLossDetailsPOM.selectJurisdiction(fieldValue);
			break;
			
		// Notification and contact section
		case "How Reported":
			postFnolLossDetailsPOM.selectHowReported(fieldValue);
			break;
		case "Name":
			postFnolLossDetailsPOM.selectReportedByName(fieldValue);
	    	break;
	    case "Relationship To Insured":
	    	postFnolLossDetailsPOM.selectRelationToInsured(fieldValue);
	    	break;
	    case "Contact Same Person":
	    	if (fieldValue.equalsIgnoreCase("true"))
	    		postFnolLossDetailsPOM.selectMainContactSame(true);
	    	else
	    		postFnolLossDetailsPOM.selectMainContactSame(false);
	    	break;
	    
	    case "Main Contact Name":
	    	postFnolLossDetailsPOM.selectMainContactName(fieldValue);
	    	break;
	    case "Main Contact Relationship":
	    	postFnolLossDetailsPOM.selectContactRelationToInsured(fieldValue);
	    	break;
	    case "Alert Notified":
	    	if (fieldValue.equalsIgnoreCase("true"))
	    		postFnolLossDetailsPOM.selectAlert(true);
	    	else
	    		postFnolLossDetailsPOM.selectAlert(false);
	    	break;
	    

		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	/**
	 * enter text into textboxes
	 * @param fieldValue
	 * @param fieldName
	 * @throws Throwable
	 */
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" field on Loss Details post FNOL$")
	public void i_input_into_the_box_onlossdetials(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		//loss detials
		case "Circumstances":
			postFnolLossDetailsPOM.setCircumstancesValue(fieldValue);
			break;
		case "Insureds Liability":
			postFnolLossDetailsPOM.setInsuredsLiability(fieldValue);
		case "Date Of Loss":
			postFnolLossDetailsPOM.setLossDate(fieldValue);
		// incident questions
		case "Journey Purpose":
			postFnolLossDetailsPOM.setJourneyPurpose(fieldValue);
			break;
		// loss location
		case "Address Line1":
			postFnolLossDetailsPOM.setAddressLine1(fieldValue);
			break;
		case "Address Line2":
			postFnolLossDetailsPOM.setAddressLine2(fieldValue);
			break;
		case "Address Line3":
			postFnolLossDetailsPOM.setAddressLine3(fieldValue);
			break;
		case "City":
			postFnolLossDetailsPOM.setCity(fieldValue);
			break;
		case "County":
			postFnolLossDetailsPOM.setCounty(fieldValue);
			break;
		case "Location Description":
			postFnolLossDetailsPOM.setLocationDescription(fieldValue);
			break;
		case "Location Code":
			postFnolLossDetailsPOM.setLocationCode(fieldValue);
			break;
		// notification and contact
		case "Alert ID":
			postFnolLossDetailsPOM.setAlertId(fieldValue);
			break;
		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	/**
	 * This is for excel driven tests, where the update values are held
	 * @throws Throwable
	 */
	@Then("^I change data in the Loss Details screen post FNOL$")
	public void i_change_data_in_loss_details_screen () throws Throwable {
		
	   // This will be driven by what is in the xcel tesdata input sheet
	   // If a field is held and has a value then it will be used to change the current value	
	
		String fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_Circumstances");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setCircumstancesValue(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncidentType");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectIncidentType(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_Cause");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectClaimCauseType(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_SubCause");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectClaimSubCauseType(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_FaultRate");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectFaultType(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_InsuredsLiability");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setInsuredsLiability(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_Catastrophe");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectCatastrophe(fieldValue);
	   	
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_DateOfLoss");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setLossDate(fieldValue);	
		
		// incident questions
		//---------------------
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncUsingFor");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectVehicleUsedFor(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncPurpose");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setJourneyPurpose(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncKnowOtherDriver");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			postFnolLossDetailsPOM.selectKnowOtherDriver(true);
			fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncNatureOfRel");
			if (fieldValue !=null)
				postFnolLossDetailsPOM.setNatureOfRelationship(fieldValue);
		}
		else {
			// only set set to changed in the sheet, otherwise leave as is
			if (fieldValue !=null)
			    postFnolLossDetailsPOM.selectKnowOtherDriver(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncSpeedImpact");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectImpactSpeed(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncWeather");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectWeather(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncRoadCond");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectRoadConditions(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncPhotos");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectPhotos(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncCctv");
     	if (fieldValue !=null && fieldValue.equalsIgnoreCase("Yes"))
		{
			postFnolLossDetailsPOM.selectCctv(fieldValue);
			fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncCctvContact");
			if (fieldValue !=null)
				postFnolLossDetailsPOM.setCctvContact(fieldValue);
		}
		else
		{
			if (fieldValue !=null)
				postFnolLossDetailsPOM.selectCctv(fieldValue);
				
		}
     	
     // notification and contact
     		//-------------------------
     		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_HowReported");
     		if (fieldValue !=null)
     			postFnolLossDetailsPOM.selectHowReported(fieldValue);
     		
     		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_ReportedByName");
     		if (fieldValue !=null)
     			postFnolLossDetailsPOM.selectReportedByName(fieldValue);
     		//TODO new company picker
     		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_ReportedByNewPerson");
     		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
     		{
     			postFnolLossDetailsPOM.selectNewPersonReporter();
     			// Need to now fill in th enext contact screen
     			personContactSteps.completePostFNOLClaimReporterForTestScenario();
     		}
     		
     		
     		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_ReportedByRelation");
     		if (fieldValue !=null)
     			postFnolLossDetailsPOM.selectRelationToInsured(fieldValue);
     		
     		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_MainContactSame");
     		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
     		{
     			postFnolLossDetailsPOM.selectMainContactSame(true);
     		}
     		else
     		{
     			postFnolLossDetailsPOM.selectMainContactSame(false);
     			fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_MainContactNewPerson");
     			if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
     			{
     				postFnolLossDetailsPOM.selectNewPersonContact();
     				// Need to now fill in th enext contact screen
     				personContactSteps.completePostFNOLClaimMainContactForTestScenario();
     			}
     	
     		
     			fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_MainContactRelation"); 
     			if (fieldValue !=null)
     				postFnolLossDetailsPOM.selectContactRelationToInsured(fieldValue);
     		}
     		
     		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_AlertNotified");
    		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
    		{
    			postFnolLossDetailsPOM.selectAlert(true);
    			fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_AlertId");
    			postFnolLossDetailsPOM.setAlertId(fieldValue);
    		}
    		else
    		{
    			if (fieldValue !=null)
    				postFnolLossDetailsPOM.selectAlert(false);
    		}
		
		// LOSS location
     	fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_AddressLocation");
		if (fieldValue !=null) {
			if (fieldValue.equalsIgnoreCase("New"))
			{
				postFnolLossDetailsPOM.selectAddressLocation("New...");
			}
			else {
				postFnolLossDetailsPOM.selectAddressLocation(fieldValue);
			}
			
		}
			
	   	// change the loss location address details
     	fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_AddressLine1");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setAddressLine1(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_AddressLine2");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setAddressLine2(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_AddressLine3");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setAddressLine3(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_City");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setCity(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_County");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setCounty(fieldValue);
		
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_Postcode");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setPostcode(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_PostcodeAddress");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectPostCodeAddress(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_LocationDesc");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setLocationDescription(fieldValue);
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_LocationCode");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setLocationCode(fieldValue);
		
		
		
		
		
	}
	
	

	
	
	

}
