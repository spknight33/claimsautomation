package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLStep1POM extends BaseTest {

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:ttlBar")
	private WebElement pageTitle;

	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;

	@FindBy(id = "FNOLWizard:Next-btnEl")
	private WebElement nextButton;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:ScreenMode_true-inputEl")
	private WebElement findPolicyRadio;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:policyNumber-inputEl")
	private WebElement searchPolicyNumber;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:GlobalPersonNameInputSet:FirstName-inputEl")
	private WebElement searchFirstName;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:GlobalPersonNameInputSet:LastName-inputEl")
	private WebElement searchLastName;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:GlobalContactNameInputSet:Name-inputEl")
	private WebElement searchContactName;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyType-inputEl")
	private WebElement searchPolicyType;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:date-inputEl")
	private WebElement searchLossDate;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:FNOLWizard_PolicySearchInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:Country-inputEl")
	private WebElement searchCountry;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:FNOLWizard_PolicySearchInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement searchTownCity;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:FNOLWizard_PolicySearchInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement searchPostcode;

	// TODO check when code deliverd that the locator uses vin?
	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:FNOLWizard_PolicySearchInputSet:vin-inputEl")
	private WebElement searchVRN;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Search")
	private WebElement searchPolicyButton;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Reset")
	private WebElement resetSearchPolicyButton;

	// not bothered which?
	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyResultLV:0:selectButton")
	private WebElement firstPolicySelectButton;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_LossDate-inputEl")
	private WebElement lossDate;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:Claim_lossTime-inputEl")
	private WebElement lossTime;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyResultLV:0:unselectButton")
	private WebElement unselectButton;

	@FindBy(id = "button-1005-btnEl")
	private WebElement okDeselectPrompt;

	private Map<String, String> fieldMap;

	public ClaimCenterFNOLStep1POM() {
		fieldMap = new HashMap<String, String>();
		fieldMap.put("PolicyNumber".toUpperCase(), "policyNumber-inputEl");
		fieldMap.put("First Name".toUpperCase(), "FirstName-inputEl");
		fieldMap.put("Last Name".toUpperCase(), "LastName-inputEl");
		fieldMap.put("Policy Type".toUpperCase(), "PolicyType-inputEl");
		fieldMap.put("Loss Date".toUpperCase(), "date-inputEl");
		fieldMap.put("Country".toUpperCase(), "Country-inputEl");
		fieldMap.put("Town/City".toUpperCase(), "City-inputEl");
		fieldMap.put("Postcode".toUpperCase(), "PostalCode-inputEl");
		fieldMap.put("VRN".toUpperCase(), "vin-inputEl");

		// These are visible after a policy has been delected
		fieldMap.put("Claim Loss Date".toUpperCase(), "Claim_LossDate-inputEl");
		fieldMap.put("Time".toUpperCase(), "Claim_lossTime-inputEl");
		fieldMap.put("Type Of Claim".toUpperCase(), "ClaimMode_option0-inputEl");

		// These are OOTB which should not be visible
		fieldMap.put("Organisation Name".toUpperCase(), "GlobalContactNameInputSet:Name-inputEl");
		fieldMap.put("SSN or Tax id".toUpperCase(), "ssn-inputEl");
		// fieldMap.put("VIN".toUpperCase(),"vin-inputEl");

	}

	public String getName() {

		return "FNOL Wizard Step1 Search or Create policy";
	}

	public boolean isPageTitleDisplayed(String expected) {

		logger.info(format("%s -found page title :" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}

	private WebElement getFindPolicyRadio() {
		return findPolicyRadio;
	}

	private WebElement getSearchPolicyNumber() {
		return searchPolicyNumber;
	}

	private WebElement getSearchPolicyType() {
		return searchPolicyType;
	}

	private WebElement getResetSearchPolicyButton() {
		return resetSearchPolicyButton;
	}

	private WebElement getLossTime() {
		return lossTime;
	}

	private WebElement getSearchFirstName() {
		return searchFirstName;
	}

	private WebElement getSearchLastName() {
		return searchLastName;
	}

	private WebElement getSearchContactName() {
		return searchContactName;
	}

	private WebElement getSearchPolicyButton() {

		return searchPolicyButton;
	}

	private WebElement getConfirmDeselectOkButton() {

		return okDeselectPrompt;
	}

	private WebElement getNextButton() {

		return nextButton;
	}

	private WebElement getFirstPolicySelectButton() {

		return firstPolicySelectButton;
	}

	private WebElement getDeSelectButton() {

		return unselectButton;
	}

	public WebElement getSearchLossDate() {
		return searchLossDate;
	}

	private WebElement getLossDate() {
		return lossDate;
	}

	private WebElement getSearchTownCity() {
		return searchTownCity;
	}

	private WebElement getSearchVRN() {
		return searchVRN;
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	public void clearSearchCriteria() {
		this.getSearchPolicyNumber().clear();
		this.getSearchFirstName().clear();
		this.getSearchFirstName().clear();
		this.getSearchContactName().clear();
		this.getSearchLossDate().clear();
		logger.info(format("%s - done, cleared search fields", getName()));

	}

	public void setSearchLossDate(String searchLossDate) {
		GuideWireAccessors.setGWTextBox(driver, searchLossDate, getSearchLossDate());
		logger.info(format("%s - done, Search Loss Date set:" + searchLossDate, getName()));
	}

	public void cancel() {
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		logger.info(format("%s - done, Cancel clicked", getName()));
	}

	// TODO
	public void setFindPolicyRadio() {
		this.getFindPolicyRadio().click();
		logger.info(format("%s - done, find policy selected", getName()));
	}

	public void setSearchVRN(String vrn) {

		GuideWireAccessors.setGWTextBox(driver, vrn, getSearchVRN());
		logger.info(format("%s - done, vrn set: " + vrn, getName()));
	}

	public void setSearchPolicyNumber(String policyNumber) {
		GuideWireAccessors.setGWTextBox(driver, policyNumber, getSearchPolicyNumber());
		logger.info(format("%s - done, policy number set: " + policyNumber, getName()));
	}

	public void setSearchFirstName(String searchFirstName) {
		GuideWireAccessors.setGWTextBox(driver, searchFirstName, getSearchFirstName());
		logger.info(format("%s - done, Search First name set:" + searchFirstName, getName()));

	}

	public void setSearchLastName(String searchLastName) {
		GuideWireAccessors.setGWTextBox(driver, searchLastName, getSearchLastName());
		logger.info(format("%s - done, Search Lastname set:" + searchLastName, getName()));

	}

	public void setSearchContactName(String searchContact) {
		GuideWireAccessors.setGWTextBox(driver, searchContact, getSearchContactName());
		logger.info(format("%s - done, Search Contact Name set:" + searchContact, getName()));

	}

	public void resetSearchPolicy() {
		GuideWireAccessors.clickGWButton(driver, this.getResetSearchPolicyButton());
		logger.info(format("%s - done, Reset clicked", getName()));
	}

	public void setLossDate(String lossDate) {
		GuideWireAccessors.setGWTextBox(driver, lossDate, getLossDate());
		logger.info(format("%s - done, Loss Date set:" + lossDate, getName()));
	}

	public void setLossTime(String lossTime) {
		GuideWireAccessors.setGWTextBox(driver, lossTime, getLossTime());
		logger.info(format("%s - done, Loss Time set:" + lossTime, getName()));
	}

	public void searchPolicy() {

		logger.info(format("%s - Search Policy button ready", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getSearchPolicyButton());
		logger.info(format("%s - done, Search Policy clicked", getName()));
	}

	public void selectFirstPolicy() {

		GuideWireAccessors.clickGWButton(driver, getFirstPolicySelectButton());
		logger.info(format("%s - done, Search Policy Select (1st) clicked", getName()));
	}

	public void deselectPolicy() {
		GuideWireAccessors.clickGWButton(driver, this.getDeSelectButton());
		logger.info(format("%s - done, deselect polict clicked", getName()));
	}

	public void confirmDeselectPolicy() {
		GuideWireAccessors.clickGWButton(driver, this.getConfirmDeselectOkButton());
		logger.info(format("%s - done, confirm deselect policy clicked", getName()));
	}

	public void setPostcode(String text) {
		GuideWireAccessors.setGWTextBox(driver, text, this.getSearchPostcode());
		logger.info(format("%s - done, postcode set:" + text, getName()));
	}

	public void next() {

		GuideWireAccessors.clickGWButton(driver, getNextButton());
		logger.info(format("%s - done, Next clicked", getName()));
	}

	public boolean inputFieldOnScreen(String fieldName) throws Exception {
		boolean onscreen = false;
		logger.info(format("%s - check inputfield on screen: " + fieldName, getName()));

		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = fieldMap.get(fieldName.toUpperCase());

		if (locatorId == null)
			throw new Exception("unknown fieldName in field map : " + fieldName);

		String xpathLocator = "//input[contains(@id,'" + locatorId + "')]";
		onscreen = driver.findElements(By.xpath(xpathLocator)).size() == 1;

		return onscreen;
	}

	public boolean inputFieldNotOnScreen(String fieldName) throws Exception {
		boolean onscreen = false;
		logger.info(format("%s - check inputfield NOT on screen: " + fieldName, getName()));

		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = fieldMap.get(fieldName.toUpperCase());

		if (locatorId == null)
			throw new Exception("unknown fieldName in field map : " + fieldName);

		String xpathLocator = "//input[contains(@id,'" + locatorId + "')]";
		onscreen = driver.findElements(By.xpath(xpathLocator)).size() == 0;

		return onscreen;
	}

	// this needs to be updated to check the actual column field, for now just chekc
	// the text is within the table
	public boolean policySearchResultsShownForColumn(String value, String resultscolumn) throws Exception {
		boolean onscreen = false;
		logger.info(format(
				"%s - check policy search results are on screen for value: " + value + " for column: " + resultscolumn,
				getName()));

		sleep(2);

		String locator = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyResultLV-body";
		WebElement results = driver.findElement(By.id(locator));

		if (results == null)
			throw new Exception("cannot find policy search results");

		String xpathLocator = "//*[contains(text(),'" + value + "')]"; // some results in div others in a
		onscreen = results.findElements(By.xpath(xpathLocator)).size() > 0; // at least one found

		return onscreen;
	}

	private WebElement getSearchCountry() {
		return searchCountry;
	}

	private WebElement getSearchPostcode() {
		return searchPostcode;
	}

	private WebElement getUnselectButton() {
		return unselectButton;
	}

	private WebElement getOkDeselectPrompt() {
		return okDeselectPrompt;
	}

	private Map<String, String> getFieldMap() {
		return fieldMap;
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

}