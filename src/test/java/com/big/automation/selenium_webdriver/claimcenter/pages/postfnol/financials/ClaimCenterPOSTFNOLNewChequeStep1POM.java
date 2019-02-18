package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewChequeStep1POM extends BaseTest {

	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NormalCreateCheckWizard:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "NormalCreateCheckWizard:Next")
	private WebElement nextButton;
	
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:claimant-inputEl")
	private WebElement claimantDropdown;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:PrimaryPayee_Name-inputEl")
	private WebElement payeeDropdown;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:PrimaryPayee_Name:PrimaryPayee_NameMenuIcon")
	private WebElement payeePickerIcon;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:PrimaryPayee_Name:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-itemEl")
	private WebElement payeePickerNewCompany;
	//TODO other pickers
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:PaymentMethod_option1-inputEl")
	private WebElement paymentMethodChequeOption;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:PaymentMethod_option2-inputEl")
	private WebElement paymentMethodEFTOption;
	
	
	//EFT only fields
	//-----------------------
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:EFTDataInputSet:EFTRecords-inputEl")
	private WebElement eftRecordDropdown;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:EFTDataInputSet:PayTo-inputEl")
	private WebElement eftNameOnAccount;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:EFTDataInputSet:BankName-inputEl")
	private WebElement eftBankName;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:EFTDataInputSet:BankAccountNumber-inputEl")
	private WebElement eftAccountNumber;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:EFTDataInputSet:BankAccountNumber_MENU")
	private WebElement eftAccountNumberPickerIcon;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:EFTDataInputSet:BankAccountNumber_MENU:edit-itemEl")
	private WebElement eftAccountNumberPickerDelete;
	//TODO new value doesnt have a good id to use
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:EFTDataInputSet:BankAccountNumber_MENU")
	private WebElement eftAccountNumberPickerNewValue;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:EFTDataInputSet:BankRoutingNumber-inputEl")
	private WebElement eftSortCode;
	
	//CHEQUE only fields
	//-----------------------------------
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:PayTo-inputEl")
	private WebElement chequePayTo;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:DeliveryMethod-inputEl")
	private WebElement chequeDeliveryDropdown;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailToContact-inputEl")
	private WebElement chequeRecipient;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddress-inputEl")
	private WebElement chequeMailingAddress;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl")
	private WebElement chequeAddressLine1;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine2-inputEl")
	private WebElement chequeAddressLine2;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine3-inputEl")
	private WebElement chequeAddressLine3;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement chequeAddressCity;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:County-inputEl")
	private WebElement chequeAddressCounty;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement chequeAddressPostcode;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:addresses-inputEl")
	private WebElement chequeAddressDropdown;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:NewCheckPayeeDV:MailingAddressInputSet:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement chequeAddressLocation;

	public String getName() {

		return "Post FNOL New Cheque Step1";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(1);

		logger.info(format("%s -found page title:" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().contains(expected);
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	public void next() {

		logger.info(format("%s -  going to click next", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getNextButton());
		
	}
	
	
	public void selectClaimant(String option)
	{
		logger.info(format("%s - going to select claimant option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getClaimantDropdown(),1); // first on screen
	}
	
	public void selectPayee(String option)
	{
		logger.info(format("%s - going to select payee option :"+option, getName()));
	
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getPayeeDropdown(),2); // could be second on screen if insured
	}
	
	public void selectChequePaymentMethod()
	{
		logger.info(format("%s - going to select cheque payment method", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getPaymentMethodChequeOption());
	}
	public void selectEFTPaymentMethod()
	{
		logger.info(format("%s - going to select EFT payment method", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getPaymentMethodEFTOption());
	}
	
	
	//EFT methods
	//------------------
	public void selectEFTRecord(String option)
	{
		logger.info(format("%s - going to select EFT record option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getEftRecordDropdown(), 1);
	}
	public void setEFTAccountName(String text)
	{
		logger.info(format("%s - going to set EFT account name :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getEftNameOnAccount());
	}
	public void setEFTBankName(String text)
	{
		logger.info(format("%s - going to set EFT bank name :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getEftBankName());
	}
	
	// TODO accountnumber
	public void setEFTAccountNumber(String text)
	{
		logger.info(format("%s - going to set EFT account number :"+text, getName()));
		// need to click delete first and can then edit
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getEftAccountNumberPickerIcon(), this.getEftAccountNumberPickerDelete());
		sleep(1);
		GuideWireAccessors.setGWTextBox(driver, text, this.getEftAccountNumber());
	}
	
	public void setEFTSortCode(String text)
	{
		logger.info(format("%s - going to set EFT sort code :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getEftSortCode());
	}
	
	
	
	//CHEQUE methods
	//---------------
	public void setChequePayTo(String text)
	{
		logger.info(format("%s - going to set pay to :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequePayTo());
	}
	public void selectChequeDelivery(String option)
	{
		logger.info(format("%s - going to select cheque delivery option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getChequeDeliveryDropdown(), 1);
	}	
	public void setChequeRecipient(String text)
	{
		logger.info(format("%s - going to set recipient:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeRecipient());
	}
	
	public void setAddressLine1(String text)
	{
		logger.info(format("%s -  going to set address line1", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeAddressLine1());
		
	}
	public void setAddressLine2(String text)
	{
		logger.info(format("%s -  going to set address line2", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeAddressLine2());
		
	}
	public void setAddressLine3(String text)
	{
		logger.info(format("%s -  going to set address line3", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeAddressLine3());
		
	}
	public void setCity(String text)
	{
		logger.info(format("%s -  going to set city", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeAddressCity());
		
	}
	public void setCounty(String text)
	{
		logger.info(format("%s -  going to set County", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeAddressCounty());
		
	}
	public void setPostcode(String text)
	{
		logger.info(format("%s -  going to set postcode:"+text, getName()));
		// TODO for some reason this takes  abit of setting!!
	sleep(3);
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeAddressPostcode());
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeAddressPostcode());
		// as postcode causes display off other address fields, but this can take a couple of seconds - the next method should wait until available but add a slug anyway
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				sleep(2);
		
	}
	
	public void selectPostcodeAddress(String option)
	{
		logger.info(format("%s -  going to select address:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getChequeAddressDropdown(), 1);
		
	}
	public void setLocationDesc(String text)
	{
		logger.info(format("%s -  going to set location desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getChequeAddressLocation());
		
	}
	

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getNextButton() {
		return nextButton;
	}

	private WebElement getClaimantDropdown() {
		return claimantDropdown;
	}

	private WebElement getPayeeDropdown() {
		return payeeDropdown;
	}

	private WebElement getPayeePickerIcon() {
		return payeePickerIcon;
	}

	private WebElement getPayeePickerNewCompany() {
		return payeePickerNewCompany;
	}

	private WebElement getPaymentMethodChequeOption() {
		return paymentMethodChequeOption;
	}

	private WebElement getPaymentMethodEFTOption() {
		return paymentMethodEFTOption;
	}

	private WebElement getEftRecordDropdown() {
		return eftRecordDropdown;
	}

	private WebElement getEftNameOnAccount() {
		return eftNameOnAccount;
	}

	private WebElement getEftBankName() {
		return eftBankName;
	}

	private WebElement getEftAccountNumber() {
		return eftAccountNumber;
	}

	private WebElement getEftAccountNumberPickerIcon() {
		return eftAccountNumberPickerIcon;
	}

	private WebElement getEftAccountNumberPickerDelete() {
		return eftAccountNumberPickerDelete;
	}

	private WebElement getEftAccountNumberPickerNewValue() {
		return eftAccountNumberPickerNewValue;
	}

	private WebElement getEftSortCode() {
		return eftSortCode;
	}

	private WebElement getChequePayTo() {
		return chequePayTo;
	}

	private WebElement getChequeDeliveryDropdown() {
		return chequeDeliveryDropdown;
	}

	private WebElement getChequeRecipient() {
		return chequeRecipient;
	}

	private WebElement getChequeMailingAddress() {
		return chequeMailingAddress;
	}

	private WebElement getChequeAddressLine1() {
		return chequeAddressLine1;
	}

	private WebElement getChequeAddressLine2() {
		return chequeAddressLine2;
	}

	private WebElement getChequeAddressLine3() {
		return chequeAddressLine3;
	}

	private WebElement getChequeAddressCity() {
		return chequeAddressCity;
	}

	private WebElement getChequeAddressCounty() {
		return chequeAddressCounty;
	}

	private WebElement getChequeAddressPostcode() {
		return chequeAddressPostcode;
	}

	private WebElement getChequeAddressDropdown() {
		return chequeAddressDropdown;
	}

	private WebElement getChequeAddressLocation() {
		return chequeAddressLocation;
	}

	


	


	
	
	

}