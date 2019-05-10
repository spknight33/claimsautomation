package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLCreateRecoveryPOM extends BaseTest {

	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:ttlBar")
	private WebElement pageTitle;
	

	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:Update")
	private WebElement updateButton;
	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:Cancel")
	private WebElement cancelButton;
	
	
	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:Payer-inputEl")
	private WebElement payerDropdown;
	
	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:Payer:PayerMenuIcon")
	private WebElement payerPickerIcon;
	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:Payer:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement payerNewPersonPicker;
	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:Payer:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-itemEl")
	private WebElement payerNewCompanyPicker;
	
	
	
	
	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:Add")
	private WebElement addButton;
	@FindBy(id = "NewMultipleRecoverySet:NewRecoveryScreen:Remove")
	private WebElement removeButton;
	

	
	

	public String getName() {

		return "Post FNOL Create Recoveries";
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
	
	
	public void update() {

		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getUpdateButton());
		
	}
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	
	
	
	
	public void add() {

		logger.info(format("%s -  going to click add", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddButton());
		
	}
	public void remove() {

		logger.info(format("%s -  going to click remove", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getRemoveButton());
		
	}
	
	
	public void selectPayer(String option) {

		logger.info(format("%s -  going to select payer: "+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPayerDropdown(), 1);
		
	}
	
	
	
	
	public void addRecovery() {

		logger.info(format("%s -  going to click add recovery ", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddButton());
		
	}
	
	
	public void createRecovery(String reserveLine, String category, String amount,String comment)
	{
		this.selectReserveLine(reserveLine, 1);
	   this.selectRecoveryCategory(category, 1);	
	   this.setRecoveryAmount(amount, 1);
		
		
	}
	
	private void selectReserveLine(String option, int sequence)
	{
		logger.info(format("%s -  going to select recovery reserve line:"+option, getName()));

		String locator = "//*[@id=\"NewMultipleRecoverySet:NewRecoveryScreen:1-body\"]//table[" + sequence + "]//tr/td[2]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		
	}
	
	private void selectRecoveryCategory(String option, int sequence)
	{
		logger.info(format("%s -  going to select recovery category:"+option, getName()));

		String locator = "//*[@id=\"NewMultipleRecoverySet:NewRecoveryScreen:1-body\"]//table[" + sequence + "]//tr/td[3]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		
	}
	

	private void setRecoveryAmount(String text, int sequence)
	{
		//TODO make this line specfici
		logger.info(format("%s - going to set recovery  amount:"+text, getName()));
		
		String locator = "//*[@id=\"NewMultipleRecoverySet:NewRecoveryScreen:1-body\"]//table[" + sequence + "]//tr//td[4]/div";
		String inputLocator = "//*[@id=\"NewMultipleRecoverySet:NewRecoveryScreen:1-body\"]//input[starts-with(@id,'textfield-')]";
		
		GuideWireAccessors.setGWTextBoxInTable(driver, text, locator, inputLocator);
	}
	
	

	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getPayerDropdown() {
		return payerDropdown;
	}

	private WebElement getPayerPickerIcon() {
		return payerPickerIcon;
	}

	private WebElement getPayerNewPersonPicker() {
		return payerNewPersonPicker;
	}

	private WebElement getPayerNewCompanyPicker() {
		return payerNewCompanyPicker;
	}

	private WebElement getAddButton() {
		return addButton;
	}

	private WebElement getRemoveButton() {
		return removeButton;
	}
	
	
	

	
	
	
	

}