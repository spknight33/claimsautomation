package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

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
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLLossDetailsPOM extends BaseTest{

	
	@FindBy(id = "ClaimLossDetails:ClaimLossDetailsScreen:Cancel-btnEl")
	private WebElement cancelButton;
	
	@FindBy(id = "ClaimLossDetails:ClaimLossDetailsScreen:Update-btnEl")
	private WebElement updateButton;
		
	@FindBy(id = "ClaimLossDetails:ClaimLossDetailsScreen:Edit-btnEl")
	private WebElement editButton;
	
		
	@FindBy(id = "ClaimLossDetails:ClaimLossDetailsScreen:ttlBar")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Description-inputEl")
	private WebElement circumstances;

	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:LossCause-inputEl")
	private WebElement incidentType;
	
	       
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Claim_Cause_itb-inputEl")
	private WebElement claimCause;
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Claim_Subcause_itb-inputEl")
	private WebElement claimSubCause;
		
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:EditableVehicleIncidentsLV_tb:Add-btnEl")
	private WebElement addVehicleButton;
	
	@FindBy(id="todo-changethislocator")
	private WebElement addPedestrianButton;
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Claim_Properties:EditableFixedPropertyIncidentsLV_tb:Add-btnEl")
	private WebElement addPropertyDamageButton;
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:EditableInjuryIncidentsLV_tb:Add-btnEl")
	private WebElement addInjuryButton;

	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Notification_Fault-inputEl")
	private WebElement faultType;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:LossDate-inputEl")
	private WebElement lossDate;
		

	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:IncidentQuestions_PurposeOfJourney_itb-inputEl")
	private WebElement journeyPurpose;
	
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:IncidentQuestions_VehicleUsedFor_itb-inputEl")
	private WebElement vehicleUsedFor;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:IncidentQuestions_SpeedAtImpact_itb-inputEl")
	private WebElement impactSpeed;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Claim_Weather-inputEl")
	private WebElement weather;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:IncidentQuestions_RoadConditions_itb-inputEl")
	private WebElement roadConditions;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:IncidentQuestions_SupportingPhotographicEvid_itb-inputEl")
	private WebElement photos;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:IncidentQuestions_CCTVDashcamFootageAvail_itb-inputEl")
	private WebElement cctv;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:IncidentQuestions_CCTVContactLocationDetails_itb-inputEl")
	private WebElement cctvContact;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Notification_HowReported-inputEl")
	private WebElement howReported;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:ReportedBy_Picker-inputEl")
	private WebElement reportedByDropdown;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:ReportedBy_Picker:ReportedBy_PickerMenuIcon")
	private WebElement reportedByPickerIcon;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:ReportedBy_Picker:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
	private WebElement reportedByPickerNewPerson;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Notification_ReportedByType-inputEl")
	private WebElement reporterRelationship;
	
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:MainContact_Picker-inputEl")
	private WebElement mainContactDropdown;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:MainContact_Picker:MainContact_PickerMenuIcon")
	private WebElement mainContactPickerIcon;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:MainContact_Picker:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
	private WebElement mainContactPickerNewPerson;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:Notification_MainContactType-inputEl")
	private WebElement contactRelationship;
	
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker-inputEl")
	private WebElement addressDropdown;
	
	public String getName() {

		return "Post FNOL Loss Details";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		logger.info(format("%s -check page title for step3 :"+expected, getName()));
		logger.info(format("%s -found page title for step3 :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	
	
	public void update() {

		logger.info(format("%s -  going to click Update", getName()));
		GuideWireAccessors.clickGWButton(driver,getUpdateButton());
		logger.info(format("%s - done, Update clicked", getName()));
	}
	
	public void edit() {
		logger.info(format("%s -  going to click Edit", getName()));
		GuideWireAccessors.clickGWButton(driver,getEditButton());
		logger.info(format("%s - done, Edit clicked", getName()));
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
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getIncidentType(),1);
	}
	public void selectClaimCauseType(String option)
	{
		logger.info(format("%s - going to select Claim Cause option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getClaimCause(),1);
	}
	public void selectClaimSubCauseType(String option)
	{
		logger.info(format("%s - going to select Claim SubCause option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getClaimSubCause(),1);
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
   public void addInjury() {
		logger.info(format("%s -  going to click Add Injury", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddInjuryButton());
		logger.info(format("%s - done, Add Injury clicked", getName()));
	}
   
   public void setCctvContact(String text) {
		logger.info(format("%s -  going to set cctv contact:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text,this.getCctvContact());
		logger.info(format("%s - done, set cctv contct", getName()));
	}
   
   
   public void selecHowReported(String option)
	{
		logger.info(format("%s - going to select how reported option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getHowReported(),1);
	}
   
	private WebElement getCancelButton() {
	return cancelButton;
}



	private WebElement getUpdateButton() {
		
		return updateButton;
	}
	
	private WebElement getEditButton() {


		return editButton;
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
	
	

	private WebElement getLossDate() {
		return lossDate;
	}

	private WebElement getCctvContact() {
		return cctvContact;
	}

	private WebElement getAddInjuryButton() {
		return addInjuryButton;
	}

	private WebElement getAddressDropdown() {
		return addressDropdown;
	}
	

	private WebElement getHowReported() {
		return howReported;
	}

	private WebElement getReportedByDropdown() {
		return reportedByDropdown;
	}

	private WebElement getReportedByPickerIcon() {
		return reportedByPickerIcon;
	}

	private WebElement getReportedByPickerNewPerson() {
		return reportedByPickerNewPerson;
	}

	private WebElement getReporterRelationship() {
		return reporterRelationship;
	}

	private WebElement getMainContactDropdown() {
		return mainContactDropdown;
	}

	private WebElement getMainContactPickerIcon() {
		return mainContactPickerIcon;
	}

	private WebElement getMainContactPickerNewPerson() {
		return mainContactPickerNewPerson;
	}

	private WebElement getContactRelationship() {
		return contactRelationship;
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