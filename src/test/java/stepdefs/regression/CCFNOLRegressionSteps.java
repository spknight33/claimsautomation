package stepdefs.regression;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.When;
import stepdefs.CCFNOLStep5Steps;


public class CCFNOLRegressionSteps extends BaseTest {

	//CCFNOLStep1Steps step1Steps = new CCFNOLStep1Steps();
	//CCFNOLStep2Steps step2Steps = new CCFNOLStep2Steps();
	//CCFNOLStep3Steps step3Steps = new CCFNOLStep3Steps();
	//CCFNOLStep4Steps step4Steps = new CCFNOLStep4Steps();
	CCFNOLStep5Steps step5Steps = new CCFNOLStep5Steps();
	//CCFNOLPedestrianSteps pedestrianSteps = new CCFNOLPedestrianSteps();
	//CCFNOLPropertySteps propertySteps = new CCFNOLPropertySteps();
	//CCFNOLVehicleSteps vehicleSteps = new CCFNOLVehicleSteps();
	
	//TODO this to be driven by cucumnber to load a specific data set
	

	@When("^I create a claim as part of a regression test$")
	public void i_create_a_claim_as_part_of_a_regression_test() throws Throwable {
		
		//TODO - jump straight to step3 for now, but change to go through other steps later
		//step2Steps.completeFNOLStep2ForTestScenario();
		//step3Steps.completeFNOLStep3ForTestScenario();
		//step4Steps.completeFNOLStep4ForTestScenario(scenaroData);
		step5Steps.completeFNOLStep5ForTestScenario();
	}
	

}
