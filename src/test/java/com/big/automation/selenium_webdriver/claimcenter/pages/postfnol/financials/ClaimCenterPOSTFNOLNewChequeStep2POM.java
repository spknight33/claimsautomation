package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewChequeStep2POM extends BaseTest {

	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NormalCreateCheckWizard:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "NormalCreateCheckWizard:Prev")
	private WebElement backButton;
	@FindBy(id = "NormalCreateCheckWizard:Next")
	private WebElement nextButton;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:Add")
	private WebElement addPaymentButton;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:Remove")
	private WebElement removePaymentButton;

	// TODO payment table and checkbox
	
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:ReserveLine_itbInputSet:ReserveLine-inputEl")
	private WebElement reserveLineDropdown;
	// readonly fields
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:ReserveLine_itbInputSet:Coverage-inputEl")
	private WebElement coverage;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:ReserveLine_itbInputSet:CoverageSubtype-inputEl")
	private WebElement coverageSubtype;
	
	//for new reserve only
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:ReserveLine_itbInputSet:CostType-inputEl")
	private WebElement costTypeDropdown;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:ReserveLine_itbInputSet:CostCategory-inputEl")
	private WebElement costCategoryDropdown;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Payment_PaymentType-inputEl")
	private WebElement paymentTypeDropdown;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Payment_Eroding_true-inputEl")
	private WebElement reduceReservesYesOption;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Payment_Eroding_false-inputEl")
	private WebElement reduceReservesNoOption;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Transaction_AvailableReserves-inputEl")
	private WebElement availableReserves;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Payment_SelfAuthority_itb_true-inputEl")
	private WebElement selfAuthorityYesOption;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Payment_SelfAuthority_itb_false-inputEl")
	private WebElement selfAuthorityNoOption;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:Transaction_Comments-inputEl")
	private WebElement internalComments;
	
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:EditablePaymentLineItemsLV_tb:Add")
	private WebElement addLineItemButton;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:EditablePaymentLineItemsLV_tb:Remove")
	private WebElement removeLineItemButton;
	
	
	
	@FindBy(xpath = "//*[@id=\"NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:EditablePaymentLineItemsLV-body\"]//table[1]//tr//td[3]/div")
	private WebElement paymentAmount;
	
	public String getName() {

		return "Post FNOL New Cheque Step2";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(1);

		logger.info(format("%s -found page title:" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().contains(expected);
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
	public void next() {

		logger.info(format("%s -  going to click next", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getNextButton());
		
	}
	public void addPayment() {

		logger.info(format("%s -  going to click addPayment", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddPaymentButton());
		
	}
	public void removePayment() {

		logger.info(format("%s -  going to click removePayment", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getRemovePaymentButton());
		
	}
	
	public void selectReserveLine(String option)
	{
		logger.info(format("%s - going to select reserve line option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getReserveLineDropdown(), 1);
	}
	// for new reserve
	public void selectCostType(String option)
	{
		logger.info(format("%s - going to select cost type option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getCostTypeDropdown(), 1);
	}
	public void selectCostCategory(String option)
	{
		logger.info(format("%s - going to select cost category option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getCostCategoryDropdown(), 1);
	}
	
	public void selectPaymentType(String option)
	{
		logger.info(format("%s - going to select payment type option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPaymentTypeDropdown(), 1);
	}
	
	//TODO - reduce reserves and self authority
	
	public void setInternalComment(String text)
	{
		logger.info(format("%s - going to set internal comment :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getInternalComments());
	}
	
	/*public void addItem() {

		logger.info(format("%s -  going to click additem", getName()));
		GuideWireAccessors.clickGWButton(driver,this.geta);
		
	}*/
	
	public void setLineItemAmount(String text)
	{
		logger.info(format("%s - going to set line item amount:"+text, getName()));
		
		String locator = "//*[@id=\"NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:EditablePaymentLineItemsLV-body\"]//table[1]//tr//td[3]/div";
		String inputLocator = "//*[@id=\"NormalCreateCheckWizard:CheckWizard_CheckPaymentsScreen:NewCheckPaymentPanelSet:NewPaymentDetailDV:EditablePaymentLineItemsLV-body\"]//input";
		
		GuideWireAccessors.setGWTextBoxInTable(driver, text, locator, inputLocator);
	}
				
		

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getNextButton() {
		return nextButton;
	}

	private WebElement getBackButton() {
		return backButton;
	}

	private WebElement getAddPaymentButton() {
		return addPaymentButton;
	}

	private WebElement getRemovePaymentButton() {
		return removePaymentButton;
	}

	
	private WebElement getReserveLineDropdown() {
		return reserveLineDropdown;
	}

	private WebElement getCoverage() {
		return coverage;
	}

	private WebElement getCoverageSubtype() {
		return coverageSubtype;
	}

	private WebElement getCostTypeDropdown() {
		return costTypeDropdown;
	}

	private WebElement getCostCategoryDropdown() {
		return costCategoryDropdown;
	}

	private WebElement getPaymentTypeDropdown() {
		return paymentTypeDropdown;
	}

	private WebElement getReduceReservesYesOption() {
		return reduceReservesYesOption;
	}

	private WebElement getReduceReservesNoOption() {
		return reduceReservesNoOption;
	}

	private WebElement getAvailableReserves() {
		return availableReserves;
	}

	private WebElement getSelfAuthorityYesOption() {
		return selfAuthorityYesOption;
	}

	private WebElement getSelfAuthorityNoOption() {
		return selfAuthorityNoOption;
	}

	private WebElement getInternalComments() {
		return internalComments;
	}

	

	private WebElement getPaymentAmount() {
		return paymentAmount;
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}


	


	
	
	

}