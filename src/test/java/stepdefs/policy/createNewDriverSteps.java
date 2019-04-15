package stepdefs.policy;

import com.big.automation.selenium_webdriver.claimcenter.pages.policycreate.ClaimsCenterPolicyNewDriverPOM;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

import java.util.List;

public class createNewDriverSteps extends BaseTest {

    //ClaimsCenterPolicyNewDriverPOM claimsCenterPolicyNewDriverPOM = new ClaimsCenterPolicyNewDriverPOM();

    @When("^I Click Ok at new driver creation$")
    public void i_Click_Next() throws Throwable {
        policyCreateNewDriverPOM.clickOk();
    }

    @When("^I set the Driver Title field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Title(String option) throws Throwable {
        policyCreateNewDriverPOM.selectTitle(option);
    }

    @When("^I set the Driver First Name field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_First_Name(String name) throws Throwable {
        policyCreateNewDriverPOM.setFirstName(name);
    }

    @When("^I set the Driver Last Name field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Last_Name(String name) throws Throwable {
        policyCreateNewDriverPOM.setLastName(name);
    }

    @When("^I set the Driver DOB field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_DOB(String DOB) throws Throwable {
        policyCreateNewDriverPOM.setDateOfBirth(DOB);
    }

    @When("^I set the Driver Gender field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Gender(String option) throws Throwable {
        policyCreateNewDriverPOM.selectGender(option);
    }

    @When("^I set the Driver Primary Occupation field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Primary_Occupation(String option) throws Throwable {
        policyCreateNewDriverPOM.selectPrimaryOcupation(option);
    }

    @When("^I set the Driver Marital Status field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Marital_Status(String option) throws Throwable {
        policyCreateNewDriverPOM.selectMaritalStatus(option);
    }

    @When("^I set the Driver UK Resident for 5 Years field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Marital_Status(Boolean option) throws Throwable {
        policyCreateNewDriverPOM.selectUkResident5(option);
    }

    @When("^I set the Driver Own their own home field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_own_their_own_home(Boolean option) throws Throwable {
        policyCreateNewDriverPOM.selectOwnHome(option);
    }

    @When("^I set the Driver relationship to policyholder field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Relationship_To_Policyholder(String option) throws Throwable {
        policyCreateNewDriverPOM.selectRelationshipToPolicyholder(option);
    }

    @When("^I set the Driver Primary Phone field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Primary_Phone(String option) throws Throwable {
        policyCreateNewDriverPOM.selectPrimaryPhone(option);
    }

    @When("^I set the Driver Home Phone field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Home_Phone(String option) throws Throwable {
        policyCreateNewDriverPOM.setHomePhone(option);
    }

    @When("^I set the Driver Work Phone field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Work_Phone(String option) throws Throwable {
        policyCreateNewDriverPOM.setWorkPhone(option);
    }

    @When("^I set the Driver Mobile Phone field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Mobile_Phone(String option) throws Throwable {
        policyCreateNewDriverPOM.setMobilePhone(option);
    }

    @When("^I set the Driver Primary Email field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Primary_Email(String option) throws Throwable {
        policyCreateNewDriverPOM.setPrimaryEmail(option);
    }

    @When("^I set the Driver Secondary Email field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Secondary_Email(String option) throws Throwable {
        policyCreateNewDriverPOM.setSecondaryEmail(option);
    }

    @When("^I set the Driver License Type field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_License_Type(String option) throws Throwable {
        policyCreateNewDriverPOM.selectDrivingLicenceType(option);
    }

    @When("^I set the Driver License Number field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_License_Number(String option) throws Throwable {
        policyCreateNewDriverPOM.setLicenceNumberText(option);
    }

    @When("^I set the Driver passed Driving test over 10 years ago field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Driving_Test_10_Years_Ago(Boolean option) throws Throwable {
        policyCreateNewDriverPOM.selectDrivingTestPassed10YearsAgo(option);
    }

    @When("^I set the Driver Access to other Vehicles field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Access_To_Other_Vehicles(Boolean option) throws Throwable {
        policyCreateNewDriverPOM.selectAccessToOtherVehicles(option);
    }

    @When("^I set the Driver Additional Qualifications field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Additional_Qualifications(String option) throws Throwable {
        policyCreateNewDriverPOM.selectAdditionalDrivingQualifications(option);
    }

    @When("^I set the Driver Medical Conditions field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Medical_Conditions(String option) throws Throwable {
        policyCreateNewDriverPOM.selectMedicalConditionsAffectingYourDriving(option);
    }

    @When("^I set the Driver Non Motoring Offences field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Non_Motoring_Offences(Boolean option) throws Throwable {
        policyCreateNewDriverPOM.selectNonMotoringOffenses(option);
    }

