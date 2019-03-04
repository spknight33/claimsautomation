package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	//TP only
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Foreign_Vehicle_true-inputEl")
	private WebElement foreignYesOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Foreign_Vehicle_false-inputEl")
	private WebElement foreignNoOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Foreign_Vehicle_Details-inputEl")
	private WebElement foreignDetails;
	
	// this is the owner picker stuff
	// first the icon
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Owner_Picker:Owner_PickerMenuIcon")
	private WebElement ownerPickerLink;
	// now the New person option
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Owner_Picker:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement newPersonSubLink;
	
	// PH only, modification fields
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:VehicleHasBeenModified_true-inputEl")
	private WebElement modifiedYesOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:VehicleHasBeenModified_false-inputEl")
	private WebElement modifiedNoOption;
	//TODO add modifications
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:ModificationsIS:VehicleModificationsLV_tb:Add")
	private WebElement addModificationButton;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:ModificationsIS:VehicleModificationsLV_tb:Remove")
	private WebElement removeModificationButton;
    //TODO - select modificaitons
	
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Usual_Location-inputEl")
	private WebElement usualLocationDropdown;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Actual_Location-inputEl")
	private WebElement actualLocationDropdown;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:Actual_Location_Additional_Widgets:Actual_Location_Comments-inputEl")
	private WebElement actualLocationDetails;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:CurrentVehicleMileage-inputEl")
	private WebElement currentMileageTextBox;
	
	//DAMAGE fields
	//--------------------------------------------------
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:Description-inputEl")
	private WebElement damageDescTextArea;

	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:PreExistingDamage-inputEl")
	private WebElement preDamageDescTextArea;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:Operable_true-inputEl")
	private WebElement roadworthyYesOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:Operable_false-inputEl")
	private WebElement roadworthyNoOption;
	
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:AirbagsDeployed-inputEl")
	private WebElement airBagsDropdown;
	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:TotalLoss_true-inputEl")
	private WebElement possTotalLossYesOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:TotalLoss_false-inputEl")
	private WebElement possTotalLossNoOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:CalculateButton")
	private WebElement calcTotalLossLink;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:TotalLossPoints-inputEl")
	private WebElement totalLossPoints;
	
	//FINANCE section
	//-------------------------------
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:LoanInformation_Loan_true-inputEl")
	private WebElement financeYesOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:LoanInformation_Loan_false-inputEl")
	private WebElement financeNoOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:MonthlyPayment-inputEl")
	private WebElement financeMonthlyPayment;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:MonthsRemaining-inputEl")
	private WebElement financeMonthsRemaining;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:PayoffAmount-inputEl")
	private WebElement financePayOffAmount;
	
	//Hire Questions
	//---------------------
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:CreditHire_true-inputEl")
	private WebElement creditHireYesOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:CreditHire_false-inputEl")
	private WebElement creditHireNoOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:HireProtocol_true-inputEl")
	private WebElement protocolHireYesOption;
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:OtherDetailsDV:HireProtocol_false-inputEl")
	private WebElement protocolHireNoOption;
	
	
	// FIRE section only appears on page for a fire incident for PH vehicle
		//------------------------------------------------------------------------
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:0")
		private WebElement fireQuestionsSectionLabel;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:LastPersonInCharge-inputEl")
		private WebElement fireLastInChrgeDropdown;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:LastPersonInCharge:LastPersonInChargeMenuIcon")
		private WebElement fireLastInChrgePickerIcon;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:LastPersonInCharge:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
		private WebElement fireLastInChrgeNewPersonPicker;
			
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:WhoDiscoveredVehicleDamaged-inputEl")
		private WebElement fireWhoDiscoveredDropdown;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:WhoDiscoveredVehicleDamaged:WhoDiscoveredVehicleDamagedMenuIcon")
		private WebElement fireWhoDiscoveredPickerIcon;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:WhoDiscoveredVehicleDamaged:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
		private WebElement fireWhoDiscoveredNewPersonPicker;
		
		
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:AndWhenDate-inputEl")
		private WebElement fireWhenDiscovered;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:AndWhenTime-inputEl")
		private WebElement fireTimeDiscovered;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:AnyPreExistingMechanicalDamage_true-inputEl")
		private WebElement fireVisitedGarageYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:AnyPreExistingMechanicalDamage_false-inputEl")
		private WebElement fireVisitedGarageNoOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:PreExistingMechanicalDamageDet-inputEl")
		private WebElement fireGarageDetails;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:OtherVehiclesDamaged_true-inputEl")
		private WebElement fireOtherVehicleDamageYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:OtherVehiclesDamaged_false-inputEl")
		private WebElement fireOtherVehicleDamageNoOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:VehiclesDamagedDetail-inputEl")
		private WebElement fireOtherVehicleDamageDetails;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:SuspectAnyoneOfStartingTheFire_true-inputEl")
		private WebElement fireSuspectYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:SuspectAnyoneOfStartingTheFire_false-boxLabelEl")
		private WebElement fireSuspectNoOption;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:SuspectStartingTheFire-inputEl")
		private WebElement fireSuspectDropdown;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:SuspectStartingTheFire:SuspectStartingTheFireMenuIcon")
		private WebElement fireSuspectPickerIcon;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:SuspectStartingTheFire:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
		private WebElement fireSuspectNewPersonPicker;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:WhyDoYouSuspectThisPerson-inputEl")
		private WebElement fireSuspectWhy;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:FireAndVandalismQuestionsInputSet_itb:FireAndVandalismQuestionsInputSet:SuspectStartingTheFireInputSet:HowDoYouKnowThePerson-inputEl")
		private WebElement fireSuspectHowKnownDropdown;
		
		
		//THEFT section only appears on page for a theft incident for ph vehicle
		//---------------------------------------------------------------------------------
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:0")
		private WebElement theftQuestionsSectionLabel;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:LastSeenDate-inputEl")
		private WebElement theftLastSeenDate;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:LastSeenTime-inputEl")
		private WebElement theftLastSeenTime;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:LossDiscoveredDate-inputEl")
		private WebElement theftLossDiscoveredDate;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:LossDiscoveredTime-inputEl")
		private WebElement theftLossDiscoveredTime;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:LastDriver-inputEl")
		private WebElement theftLastDriverDropdown;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:LastDriver:LastDriverMenuIcon")
		private WebElement theftLastDriverPickerIcon;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:LastDriver:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-textEl")
		private WebElement theftLastDriverNewPersonPicker;
		
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:WindowsDoorsLockedInd_true-inputEl")
		private WebElement theftWindowsLockedYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:WindowsDoorsLockedInd_true-bodyEl")
		private WebElement theftWindowsLockedNoOption;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SecurityDevicesInd_true-inputEl")
		private WebElement theftSecurityDeviceYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SecurityDevicesInd_false-inputEl")
		private WebElement theftSecurityDeviceNoOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SecurityDevicesSection:SecurityDevicesDetails-inputEl")
		private WebElement theftSecurityDeviceDetails;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SecurityDevicesSection:SecurityDevicesActiveInd_true-inputEl")
		private WebElement theftDeviceActiveYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SecurityDevicesSection:SecurityDevicesActiveInd_false-inputEl")
		private WebElement theftDeviceActiveNoOption;
			
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:NumberOfSetsOfKeysProvided-inputEl")
		private WebElement theftPurchaseKeysDropdown;
	    @FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:NumberOfSetsOfKeysInPossesion-inputEl")
		private WebElement theftPossessedKeysDropdown;
	    
	    @FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:ContactlessKeysInd_true-inputEl")
		private WebElement theftKeysContactlessYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:ContactlessKeysInd_false-inputEl")
		private WebElement theftKeysContactlessNoOption;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:KeysLeftInVehicleInd_true-inputEl")
		private WebElement theftKeysInVehicleYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:KeysLeftInVehicleInd_false-inputEl")
		private WebElement theftKeysInVehicleNoOption;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:GarageVisitInd_true-inputEl")
		private WebElement theftVisitedGarageYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:GarageVisitInd_false-inputEl")
		private WebElement theftVisitedGarageNoOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:GarageVisitDetails-inputEl")
		private WebElement theftVisitedGarageDetails;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:VehicleChangedInd_true-inputEl")
		private WebElement theftVehicleChangedYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:VehicleChangedInd_false-inputEl")
		private WebElement theftVehicleChangedNoOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:VehicleChangedDetails-inputEl")
		private WebElement theftVehicleChangedDetails;
	    
	

		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SuspicionInd_true-inputEl")
		private WebElement theftSuspectYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SuspicionInd_false-inputEl")
		private WebElement theftSuspectNoOption;
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SuspicionSection:Suspect-inputEl")
		private WebElement theftSuspectDropdown;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SuspicionSection:Suspect:SuspectMenuIcon")
		private WebElement theftSuspectPickerIcon;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SuspicionSection:Suspect:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
		private WebElement theftSuspectNewPersonPicker;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SuspicionSection:SuspicionHowPersonIsKnown-inputEl")
		private WebElement theftSuspectHowKnownDropdown;
    	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:SuspicionSection:SuspicionReason-inputEl")
		private WebElement theftSuspectWhy;
    	
    	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:PoliceTreatingAsTheftInd_true-inputEl")
		private WebElement theftPoliceYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:PoliceTreatingAsTheftInd_false-inputEl")
		private WebElement theftPoliceNoOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleTheftQuestionsInputSet:PoliceTreatingAsTheftReason-inputEl")
		private WebElement theftPoliceDetails;
		
		
		//TP Insurer details Available
		//------------------------------------
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:TPI_InsurerDetailAvailable_itb_true-inputEl")
		private WebElement tpInsurerYesOption;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:TPI_InsurerDetailAvailable_itb_false-inputEl")
		private WebElement tpInsurerNoOption;
		
	
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:InsurerDetailsInputSet:ThirdPartyInsuranceCompany_itb-inputEl")
		private WebElement tpInsurerDropdown;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:InsurerDetailsInputSet:ThirdPartyInsuranceCompany_itb:ThirdPartyInsuranceCompany_itbMenuIcon")
		private WebElement tpInsurerPickerIcon;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:InsurerDetailsInputSet:ThirdPartyInsuranceCompany_itb:MenuItem_Search-itemEl")
		private WebElement tpInsurerPickerSearch;
		
		
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:InsurerDetailsInputSet:ThirdPartyInsuranceCompany_itb_WorkPhone-inputEl")
		private WebElement tpInsurerPhone;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:InsurerDetailsInputSet:ThirdPartyInsuranceCompany_itb_EmailAddress1-inputEl")
		private WebElement tpInsurerPEmail;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:InsurerDetailsInputSet:TPI_PolicyNumber_itb-inputEl")
		private WebElement tpInsurerPolicyNumber;
		@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:ThirdPartyInsurerInputSet:InsurerDetailsInputSet:TPI_ClaimNumber_itb-inputEl")
		private WebElement tpInsurerClaimNumber
		
		;
		
	
		public boolean containsErrorMessage(String contains)
		{
					
			return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
		}

	public String getName() {

		return "FNOL Wizard Step3 Vehicle Information";
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
	
	
	
	public void selectVehicleType(String option)
	{
		logger.info(format("%s - going to select Vehicle option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVehicleType(),1);
	}
	public void setVrn(String text)
	{
		logger.info(format("%s - going to select VRN :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getVrn());
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		sleep(2);
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
	
	//tp only
	public void selectForeign(boolean foreign)
	{
		logger.info(format("%s -  going to set vehicle foreign to:"+foreign, getName()));
	    if (foreign)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getForeignYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getForeignNoOption());
	    }
	}
	public void setForeignDetails(String text)
	{
		logger.info(format("%s - going to set foreign details :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getForeignDetails());
	}
	
	// owner is for TP only
	public void selectOwner(String option)
	{
		logger.info(format("%s - going to select owner :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getOwnerDropdown(), 1);
	}
	public void selectNewOwner()
	{
		logger.info(format("%s - going to select New Person from owner picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getOwnerPickerLink(),this.getNewPersonSubLink());
	}
	
    // PH vehicle only
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
	

	public void setVehicleMileage(String text)
	{
		logger.info(format("%s - going to select mileage :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCurrentMileageTextBox());
	}
	
	
	//MODIFICATIONS
	//-------------------------------
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
	
	public void selectModification(String option, int sequence)
	{
		// use to select the modification
		String locator = "//*[@id=\"FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:VehicleBasicsDV:ModificationsIS:VehicleModificationsLV-body\"]//table[" + sequence + "]//tr/td[2]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		
	}

	// DAMAGE SECTION
	//-------------------------------------------
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
	
	
	//OTHER details section
	//------------------------
	public void selectFinanceOnVehicle(boolean finance)
	{
		logger.info(format("%s -  going to set finance to:"+finance, getName()));
	    if (finance)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getFinanceYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getFinanceNoOption());
	    }

	}
	
	public void setFinanceMonthlyPayment(String text)
	{
		logger.info(format("%s - going to set finance monthly payment:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFinanceMonthlyPayment());
	}
	public void setFinanceMonthsRemaining(String text)
	{
		logger.info(format("%s - going to set finance remaining :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFinanceMonthsRemaining());
	}
	public void setFinancePayoffAmount(String text)
	{
		logger.info(format("%s - going to set finance payoff:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFinancePayOffAmount());
	}
	
	public void selectCreditHire(boolean hire)
	{
		logger.info(format("%s -  going to set credit hire to:"+hire, getName()));
	    if (hire)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getCreditHireYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getCreditHireNoOption());
	    }

	}
	
	public void selectProtocolHire(boolean hire)
	{
		logger.info(format("%s -  going to set protocol hire to:"+hire, getName()));
	    if (hire)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getProtocolHireYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getProtocolHireNoOption());
	    }

	}
	
	
	//FIRE SECTION, ONLY FOR PH
	//--------------------------------------------------
	public void selectFireLastInCharge(String option)
	{
		logger.info(format("%s - going to select fire last in charge option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getFireLastInChrgeDropdown(),1); // first on page
	}
	public void selectFireLastInChargeNewPerson()
	{
		logger.info(format("%s - going to select New Person from last in charge picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getFireLastInChrgePickerIcon(),this.getFireLastInChrgeNewPersonPicker());
	}
	public void selectFireWhoDiscovered(String option)
	{
		logger.info(format("%s - going to select fire who discoverede option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getFireWhoDiscoveredDropdown(),2); // 2nd on page
	}
	public void selectFireWhoDiscoveredNewPerson()
	{
		logger.info(format("%s - going to select New Person from who discovered picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getFireWhoDiscoveredPickerIcon(),this.getFireWhoDiscoveredNewPersonPicker());
	}
	public void setFireWhenDiscovered(String text)
	{
		logger.info(format("%s - going to set fire date :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFireWhenDiscovered());
	}
	public void setFireTimeDiscovered(String text)
	{
		logger.info(format("%s - going to set fire time :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFireTimeDiscovered());
	}
	public void selectFireVisitedGarage(boolean visited) {
		logger.info(format("%s -  going to select visited garage:"+visited, getName()));
		
		if (visited)
		{
		GuideWireAccessors.clickGWButton(driver, this.getFireVisitedGarageYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getFireVisitedGarageNoOption());
		}
		
	}
	public void setFireGarageDetails(String text)
	{
		logger.info(format("%s - going to set fire garage visit details :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFireGarageDetails());
	}
	public void selectFireOtherVehicles(boolean involved) {
		logger.info(format("%s -  going to select other vehicle damaged:"+involved, getName()));
		
		if (involved)
		{
		GuideWireAccessors.clickGWButton(driver, this.getFireOtherVehicleDamageYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getFireOtherVehicleDamageNoOption());
		}
		
	}
	public void setFireOtherVehicleDetails(String text)
	{
		logger.info(format("%s - going to set fire other vehicle details :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFireOtherVehicleDamageDetails());
	}
	public void selectFireSuspected(boolean suspected) {
		logger.info(format("%s -  going to select someone suspected:"+suspected, getName()));
		
		if (suspected)
		{
		GuideWireAccessors.clickGWButton(driver, this.getFireSuspectYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getFireSuspectNoOption());
		}
		
	}
	public void selectFireSuspectNewPerson()
	{
		logger.info(format("%s - going to select New Person from suspect picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getFireSuspectPickerIcon(),this.getFireSuspectNewPersonPicker());
	}
	public void setFireWhySuspected(String text)
	{
		logger.info(format("%s - going to set why suspectedls :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFireSuspectWhy());
	}
	public void selectFireHowSuspectKnown(String option)
	{
		logger.info(format("%s - going to select how suspect known option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getFireSuspectHowKnownDropdown(),1); // first on page
	}
	
	//THEFT SECTION, ONLY FOR PH
	//----------------------------------------------------------------------------------------------------
	
	public void setTheftLastSeenDate(String text)
	{
		logger.info(format("%s - going to set theft last seen date :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftLastSeenDate());
	}
	public void setTheftLastSeenTime(String text)
	{
		logger.info(format("%s - going to set theft last seen time :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftLastSeenTime());
	}
	
	
	public void setTheftWhenDiscovered(String text)
	{
		logger.info(format("%s - going to set theft loss date :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftLossDiscoveredDate());
	}
	public void setTheftTimeDiscovered(String text)
	{
		logger.info(format("%s - going to set theft loss time :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftLossDiscoveredTime());
	}
	
	public void selectTheftLastDriver(String option)
	{
		logger.info(format("%s - going to select theft last driver :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getTheftLastDriverDropdown(),1); // first on page
	}
	
	public void selectTheftWindowsLocked(boolean locked) {
		logger.info(format("%s -  going to select theft window and doors locked:"+locked, getName()));
		
		if (locked)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftWindowsLockedYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftWindowsLockedNoOption());
		}
		
	}
	
	public void selectTheftSecurityFitted(boolean fitted) {
		logger.info(format("%s -  going to select theft security device:"+fitted, getName()));
		
		if (fitted)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftSecurityDeviceYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftSecurityDeviceNoOption());
		}
		
	}
	public void setTheftSecurityDetails(String text)
	{
		logger.info(format("%s - going to set theft security device details :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftSecurityDeviceDetails());
	}
	public void selectTheftSecurityActive(boolean active) {
		logger.info(format("%s -  going to select theft security device active:"+active, getName()));
		
		if (active)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftDeviceActiveYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftDeviceActiveNoOption());
		}
		
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
	
	public void selectTheftKeysContactless(boolean contactless) {
		logger.info(format("%s -  going to select theft keys contacless:"+contactless, getName()));
		
		if (contactless)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftKeysContactlessYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftKeysContactlessNoOption());
		}
		
	}
	
	public void selectTheftKeysLeft(boolean left) {
		logger.info(format("%s -  going to select theft keys left:"+left, getName()));
		
		if (left)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftKeysInVehicleYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftKeysInVehicleNoOption());
		}
		
	}
	
	
	public void selectTheftVisitedGarage(boolean visited) {
		logger.info(format("%s -  going to select theft visited garage:"+visited, getName()));
		
		if (visited)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftVisitedGarageYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftVisitedGarageNoOption());
		}
		
	}
	public void setTheftGarageDetails(String text)
	{
		logger.info(format("%s - going to set theft garage visit details :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftVisitedGarageDetails());
	}
	
	public void selectTheftVehicleChanged(boolean changed) {
		logger.info(format("%s -  going to select theft vehicle changed:"+changed, getName()));
		
		if (changed)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftVehicleChangedYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftVehicleChangedNoOption());
		}
		
	}
	public void setTheftVehicleChangedDetails(String text)
	{
		logger.info(format("%s - going to set theft vehicle changed details :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftVehicleChangedDetails());
	}
	
	
	public void selectTheftSuspected(boolean suspected) {
		logger.info(format("%s -  going to select theft someone suspected:"+suspected, getName()));
		
		if (suspected)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftSuspectYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftSuspectNoOption());
		}
		
	}
	public void selectTheftSuspectNewPerson()
	{
		logger.info(format("%s - going to select New Person from theft suspect picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getFireSuspectPickerIcon(),this.getTheftSuspectNewPersonPicker());
	}
	public void setTheftWhySuspected(String text)
	{
		logger.info(format("%s - going to set theft why suspected :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftSuspectWhy());
	}
	public void selectTheftHowSuspectKnown(String option)
	{
		logger.info(format("%s - going to select how theft suspect known option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getTheftSuspectHowKnownDropdown(),1); // first on page
	}

	public void selectTheftPoliceTreating(boolean treating) {
		logger.info(format("%s -  going to select theft police treating:"+treating, getName()));
		
		if (treating)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTheftPoliceYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTheftPoliceNoOption());
		}
		
	}
	public void setTheftPoliceDetails(String text)
	{
		logger.info(format("%s - going to set theft police details :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTheftPoliceDetails());
	}
	
	//TP Insurer details
	//---------------------------
	public void selectTPInsurerAvailable(boolean available)
	{
		logger.info(format("%s -  going to set TP insurer available to:"+available, getName()));
	    if (available)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getTpInsurerYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getTpInsurerNoOption());
	    }

	}
	
	public void selectTPInsurerSearch()
	{
		logger.info(format("%s - going to select Searcn from TP Insurer picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getTpInsurerPickerIcon(),this.getTpInsurerPickerSearch());
	}
	
	//TODO address lookup/overwrite
	
	
	public void setTPInsurerPolicyNumber(String text)
	{
		logger.info(format("%s - going to set TP insurer policy number :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTpInsurerPolicyNumber());
	}
	public void setTPInsurerClaimNumber(String text)
	{
		logger.info(format("%s - going to set TP insurer claim number :"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTpInsurerClaimNumber());
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
		return theftPurchaseKeysDropdown;
	}

	private WebElement getPossessedKeysDropdown() {
		return theftPossessedKeysDropdown;
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

	//private List<WebElement> getErrorMessages() {
	//	return errorMessages;
	//}

	private WebElement getColor() {
		return color;
	}

	private WebElement getVin() {
		return vin;
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

	private WebElement getTheftLastDriverDropdown() {
		return theftLastDriverDropdown;
	}

	private WebElement getTheftLastDriverPickerIcon() {
		return theftLastDriverPickerIcon;
	}

	private WebElement getTheftLastDriverNewPersonPicker() {
		return theftLastDriverNewPersonPicker;
	}

	private WebElement getTheftWindowsLockedYesOption() {
		return theftWindowsLockedYesOption;
	}

	private WebElement getTheftWindowsLockedNoOption() {
		return theftWindowsLockedNoOption;
	}

	private WebElement getTheftSecurityDeviceYesOption() {
		return theftSecurityDeviceYesOption;
	}

	private WebElement getTheftSecurityDeviceNoOption() {
		return theftSecurityDeviceNoOption;
	}

	private WebElement getTheftSecurityDeviceDetails() {
		return theftSecurityDeviceDetails;
	}

	private WebElement getTheftDeviceActiveYesOption() {
		return theftDeviceActiveYesOption;
	}

	private WebElement getTheftDeviceActiveNoOption() {
		return theftDeviceActiveNoOption;
	}

	private WebElement getTheftPurchaseKeysDropdown() {
		return theftPurchaseKeysDropdown;
	}

	private WebElement getTheftPossessedKeysDropdown() {
		return theftPossessedKeysDropdown;
	}

	private WebElement getTheftKeysContactlessYesOption() {
		return theftKeysContactlessYesOption;
	}

	private WebElement getTheftKeysContactlessNoOption() {
		return theftKeysContactlessNoOption;
	}

	private WebElement getTheftKeysInVehicleYesOption() {
		return theftKeysInVehicleYesOption;
	}

	private WebElement getTheftKeysInVehicleNoOption() {
		return theftKeysInVehicleNoOption;
	}

	private WebElement getTheftVisitedGarageYesOption() {
		return theftVisitedGarageYesOption;
	}

	private WebElement getTheftVisitedGarageNoOption() {
		return theftVisitedGarageNoOption;
	}

	private WebElement getTheftVisitedGarageDetails() {
		return theftVisitedGarageDetails;
	}

	private WebElement getTheftVehicleChangedYesOption() {
		return theftVehicleChangedYesOption;
	}

	private WebElement getTheftVehicleChangedNoOption() {
		return theftVehicleChangedNoOption;
	}

	private WebElement getTheftVehicleChangedDetails() {
		return theftVehicleChangedDetails;
	}

	private WebElement getTheftSuspectYesOption() {
		return theftSuspectYesOption;
	}

	private WebElement getTheftSuspectNoOption() {
		return theftSuspectNoOption;
	}

	private WebElement getTheftSuspectDropdown() {
		return theftSuspectDropdown;
	}

	private WebElement getTheftSuspectPickerIcon() {
		return theftSuspectPickerIcon;
	}

	private WebElement getTheftSuspectNewPersonPicker() {
		return theftSuspectNewPersonPicker;
	}

	private WebElement getTheftSuspectHowKnownDropdown() {
		return theftSuspectHowKnownDropdown;
	}

	private WebElement getTheftSuspectWhy() {
		return theftSuspectWhy;
	}

	private WebElement getTheftPoliceYesOption() {
		return theftPoliceYesOption;
	}

	private WebElement getTheftPoliceNoOption() {
		return theftPoliceNoOption;
	}

	private WebElement getTheftPoliceDetails() {
		return theftPoliceDetails;
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

	private WebElement getActualLocationDetails() {
		return actualLocationDetails;
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

	private WebElement getFinanceYesOption() {
		return financeYesOption;
	}

	private WebElement getFinanceNoOption() {
		return financeNoOption;
	}

	private WebElement getFinanceMonthlyPayment() {
		return financeMonthlyPayment;
	}

	private WebElement getFinanceMonthsRemaining() {
		return financeMonthsRemaining;
	}

	private WebElement getFinancePayOffAmount() {
		return financePayOffAmount;
	}

	private WebElement getCreditHireYesOption() {
		return creditHireYesOption;
	}

	private WebElement getCreditHireNoOption() {
		return creditHireNoOption;
	}

	private WebElement getProtocolHireYesOption() {
		return protocolHireYesOption;
	}

	private WebElement getProtocolHireNoOption() {
		return protocolHireNoOption;
	}

	private WebElement getForeignYesOption() {
		return foreignYesOption;
	}

	private WebElement getForeignNoOption() {
		return foreignNoOption;
	}

	private WebElement getForeignDetails() {
		return foreignDetails;
	}

	private WebElement getTpInsurerYesOption() {
		return tpInsurerYesOption;
	}

	private WebElement getTpInsurerNoOption() {
		return tpInsurerNoOption;
	}

	private WebElement getTpInsurerDropdown() {
		return tpInsurerDropdown;
	}

	private WebElement getTpInsurerPickerIcon() {
		return tpInsurerPickerIcon;
	}

	private WebElement getTpInsurerPickerSearch() {
		return tpInsurerPickerSearch;
	}

	private WebElement getTpInsurerPhone() {
		return tpInsurerPhone;
	}

	private WebElement getTpInsurerPEmail() {
		return tpInsurerPEmail;
	}

	private WebElement getTpInsurerPolicyNumber() {
		return tpInsurerPolicyNumber;
	}

	private WebElement getTpInsurerClaimNumber() {
		return tpInsurerClaimNumber;
	}

	

	

	
	
	
	


}