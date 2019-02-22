package stepdefs.postfnol.cheques;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CCPOSTFNOLChequesStep3Steps extends BaseTest {
	
	
	@Then("^I will see post FNOL New System Cheque Step3 screen$")
	public void i_will_see_post_syschequestep3screen() throws Throwable {
		postFnolNewChequeStep3POM.isPageTitleDisplayed("Step 3 of 3: Set payment instructions");
	}
	
	
	@Given("^I click finish button on New System Cheque Step3 post FNOL$")
	public void finish() {
		
		postFnolNewChequeStep3POM.finish();
	}
	
	
	
	@Given("^I select \"([^\"]*)\" from field \"([^\"]*)\" at New System Cheque Step3 post FNOL$")
	public void i_select_from_field_on_chequestep3postfnol_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Cheque Batching":
			postFnolNewChequeStep3POM.selectChequeBatching(fieldValue);
		    	break;
		case "Cheque Instructions":
			postFnolNewChequeStep3POM.selectChequeInstructions(fieldValue);
		    	break;
		
		
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" field at New System Cheque Step3 post FNOL$")
	public void i_input_into_the_box(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Reference":
			postFnolNewChequeStep3POM.setReference(fieldValue);
			break;
		case "Purpose":
			postFnolNewChequeStep3POM.setPurpose(fieldValue);
			break;


		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	@Then("^Mandatory field error messages will be shown at New System Cheque Step3 post FNOL$")
	public void mandatory_field_error_messages_will_be_shown(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(postFnolNewChequeStep3POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}
	
	
	
	
	

}
