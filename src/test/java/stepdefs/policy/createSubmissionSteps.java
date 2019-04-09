package stepdefs.policy;

import cucumber.api.DataTable;
import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.When;

import java.util.List;

public class createSubmissionSteps extends BaseTest {

	public void completeSubmissionStep3ForTestScenario(){
		//TODO add functionality to pull from test data spreadsheet


	}

	@When("^I select product at step1 of submission create$")
	public void i_Click_Search() throws Throwable {
		policyCreateStep1SubmissionPOM.clickSelectProduct();
		}
	
	

	@When("^I set the submission step2 field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_the_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		case "HeardAbout":
			policyCreateStep2PolicyInfoPOM.selectHowHeard(fieldValue);
			break;
		
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}


	@When("^I Click Next at submission step2$")
	public void i_Click_nextstep2() throws Throwable {
		policyCreateStep2PolicyInfoPOM.clickNext();
		}
	
	@When("^I Click AddDriver at submission step3$")
	public void i_Click_adddriverstep3() throws Throwable {
		policyCreateStep3DriversPOM.selectNamedDriver();
		}

	@When("^I create New Person for a new Driver at submission step3$")
	public void i_Click_New_Person_Step3() throws Throwable {
		policyCreateStep3DriversPOM.createDriverNewPerson();
	}
	
	@When("^I set the submission step3 field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_thestep3_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		case "Title":
			policyCreateStep3DriversPOM.selectTitle(fieldValue);
			break;
		case "Occupation":
			policyCreateStep3DriversPOM.selectOccupation(fieldValue);
			break;
		case "Gender":
			policyCreateStep3DriversPOM.selectGender(fieldValue);
			break;
		case "MaritalStatus":
			policyCreateStep3DriversPOM.selectMaritalStatus(fieldValue);
			break;
		case "Dob":
			policyCreateStep3DriversPOM.setDob(fieldValue);
			break;
		 case "Resident":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep3DriversPOM.selectResident(true);
		    	else
		    		policyCreateStep3DriversPOM.selectResident(false);
		    	break;
		 case "OwnHome":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep3DriversPOM.selectOwnHome(true);
		    	else
		    		policyCreateStep3DriversPOM.selectOwnHome(false);
		    	break;
		 case "LicenseType":
				policyCreateStep3DriversPOM.selectLicenseType(fieldValue);
				break;
		 case "License10Years":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep3DriversPOM.selectLicense10(true);
		    	else
		    		policyCreateStep3DriversPOM.selectLicense10(false);
		    	break;
		 case "OtherVehicles":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep3DriversPOM.selectOtherVehicles(true);
		    	else
		    		policyCreateStep3DriversPOM.selectOtherVehicles(false);
		    	break;
		    	
		 case "AddQuals":
				policyCreateStep3DriversPOM.selectAddQuals(fieldValue);
				break;
		 case "Medicals":
				policyCreateStep3DriversPOM.selectMedicals(fieldValue);
				break;
		 case "Rehab":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep3DriversPOM.selectRehab(true);
		    	else
		    		policyCreateStep3DriversPOM.selectRehab(false);
		    	break;
		 case "Cancelled":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep3DriversPOM.selectCancelled(true);
		    	else
		    		policyCreateStep3DriversPOM.selectCancelled(false);
		    	break;
		 case "Claims5Years":
		    	if (fieldValue.equalsIgnoreCase("true")){
					policyCreateStep3DriversPOM.selectClaims5(true);
				}
		    	else
		    		policyCreateStep3DriversPOM.selectClaims5(false);
		    	break;
		 case "Convictions5Years":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep3DriversPOM.selectConvict5(true);
		    	else
		    		policyCreateStep3DriversPOM.selectConvict5(false);
		    	break;
		    	//TODO- adding a conviction to table and previous claim to table
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}

	@When("^I set residency month to \"([^\"]*)\" at submission step3$")
	public void i_Set_Residency_Months(String option) throws Throwable {
		policyCreateStep3DriversPOM.setResidencyMonth(option);
	}

	@When("^I set residency year to \"([^\"]*)\" at submission step3$")
	public void i_Set_Residency_Year(String option) throws Throwable {
		policyCreateStep3DriversPOM.setResidencyYear(option);
	}
	
	@When("^I Click Roles at submission step3$")
	public void i_Click_rolesstep3() throws Throwable {
		policyCreateStep3DriversPOM.clickRolesTab();
		}
	
	@When("^I Click Next at submission step3$")
	public void i_Click_nextstep3() throws Throwable {
		policyCreateStep3DriversPOM.clickNext();
		}

	@When("^I click the Add Claim button at submission step 3$")
	public void i_Click_The_Add_Claim_Button() throws Throwable {
		policyCreateStep3DriversPOM.clickAddClaims5();
	}

	@When("^I set the Claim Type field to \"([^\"]*)\" at submission step 3$")
	public void i_Select_Claim_Type(String claimType) throws Throwable {
		policyCreateStep3DriversPOM.selectClaims5Type(claimType, 1);
	}

	@When("^I set the Claim Date field to \"([^\"]*)\" at submission step 3$")
	public void i_Set_Claim_Date(String claimDate) throws Throwable {
		policyCreateStep3DriversPOM.setClaims5Date(claimDate, 1);
	}

	@When("^I click the Add Conviction button at submission step 3$")
	public void i_Click_The_Add_Conviction_Button() throws Throwable {
		policyCreateStep3DriversPOM.clickAddConvict5();
	}

	@When("^I set the Conviction Date field to \"([^\"]*)\" at submission step 3$")
	public void i_Set_Conviction_Date(String convictionDate) throws Throwable {
		policyCreateStep3DriversPOM.setConvict5Date(convictionDate, 1);
	}

