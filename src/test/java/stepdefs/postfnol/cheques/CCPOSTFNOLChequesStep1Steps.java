package stepdefs.postfnol.cheques;

import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CCPOSTFNOLChequesStep1Steps extends BaseTest {
	
	
	@Then("^I will see post FNOL New System Cheque Step1 screen$")
	public void i_will_see_post_syschequestep1screen() throws Throwable {
		postFnolNewChequeStep1POM.isPageTitleDisplayed("Step 1 of 3: Enter payee information");
	}
	
	
	@Given("^I click next button on New System Cheque Step1 post FNOL$")
	public void next() {
		
		postFnolNewChequeStep1POM.next();
	}
	
	@Given("^I select \"([^\"]*)\" Payment Method at New System Cheque Step1 post FNOL$")
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
	}
	
	
	@Given("^I select \"([^\"]*)\" from field \"([^\"]*)\" at New System Cheque Step1 post FNOL$")
	public void i_select_from_field_on_chequestep1postfnol_screen(String fieldValue, String fieldName) throws Throwable {
		switch(fieldName)
		    {
		case "Claimant":
			postFnolNewChequeStep1POM.selectClaimant(fieldValue);
		    	break;
		case "Payee":
			postFnolNewChequeStep1POM.selectPayee(fieldValue);
		    	break;
		 //TODO type	   	
		case "EFT Record":
			postFnolNewChequeStep1POM.selectEFTRecord(fieldValue);
		    	break;
		case "Cheque Delivery":
			postFnolNewChequeStep1POM.selectChequeDelivery(fieldValue);
		    	break;
		case "Cheque Address":
			postFnolNewChequeStep1POM.selectPostcodeAddress(fieldValue);
		    	break;
		    	
	    default:
	    Assert.fail("unknown input field :"+ fieldName+" - check cucumber script!");
	    }
	}
	
	@Given("^I input \"([^\"]*)\" into the \"([^\"]*)\" field at New System Cheque Step1 post FNOL$")
	public void i_input_into_the_box(String fieldValue, String fieldName) throws Throwable {
		switch (fieldName) {
		case "EFT Account Name":
			postFnolNewChequeStep1POM.setEFTAccountName(fieldValue);
			break;
		case "EFT Bank Name":
			postFnolNewChequeStep1POM.setEFTBankName(fieldValue);
			break;
		case "EFT AccountNumber":
			postFnolNewChequeStep1POM.setEFTAccountNumber(fieldValue);
			break;
		case "EFT SortCode":
			postFnolNewChequeStep1POM.setEFTSortCode(fieldValue);
			break;
		case "Cheque PayTo":
			postFnolNewChequeStep1POM.setChequePayTo(fieldValue);
			break;
		case "Cheque Recipient":
			postFnolNewChequeStep1POM.setChequeRecipient(fieldValue);
			break;
		case "Cheque Address Line1":
			postFnolNewChequeStep1POM.setAddressLine1(fieldValue);
			break;
		case "Cheque Address Line2":
			postFnolNewChequeStep1POM.setAddressLine2(fieldValue);
			break;
		case "Cheque Address Line3":
			postFnolNewChequeStep1POM.setAddressLine3(fieldValue);
			break;
		case "Cheque Address City":
			postFnolNewChequeStep1POM.setCity(fieldValue);
			break;
		case "Cheque Address County":
			postFnolNewChequeStep1POM.setCounty(fieldValue);
			break;
		case "Cheque Address Postcode":
			postFnolNewChequeStep1POM.setPostcode(fieldValue);
			break;
		case "Cheque Address Location":
			postFnolNewChequeStep1POM.setLocationDesc(fieldValue);
			break;






		default:
			Assert.fail("unknown input field :" + fieldName + " - check cucumber script!");
		}
	}
	
	
	@Then("^Mandatory field error messages will be shown at New System Cheque Step1 post FNOL$")
	public void mandatory_field_error_messages_will_be_shown(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
	    SoftAssert softAssert = new SoftAssert();
			for(int i=0; i<list.size(); i++) {
				softAssert.assertTrue(postFnolNewChequeStep1POM.containsErrorMessage(list.get(i)),"Error Message Check: "+ list.get(i));
				
			}
			softAssert.assertAll();
		}
	
	
	
	
	

}
