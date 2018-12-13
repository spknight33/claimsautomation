package com.big.automation.selenium_webdriver.claimcenter.pages;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

public class ClaimCenterFNOLStep3POM extends BaseTest{

	
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	
	@FindBy(id = "FNOLWizard:Next-btnEl")
	private WebElement nextButton;
		
	@FindBy(id = "FNOLWizard:Prev-btnEl")
	private WebElement backButton;
	
	@FindBy(id = "FFNOLWizard:Finish-btnEl")
	private WebElement finishButton;
	
	@FindBy(id = "title")
	private WebElement titleDropDown;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:ttlBar")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Description-inputEl")
	private WebElement circumstances;

	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_LossCause-inputEl")
	private WebElement incidentType;
	
	       
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_Cause_itb-inputEl")
	private WebElement claimCause;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_Subcause_itb-inputEl")
	private WebElement claimSubCause;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentOnly-inputEl")
	private WebElement incidentOnlyCB;
	
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:VehicleIncidentIterator:0:VehicleIncidentDV:VehicleName-inputEl")
	private WebElement insuredVehicleLink;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:AddVehicleButton-btnEl")
	private WebElement addVehicleButton;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:AddPedestrianButton-btnEl")
	private WebElement addPedestrianButton;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:AddPropertyDamageButton-btnEl")
	private WebElement addPropertyDamageButton;
	
	@FindBy(id ="FFNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:CategorizationDV:Notification_Fault-inputEl")
	private WebElement faultType;
	
	
	@FindBy(id ="NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton-btnEl")
	private WebElement closeDuplicateClaimWindow;
	private String closeDuplicateClaimLocator = "NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton-btnEl";
	

	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_PurposeOfJourney_itb-inputEl")
	private WebElement journeyPurpose;
	
	
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_VehicleUsedFor_itb-inputEl")
	private WebElement vehicleUsedFor;
	
	public String getName() {

		return "FNOL Wizard Step3 Add Claim Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		logger.info(format("%s -check page title for step3 :"+expected, getName()));
		logger.info(format("%s -found page title for step3 :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		getCancelButton().click();
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void finish() {

		logger.info(format("%s -  going to click finish", getName()));
		getFinishButton().click();
		logger.info(format("%s - done, Finish clicked", getName()));
	}
	
	public void next() {

		logger.info(format("%s -  going to click Next", getName()));
		getNextButton().click();
		logger.info(format("%s - done, Next clicked", getName()));
	}
	
	public void back() {
		logger.info(format("%s -  going to click Back", getName()));
		this.getBackButton().click();
		logger.info(format("%s - done, Back clicked", getName()));
	}


	
	public void setJourneyPurpose(String purpose)
	{
		logger.info(format("%s - setting journey purpose: "+purpose, getName()));
		this.getJourneyPurpose().clear();
		this.getJourneyPurpose().sendKeys(purpose);
	}
	
	public String getClaimCauseValue() {

		return this.getClaimCause().getAttribute("value");

	}
	
	public String getClaimSubCauseValue() {

		return this.getClaimSubCause().getAttribute("value");

	}
	
	public void setCircumstancesValue(String circumstances)
	{
		logger.info(format("%s - setting circumstances: "+circumstances, getName()));
		this.getCircumstances().clear();
		this.getCircumstances().sendKeys(circumstances);
	}
	

	public void closeDuplicateClaimWindow()
	{
		
		logger.info(format("%s - going to close duplicate cliam window if its open", getName()));
		//*[@id="NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton-btnEl"]
		String xpathLocator = "//*[@id='"+  this.closeDuplicateClaimLocator + "']";
		if(driver.findElements( By.xpath(xpathLocator) ).size() > 0)
		{
			logger.info(format("%s - going to close duplicate cliam window as its open", getName()));
			// close it if present
			driver.findElement(By.xpath(xpathLocator)).click();
		}
		else
		{
			logger.info(format("%s - NOT going to close duplicate cliam window as not open", getName()));
		}
	
	}
	
	
	public boolean incidentTypeContainsOption(String option)
	{
		boolean found=false;
		logger.info(format("%s - going to check if options in Incident Type:"+option, getName()));
		this.getIncidentType().click();
		String optionLocator = "//li[contains(text(),'"  + option + "')]";
		found = this.getIncidentType().findElements( By.xpath(optionLocator) ).size() > 0;
		
		return found;
	}
	public boolean faultTypeContainsOption(String option)
	{
		boolean found=false;
		logger.info(format("%s - going to check if options in Fault Type:"+option, getName()));
		this.getFaultType().click();
		String optionLocator = "//li[contains(text(),'"  + option + "')]";
		found = this.getFaultType().findElements( By.xpath(optionLocator) ).size() > 0;
		
		return found;
	}
	
	public void selectIncidentType(String option)
	{
		logger.info(format("%s - going to select IncidentType option :"+option, getName()));
		sleep(1);
		this.getIncidentType().click();
		sleep(3);
		String optionLocator = "//li[contains(text(),'"  + option + "')]";
		this.getIncidentType().findElement(By.xpath(optionLocator)).click();
	}
	public void selectClaimCauseType(String option)
	{
		logger.info(format("%s - going to select Claim Cause option :"+option, getName()));
	    sleep(1);
		this.getClaimCause().click();
		sleep(3);
		String optionLocator = "//li[contains(text(),'"  + option + "')]";
		this.getClaimCause().findElement(By.xpath(optionLocator)).click();
	}
	public void selectClaimSubCauseType(String option)
	{
		logger.info(format("%s - going to select Claim SubCause option :"+option, getName()));
		sleep(1);
		this.getClaimSubCause().click();
		sleep(3);
		String optionLocator = "//li[contains(text(),'"  + option + "')]";
		this.getClaimSubCause().findElement(By.xpath(optionLocator)).click();
	}


   public void selectIncidentOnlyCB()
   {
	   logger.info(format("%s - current Incident only CB selection is :"+this.getIncidentOnlyCB().isSelected(), getName()));
   // can be more than one, but just select first for now
	   if (!this.getIncidentOnlyCB().isSelected())
	   {
		   this.getIncidentOnlyCB().click();
		   logger.info(format("%s - done, select Incident Only", getName()));
		   
	   }
   }
   
   public void deselectIncidentOnlyCB()
   {
   // can be more than one, but just deselect first for now
	   logger.info(format("%s - done, going to deselect Incident Only", getName()));
	   if (this.getIncidentOnlyCB().isSelected())
	   {
		   this.getIncidentOnlyCB().click();
		   logger.info(format("%s - done, deselect Incident Only", getName()));
	   }
   }
   
   public void addVehicle() {
		logger.info(format("%s -  going to click AddVehicle", getName()));
		this.getAddVehicleButton().click();
		logger.info(format("%s - done, Add Vehicle clicked", getName()));
	}
   
   public void selectVehicleUsedFor(String option)
	{
		logger.info(format("%s - going to select VehicleUser for option :"+option, getName()));
		sleep(1);
		this.getVehicleUsedFor().click();
		sleep(2);
		String optionLocator = "//li[contains(text(),'"  + option + "')]";
		this.getVehicleUsedFor().findElement(By.xpath(optionLocator)).click();
	}
		
   
   public void selectInsuredVehicle() {
		logger.info(format("%s -  going to click INSUREDVehicle", getName()));
		sleep(4); // TODO make explicit waits
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",this.getInsuredVehicleLink());
		this.getInsuredVehicleLink().click();
		
		//Actions actions = new Actions(driver);
		//actions.moveToElement(this.getInsuredVehicleLink());
		
		//actions.click();
	
		//actions.build().perform();
		
		logger.info(format("%s - done, Insured Vehicle clicked", getName()));
	}
   
   public void addPedestrian() {
		logger.info(format("%s -  going to click AddPedestrian", getName()));
		this.getAddPedestrianButton().click();
		logger.info(format("%s - done, Add Pedestrian clicked", getName()));
	}
   
   public void addPropertyDamage() {
		logger.info(format("%s -  going to click Add PropertyDamage", getName()));
		this.getAddPropertyDamageButton().click();
		logger.info(format("%s - done, Add PropertyDamage clicked", getName()));
	}
   
	private WebElement getCancelButton() {
	return cancelButton;
}

private WebElement getFinishButton() {
	return finishButton;
}

	private WebElement getNextButton() {
		
		return nextButton;
	}
	
	private WebElement getBackButton() {


		return backButton;
	}
	private WebElement getCircumstances() {
		return circumstances;
	}
	private WebElement getIncidentType() {
		return incidentType;
	}

	
	private WebElement getClaimCause()
	{
		return claimCause;
	}
	private WebElement getClaimSubCause()
	{
		return claimSubCause;
	}
	private WebElement getIncidentOnlyCB()
	{
		return incidentOnlyCB;
	}
	private WebElement getAddVehicleButton()
	{
		return addVehicleButton;
	}
	private WebElement getAddPedestrianButton()
	{
		return addPedestrianButton;
	}
	private WebElement getAddPropertyDamageButton()
	{
		return addPropertyDamageButton;
	}
	private List<WebElement> getErrorMessages(){
		return errorMessages;
	}
	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	
	
	
	
	
	private WebElement getVehicleUsedFor() {
		return vehicleUsedFor;
	}

	private WebElement getJourneyPurpose() {
		return journeyPurpose;
	}

	private WebElement getInsuredVehicleLink() {
		return insuredVehicleLink;
	}

	private WebElement getFaultType() {
		return faultType;
	}

	public boolean containsErrorMessage(String contains)
	{
		boolean found=false;
		for (WebElement element : getErrorMessages()) 
		{
			if (element.getText().equalsIgnoreCase(contains))
			{
				found = true;
				break;
			}
		}
		return found;
	}
	
	
	


}