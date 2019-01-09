package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewVehicleDetailsPOM extends BaseTest{


	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:0")
	private WebElement pageTitle;
	
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:Update")
	private WebElement okButton;
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:Cancel")
	private WebElement cancelButton;
		
	
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:LossParty_option1-inputEl")
	private WebElement lossPartyInsuredRadio;
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:LossParty_option2-inputEl")
	private WebElement lossPartyTPRadio;
		
	
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:OccupantLV_tb:AddDriverButton-btnEl")
	private WebElement addDriverButton;
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:OccupantLV_tb:AddPassengerButton")
	private WebElement addPassengerButton;
	
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_VehicleType-inputEl")
	private WebElement vehicleType;
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_LicensePlate-inputEl")
	private WebElement vrn;
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Year-inputEl")
	private WebElement year;
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Make-inputEl")
	private WebElement make;
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Model-inputEl")
	private WebElement model;
	//TODO other fields style, color, vin
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Owner_Picker-inputEl")
	private WebElement ownerDropdown;
	
	// this is the owner picker stuff
	// first the icon
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Owner_Picker:Owner_PickerMenuIcon")
	private WebElement ownerPickerLink;
	// now the New person option
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Owner_Picker:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement newPersonSubLink;
	
	// PH only
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Usual_Location-inputEl")
	private WebElement usualLocationDropdown;
	
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Actual_Location-inputEl")
	private WebElement actualLocationDropdown;
	
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:CurrentVehicleMileage-inputEl")
	private WebElement currentMileageTextBox;
	
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:Description-inputEl")
	private WebElement damageDescTextArea;
	
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:PreExistingDamage-inputEl")
	private WebElement preDamageDescTextArea;
	//TODO other fields
	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:AirbagsDeployed-inputEll")
	private WebElement airBagsDropdown;

	@FindBy(id = "NewVehicleIncidentPopup:NewVehicleIncidentScreen:PostFNOLVehicleIncidentDV:CalculateButton")
	private WebElement calcTotalLossLink;
	
	
	
	// fire section only appears on page for a fire incident
	// and only for PH vehicle - add these later
	
	//@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:LastPersonInCharge-inputEl")
	//private WebElement fireLastInChrgeDropdown;
	//TODO - rest of fire locators
	
	//Theft section only appears on page for a theft incident
	
	//@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:NumberOfSetsOfKeysProvided-inputEl")
	//private WebElement purchaseKeysDropdown;
	
	//@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:NumberOfSetsOfKeysInPossesion-inputEl")
	//private WebElement possessedKeysDropdown;
	
	//TODO rest of theft locators
	
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "Post FNOL New Vehicle";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		logger.info(format("%s -found page title for Vehicle page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkButton());
		
	}
	
	public void selectAddDriver() {
		logger.info(format("%s -  going to click AddDriver", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddDriverButton());
		
	}
	
	public void selectAddPassenger() {
		logger.info(format("%s -  going to click AddPassenger", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddPassengerButton());
		
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
	
	public void selectNewOwner()
	{
		logger.info(format("%s - going to select New Person from owner picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getOwnerPickerLink(),this.getNewPersonSubLink());
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

	

	
	
	
	


}