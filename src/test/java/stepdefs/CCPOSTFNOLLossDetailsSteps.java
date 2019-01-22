package stepdefs;

import java.util.List;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

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
	
	
	@Given("^I click add Police details on post FNOL loss details$")
	public void addPoliceDetails() {
		
		postFnolLossDetailsPOM.addPolice();
	}
	
	@Then("^I can enter data into the Loss Details fields$")
	public void i_enter_data_into_the_Loss_Details_fields() throws Throwable {
		
	
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
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_FaulltRate");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectFaultType(fieldValue);
		
		fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_InsuredsLiability");
		if (fieldValue !=null)
			postFnolLossDetailsPOM.setInsuredsLiability(fieldValue);
		
	   	
			
	}

	@Then("^I can enter data into the Loss Locations fields$")
	public void i_can_enter_data_into_the_Loss_Locations_fields(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	   	for(int i=0; i<list.size(); i++) {
				switch(list.get(i))
			    {
			    case "Location":
			    	//TODO;
	    	   	break;
			    case "Country":
			    	//TODO
	    	   	break;
			    case "Address 1":
			    	//TODO
	    	   	break;
			    case "Address 2":
			    	//TODO
	    	   	break;
			    case "Address 3":
			    	//TODO
	    	   	break;
			    case "City":
			    	//TODO
	    	   	break;
			    case "PostCode":
			    	//TODO
	    	   	break;
			    case "Location Description":
			    	//TODO
	    	   	break;
			    case "Location Code":
			    	//TODO
	    	   	break;
			    case "Jurisdiction":
			    	//TODO
	    	   	break;
			   
			    default:
			    Assert.fail("unknown input field :"+ list.get(i)+" - check cucumber script!");
			    }
				
				
			}
	}

	@Then("^I can enter data into the Incident Question fields$")
	public void i_enter_data_into_the_Incident_Question_fields() throws Throwable {
		
		String fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncUsingFor");
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
		if (fieldValue !=null)
			postFnolLossDetailsPOM.selectCctv(fieldValue);
		
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("Yes"))
		{
			
			fieldValue = ExcelUtil.getTestDataValue("PostFnol_LossDetails_IncCctvContact");
			if (fieldValue !=null)
				postFnolLossDetailsPOM.setCctvContact(fieldValue);
		}
		
		
	}
	   

	@Then("^I can enter data into the Notifcation and Contact fields$")
	public void i_can_enter_data_into_the_Notifcation_and_Contact_fields(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	   	for(int i=0; i<list.size(); i++) {
				switch(list.get(i))
			    {
			    case "How Reported":
			    	postFnolLossDetailsPOM.selecHowReported("Portal");
	    	   	break;
			    case "Reported By":
			    	postFnolLossDetailsPOM.selectNewPersonReporter();
			    	// on select new person page, complete the details
					personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("Jimmy", "First Name");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("Reporter", "Last Name");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("The Hovel", "Address Line1");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("Waterside", "Address Line2");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("The Bridge", "Address Line3");
					personContactSteps.i_select_on_persondetails_screen("Update");
	    	   	break;
			    case "Relationship to Insured":
			    	postFnolLossDetailsPOM.selectRelationToInsured("Named Driver");
	    	   	break;
			    case "Main Contact":
			    	postFnolLossDetailsPOM.selectNewPersonContact();
			    	// on select new person page, complete the details
					personContactSteps.i_select_from_field_on_persondetails_screen("Mr.", "Prefix");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("Ricky", "First Name");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("Contact", "Last Name");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("The Bends", "Address Line1");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("Waterside", "Address Line2");
					personContactSteps.i_input_into_the_box_on_persondetails_screen("The Bridge", "Address Line3");
					personContactSteps.i_select_on_persondetails_screen("Update");
			    case "Contact Relationship to Insured":
			    	postFnolLossDetailsPOM.selectContactRelationToInsured("Police");
	    	   	break;
			   
			   
			    default:
			    Assert.fail("unknown input field :"+ list.get(i)+" - check cucumber script!");
			    }
				
				
			}
		
	}
	
	

}
