package stepdefs.policy;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.When;

public class createSubmissionSteps extends BaseTest {

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
		    	if (fieldValue.equalsIgnoreCase("true"))
		    		policyCreateStep3DriversPOM.selectClaims5(true);
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
	
	@When("^I Click Roles at submission step3$")
	public void i_Click_rolesstep3() throws Throwable {
		policyCreateStep3DriversPOM.clickRolesTab();
		}
	
	@When("^I Click Next at submission step3$")
	public void i_Click_nextstep3() throws Throwable {
		policyCreateStep3DriversPOM.clickNext();
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

}