    @When("^I set the Driver Policy Cancelled field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Policy_Cancelled(Boolean option) throws Throwable {
        policyCreateNewDriverPOM.selectCancelledPolicy(option);
    }

    @When("^I set the Driver Other Claims field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Other_Claims(Boolean option) throws Throwable {
        policyCreateNewDriverPOM.selectClaimsAccidentsOrLosses(option);
    }
    
    @When("^I add multiple claims at new driver creation$") 
	public void i_add_multiple_claims_at_new_driver(DataTable dt) throws Throwable {
		List<List<String>> list = dt.asLists(String.class);

		for(int i = 1; i < list.size(); i++) { // i starts from 1 because i=0 represents the header
			policyCreateNewDriverPOM.clickAddPreviousClaimButton();
			policyCreateNewDriverPOM.selectPreviousClaimType(list.get(i).get(0), i);
			policyCreateNewDriverPOM.setPreviousClaimDate(list.get(i).get(1),i);
		}
	}

    @When("^I set the Driver Convictions field to \"([^\"]*)\" at new driver creation$")
    public void i_Set_Driver_Convictions(Boolean option) throws Throwable {
        policyCreateNewDriverPOM.selectConvictions5Years(option);
    }
    
    @When("^I add multiple convictions at new driver creation$")
	public void i_add_multiple_convictions_at_newderiver(DataTable dt) throws Throwable {
		List<List<String>> list = dt.asLists(String.class);

		for(int i = 1; i < list.size(); i++) { // i starts from 1 because i=0 represents the header
			policyCreateNewDriverPOM.clickAddConvict5();
			policyCreateNewDriverPOM.setConvict5Points(list.get(i).get(0), i);
			policyCreateNewDriverPOM.selectConvict5MonthsDisqualified(list.get(i).get(1),i);
			policyCreateNewDriverPOM.selectConvict5Code(list.get(i).get(2),i);
			policyCreateNewDriverPOM.setConvict5Date(list.get(i).get(3), i);
		}
	}

    @When("^I Create drivers with different previous claims$")
    public void i_Create_Drivers_With_Different_Previous_Claims(DataTable dt) throws Throwable {
        List<List<String>> list = dt.asLists(String.class);

        for(int i = 1; i < list.size(); i++){ // i starts from 1 because i=0 represents the header
            policyCreateStep3DriversPOM.createDriverNewPerson();
            policyCreateNewDriverPOM.selectTitle("Mr.");
            policyCreateNewDriverPOM.setFirstName(list.get(i).get(0));
            policyCreateNewDriverPOM.setLastName("Dimmerdome");
            policyCreateNewDriverPOM.setDateOfBirth("11021990");
            policyCreateNewDriverPOM.selectGender("Male");
            policyCreateNewDriverPOM.selectPrimaryOcupation("Actor");
            policyCreateNewDriverPOM.selectMaritalStatus("Single");
            policyCreateNewDriverPOM.selectUkResident5(true);
            policyCreateNewDriverPOM.selectOwnHome(true);
            policyCreateNewDriverPOM.selectRelationshipToPolicyholder("Other");
            policyCreateNewDriverPOM.selectPrimaryPhone("Mobile");
            policyCreateNewDriverPOM.setHomePhone("07855085749");
            policyCreateNewDriverPOM.setWorkPhone("07855085741");
            policyCreateNewDriverPOM.setMobilePhone("07855085748");
            policyCreateNewDriverPOM.setPrimaryEmail("DougDimmerdome@DimmerMail.com");
            policyCreateNewDriverPOM.setSecondaryEmail("");
            policyCreateNewDriverPOM.selectDrivingLicenceType("Full Uk Licence");
            policyCreateNewDriverPOM.setLicenceNumberText("111222");
            policyCreateNewDriverPOM.selectDrivingTestPassed10YearsAgo(true);
            policyCreateNewDriverPOM.selectAccessToOtherVehicles(false);
            policyCreateNewDriverPOM.selectAdditionalDrivingQualifications("No");
            policyCreateNewDriverPOM.selectMedicalConditionsAffectingYourDriving("DVLA aware - no licence restriction");
            policyCreateNewDriverPOM.selectNonMotoringOffenses(false);
            policyCreateNewDriverPOM.selectCancelledPolicy(false);
            policyCreateNewDriverPOM.selectClaimsAccidentsOrLosses(true);
            policyCreateNewDriverPOM.clickAddPreviousClaimButton();
            policyCreateNewDriverPOM.selectPreviousClaimType(list.get(i).get(1),1);
            policyCreateNewDriverPOM.setPreviousClaimDate(list.get(i).get(2), 1);
            policyCreateNewDriverPOM.selectConvictions5Years(false);
            policyCreateNewDriverPOM.clickOk();
        }
    }


}
