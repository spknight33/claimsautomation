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

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:PolicyType-inputEl")
	private WebElement searchPolicyType;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:date-inputEl")
	private WebElement searchLossDate;
	
	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:FNOLWizard_PolicySearchInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement searchTownCity;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:FNOLWizard_PolicySearchInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:County-inputEl")
	private WebElement searchCounty;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:FNOLWizardFindPolicyPanelSet:FNOLWizard_PolicySearchInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement searchPostcode;

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

	public void setFindPolicyRadio() {
		logger.info(format("%s - select find policy", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getFindPolicyRadio());
		}
	
	public void cancel() {
		logger.info(format("%s - Going to click Cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		
	}
	public void next() {
		logger.info(format("%s - going to click Next", getName()));
		GuideWireAccessors.clickGWButton(driver, getNextButton());
		
	}

	
	// Search Criteria Fields
	//--------------------------------------------------------------------------------
	public void setSearchPolicyNumber(String policyNumber) {
		logger.info(format("%s - going to set search pilicy number: " + policyNumber, getName()));
		GuideWireAccessors.setGWTextBox(driver, policyNumber, getSearchPolicyNumber());
	}
	public void setSearchFirstName(String searchFirstName) {
		logger.info(format("%s - going to set search first name:" + searchFirstName, getName()));
		GuideWireAccessors.setGWTextBox(driver, searchFirstName, getSearchFirstName());
	}
	public void setSearchLastName(String searchLastName) {
		logger.info(format("%s - Going to set search Lastname:" + searchLastName, getName()));
		GuideWireAccessors.setGWTextBox(driver, searchLastName, getSearchLastName());
	}
	public void setSearchLossDate(String searchLossDate) {
		logger.info(format("%s - Going to set search Loss Date:" + searchLossDate, getName()));
		GuideWireAccessors.setGWTextBox(driver, searchLossDate, getSearchLossDate());
}
	public void setSearchTownCity(String text) {
		logger.info(format("%s - going to set search town city:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getSearchTownCity());
	}
	public void setSearchCounty(String text) {
		logger.info(format("%s - going to set search county:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getSearchCounty());
	}
	public void setSearchPostcode(String text) {
		logger.info(format("%s - going to set search postcode:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getSearchPostcode());
	}
	public void setSearchVRN(String vrn) {
		logger.info(format("%s - going to set search vrn: " + vrn, getName()));
		GuideWireAccessors.setGWTextBox(driver, vrn, getSearchVRN());
	}

	// Search buttons
	// --------------------------------------------
	public void searchPolicy() {
		logger.info(format("%s - Search Policy button click", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getSearchPolicyButton());
	}
	public void resetSearchPolicy() {
		logger.info(format("%s - going to click Reset search", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getResetSearchPolicyButton());
	}


	//Policy search results
	//---------------------------------------------------------------------------------
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
	public void setLossDate(String lossDate) {
		GuideWireAccessors.setGWTextBox(driver, lossDate, getLossDate());
		logger.info(format("%s - done, Loss Date set:" + lossDate, getName()));
	}
	public void setLossTime(String lossTime) {
		logger.info(format("%s - going to set Loss Time:" + lossTime, getName()));
		GuideWireAccessors.setGWTextBox(driver, lossTime, getLossTime());
		
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
	
	
	public void clearSearchCriteria() {
		this.getSearchPolicyNumber().clear();
		this.getSearchFirstName().clear();
		this.getSearchFirstName().clear();
		this.getSearchLossDate().clear();
		logger.info(format("%s - done, cleared search fields", getName()));

	}

	private WebElement getSearchCounty() {
		return searchCounty;
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
}