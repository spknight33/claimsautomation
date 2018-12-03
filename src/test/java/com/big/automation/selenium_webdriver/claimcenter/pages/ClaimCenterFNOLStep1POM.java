package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;
import org.openqa.selenium.JavascriptExecutor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.types.Brand;

public class ClaimCenterFNOLStep1POM extends BaseTest{

	//private final WebDriver webDriver;
	//private final WebDriverWait wait;

	@FindBy(id = "FNOLWizard:FNOLWizard_FindPolicyScreen:ttlBar")
	private WebElement title;

	@FindBy(className = "message")
	private List<WebElement> errorMessages;

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

	//public ClaimCenterFNOLStep1POM(WebDriver webDriver) {

		
	//	this.wait = new WebDriverWait(webDriver,30);
	//	this.webDriver = webDriver;

	//	AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(webDriver, 60);
	//	PageFactory.initElements(ajaxElementLocatorFactory, this);
	//}
	
	
	private Map<String,String> fieldMap;
	public ClaimCenterFNOLStep1POM()
	{
		fieldMap = new HashMap<String, String>();
		fieldMap.put("PolicyNumber".toUpperCase(),"policyNumber-inputEl");
		fieldMap.put("First Name".toUpperCase(),"FirstName-inputEl");
		fieldMap.put("Last Name".toUpperCase(),"LastName-inputEl");
		fieldMap.put("Policy Type".toUpperCase(),"PolicyType-inputEl");
		fieldMap.put("Loss Date".toUpperCase(),"date-inputEl");
		fieldMap.put("Country".toUpperCase(),"Country-inputEl");
		fieldMap.put("Town/City".toUpperCase(),"City-inputEl");
		fieldMap.put("Postcode".toUpperCase(),"PostalCode-inputEl");
		fieldMap.put("VRN".toUpperCase(),"vrn-inputEl");
		
		
		// These are visible after a policy has been delected
		fieldMap.put("Claim Loss Date".toUpperCase(),"Claim_LossDate-inputEl");
		fieldMap.put("Time".toUpperCase(),"Claim_lossTime-inputEl");
		fieldMap.put("Type Of Claim".toUpperCase(),"ClaimMode_option0-inputEl");
		
		
		// These are OOTB which should not be visible
		fieldMap.put("Organisation Name".toUpperCase(),"GlobalContactNameInputSet:Name-inputEl");
		fieldMap.put("SSN or Tax id".toUpperCase(),"ssn-inputEl");
		fieldMap.put("VIN".toUpperCase(),"vin-inputEl");
		
		
		
		
	}

	public String getName() {

		return "FNOL Wizard Step1 Search or Create policy";
	}
	
