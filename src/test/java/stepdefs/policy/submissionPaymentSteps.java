package stepdefs.policy;

import com.big.automation.selenium_webdriver.claimcenter.pages.policycreate.ClaimCenterPolicySubmissionPaymentPOM;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import cucumber.api.java.en.When;

public class submissionPaymentSteps extends BaseTest {

    @When("^I click issue policy at payment step$")
    public void I_CLICK_ISSUE_POLICY() throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.issuePolicy();
    }

    @When("^I set Document preference to \"([^\"]*)\" at the payment step of submission$")
    public void I_SET_DOCUMENT_PREFERENCE(String option) throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.selectDocPreference(option);
    }

    //Annual Payment Plan     OR     Installment New Business Payment
    @When("^I set installment plan to \"([^\"]*)\" at the payment step of submission$")
    public void I_SET_INSTALLMENT_PLAN(String option) throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.selectInstallmentPlan(option);
    }

    @When("^I set is the card registered to you to \"([^\"]*)\" at the payment step of submission$")
    public void I_SET_CARD_REGISTERED_TO_YOU(Boolean bool) throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.selectCardRegisteredToYou(bool);
    }

    @When("^I click to add bank payment at the payment step of submission$")
    public void I_CLICK_TO_ADD_BANK_PAYMENT() throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.clickAddBankPaymentButton();
    }

    @When("^I set account type to \"([^\"]*)\" at the payment step of submission$")
    public void I_SET_ACCOUNT_TYPE(String option) throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.selectAccountType(option);
    }

    @When("^I set account number to \"([^\"]*)\" at the payment step of submission$")
    public void I_SET_ACCOUNT_Number(String number) throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.setAccountNumber(number);
    }

    @When("^I set account sort code to \"([^\"]*)\" at the payment step of submission$")
    public void I_SET_ACCOUNT_SORT_CODE(String sortCode) throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.setSortCode(sortCode);
    }

    @When("^I set solely authorised to make payments to \"([^\"]*)\" at the payment step of submission$")
    public void I_SET_AUTHORISED_TO_MAKE_PAYMENTS(Boolean bool) throws Throwable {
        policyCenterPolicySubmissionPaymentPOM.setAuthorisedToMakePaymentRadio(bool);
    }


}
