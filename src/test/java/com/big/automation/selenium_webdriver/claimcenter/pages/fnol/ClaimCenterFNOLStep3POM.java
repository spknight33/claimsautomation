package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLStep3POM extends BaseTest{

	
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	
	@FindBy(id = "FNOLWizard:Next-btnEl")
	private WebElement nextButton;
		
	@FindBy(id = "FNOLWizard:Prev-btnEl")
	private WebElement backButton;
	
	@FindBy(id = "FNOLWizard:Finish-btnEl")
	private WebElement finishButton;
	
	@FindBy(id = "title")
	private WebElement titleDropDown;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:ttlBar")
	private WebElement pageTitle;


	//@FindBy(className = "message")
	//private List <WebElement> errorMessages;
	
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

	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:CategorizationDV:Notification_Fault-inputEl")
	private WebElement faultType;
	
	
	@FindBy(id ="NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton-btnEl")
	private WebElement closeDuplicateClaimWindow;
	private String closeDuplicateClaimLocator = "NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton-btnEl";
	

	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_PurposeOfJourney_itb-inputEl")
	private WebElement journeyPurpose;
	
	
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_VehicleUsedFor_itb-inputEl")
	private WebElement vehicleUsedFor;
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_SpeedAtImpact_itb-inputEl")
	private WebElement impactSpeed;
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_Weather-inputEl")
	private WebElement weather;
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_RoadConditions_itb-inputEl")
	private WebElement roadConditions;
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_SupportingPhotographicEvid_itb-inputEl")
	private WebElement photos;
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_CCTVDashcamFootageAvail_itb-inputEl")
	private WebElement cctv;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:PoliceDetailsLV:PoliceDetailsLV_tb:Add-btnEl")
	private WebElement addPoliceButton;
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:PoliceDetailsLV:PoliceDetailsLV_tb:Remove-btnEl")
	private WebElement removePoliceButton;
	
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker-inputEl")
	private WebElement addressDropdown;
	
	public String getName() {

		return "FNOL Wizard Step3 Add Claim Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	
		logger.info(format("%s -found page title :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public boolean containsErrorMessage(String contains)
	{
		
		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,getCancelButton());
		
	}
	
	public void finish() {

		logger.info(format("%s -  going to click finish", getName()));
		GuideWireAccessors.clickGWButton(driver,getFinishButton());
	
	}
	
	public void next() {

		logger.info(format("%s -  going to click Next", getName()));
		GuideWireAccessors.clickGWButton(driver,getNextButton());
		
	}
	
	public void back() {
		logger.info(format("%s -  going to click Back", getName()));
		GuideWireAccessors.clickGWButton(driver,getBackButton());
		
	}


	
	public void setJourneyPurpose(String purpose)
	{
		logger.info(format("%s - setting journey purpose: "+purpose, getName()));
		GuideWireAccessors.setGWTextBox(driver,purpose, this.getJourneyPurpose());
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
		GuideWireAccessors.setGWTextBox(driver, circumstances, this.getCircumstances());
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
		int initialWait=3;
		String selectedOption = GuideWireAccessors.getSelectedValueFromGWDropdown(driver, this.getFaultType(),initialWait);
		logger.info(format("%s - selected option in Fault Type:"+selectedOption, getName()));
		if (option.equalsIgnoreCase(selectedOption))
		{
			found = true;
		}
		return found;
	}
	
	public void selectIncidentType(String option)
	{
		logger.info(format("%s - going to select IncidentType option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getIncidentType(),1);
	}
	public void selectClaimCauseType(String option)
	{
		logger.info(format("%s - going to select Claim Cause option :"+option, getName()));
		
		// due to gw limitations, need to trap any cause option which is the same text as incident type
		if(option.equalsIgnoreCase("Misfuelling") || option.equalsIgnoreCase("Malicious Damage"))
		{
			GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getClaimCause(),2); 	// get the second occurence
		}
		else
		{
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getClaimCause(),1); 
		}
	}
	public void selectClaimSubCauseType(String option)
	{
		logger.info(format("%s - going to select Claim SubCause option :"+option, getName()));
		if(option.equalsIgnoreCase("Storm Damage") || option.equalsIgnoreCase("Repair") || option.equalsIgnoreCase("Replace") || option.equalsIgnoreCase("Unknown")|| option.equalsIgnoreCase("Reported by TP"))
		{
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getClaimSubCause(),2); // get second occurence
		}
		else
		{
			GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getClaimSubCause(),1);
		}
		
	}
	
	public void selectImpactSpeed(String option)
	{
		logger.info(format("%s - going to select impact speed option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getImpactSpeed(),1);
	}
	
	public void selectWeather(String option)
	{
		logger.info(format("%s - going to select Weather option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getWeather(),1);
	}
	public void selectRoadConditions(String option)
	{
		logger.info(format("%s - going to select road conditions option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getRoadConditions(),1);
	}
	public void selectPhotos(String option)
	{
		logger.info(format("%s - going to select photos option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getPhotos(),1);
	}
	public void selectCctv(String option)
	{
		logger.info(format("%s - going to select cctv option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getCctv(),2);
	}
	public void selectFaultType(String option)
	{
		logger.info(format("%s - going to select fault type option :"+option, getName()));
		sleep(2);
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getFaultType(),1);
	}
	public void selectAddressLocation(String option)
	{
		logger.info(format("%s - going to select address location option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getAddressDropdown(),1);
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
		GuideWireAccessors.clickGWButton(driver,getAddVehicleButton());
		logger.info(format("%s - done, Add Vehicle clicked", getName()));
	}
   
   public void selectVehicleUsedFor(String option)
	{
		logger.info(format("%s - going to select VehicleUser for option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVehicleUsedFor(),1);
	}
		
   
   public void selectInsuredVehicle() {
		logger.info(format("%s -  going to click INSUREDVehicle", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getInsuredVehicleLink());
		logger.info(format("%s - done, Insured Vehicle clicked", getName()));
	}
   
   public void addPedestrian() {
		logger.info(format("%s -  going to click AddPedestrian", getName()));
		GuideWireAccessors.clickGWButton(driver,getAddPedestrianButton());
		logger.info(format("%s - done, Add Pedestrian clicked", getName()));
	}
   
   public void addPropertyDamage() {
		logger.info(format("%s -  going to click Add PropertyDamage", getName()));
		GuideWireAccessors.clickGWButton(driver, getAddPropertyDamageButton());
		logger.info(format("%s - done, Add PropertyDamage clicked", getName()));
	}
   
   public void addPoliceDetails() {
		logger.info(format("%s -  going to click Add Police", getName()));
		GuideWireAccessors.clickGWButton(driver,getAddPoliceButton());
		logger.info(format("%s - done, Add Police clicked", getName()));
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
	//private List<WebElement> getErrorMessages() {
	//	return driver.findElements(By.className("message"));
	//}
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
	

	private WebElement getImpactSpeed() {
		return impactSpeed;
	}

	private WebElement getWeather() {
		return weather;
	}

	private WebElement getRoadConditions() {
		return roadConditions;
	}

	private WebElement getPhotos() {
		return photos;
	}

	private WebElement getCctv() {
		return cctv;
	}
	

	private WebElement getAddressDropdown() {
		return addressDropdown;
	}
	
	

	private WebElement getTitleDropDown() {
		return titleDropDown;
	}

	private WebElement getCloseDuplicateClaimWindow() {
		return closeDuplicateClaimWindow;
	}

	private String getCloseDuplicateClaimLocator() {
		return closeDuplicateClaimLocator;
	}

	private WebElement getAddPoliceButton() {
		return addPoliceButton;
	}

	private WebElement getRemovePoliceButton() {
		return removePoliceButton;
	}

	
	
	

}