	private WebElement getTitle() {
		return title;
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

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	

	public boolean containsErrorMessage(String contains) {
		boolean found = false;
		for (WebElement element : getErrorMessages()) {
			if (element.getText().equalsIgnoreCase(contains)) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	
	public WebElement getSearchLossDate() {
		return searchLossDate;
	}
	

	private WebElement getLossDate() {
		return lossDate;
	}
	

	private WebElement getCancelButton() {
		return cancelButton;
	}
	
	public void clearSearchCriteria()
	{
		this.getSearchPolicyNumber().clear();
		this.getSearchFirstName().clear();
		this.getSearchFirstName().clear();
		this.getSearchContactName().clear();
		this.getSearchLossDate().clear();
		logger.info(format("%s - done, cleared search fields", getName()));
		
	}

	public void setSearchLossDate(String searchLossDate) {
		this.getSearchLossDate().clear();
		this.getSearchLossDate().sendKeys(searchLossDate);
		logger.info(format("%s - done, Search Loss Date set:"+searchLossDate, getName()));
	}

	public void cancel() {
		this.getCancelButton().click();
		logger.info(format("%s - done, Cancel clicked", getName()));
	}

	public void setFindPolicyRadio() {
		this.getFindPolicyRadio().click();
		logger.info(format("%s - done, find policy selected", getName()));
	}
	
	public void setSearchPolicyNumber(String policyNumber)
	{
		this.getSearchPolicyNumber().clear();
		this.getSearchPolicyNumber().sendKeys(policyNumber);
		logger.info(format("%s - done, find policy numbver set: "+policyNumber, getName()));
	}

	public void setSearchFirstName(String searchFirstName) {
		this.getSearchFirstName().clear();
		this.getSearchFirstName().sendKeys(searchFirstName);
		logger.info(format("%s - done, Search First name set:"+searchFirstName, getName()));
		
	}

	public void setSearchLastName(String searchLastName) {
		this.getSearchLastName().clear();
		this.getSearchLastName().sendKeys(searchLastName);
		logger.info(format("%s - done, Search Lastname set:"+searchLastName, getName()));
		
	}

	public void setSearchContactName(String searchContact) {
		this.getSearchContactName().clear();
		this.getSearchContactName().sendKeys(searchContact);
		logger.info(format("%s - done, Search Contact Name set:"+searchContact, getName()));

	}

	public void resetSearchPolicy() {
		this.getResetSearchPolicyButton().click();
		logger.info(format("%s - done, Reset clicked", getName()));
	}

	
	public void setLossDate(String lossDate) {
		this.getLossDate().clear();
		this.getLossDate().sendKeys(lossDate);
		logger.info(format("%s - done, Loss Date set:"+lossDate, getName()));
	}
	
	public void setLossTime(String lossTime) {
		this.getLossTime().clear();
		this.getLossTime().sendKeys(lossTime);
		logger.info(format("%s - done, Loss Time set:"+lossTime, getName()));
	}

	public void searchPolicy() {

		
	
		
		logger.info(format("%s - Search Policy button ready", getName()));
		this.getSearchPolicyButton().click();
		logger.info(format("%s - done, Search Policy clicked", getName()));
	}

	public void selectFirstPolicy() {

		this.getFirstPolicySelectButton().click();
		logger.info(format("%s - done, Search Policy Select (1st) clicked", getName()));
	}

	public void deselectPolicy() {
		this.getDeSelectButton().click();
		logger.info(format("%s - done, deselect polict clicked", getName()));
	}

	public void confirmDeselectPolicy() {
		this.getConfirmDeselectOkButton().click();
		logger.info(format("%s - done, confirm deselect policy clicked", getName()));
	}
	
	
	public void next() {

		sleep(2);
		//WaitForUtils.waitForElementToBeClickable(webDriver, getNextButton());
		getNextButton().click();
		logger.info(format("%s - done, Next clicked", getName()));
	}
	
	
	
	public boolean inputFieldOnScreen(String fieldName) throws Exception
	{
		boolean onscreen = false;
		logger.info(format("%s - check inputfield on screen: "+fieldName, getName()));
		
		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = fieldMap.get(fieldName.toUpperCase());
		
		
		if (locatorId == null )
			throw new Exception("unknown fieldName in field map : "+ fieldName);
		
		String xpathLocator = "//input[contains(@id,'" + locatorId + "')]";
		onscreen = driver.findElements( By.xpath(xpathLocator) ).size() == 1;
		
		return onscreen;
	}
	
	public boolean inputFieldNotOnScreen(String fieldName) throws Exception
	{
		boolean onscreen = false;
		logger.info(format("%s - check inputfield NOT on screen: "+fieldName, getName()));
		
		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = fieldMap.get(fieldName.toUpperCase());
		
		
		if (locatorId == null )
			throw new Exception("unknown fieldName in field map : "+ fieldName);
		
		String xpathLocator = "//input[contains(@id,'" + locatorId + "')]";
		onscreen = driver.findElements( By.xpath(xpathLocator) ).size() == 0;
		
		return onscreen;
	}
	
	
	
	
	
	
	

}