	@When("^I set the Conviction Code field to \"([^\"]*)\" at submission step 3$")
	public void i_Set_Conviction_Code(String convictionCode) throws Throwable {
		policyCreateStep3DriversPOM.selectConvict5Code(convictionCode, 1);
	}

	@When("^I set the Conviction Points field to \"([^\"]*)\" at submission step 3$")
	public void i_Set_Conviction_Points(String convictionPoints) throws Throwable {
		policyCreateStep3DriversPOM.setConvict5Points(convictionPoints, 1);
	}

	@When("^I set the Conviction Months Disqualified field to \"([^\"]*)\" at submission step 3$")
	public void i_Set_Conviction_Months_Disqualified(String monthsDisqualified) throws Throwable {
		policyCreateStep3DriversPOM.selectConvict5MonthsDisqualified(monthsDisqualified, 1);
	}
	
	@When("^I Click AddVehicle at submission step4$")
	public void i_Click_addvehiclestep4() throws Throwable {
		policyCreateStep4VehiclePOM.clickAddVehicle();
		}

	@When("^I set the submission step4 field \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_set_thestep4_fields_to(String fieldName, String fieldValue) throws Throwable {
		switch (fieldName) {
		case "Vrn":
			policyCreateStep4VehiclePOM.setVrn(fieldValue);
			break;
		case "SecurityDevice":
			policyCreateStep4VehiclePOM.selectSecurityDevice(fieldValue);
			break;
		 case "Tracker":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep4VehiclePOM.selectTracker(true);
		    	else
		    		policyCreateStep4VehiclePOM.selectTracker(false);
		    	break;
		 case "Value":
				policyCreateStep4VehiclePOM.setMarketValue(fieldValue);
				break;	
		 case "Modified":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep4VehiclePOM.selectModified(true);
		    	else
		    		policyCreateStep4VehiclePOM.selectModified(false);
		    	break;
		 case "DayParking":
				policyCreateStep4VehiclePOM.selectDayParking(fieldValue);
				break;	
		 case "NightParking":
				policyCreateStep4VehiclePOM.selectNightParking(fieldValue);
				break;	
		 case "BuyMonth":
				policyCreateStep4VehiclePOM.selectBuyMonth(fieldValue);
				break;	
		 case "BuyYear":
				policyCreateStep4VehiclePOM.setBuyYear(fieldValue);
				break;	
		 case "RegKeeper":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep4VehiclePOM.selectRegKeeper(true);
		    	else
		    		policyCreateStep4VehiclePOM.selectRegKeeper(false);
		    	break;
		 case "UseCar":
				policyCreateStep4VehiclePOM.selectUseCar(fieldValue);
				break;	
		 case "RhDrive":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep4VehiclePOM.selectRhDrive(true);
		    	else
		    		policyCreateStep4VehiclePOM.selectRhDrive(false);
		    	break;
		 case "Imported":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep4VehiclePOM.selectImported(true);
		    	else
		    		policyCreateStep4VehiclePOM.selectImported(false);
		    	break;
		 case "Less8Seats":
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep4VehiclePOM.selectLess8Seats(true);
		    	else
		    		policyCreateStep4VehiclePOM.selectLess8Seats(false);
		    	break;
		 case "ProductMiles":
				policyCreateStep4VehiclePOM.selectProductMiles(fieldValue);
				break;	
		 case "EstimateMiles":
				policyCreateStep4VehiclePOM.setEstimateMiles(fieldValue);
				break;	
		 case "VolExcess":
				policyCreateStep4VehiclePOM.selectVolExcess(fieldValue);
				break;	
		 case "Ncd":
				policyCreateStep4VehiclePOM.selectNcd(fieldValue);
				break;	
		default:
			Assert.fail("unknown search field :" + fieldName + " - check cucumber script!");
		}
	}
	
	@When("^I Click AssignDriver at submission step4$")
	public void i_Click_assigndriverstep4() throws Throwable {
		policyCreateStep4VehiclePOM.selectAssignDriver();
		}

	@When("^I Click AssignDriver \"([^\"]*)\" times to assign mutiple drivers at submission step4$")
	public void i_Click_assignmultipledriverstep4(int x) throws Throwable {
		for(int i = 0;i<x;i++){
			policyCreateStep4VehiclePOM.selectAssignDriver();
		}
	}
	
	@When("^I Click Next at submission step4$")
	public void i_Click_nextstep4() throws Throwable {
		policyCreateStep4VehiclePOM.clickNext();
		}
	@When("^I Click Quote at submission step4$")
	public void i_Click_quotestep4() throws Throwable {
		policyCreateStep4VehiclePOM.clickQuote();
		}
	@When("^I Click Issue Policy at submission step5$")
	public void i_Click_issuepolictstep5() throws Throwable {
		policyCreateStep5QuotePOM.clickIssuePolicy();
		}
	@When("^I Click Confirm Issue Policy at submission step5$")
	public void i_Click_confirmissuepolictstep5() throws Throwable {
		policyCreateStep5QuotePOM.clickConfirmIssuePolicy();
		}

	@When("^I add multiple claims at submission step3$") //Note requires convictions within past 5 years to be ticked
	public void i_add_multiple_claims_at_submission_step3(DataTable dt) throws Throwable {
		List<List<String>> list = dt.asLists(String.class);

		for(int i = 1; i < list.size(); i++) { // i starts from 1 because i=0 represents the header
			policyCreateStep3DriversPOM.clickAddClaims5();
			policyCreateStep3DriversPOM.selectClaims5Type(list.get(i).get(0), i);
			policyCreateStep3DriversPOM.setClaims5Date(list.get(i).get(1),i);
		}
	}

}