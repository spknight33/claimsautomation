package stepdefs.postfnol.exposures;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCPOSTFNOLViewExposureSteps extends BaseTest {

	public void completeFNOLExposureForTestScenario() {
		// TODO - to use ScenarioData

	}

	@Then("^I will see post FNOL exposure screen for \"([^\"]*)\"$")
	public void i_will_see_post_FNOL_exposure_screen_for(String type) throws Throwable {
		switch (type) {
		case ("1st Party Vehicle"):
			postFnolViewVehicleExposurePOM.isPageTitleDisplayed(type);
			break;
		case ("3rd Party Vehicle"):
			postFnolViewVehicleExposurePOM.isPageTitleDisplayed(type);
			break;
		case ("3rd Party Bodily Injury"):
			postFnolViewInjuryExposurePOM.isPageTitleDisplayed(type);
			break;
		case ("3rd Party Property"):
			postFnolViewPropertyExposurePOM.isPageTitleDisplayed(type);
			break;
		case ("3rd Party Credit Hire"):
			postFnolViewCreditHireExposurePOM.isPageTitleDisplayed(type);
			break;
		case ("3rd Party Protocol Hire"):
			postFnolViewProtocolHireExposurePOM.isPageTitleDisplayed(type);
			break;
		case ("TP Capture"):
			postFnolViewTPCaptureExposurePOM.isPageTitleDisplayed(type);
			break;
		}

	}

	@Then("^I will see \"([^\"]*)\" is \"([^\"]*)\" on post FNOL \"([^\"]*)\" exposure screen$")
	public void i_will_see_is_on_post_FNOL_exposure_screen(String fieldName, String fieldValue, String exposureType)
			throws Throwable {
		switch (exposureType) {
		case ("1st Party Vehicle"):
			checkFieldValueForVehicleExposure(fieldName, fieldValue);
			break;
		case ("3rd Party Vehicle"):
			checkFieldValueForVehicleExposure(fieldName, fieldValue);
			break;
		case ("3rd Party Bodily Injury"):
			checkFieldValueForInjuryExposure(fieldName, fieldValue);
			break;
		case ("3rd Party Property"):
			checkFieldValueForPropertyExposure(fieldName, fieldValue);
			break;
		case ("3rd Party Credit Hire"):
			checkFieldValueForCreditHireExposure(fieldName, fieldValue);
			break;
		case ("3rd Party Protocol Hire"):
			checkFieldValueForProtocolHireExposure(fieldName, fieldValue);
			break;
		case ("TP Capture"):
			checkFieldValueForTPCaptureExposure(fieldName, fieldValue);
			break;
		}
	}

	private void checkFieldValueForVehicleExposure(String fieldName, String fieldValue) {
		switch (fieldName) {
		case ("Claimant Type"):
			Assert.assertEquals(fieldValue, postFnolViewVehicleExposurePOM.getClaimantType());
			break;
		// TODO claimant
		}
	}

	private void checkFieldValueForInjuryExposure(String fieldName, String fieldValue) {
		switch (fieldName) {
		case ("Claimant Type"):
			Assert.assertEquals(fieldValue, postFnolViewInjuryExposurePOM.getClaimantType());
			break;
		// TODO claimant
		}
	}

	private void checkFieldValueForPropertyExposure(String fieldName, String fieldValue) {
		switch (fieldName) {
		case ("Claimant Type"):
			Assert.assertEquals(fieldValue, postFnolViewPropertyExposurePOM.getClaimantType());
			break;
		// TODO claimant
		}
	}

	private void checkFieldValueForCreditHireExposure(String fieldName, String fieldValue) {
		switch (fieldName) {
		case ("Claimant Type"):
			Assert.assertEquals(fieldValue, postFnolViewCreditHireExposurePOM.getClaimantType());
			break;
		// TODO claimant
		}
	}

	private void checkFieldValueForProtocolHireExposure(String fieldName, String fieldValue) {
		switch (fieldName) {
		case ("Claimant Type"):
			Assert.assertEquals(fieldValue, postFnolViewProtocolHireExposurePOM.getClaimantType());
			break;
		// TODO claimant
		}
	}
	
	private void checkFieldValueForTPCaptureExposure(String fieldName, String fieldValue) {
		switch (fieldName) {
		case ("Claimant Type"):
			Assert.assertEquals(fieldValue, postFnolViewTPCaptureExposurePOM.getClaimantType());
			break;
		// TODO claimant
		}
	}


	@Given("^I click \"([^\"]*)\" on post FNOL \"([^\"]*)\" exposure screen$")
	public void i_select_on_exposure_screen(String button, String exposureType) throws Throwable {
		switch (exposureType) {
		case ("1st Party Vehicle"):
			clickForVehicleExposure(button);
			break;
		case ("3rd Party Vehicle"):
			clickForVehicleExposure(button);
			break;
		case ("3rd Party Bodily Injury"):
			clickForInjuryExposure(button);
			break;
		case ("3rd Party Property"):
			clickForPropertyExposure(button);
			break;
		case ("3rd Party Credit Hire"):
			clickForCreditHireExposure(button);
			break;
		case ("3rd Party Protocol Hire"):
			clickForProtocolHireExposure(button);
			break;
		// TODO tpcapture

		}

	}

	private void clickForVehicleExposure(String button) {
		switch (button) {
		case "Update":
			postFnolViewVehicleExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolViewVehicleExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolViewVehicleExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	private void clickForInjuryExposure(String button) {
		switch (button) {
		case "Update":
			postFnolViewInjuryExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolViewInjuryExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolViewInjuryExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	private void clickForPropertyExposure(String button) {
		switch (button) {
		case "Update":
			postFnolViewPropertyExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolViewPropertyExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolViewPropertyExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	private void clickForCreditHireExposure(String button) {
		switch (button) {
		case "Update":
			postFnolViewCreditHireExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolViewCreditHireExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolViewCreditHireExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	private void clickForProtocolHireExposure(String button) {
		switch (button) {
		case "Update":
			postFnolViewProtocolHireExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolViewProtocolHireExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolViewProtocolHireExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}
	private void clickForTPCaptureExposure(String button) {
		switch (button) {
		case "Update":
			postFnolViewTPCaptureExposurePOM.selectUpdate();
			break;
		case "Cancel":
			postFnolViewTPCaptureExposurePOM.selectCancel();
			;
			break;
		case "Edit":
			postFnolViewTPCaptureExposurePOM.selectEdit();
			break;

		default:
			Assert.fail("unknown input field :" + button + " - check cucumber script!");
		}
	}

	@When("^I click the uptoexposures link on \"([^\"]*)\" exposure screen for Post FNOL$")
	public void i_click_the_uptoexposures_link_on_exposure_screen_for_Post_FNOL(String exposureType) throws Throwable {
		switch (exposureType) {
		case ("1st Party Vehicle"):
			postFnolViewVehicleExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Vehicle"):
			postFnolViewVehicleExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Bodily Injury"):
			postFnolViewInjuryExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Property"):
			postFnolViewPropertyExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Credit Hire"):
			postFnolViewCreditHireExposurePOM.selectUpToExposures();
			break;
		case ("3rd Party Protocol Hire"):
			postFnolViewProtocolHireExposurePOM.selectUpToExposures();
			break;
		case ("TP Capture"):
			postFnolViewTPCaptureExposurePOM.selectUpToExposures();
			break;

		default:
			Assert.fail("unknown input field :" + exposureType + " - check cucumber script!");
		}

	}

}
