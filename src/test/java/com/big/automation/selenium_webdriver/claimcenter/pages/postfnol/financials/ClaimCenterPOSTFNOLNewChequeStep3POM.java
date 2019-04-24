package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewChequeStep3POM extends BaseTest {

	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckInstructionsScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NormalCreateCheckWizard:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "NormalCreateCheckWizard:Prev")
	private WebElement backButton;
	@FindBy(id = "NormalCreateCheckWizard:Finish")
	private WebElement finishButton;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckInstructionsScreen:NewPaymentInstructionsDV:CheckWizardCheckSummaryInputSet:Check_Reference-inputEl")
	private WebElement reference;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckInstructionsScreen:NewPaymentInstructionsDV:CheckWizardCheckSummaryInputSet:Check_PurposeOfPayment-inputEl")
	private WebElement purpose;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Payment_SelfAuthority_itb_true-inputEl")
	private WebElement selfAuthorityYesOption;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Payment_SelfAuthority_itb_false-inputEl")
	private WebElement selfAuthorityNoOption;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckInstructionsScreen:NewPaymentInstructionsDV:CheckWizardCheckSummaryInputSet:SelfAuthority_itb_true-inputEl")
	private WebElement chequeBatchingDropdown;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckInstructionsScreen:NewPaymentInstructionsDV:CheckWizardCheckSummaryInputSet:SelfAuthority_itb_false-inputEl")
	private WebElement chequeInstructionsDropdown;
	
	@FindBy(id ="WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton")
	private WebElement closeWarningsWindow;
	private String closeWarningsLocator = "WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton";
	
	
	

	public String getName() {

		return "Post FNOL New Cheque Step3";
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
	public void back() {

		logger.info(format("%s -  going to click back", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getBackButton());
		
	}
	public void finish() {

		logger.info(format("%s -  going to click finish", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getFinishButton());
		
		// we may get prompt for validation warnings
		//clear any if necessary
		logger.info(format("%s - going to close warnings window if its open", getName()));

		String xpathLocator = "//*[@id='"+  this.closeWarningsLocator + "']";
		if(driver.findElements( By.xpath(xpathLocator) ).size() > 0)
		{
				logger.info(format("%s - going to close warnings window as its open", getName()));
					// close it if present
					driver.findElement(By.xpath(xpathLocator)).click();
					GuideWireAccessors.clickGWButton(driver,getFinishButton());
		}
		else
			{
				logger.info(format("%s - NOT going to warnings window as not open", getName()));
			}
		
	}
	
	
	public void setReference(String text)
	{
		logger.info(format("%s - going to set reference :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getReference());
	}
	public String getCurrentReference()
	{
		logger.info(format("%s - going to get reference ", getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getReference());
	}
	
	public void setPurpose(String text)
	{
		logger.info(format("%s - going to set purpose :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPurpose());
	}
	
	
	public void selectChequeBatching(String option)
	{
		logger.info(format("%s - going to select cheque batching option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getChequeBatchingDropdown(), 1);
	}
	
	public void selectChequeInstructions(String option)
	{
		logger.info(format("%s - going to select cheque instructions option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getChequeInstructionsDropdown(), 1);
	}
	
	
	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getBackButton() {
		return backButton;
	}

	private WebElement getFinishButton() {
		return finishButton;
	}

	private WebElement getReference() {
		return reference;
	}

	private WebElement getPurpose() {
		return purpose;
	}

	private WebElement getChequeBatchingDropdown() {
		return chequeBatchingDropdown;
	}

	private WebElement getChequeInstructionsDropdown() {
		return chequeInstructionsDropdown;
	}



	private WebElement getSelfAuthorityYesOption() {
		return selfAuthorityYesOption;
	}

	private WebElement getSelfAuthorityNoOption() {
		return selfAuthorityNoOption;
	}
	


	


	
	
	

}