package com.big.automation.selenium_webdriver.claimcenter.pages.policycreate;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;
import com.big.automation.selenium_webdriver.common.utilities.SeleniumUtils;
import com.sun.jna.platform.win32.Guid;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.format;

public class ClaimCenterPolicySubmissionPaymentPOM extends BaseTest {

    //Web Elements
    @FindBy(id = "FNOLWizard:Prev-btnEl")
    private WebElement backButton;

    @FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:ttlBar")
    private WebElement pageTitle;

    @FindBy(id = "SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardBillingToolbarButtonSet:BindAndIssue-btnEl")
    private WebElement issuePolicyButton;

    @FindBy(id = "SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:DocumentationPreference-trigger-picker")
    private WebElement documentPreferenceDropDown;

    @FindBy(xpath = "//div[text() = 'Annual Payment Plan']/../..//div[contains(@class,'radio')]")
    private WebElement annualPaymentRadio;

    @FindBy(xpath = "//div[text() = 'Installment New Business Payment']/../..//div[contains(@class,'radio')]")
    private WebElement installmentPaymentRadio;

   @FindBy(xpath = "//input[@id = 'SubmissionWizard:SubmissionWizard_PaymentScreen:UpFrontPaymentDV:IsCardRegistered_true-inputEl']")
    private WebElement cardRegisteredToYouYesRadio;

    @FindBy(xpath = "//input[@id = 'SubmissionWizard:SubmissionWizard_PaymentScreen:UpFrontPaymentDV:IsCardRegistered_false-inputEl']")
    private WebElement cardRegisteredToYouNoRadio;

    @FindBy(id = "SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV_tb:Add-btnInnerEl")
    private WebElement addBankPaymentDetailsButton;

    @FindBy(xpath = "//div[@id = 'SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV-body']//td[3]")
    private WebElement bankPaymentDetailsTableAccountType;
    @FindBy(xpath = "//div[@id = 'SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV-body']//td[4]")
    private WebElement bankPaymentDetailsTableAccountNumber;
    @FindBy(xpath = "//div[@id = 'SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV-body']//td[5]")
    private WebElement bankPaymentDetailsTableAccountSortCode;
    @FindBy(xpath = "//div[@id = 'SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV-body']//td[6]//label[text() = 'Yes']")
    private WebElement bankPaymentDetailsTableAccountAuthorisedYes;
    @FindBy(xpath = "//div[@id = 'SubmissionWizard:SubmissionWizard_PaymentScreen:BankPaymentDetailsDV:ContactEFTLV-body']//td[6]//label[text() = 'No']")
    private WebElement bankPaymentDetailsTableAccountAuthorisedNo;



    //Methods
    public void issuePolicy() {
        logger.info("Clicking issue policy ");
        GuideWireAccessors.clickGWButton(driver,getIssuePolicyButton());
    }

    public void selectDocPreference(String option){
        logger.info("Going to select Claim Cause option :"+option);
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getDocumentPreferenceDropDown(),1);
    }

    public void selectInstallmentPlan(String type){
        switch(type) {
            case "Annual":
                logger.info("Selecting yearly installments");
                GuideWireAccessors.clickGWButton(driver,getAnnualPaymentRadio());
                break;
            case "Monthly":
                logger.info("Selecting monthly installments");
                GuideWireAccessors.clickGWButton(driver,getInstallmentPaymentRadio());
                break;
            default:
                logger.info("Invalid plan type");
        }
    }

    public void selectCardRegisteredToYou(Boolean bool){
        if(bool == false){
            GuideWireAccessors.clickGWButton(driver,getCardRegisteredToYouNoRadio());
            logger.info("Selecting No to 'Is the card registered to you'");
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getCardRegisteredToYouYesRadio());
            logger.info("Selecting Yes to 'Is the card registered to you'");
        }
    }

    public void clickAddBankPaymentButton(){
        GuideWireAccessors.clickGWButton(driver,getAddBankPaymentDetailsButton());
        logger.info("Clicking add bankPayment button");
    }

    //Company or Individual
    public void selectAccountType(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getBankPaymentDetailsTableAccountType(),1);
        logger.info("Attempting to select " + option + "from account type");
    }

    public void setAccountNumber(String number){
        GuideWireAccessors.setGWTextBox(driver,number,getBankPaymentDetailsTableAccountNumber());
        logger.info("Attempting to set account number to " + number);
    }

    public void setSortCode(String sortCode){
        GuideWireAccessors.setGWTextBox(driver,sortCode,getBankPaymentDetailsTableAccountSortCode());
        logger.info("Attempting to set sort code to " + sortCode);
    }

    //True or false
    public void setAuthorisedToMakePaymentRadio(boolean bool){
        if(bool == false){
            GuideWireAccessors.clickGWButton(driver,getBankPaymentDetailsTableAccountAuthorisedNo());
            logger.info("Selecting No to 'Are you solely authorised to make payments on this account'");
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getBankPaymentDetailsTableAccountAuthorisedYes());
            logger.info("Selecting Yes to 'Are you solely authorised to make payments on this account'");
        }
    }

    //Getters
    public WebElement getBackButton() {
        return backButton;
    }

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public WebElement getIssuePolicyButton() {
        return issuePolicyButton;
    }

    public WebElement getDocumentPreferenceDropDown() {
        return documentPreferenceDropDown;
    }

    public WebElement getAnnualPaymentRadio() {
        return annualPaymentRadio;
    }

    public WebElement getInstallmentPaymentRadio() {
        return installmentPaymentRadio;
    }

    public WebElement getCardRegisteredToYouYesRadio() {
        return cardRegisteredToYouYesRadio;
    }

    public WebElement getCardRegisteredToYouNoRadio() {
        return cardRegisteredToYouNoRadio;
    }

    public WebElement getAddBankPaymentDetailsButton() {
        return addBankPaymentDetailsButton;
    }

    public WebElement getBankPaymentDetailsTableAccountType() {
        return bankPaymentDetailsTableAccountType;
    }

    public WebElement getBankPaymentDetailsTableAccountNumber() {
        return bankPaymentDetailsTableAccountNumber;
    }

    public WebElement getBankPaymentDetailsTableAccountSortCode() {
        return bankPaymentDetailsTableAccountSortCode;
    }

    public WebElement getBankPaymentDetailsTableAccountAuthorisedYes() {
        return bankPaymentDetailsTableAccountAuthorisedYes;
    }

    public WebElement getBankPaymentDetailsTableAccountAuthorisedNo() {
        return bankPaymentDetailsTableAccountAuthorisedNo;
    }
}
