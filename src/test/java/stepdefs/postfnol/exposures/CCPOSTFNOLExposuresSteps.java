package stepdefs.postfnol.exposures;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.config.UserToGroupMap;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCPOSTFNOLExposuresSteps extends BaseTest {
	
	//TODO this needs refactor as it is based from the FNOL viewpoint
	// we need methods to work for noth FNOL and postfnol
	// so need to work out how to use either values from the fnol dataset or adhoc calls as part of post fnol tests
	// might just need to duplicate the methods and have one prefixed with "Following FNOL capture..."

	@Then("^I will see post FNOL exposures screen$")
	public void i_will_see_post_FNOL_exposurescreen() throws Throwable {
		postFnolExposuresPOM.isPageTitleDisplayed("Exposures");
	}
	
	
	@Given("^All exposures are at status \"([^\"]*)\" on post FNOL exposures screen$")
	public void are_all_exposures_at_status(String status) throws Throwable {
		
		Assert.assertTrue(postFnolExposuresPOM.areAllExposuresAtStatus(status));
		
	}
	

	/**
	 * This is called as part of FNOL processing 
	 * @param type
	 * @param coverage
	 * @param claimant
	 * @throws Throwable
	 */
	@Given("^I select the exposure for type \"([^\"]*)\" for coverage \"([^\"]*)\" and claimant \"([^\"]*)\"$")
	public void i_select_the_exposure_for_type_for_coverage_and_claimant(String type, String coverage, String claimant)
			throws Throwable {
		String claimantName = null;
		switch (claimant) {
		case ("TP Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_TPDriverFullName");
			break;
		case ("PH Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_Name");
			break;
		case ("Pedestrian"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PedestrianFullName");
			break;
		case ("TP Passenger"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_TPPassengerFullName");
			break;
		case ("PH Passenger"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PHPassengerFullName");
			break;
		case ("TP Property Owner"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerFullName");
			break;

		}
		postFnolExposuresPOM.clickOpenExposure(type, coverage, claimantName);
	}

	@Given("^I will see type \"([^\"]*)\" for coverage \"([^\"]*)\" and claimant \"([^\"]*)\" has been assigned to a user in group \"([^\"]*)\"$")
	public void i_will_see_type_for_coverage_has_been_assigned_to_a_user_in_group(String type, String coverage,
			String claimant,String group) throws Throwable {
		String claimantName = null;
		switch (claimant) {
		case ("TP Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_TPDriverFullName");
			break;
		case ("PH Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_Name");
			break;
		case ("PH Named Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_Named_Driver");
			break;
		case ("Pedestrian"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PedestrianFullName");
			break;
		case ("TP Passenger"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_TPPassengerFullName");
			break;
		case ("PH Passenger"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PHPassengerFullName");
			break;
		case ("TP Property Owner"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerFullName");
			break;
			
		default:
			Assert.fail("unknown claimant type :" + claimant + " - check cucumber script!");
		}
		
		String handler = postFnolExposuresPOM.getHandlerForExposure(type, coverage,claimantName);

		// fail if handler not found
		Assert.assertNotNull(handler, "Cannot find exposure in exposure table");

		Assert.assertTrue(UserToGroupMap.getGroupForUser(handler).equalsIgnoreCase(group),"Not in expected group:" + group);
		// A handler will belong to a group
	}

	/**
	 * This is called from FNOL
	 * @param type
	 * @param coverage
	 * @param group
	 * @param claimant
	 * @param reserve
	 * @throws Throwable
	 */
	@Given("^I will see type \"([^\"]*)\" for coverage \"([^\"]*)\" has been assigned to a user in group \"([^\"]*)\" for Claimant \"([^\"]*)\" with reserves amount \"([^\"]*)\"$")
	public void i_will_see_type_for_coverage_has_been_assigned_to_a_user_in_group_for_Claimant(String type,
			String coverage, String group, String claimant, String reserve) throws Throwable {

		// TODO - sort out issue with passing £ from cucumber, must be an encoding issue
		// as coming across as ?
		if (!reserve.equalsIgnoreCase("-"))
			reserve = "£" + reserve;

		// detemrine which claimant type to check against
		String claimantName = null;
		switch (claimant) {
		case ("TP Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_TPDriverFullName");
			break;
		case ("PH Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_Name");
			break;
		case ("Pedestrian"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PedestrianFullName");
			break;
		case ("TP Passenger"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_TPPassengerFullName");
			break;
		case ("PH Passenger"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PHPassengerFullName");
			break;
		case ("TP Property Owner"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerFullName");
			break;

		}

		String expReserve = postFnolExposuresPOM.getReserveForExposure(type, coverage, claimantName);
		Assert.assertNotNull(expReserve, "Cannot find reserve amount in exposure table");
		Assert.assertTrue(expReserve.equalsIgnoreCase(reserve),
				"expected TOTAL reserve amount to be :" + reserve + " but was:" + expReserve);
		
		// NOW CHECK THE GROUP ASSIGNMENT
		this.i_will_see_type_for_coverage_has_been_assigned_to_a_user_in_group(type, coverage, group,claimant);

	}

	/**
	 * this is called from FNOL
	 * @param type
	 * @param coverage
	 * @param group
	 * @param claimant
	 * @param reserve
	 * @throws Throwable
	 */
	@Given("^I will NOT see type \"([^\"]*)\" for coverage \"([^\"]*)\" has been assigned to a user in group \"([^\"]*)\" for Claimant \"([^\"]*)\" with reserves amount \"([^\"]*)\"$")
	public void i_will_notsee_type_for_coverage_has_been_assigned_to_a_user_in_group_for_Claimant(String type,
			String coverage, String group, String claimant, String reserve) throws Throwable {

		// detemrine which claimant type to check against
		String claimantName = null;
		switch (claimant) {
		case ("TP Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_TPDriverFullName");
			break;
		case ("PH Driver"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_Name");
			break;
		case ("Pedestrian"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PedestrianFullName");
			break;
		case ("TP Passenger"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_TPPassengerFullName");
			break;
		case ("PH Passenger"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PHPassengerFullName");
			break;
		case ("TP Property Owner"):
			claimantName = ExcelUtil.getTestDataValue("Fnol_PropertyNewOwnerFullName");
			break;

		}

		String expReserve = postFnolExposuresPOM.getReserveForExposure(type, coverage, claimantName);

		Assert.assertNull(expReserve, "should not have found entry in exposure table for:" + type + "," + coverage + ","
				+ claimantName + ", with reserve:" + expReserve);

	}

}
