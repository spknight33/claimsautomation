package stepdefs.postfnol.cheques;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CCPOSTFNOLChequesStep2Steps extends BaseTest {
	
	
	@Then("^I will see post FNOL New System Cheque Step2 screen$")
	public void i_will_see_post_syschequestep2screen() throws Throwable {
		postFnolNewChequeStep2POM.isPageTitleDisplayed("Step 2 of 3: Enter payment information");
	}
	
	
	@Given("^I click \"([^\"]*)\" button on New System Cheque Step2 post FNOL$")
	public void i_click_button(String fieldName) {
		switch (fieldName) {
		case "next":
			postFnolNewChequeStep2POM.next();
			break;
		case "add payment":
			postFnolNewChequeStep2POM.addPayment();
			break;


		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
		
	}
	@Given("^I click add payment button on New System Cheque Step2 post FNOL$")
	public void next() {
		
		postFnolNewChequeStep2POM.next();
	}
	
	//TODO add payment button
	
	/*@Given("^I select \"([^\"]*)\" Payment Method at New System Cheque Step2 post FNOL$")
	public void i_select_Payment_Method_at_New_System_Cheque_Step_post_FNOL(String fieldName) throws Throwable {
	switch(fieldName)
	    {
	case "Cheque":
		postFnolNewChequeStep1POM.selectChequePaymentMethod();
	    	break;
	case "EFT":
		postFnolNewChequeStep1POM.selectEFTPaymentMethod();
		break;
	    	
    default:
    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
    }
	}*/
	
	
	@Given("^I select \"([^\"]*)\" from field \"([^\"]*)\" at New System Cheque Step2 post FNOL$")
	public void i_select_from_field_on_chequestep1postfnol_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Reserve Line":
			postFnolNewChequeStep2POM.selectReserveLine(fieldValue);
		    	break;
		case "Payment Type":
			postFnolNewChequeStep2POM.selectPaymentType(fieldValue);
		    	break;
			   	
		case "Cost Type":
			postFnolNewChequeStep2POM.selectCostType(fieldValue);
		    	break;
		case "Cost Category":
			postFnolNewChequeStep2POM.selectCostCategory(fieldValue);
		    	break;
		
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" field at New System Cheque Step2 post FNOL$")
	public void i_input_into_the_box(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "Internal Comments":
			postFnolNewChequeStep2POM.setInternalComment(fieldValue);
			break;
		case "Line Item Amount":
			postFnolNewChequeStep2POM.setLineItemAmount(fieldValue);
			break;


		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	@Then("^Mandatory field error messages will be shown at New System Cheque Step2 post FNOL$")
	public void mandatory_field_error_messages_will_be_shown(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(postFnolNewChequeStep2POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}
	
	
	
	
	

}
