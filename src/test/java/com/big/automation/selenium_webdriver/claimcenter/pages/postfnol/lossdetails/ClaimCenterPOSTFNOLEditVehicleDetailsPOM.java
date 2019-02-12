package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLEditVehicleDetailsPOM extends BaseTest{

	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:0")
	private WebElement pageTitle;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:Update")
	private WebElement okButton;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:Cancel")
	private WebElement cancelButton;
	
	
	//VEHICLE BASICS SECTION
	//--------------------------------------------------------------------------
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:LossParty_option1-inputEl")
	private WebElement lossPartyInsuredRadio;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:LossParty_option2-inputEl")
	private WebElement lossPartyTPRadio;
		
	
	// only for PH 
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Picker-inputEl")
	private WebElement selectVehicleDropdown;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_VehicleType-inputEl")
	private WebElement vehicleTypeDropdown;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_LicensePlate-inputEl")
	private WebElement vrn;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Year-inputEl")
	private WebElement year;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Make-inputEl")
	private WebElement make;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Model-inputEl")
	private WebElement model;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Style-inputEl")
	private WebElement styleDropdown;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_Color-inputEl")
	private WebElement color;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Vehicle_VIN-inputEl")
	private WebElement vin;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:VehicleHasBeenModified_true-inputEl")
	private WebElement modifiedYesOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:VehicleHasBeenModified_false-inputEl")
	private WebElement modifiedNoOption;
	//TODO add modifications
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:ModificationsIS:VehicleModificationsLV_tb:Add")
	private WebElement addModificationButton;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:ModificationsIS:VehicleModificationsLV_tb:Remove")
	private WebElement removeModificationButton;
	
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Usual_Location-inputEl")
	private WebElement normallyKeptDropdown;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Actual_Location-inputEl")
	private WebElement vehicleNowDropdown;
	//TODO subfields for garage/other/unknown
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:CurrentVehicleMileage-inputEl")
	private WebElement vehicleMileage;
	
	
	//TP only
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Foreign_Vehicle_true-inputEl")
	private WebElement foreignYesOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Foreign_Vehicle_false-inputEl")
	private WebElement foreignNoOption;	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Owner_Picker-inputEl")
	private WebElement ownerDropdown;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Owner_Picker:Owner_PickerMenuIcon")
	private WebElement ownerPickerLink;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleBasicsIS:Owner_Picker:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement newPersonSubLink;
	
	
	
	//DAMAGE section
	// ----------------------------------------------------------------------------------------------

	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:Description-inputEl")
	private WebElement damageDescTextArea;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:PreExistingDamage-inputEl")
	private WebElement preDamageDescTextArea;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:Operable_true-inputEl")
	private WebElement roadworthyYesOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:Operable_false-inputEl")
	private WebElement roadworthyNoOption;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:AirbagsDeployed-inputEl")
	private WebElement airBagsDropdown;

	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:TotalLoss_true-inputEl")
	private WebElement possTotalLossYesOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:TotalLoss_false-inputEl")
	private WebElement possTotalLossNoOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:CalculateButton")
	private WebElement calcTotalLossLink;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:TotalLossPoints-inputEl")
	private WebElement totalLossPoints;
	
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:OccupantLV_tb:AddDriverButton")
	private WebElement addDriverButton;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:OccupantLV_tb:AddPassengerButton")
	private WebElement addPassengerButton;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:OccupantLV_tb:Remove")
	private WebElement removeButton;
	
	// FIRE section only appears on page for a fire incident for PH vehicle
	//------------------------------------------------------------------------
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:0")
	private WebElement fireQuestionsSectionLabel;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:LastPersonInCharge-inputEl")
	private WebElement fireLastInChrgeDropdown;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:LastPersonInCharge:LastPersonInChargeMenuIcon")
	private WebElement fireLastInChrgePickerIcon;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:LastPersonInCharge:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-textEl")
	private WebElement fireLastInChrgeNewPersonPicker;
		
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:WhoDiscoveredVehicleDamaged-inputEl")
	private WebElement fireWhoDiscoveredDropdown;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:WhoDiscoveredVehicleDamaged:WhoDiscoveredVehicleDamagedMenuIcon")
	private WebElement fireWhoDiscoveredPickerIcon;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:WhoDiscoveredVehicleDamaged:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-textEl")
	private WebElement fireWhoDiscoveredNewPersonPicker;
	
	
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:AndWhenDate-inputEl")
	private WebElement fireWhenDiscovered;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:AndWhenTime-inputEl")
	private WebElement fireTimeDiscovered;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:AnyPreExistingMechanicalDamage_true-inputEl")
	private WebElement fireVisitedGarageYesOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:AnyPreExistingMechanicalDamage_false-inputEl")
	private WebElement fireVisitedGarageNoOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:PreExistingMechanicalDamageDet-inputEl")
	private WebElement fireGarageDetails;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:OtherVehiclesDamaged_true-inputEl")
	private WebElement fireOtherVehicleDamageYesOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:OtherVehiclesDamaged_false-inputEl")
	private WebElement fireOtherVehicleDamageNoOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:VehiclesDamagedDetail-inputEl")
	private WebElement fireOtherVehicleDamageDetails;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:SuspectAnyoneOfStartingTheFire_true-inputEl")
	private WebElement fireSuspectYesOption;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:SuspectAnyoneOfStartingTheFire_false-inputEl")
	private WebElement fireSuspectNoOption;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:SuspectStartingTheFire-inputEl")
	private WebElement fireSuspectDropdown;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:SuspectStartingTheFire:SuspectStartingTheFireMenuIcon")
	private WebElement fireSuspectPickerIcon;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:SuspectStartingTheFire:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-textEl")
	private WebElement fireSuspectNewPersonPicker;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:WhyDoYouSuspectThisPerson-inputEl")
	private WebElement fireSuspectWhy;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:HowDoYouKnowThePerson-inputEl")
	private WebElement fireSuspectHowKnownDropdown;
	
	
	//THEFT section only appears on page for a theft incident for ph vehicle
	//---------------------------------------------------------------------------------
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleTheftQuestionsInputSet:0")
	private WebElement theftQuestionsSectionLabel;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleTheftQuestionsInputSet:LastSeenDate-inputEl")
	private WebElement theftLastSeenDate;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleTheftQuestionsInputSet:LastSeenTime-inputEl")
	private WebElement theftLastSeenTime;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleTheftQuestionsInputSet:LossDiscoveredDate-inputEl")
	private WebElement theftLossDiscoveredDate;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleTheftQuestionsInputSet:LossDiscoveredTime-inputEl")
	private WebElement theftLossDiscoveredTime;
	
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleTheftQuestionsInputSet:LastDriver-inputEl")
	private WebElement lastDriverDropdown;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleTheftQuestionsInputSet:LastDriver:LastDriverMenuIcon")
	private WebElement lastDriverPickerIcon;
	@FindBy(id = "EditVehicleIncidentPopup:EditVehicleIncidentScreen:PostFNOLVehicleIncidentDV:VehicleTheftQuestionsInputSet:LastDriver:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
	private WebElement lastDriverNewPersonPicker;
	
	//TODO the rest
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:NumberOfSetsOfKeysProvided-inputEl")
	private WebElement purchaseKeysDropdown;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:NumberOfSetsOfKeysInPossesion-inputEl")
	private WebElement possessedKeysDropdown;
	
	

	public String getName() {

		return "Edit Vehicle Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		logger.info(format("%s -found page title for Vehicle page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkButton());
		
	}
	
	
	
	//Vehicle Basics methods
    //----------------------------
	public void selectInsuredLossParty(boolean party)
	{
		logger.info(format("%s -  going to set insured loss party to:"+party, getName()));
	    if (party)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getLossPartyInsuredRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getLossPartyTPRadio());
	    }
	
		
	}
	public void selectVehicle(String option)
	{
		logger.info(format("%s - going to select vehicle option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getSelectVehicleDropdown(),1); // first on page
	}
	public void selectVehicleType(String option)
	{
		logger.info(format("%s - going to select Vehicle option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVehicleTypeDropdown(),1);
	}
	public void setVrn(String text)
	{
		logger.info(format("%s - going to select VRN :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getVrn());
	}
	//TODO value?
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
	public void selectStyle(String option)
	{
		logger.info(format("%s - going to select style option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getStyleDropdown(),1);
	}
	public void setColor(String text)
	{
		logger.info(format("%s - going to set color :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getColor());
	}
	public void setVin(String text)
	{
		logger.info(format("%s - going to set vin :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getVin());
	}
	
	//tp only
	public void selectForeignVehicle(boolean foreign)
	{
		logger.info(format("%s -  going to set foreign vehicle:"+foreign, getName()));
	    if (foreign)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getForeignYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getForeignNoOption());
	    }
	}
	
	//tp only
	public void selectTPVehicleOwner(String option)
	{
		logger.info(format("%s - going to select TP vehicle owner option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getOwnerDropdown(),1); // first on page
	}
	public void selectNewTPOwner()
	{
		logger.info(format("%s - going to select New Person from TP owner picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getOwnerPickerLink(),this.getNewPersonSubLink());
	}
	
	//ph only
	public void selectVehicleModified(boolean modified)
	{
		logger.info(format("%s -  going to set vehicle modified to:"+modified, getName()));
	    if (modified)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getModifiedYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getModifiedNoOption());
	    }
	}
	
	public void clickAddModification()
	{
		logger.info(format("%s - going to click add modification", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddModificationButton());
	}
	
	public void clickRemoveModification()
	{
		logger.info(format("%s - going to click remove modification", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getRemoveModificationButton());
	}
	//TODO select modification 
	
	public void selectUsualLocation(String option)
	{
		logger.info(format("%s - going to select usual location option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getNormallyKeptDropdown(),1); // first on page
	}
	
	public void selectActualLocation(String option)
	{
		logger.info(format("%s - going to select actual location option :"+option, getName()));
		//TODO ACTUAL LOCATION 
		// the problem with this locator is that theere are only some optikns in actual location
		// which also occur in suaul location, so the workaround of passing the occurence 1st or 2nd on the 
		// page will not work
		// TODO
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVehicleNowDropdown(),2); // 2nd on page?
	}
	
	public void setVehicleMileage(String text)
	{
		logger.info(format("%s - going to set vehicle mileage :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getVehicleMileage());
	}
	
	
	
	// DAMAGE methods
	//---------------------------------------------
	public void setDamageDesc(String text)
	{
		logger.info(format("%s - going to set damage desc :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDamageDescTextArea());
	}
	public void setPreExistDamage(String text)
	{
		logger.info(format("%s - going to set preexist damage:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPreDamageDescTextArea());
	}
	public void selectRoadworthy(boolean worthy)
	{
		logger.info(format("%s -  going to set roadworthy to:"+worthy, getName()));
	    if (worthy)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getRoadworthyYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getRoadworthyNoOption());
	    }

	}
	
	public void selectAirbagsDeployed(String option)
	{
		logger.info(format("%s - going to select airbags deployed option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getAirBagsDropdown(),1); // first on page
	}
	public void selecPossTotalLoss(boolean loss)
	{
		logger.info(format("%s -  going to set possible total loss to:"+loss, getName()));
	    if (loss)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getPossTotalLossYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getPossTotalLossNoOption());
	    }
	}
	
	public void clickCalculateTotalLoss()
	{
		logger.info(format("%s - going to click calculate total loss ", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCalcTotalLossLink());
	}
	
	public String getLossPoints()
	{
		logger.info(format("%s - going to get loss points ", getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getTotalLossPoints());
	}
	
	//OTHER DETAILS methods
	//TODO
	// Finance on vehicle
	//  monthly payment
	// months remaining
	// payoff amount
	// damage to personal
	// personal details
	
	// Occupants and Injuries questions
	//-------------------------------------------------
	public void selectAddDriver() {
		logger.info(format("%s -  going to click AddDriver", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddDriverButton());
		
	}
	
	public void selectAddPassenger() {
		logger.info(format("%s -  going to click AddPassenger", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddPassengerButton());
		
	}
	
	public void selectRemove() {
		logger.info(format("%s -  going to click Remove", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getRemoveButton());
		
	}
	
	// Theft methods ph only for theft
	//------------------------------------
	// TODO differentiate person picker

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
	
	
	// Fire methods
	//------------------------------------------
	
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

	private WebElement getSelectVehicleDropdown() {
		return selectVehicleDropdown;
	}

	private WebElement getVehicleTypeDropdown() {
		return vehicleTypeDropdown;
	}

	private WebElement getStyleDropdown() {
		return styleDropdown;
	}

	private WebElement getColor() {
		return color;
	}

	private WebElement getVin() {
		return vin;
	}

	private WebElement getModifiedYesOption() {
		return modifiedYesOption;
	}

	private WebElement getModifiedNoOption() {
		return modifiedNoOption;
	}

	private WebElement getAddModificationButton() {
		return addModificationButton;
	}

	private WebElement getRemoveModificationButton() {
		return removeModificationButton;
	}

	private WebElement getNormallyKeptDropdown() {
		return normallyKeptDropdown;
	}

	private WebElement getVehicleNowDropdown() {
		return vehicleNowDropdown;
	}

	private WebElement getVehicleMileage() {
		return vehicleMileage;
	}

	private WebElement getForeignYesOption() {
		return foreignYesOption;
	}

	private WebElement getForeignNoOption() {
		return foreignNoOption;
	}

	private WebElement getRoadworthyYesOption() {
		return roadworthyYesOption;
	}

	private WebElement getRoadworthyNoOption() {
		return roadworthyNoOption;
	}

	private WebElement getPossTotalLossYesOption() {
		return possTotalLossYesOption;
	}

	private WebElement getPossTotalLossNoOption() {
		return possTotalLossNoOption;
	}

	private WebElement getTotalLossPoints() {
		return totalLossPoints;
	}

	private WebElement getRemoveButton() {
		return removeButton;
	}

	private WebElement getFireQuestionsSectionLabel() {
		return fireQuestionsSectionLabel;
	}

	private WebElement getFireLastInChrgePickerIcon() {
		return fireLastInChrgePickerIcon;
	}

	private WebElement getFireLastInChrgeNewPersonPicker() {
		return fireLastInChrgeNewPersonPicker;
	}

	private WebElement getFireWhoDiscoveredDropdown() {
		return fireWhoDiscoveredDropdown;
	}

	private WebElement getFireWhoDiscoveredPickerIcon() {
		return fireWhoDiscoveredPickerIcon;
	}

	private WebElement getFireWhoDiscoveredNewPersonPicker() {
		return fireWhoDiscoveredNewPersonPicker;
	}

	private WebElement getFireWhenDiscovered() {
		return fireWhenDiscovered;
	}

	private WebElement getFireTimeDiscovered() {
		return fireTimeDiscovered;
	}

	private WebElement getFireVisitedGarageYesOption() {
		return fireVisitedGarageYesOption;
	}

	private WebElement getFireVisitedGarageNoOption() {
		return fireVisitedGarageNoOption;
	}

	private WebElement getFireGarageDetails() {
		return fireGarageDetails;
	}

	private WebElement getFireOtherVehicleDamageYesOption() {
		return fireOtherVehicleDamageYesOption;
	}

	private WebElement getFireOtherVehicleDamageNoOption() {
		return fireOtherVehicleDamageNoOption;
	}

	private WebElement getFireOtherVehicleDamageDetails() {
		return fireOtherVehicleDamageDetails;
	}

	private WebElement getFireSuspectYesOption() {
		return fireSuspectYesOption;
	}

	private WebElement getFireSuspectNoOption() {
		return fireSuspectNoOption;
	}

	private WebElement getFireSuspectDropdown() {
		return fireSuspectDropdown;
	}

	private WebElement getFireSuspectPickerIcon() {
		return fireSuspectPickerIcon;
	}

	private WebElement getFireSuspectNewPersonPicker() {
		return fireSuspectNewPersonPicker;
	}

	private WebElement getFireSuspectWhy() {
		return fireSuspectWhy;
	}

	private WebElement getFireSuspectHowKnownDropdown() {
		return fireSuspectHowKnownDropdown;
	}

	private WebElement getTheftQuestionsSectionLabel() {
		return theftQuestionsSectionLabel;
	}
	
	

	private WebElement getTheftLastSeenDate() {
		return theftLastSeenDate;
	}

	private WebElement getTheftLastSeenTime() {
		return theftLastSeenTime;
	}

	private WebElement getTheftLossDiscoveredDate() {
		return theftLossDiscoveredDate;
	}

	private WebElement getTheftLossDiscoveredTime() {
		return theftLossDiscoveredTime;
	}

	private WebElement getLastDriverDropdown() {
		return lastDriverDropdown;
	}

	private WebElement getLastDriverPickerIcon() {
		return lastDriverPickerIcon;
	}

	private WebElement getLastDriverNewPersonPicker() {
		return lastDriverNewPersonPicker;
	}

	
	

	
	
	
	


}