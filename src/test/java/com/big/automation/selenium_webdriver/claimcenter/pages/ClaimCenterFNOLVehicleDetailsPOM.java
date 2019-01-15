package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLVehicleDetailsPOM extends BaseTest{

	
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	
		

	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:0")
	private WebElement pageTitle;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:LossParty_true-inputEl")
	private WebElement lossPartyInsuredRadio;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:LossParty_false-inputEl")
	private WebElement lossPartyTPRadio;
		
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:Update-btnEl")
	private WebElement okButton;

	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OccupantLV_tb:AddDriverButton-btnEl")
	private WebElement addDriverButton;
	

	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OccupantLV_tb:AddPassengerButton-btnEl")
	private WebElement addPassengerButton;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Vehicle_VehicleType-inputEl")
	private WebElement vehicleType;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Vehicle_LicensePlate-inputEl")
	private WebElement vrn;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Vehicle_Year-inputEl")
	private WebElement year;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Vehicle_Make-inputEl")
	private WebElement make;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Vehicle_Model-inputEl")
	private WebElement model;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Vehicle_Color-inputEl")
	private WebElement color;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Owner_Picker-inputEl")
	private WebElement ownerDropdown;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Vehicle_Style-inputEl")
	private WebElement style;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Vehicle_VIN-inputEl")
	private WebElement vin;
	
	
	// this is the owner picker stuff
	// first the icon
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Owner_Picker:Owner_PickerMenuIcon")
	private WebElement ownerPickerLink;
	// now the New person option
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Owner_Picker:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement newPersonSubLink;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Usual_Location-inputEl")
	private WebElement usualLocationDropdown;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Actual_Location-inputEl")
	private WebElement actualLocationDropdown;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:CurrentVehicleMileage-inputEl")
	private WebElement currentMileageTextBox;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:Description-inputEl")
	private WebElement damageDescTextArea;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:PreExistingDamage-inputEl")
	private WebElement preDamageDescTextArea;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:AirbagsDeployed-inputEl")
	private WebElement airBagsDropdown;

	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:CalculateButton")
	private WebElement calcTotalLossLink;
	
	
	
	// fire section only appears on page for a fire incident
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:LastPersonInCharge-inputEl")
	private WebElement fireLastInChrgeDropdown;
	//TODO - rest of fire locators
	
	//Theft section only appears on page for a theft incident
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:NumberOfSetsOfKeysProvided-inputEl")
	private WebElement purchaseKeysDropdown;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:NumberOfSetsOfKeysInPossesion-inputEl")
	private WebElement possessedKeysDropdown;
	
	//TODO rest of theft locators
	
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "FNOL Wizard Step3 Vehicle Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(4);
		logger.info(format("%s -check page title for Vehicle page :"+expected, getName()));
		logger.info(format("%s -found page title for Vehicle page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkButton());
		logger.info(format("%s - done, OK clicked", getName()));
	}
	
	public void selectAddDriver() {
		logger.info(format("%s -  going to click AddDriver", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddDriverButton());
		logger.info(format("%s - done, AddDriver clicked", getName()));
	}
	
	public void selectAddPassenger() {
		logger.info(format("%s -  going to click AddPassenger", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddPassengerButton());
		logger.info(format("%s - done, AddPassenger clicked", getName()));
	}
	
	public void selectKeysPurchased(String option)
	{
		logger.info(format("%s - going to select keys purchased option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getPurchaseKeysDropdown(),1); // first on page
	}
	public void selectKeysPossessed(String option)
	{
		logger.info(format("%s - going to select keys possessed option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getPossessedKeysDropdown(),2); // second on page
	}
	public void selectUsualLocation(String option)
	{
		logger.info(format("%s - going to select usual location option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getUsualLocationDropdown(),1); // first on page
	}
	public void selectActualLocation(String option)
	{
		logger.info(format("%s - going to select actual location option :"+option, getName()));
		// the problem with this locator is that theere are only some optikns in actual location
		// which also occur in suaul location, so the workaround of passing the occurence 1st or 2nd on the 
		// page will not work
		// TODO
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getActualLocationDropdown(),2); // 2nd on page?
	}
	public void selectAirbagsDeployed(String option)
	{
		logger.info(format("%s - going to select airbags deployed option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getAirBagsDropdown(),1); // first on page
	}
	public void selectOwnerName(String option)
	{
		logger.info(format("%s - going to select vehgicle owner name option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getOwnerDropdown(),1);
	}
	
	public void selectVehicleType(String option)
	{
		logger.info(format("%s - going to select Vehicle option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVehicleType(),1);
	}
	public void setVrn(String text)
	{
		logger.info(format("%s - going to select VRN :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getVrn());
	}
	public void setYear(String text)
	{
		logger.info(format("%s - going to select Year :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getYear());
	}
	public void setMake(String text)
	{
		logger.info(format("%s - going to select make :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMake());
	}
	public void setModel(String text)
	{
		logger.info(format("%s - going to select Model :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getModel());
	}
	
	public void selectVehicleStyle(String option)
	{
		logger.info(format("%s - going to select Vehicle style :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getStyle(),1);
	}
	public void setColor(String text)
	{
		logger.info(format("%s - going to set color  :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getColor());
	}
	public void setVin(String text)
	{
		logger.info(format("%s - going to set vin :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getVin());
	}
	
	public void selectNewOwner()
	{
		logger.info(format("%s - going to select New Person from owner picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getOwnerPickerLink(),this.getNewPersonSubLink());
	}

	public void setDamageDesc(String text)
	{
		logger.info(format("%s - going to set damage desc :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDamageDescTextArea());
	}
	
	public void setPreDamageDesc(String text)
	{
		logger.info(format("%s - going to set pre damage desc :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPreDamageDescTextArea());
	}
   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getAddDriverButton() {
		return addDriverButton;
	}

	private WebElement getAddPassengerButton() {
		return addPassengerButton;
	}
	
	
	private WebElement getOkButton() {
		return okButton;
	}
	

	private WebElement getUsualLocationDropdown() {
		return usualLocationDropdown;
	}

	private WebElement getActualLocationDropdown() {
		return actualLocationDropdown;
	}

	private WebElement getCurrentMileageTextBox() {
		return currentMileageTextBox;
	}

	private WebElement getDamageDescTextArea() {
		return damageDescTextArea;
	}

	private WebElement getPreDamageDescTextArea() {
		return preDamageDescTextArea;
	}

	private WebElement getAirBagsDropdown() {
		return airBagsDropdown;
	}

	private WebElement getCalcTotalLossLink() {
		return calcTotalLossLink;
	}

	private WebElement getFireLastInChrgeDropdown() {
		return fireLastInChrgeDropdown;
	}

	private WebElement getPurchaseKeysDropdown() {
		return purchaseKeysDropdown;
	}

	private WebElement getPossessedKeysDropdown() {
		return possessedKeysDropdown;
	}

	private WebElement getVehicleType() {
		return vehicleType;
	}

	private WebElement getVrn() {
		return vrn;
	}

	private WebElement getYear() {
		return year;
	}

	private WebElement getMake() {
		return make;
	}

	private WebElement getModel() {
		return model;
	}

	private WebElement getOwnerDropdown() {
		return ownerDropdown;
	}

	private WebElement getOwnerPickerLink() {
		return ownerPickerLink;
	}

	private WebElement getNewPersonSubLink() {
		return newPersonSubLink;
	}

	private WebElement getLossPartyInsuredRadio() {
		return lossPartyInsuredRadio;
	}

	private WebElement getLossPartyTPRadio() {
		return lossPartyTPRadio;
	}

	private WebElement getStyle() {
		return style;
	}

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	private WebElement getColor() {
		return color;
	}

	private WebElement getVin() {
		return vin;
	}

	

	
	
	
	


}