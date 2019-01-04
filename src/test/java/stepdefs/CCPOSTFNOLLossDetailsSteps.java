package stepdefs;

import java.util.List;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

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
	
	@Given("^I click add Injury on post FNOL loss details$")
	public void addInjury() {
		
		postFnolLossDetailsPOM.addInjury();
	}
	
	@Given("^I click add Police details on post FNOL loss details$")
	public void addPoliceDetails() {
		
		postFnolLossDetailsPOM.addPolice();
	}
	
	@Then("^I can enter data into the Loss Details fields$")
	public void i_can_enter_data_into_the_Loss_Details_fields(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	   	for(int i=0; i<list.size(); i++) {
				switch(list.get(i))
			    {
			    case "Circumstances":
			    	postFnolLossDetailsPOM.setCircumstancesValue("Some Circs");
	    	   	break;
			    case "Incident Type":
			    	postFnolLossDetailsPOM.selectIncidentType("Accident");
	    	   	break;
			    case "Cause":
			    	postFnolLossDetailsPOM.selectClaimCauseType("Car Door Open");
	    	   	break;
			    case "Sub Cause":
			    	postFnolLossDetailsPOM.selectClaimSubCauseType("Third party opened car door into path of insured");
	    	   	break;
			    case "Fault Rating":
			    	postFnolLossDetailsPOM.selectFaultType("Fault");
	    	   	break;
			    case "Catastrophe":
			    	//TODO
	    	   	break;
			    case "Date Of Loss":
			    	//TODO
	    	   	break;
			   
			    default:
			    Assert.fail("unknown input field :"+ list.get(i)+" - check cucumber script!");
			    }
				
				
				
			}
			
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
	public void i_can_enter_data_into_the_Incident_Question_fields(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	   	for(int i=0; i<list.size(); i++) {
				switch(list.get(i))
			    {
			    case "What were you using the vehicle for":
			    	postFnolLossDetailsPOM.selectVehicleUsedFor("Business");
	    	   	break;
			    case "What was the pourpose of your Journey":
			    	postFnolLossDetailsPOM.setJourneyPurpose("Going to the shops");
	    	   	break;
			    case "Do You know the other driver":
			    	//TODO
	    	   	break;
			    case "At what speed were you travelling at impact":
			    	postFnolLossDetailsPOM.selectImpactSpeed("0-6 MPH");
	    	   	break;
			    case "Weather":
			    	postFnolLossDetailsPOM.selectWeather("Wind");
	    	   	break;
			    case "Road Conditions":
			    	postFnolLossDetailsPOM.selectRoadConditions("Muddy");
	    	   	break;
			    case "Supporting photgraphic evidence":
			    	postFnolLossDetailsPOM.selectPhotos("Yes");
	    	   	break;
			    case "CCTv/Dashcam footage available":
			    	postFnolLossDetailsPOM.selectCctv("Yes");
			    	postFnolLossDetailsPOM.setCctvContact("The local police");
	    	   	break;
			    
			   
			    default:
			    Assert.fail("unknown input field :"+ list.get(i)+" - check cucumber script!");
			    }
				
				
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
