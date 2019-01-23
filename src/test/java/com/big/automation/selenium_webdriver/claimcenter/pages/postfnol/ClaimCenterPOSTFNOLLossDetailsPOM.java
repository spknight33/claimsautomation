package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLLossDetailsPOM extends BaseTest{

	
	@FindBy(id = "ClaimLossDetails:ClaimLossDetailsScreen:Cancel")
	private WebElement cancelButton;
	
	@FindBy(id = "ClaimLossDetails:ClaimLossDetailsScreen:Update")
	private WebElement updateButton;
		
	@FindBy(id = "ClaimLossDetails:ClaimLossDetailsScreen:Edit")
	private WebElement editButton;
	
		
	@FindBy(id = "ClaimLossDetails:ClaimLossDetailsScreen:ttlBar")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Description-inputEl")
	private WebElement circumstances;

	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Claim_LossCause-inputEl")
	private WebElement incidentType;
	
	       
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Claim_Cause_itb-inputEl")
	private WebElement claimCause;
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Claim_Subcause_itb-inputEl")
	private WebElement claimSubCause;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Notification_Fault-inputEl")
	private WebElement faultType;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Notification_AtFaultPercentage-inputEl")
	private WebElement insuredsLiability;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Catastrophe_CatastropheNumber-inputEl")
	private WebElement catastropheDropdown;
	
	//TODO
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsPanelSet:LossDetailsCardCV:LossDetailsDV:LossDate-inputEl")
	private WebElement lossDate;
		
	//INCIDENT questions
	//----------------------------------
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_VehicleUsedFor_itb-inputEl")
	private WebElement vehicleUsedFor;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_PurposeOfJourney_itb-inputEl")
	private WebElement journeyPurpose;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_TheOtherDriverIsKnown_itb_true-inputEl")
	private WebElement knowDriverYesOption;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_TheOtherDriverIsKnown_itb_false-inputEl")
	private WebElement knowDriverNoOption;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_NatureOfRelationship_itb-inputEl")
	private WebElement knowDriverDetails;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_SpeedAtImpact_itb-inputEl")
	private WebElement impactSpeed;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Claim_Weather-inputEl")
	private WebElement weather;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_RoadConditions_itb-inputEl")
	private WebElement roadConditions;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_SupportingPhotographicEvid_itb-inputEl")
	private WebElement photos;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_CCTVDashcamFootageAvail_itb-inputEl")
	private WebElement cctv;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:IncidentQuestions_CCTVContactLocationDetails_itb-inputEl")
	private WebElement cctvContact;
	
	//VEHICLE, PREDESTRIANS AND PROPERTY
	//----------------------------------------
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:AddVehicleButton")
	private WebElement addVehicleButton;
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:AddPedestrianButton")
	private WebElement addPedestrianButton;
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:AddPropertyDamageButton")
	private WebElement addPropertyDamageButton;
	
	//VEHICLE edit dropdowns
	//-----------------------------------------
	// assumes 1st vehicle is insureds
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:0:VehicleIncidentDV:VehicleName:VehicleNameMenuIcon")
	private WebElement phEditVehiclePickerIcon;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:0:VehicleIncidentDV:VehicleName:EditVehicleMenu-itemEl")
	private WebElement phEditVehiclePickerEditVehicle;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:0:VehicleIncidentDV:VehicleName:RemoveVehicleMenu-textEl")
	private WebElement phEditVehiclePickerRemoveVehicle;
	// assumes 2nd vehicle is insureds
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:1:VehicleIncidentDV:VehicleName:VehicleNameMenuIcon")
	private WebElement tpEditVehiclePickerIcon;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:1:VehicleIncidentDV:VehicleName:EditVehicleMenu-itemEl")
	private WebElement tpEditVehiclePickerEditVehicle;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:1:VehicleIncidentDV:VehicleName:RemoveVehicleMenu-textEl")
	private WebElement tpEditVehiclePickerRemoveVehicle;
	
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:0:VehicleIncidentDV:PassengerLV:driver")
	private WebElement phEditDriver;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:1:VehicleIncidentDV:PassengerLV:driver")
	private WebElement tpEditDriver;
	
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:0:VehicleIncidentDV:PassengerLV:0:passenger")
	private WebElement phEditPassenger;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:VehicleIncidentIterator:1:VehicleIncidentDV:PassengerLV:0:passenger")
	private WebElement tpEditPassenger;
	
	
	
	//PROPERTY edit dropdowns
	//-----------------------------------------
	// just do the 1st for now
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:PropertyIncidentIterator:0:PropertyIncidentDV:PropertyName:PropertyNameMenuIcon")
	private WebElement editPropertyPickerIcon;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:PropertyIncidentIterator:0:PropertyIncidentDV:PropertyName:EditProperty-itemEl")
	private WebElement editPropertyPickerEditProperty;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:PropertyIncidentIterator:0:PropertyIncidentDV:PropertyName:RemoveProperty-textEl")
	private WebElement editPropertyPickerRemoveProperty;
	
	//PEDESTRIAN edit dropdowns
		//-----------------------------------------
		// just do the 1st for now
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:PedestrianIterator:0:PedestrianDV:PersonName:PersonNameMenuIcon")
	private WebElement editPedestrianPickerIcon;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:PedestrianIterator:0:PedestrianDV:PersonName:EditPedestrian-textEl")
	private WebElement editPedestrianPickerEditPedestrian;
	@FindBy(id="ClaimLossDetails:ClaimLossDetailsScreen:PedestrianIterator:0:PedestrianDV:PersonName:RemovePedestrian-textEl")
	private WebElement editPedestrianPickerRemovePedestrian;
		
	
	
		
	//LOSS LOCATION
	//----------------------------------
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Picker-inputEl")
	private WebElement addressDropdown;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl")
	private WebElement addressLine1;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine2-inputEl")
	private WebElement addressLine2;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine3-inputEl")
	private WebElement addressLine3;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement addressCity;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:County-inputEl")
	private WebElement addressCounty;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement addressPostcode;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:addresses-inputEl")
	private WebElement addressPickerDropdown;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement addressLocationDesc;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Claim_LocationCode-inputEl")
	private WebElement addressLocationCode;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:AddressDetailInputSetRef:CCAddressInputSet:globalAddressContainer:Claim_JurisdictionState-inputEl")
	private WebElement addressJurisdictionDropdown;
	
	
	//NOTIFICATION and CONTACTS
	//-----------------------------------------------------
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:HowReported-inputEl")
	private WebElement howReportedDropdown;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:ReportedBy_Name-inputEl")
	private WebElement reportedByDropdown;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:ReportedBy_Name:ReportedBy_NameMenuIcon")
	private WebElement reportedByPickerIcon;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:ReportedBy_Name:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement reportedByPickerNewPerson;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:ReportedBy_Name:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-itemEl")
	private WebElement reportedByPickerNewCompany;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:ReportedBy_Name:MenuItem_Search-itemEl")
	private WebElement reportedByPickerSearch;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Claim_ReportedByType-inputEl")
	private WebElement reporterRelationshipDropdown;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:MainContactChoice_true-inputEl")
	private WebElement sameContactYesOption;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:MainContactChoice_false-inputEl")
	private WebElement sameContactNoOption;
		
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:MainContact_Name-inputEl")
	private WebElement mainContactDropdown;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:MainContact_Name:MainContact_NameMenuIcon")
	private WebElement mainContactPickerIcon;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:MainContact_Name:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
	private WebElement mainContactPickerNewPerson;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:MainContact_Name:MenuItem_Search-itemEl")
	private WebElement mainContactPickerSearch;
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:LossDetailsAddressDV:Claim_MainContactType-inputEl")
	private WebElement mainContactRelationship;
	
	//AT THE SCENE
	//--------------------------------------	
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:AtTheSceneDV:WitnessLV:EditableWitnessesLV_tb:Add")
	private WebElement addWitnessesButton;
	
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:AtTheSceneDV:Claim_Officials:EditableOfficialsLV_tb:Add")
	private WebElement addOfficialsButton;
	
	//TODO
	@FindBy(id ="ClaimLossDetails:ClaimLossDetailsScreen:AtTheSceneDV:PoliceReportLV:MetroReportsLV_tb:Add")
	private WebElement addPoliceButton;
	
	
	public String getName() {

		return "Post FNOL Loss Details";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {
	logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,getCancelButton());
	}
	
	public void update() {
	logger.info(format("%s -  going to click Update", getName()));
		GuideWireAccessors.clickGWButton(driver,getUpdateButton());
		}
	
	public void edit() {
		logger.info(format("%s -  going to click Edit", getName()));
		GuideWireAccessors.clickGWButton(driver,getEditButton());
		
	}

   // LOSS DETAILS SECTION
	//-----------------------------------------------------------------------------------------
	public void setCircumstancesValue(String circumstances)
	{
		logger.info(format("%s - setting circumstances: "+circumstances, getName()));
		GuideWireAccessors.setGWTextBox(driver, circumstances, this.getCircumstances());
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
	public void selectFaultType(String option)
	{
		logger.info(format("%s - going to select fault type option :"+option, getName()));
		sleep(2);
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getFaultType(),1);
	}
	public void setInsuredsLiability(String liability)
	{
		logger.info(format("%s - setting insureds liability: "+liability, getName()));
		GuideWireAccessors.setGWTextBox(driver, liability, this.getInsuredsLiability());
	}
	//TODO catastrophe
	
	public String getClaimCauseValue() {

		return this.getClaimCause().getAttribute("value");

	}
	
	public String getClaimSubCauseValue() {

		return this.getClaimSubCause().getAttribute("value");
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
	
	
	// INCIDENT QUESTIONS
	//---------------------------------------------------------------------
	public void selectVehicleUsedFor(String option)
	{
		logger.info(format("%s - going to select VehicleUser for option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVehicleUsedFor(),1);
	}
		
	public void setJourneyPurpose(String purpose)
	{
		logger.info(format("%s - setting journey purpose: "+purpose, getName()));
		GuideWireAccessors.setGWTextBox(driver,purpose, this.getJourneyPurpose());
	}
	
	
	public void selectKnowOtherDriver(boolean known)
	{
		logger.info(format("%s -  going to set know other driver to:"+known, getName()));
	    if (known)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getKnowDriverYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getKnowDriverNoOption());
	    }

	}
	public void setNatureOfRelationship(String nature)
	{
		logger.info(format("%s - setting nature of relationship : "+nature, getName()));
		GuideWireAccessors.setGWTextBox(driver,nature, this.getKnowDriverDetails());
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
	 public void setCctvContact(String text) {
			logger.info(format("%s -  going to set cctv contact:"+text, getName()));
			GuideWireAccessors.setGWTextBox(driver, text,this.getCctvContact());
			
		}
	
	
	// INCIDENT LOCATION
	//-------------------------------------------------------------
	public void selectAddressLocation(String option)
	{
		logger.info(format("%s - going to select address location option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getAddressDropdown(),1);
	}



  
    // VEHICLES, PEOPLE AND PROPERTY
	//----------------------------
   
   public void addVehicle() {
		logger.info(format("%s -  going to click AddVehicle", getName()));
		GuideWireAccessors.clickGWButton(driver,getAddVehicleButton());
		
	}
   
   public void addPedestrian() {
		logger.info(format("%s -  going to click AddPedestrian", getName()));
		GuideWireAccessors.clickGWButton(driver,getAddPedestrianButton());
		
	}
   
   public void addPropertyDamage() {
		logger.info(format("%s -  going to click Add PropertyDamage", getName()));
		GuideWireAccessors.clickGWButton(driver, getAddPropertyDamageButton());
		
	}
   
  
   public void selectEditPHVehicle()
   {
	   // the ph is usually the 1st in the set, there is nothing else on the page which denotes difference between PH/TP vehicle other than an image icon
	   // could use that later
	   logger.info(format("%s -  going to click edit PH vehicle", getName()));
	   GuideWireAccessors.selectOptionFromGWPicker(driver, this.getPhEditVehiclePickerIcon(), this.getPhEditVehiclePickerEditVehicle());
   }
   public void selectDeletePHVehicle()
   {
	   // the ph is usually the 1st in the set, there is nothing else on the page which denotes difference between PH/TP vehicle other than an image icon
	   // could use that later
	   logger.info(format("%s -  going to click delete PH vehicle", getName()));
	   GuideWireAccessors.selectOptionFromGWPicker(driver, this.getPhEditVehiclePickerIcon(), this.getPhEditVehiclePickerRemoveVehicle());
   }
   public void selectEditPHDriver()
   {
	  
	   logger.info(format("%s -  going to click edit PH Driver", getName()));
	   GuideWireAccessors.clickGWButton(driver, this.getPhEditDriver());
   }
   public void selectEditPHPassenger()
   {
	  
	   logger.info(format("%s -  going to click edit PH passenger", getName()));
	   GuideWireAccessors.clickGWButton(driver, this.getPhEditPassenger());
   }
   
   public void selectEditTPVehicle()
   {
	   // the ph is usually the 1st in the set, there is nothing else on the page which denotes difference between PH/TP vehicle other than an image icon
	   // could use that later
	   logger.info(format("%s -  going to click edit TP vehicle", getName()));
	   GuideWireAccessors.selectOptionFromGWPicker(driver, this.getTpEditVehiclePickerIcon(), this.getTpEditVehiclePickerEditVehicle());
   }
   public void selectDeleteTPVehicle()
   {
	   // the ph is usually the 1st in the set, there is nothing else on the page which denotes difference between PH/TP vehicle other than an image icon
	   // could use that later
	   logger.info(format("%s -  going to click delete TP vehicle", getName()));
	   GuideWireAccessors.selectOptionFromGWPicker(driver, this.getTpEditVehiclePickerIcon(), this.getTpEditVehiclePickerRemoveVehicle());
   }
   public void selectEditTPDriver()
   {
	  
	   logger.info(format("%s -  going to click edit TP Driver", getName()));
	   GuideWireAccessors.clickGWButton(driver, this.getTpEditDriver());
   }
   public void selectEditTPPassenger()
   {
	  
	   logger.info(format("%s -  going to click edit TP passenger", getName()));
	   GuideWireAccessors.clickGWButton(driver, this.getTpEditPassenger());
   }
   
   public void selectEditPedestrian()
   {
	
	   logger.info(format("%s -  going to click edit pedestrian", getName()));
	   GuideWireAccessors.selectOptionFromGWPicker(driver, this.getEditPedestrianPickerIcon(), this.getEditPedestrianPickerEditPedestrian());
   }
   public void selectDeletePedestrian()
   {
	 
	   logger.info(format("%s -  going to click delete pedestrian", getName()));
	   GuideWireAccessors.selectOptionFromGWPicker(driver, this.getEditPedestrianPickerIcon(), this.getEditPedestrianPickerRemovePedestrian());
   }
   
   public void selectEditProperty()
   {
	  
	   logger.info(format("%s -  going to click edit property", getName()));
	   GuideWireAccessors.selectOptionFromGWPicker(driver, this.getEditPropertyPickerIcon(), this.getEditPropertyPickerEditProperty());
   }
   public void selectDeleteProperty()
   {
	
	   logger.info(format("%s -  going to click delete property", getName()));
	   GuideWireAccessors.selectOptionFromGWPicker(driver, this.getEditPropertyPickerIcon(), this.getEditPropertyPickerRemoveProperty());
   }
   
  
   
   
   // AT THE SCENE
   //---------------------------------------------------------------------
    
   public void addWitnesses() {
		logger.info(format("%s -  going to click Add Witness", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddWitnessesButton());
		
	}
   public void addOfficials() {
		logger.info(format("%s -  going to click Add Official", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddOfficialsButton());
		
	}
   
   public void addPolice() {
		logger.info(format("%s -  going to click Add Police", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddPoliceButton());
		
	}
   
   public void selecHowReported(String option)
	{
		logger.info(format("%s - going to select how reported option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getHowReportedDropdown(),1);
	}
   
	private WebElement getCancelButton() {
	return cancelButton;
}
	

	public void selectReportedByName(String option) {
		logger.info(format("%s - going to select report by name option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, getReportedByDropdown(), 1);
	}

	public void selectRelationToInsured(String option) {
		logger.info(format("%s - going to select relation to insured option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getReporterRelationshipDropdown(), 1);
	}
	
	public void selectContactRelationToInsured(String option) {
		logger.info(format("%s - going to select contact relation to insured option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getMainContactRelationship(), 2);
	}

	public void selectNewPersonReporter()
	{
		logger.info(format("%s - going to select New Person from reported by picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getReportedByPickerIcon(),this.getReportedByPickerNewPerson());
	}
	
	public void selectNewPersonContact()
	{
		logger.info(format("%s - going to select New Person from contact picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getMainContactPickerIcon(),this.getMainContactPickerNewPerson());
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

	

	private WebElement getAddressDropdown() {
		return addressDropdown;
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

	
	private WebElement getMainContactDropdown() {
		return mainContactDropdown;
	}

	private WebElement getMainContactPickerIcon() {
		return mainContactPickerIcon;
	}

	private WebElement getMainContactPickerNewPerson() {
		return mainContactPickerNewPerson;
	}

	

	private WebElement getAddPoliceButton() {
		return addPoliceButton;
	}
	
	

	private WebElement getInsuredsLiability() {
		return insuredsLiability;
	}

	private WebElement getCatastropheDropdown() {
		return catastropheDropdown;
	}

	private WebElement getKnowDriverYesOption() {
		return knowDriverYesOption;
	}

	private WebElement getKnowDriverNoOption() {
		return knowDriverNoOption;
	}

	private WebElement getKnowDriverDetails() {
		return knowDriverDetails;
	}

	private WebElement getAddressLine1() {
		return addressLine1;
	}

	private WebElement getAddressLine2() {
		return addressLine2;
	}

	private WebElement getAddressLine3() {
		return addressLine3;
	}

	private WebElement getAddressCity() {
		return addressCity;
	}

	private WebElement getAddressCounty() {
		return addressCounty;
	}

	private WebElement getAddressPostcode() {
		return addressPostcode;
	}

	private WebElement getAddressPickerDropdown() {
		return addressPickerDropdown;
	}

	private WebElement getAddressLocationDesc() {
		return addressLocationDesc;
	}

	private WebElement getAddressLocationCode() {
		return addressLocationCode;
	}

	private WebElement getAddressJurisdictionDropdown() {
		return addressJurisdictionDropdown;
	}

	private WebElement getHowReportedDropdown() {
		return howReportedDropdown;
	}

	private WebElement getReportedByPickerNewCompany() {
		return reportedByPickerNewCompany;
	}

	private WebElement getReportedByPickerSearch() {
		return reportedByPickerSearch;
	}

	private WebElement getReporterRelationshipDropdown() {
		return reporterRelationshipDropdown;
	}

	private WebElement getSameContactYesOption() {
		return sameContactYesOption;
	}

	private WebElement getSameContactNoOption() {
		return sameContactNoOption;
	}

	private WebElement getMainContactPickerSearch() {
		return mainContactPickerSearch;
	}

	private WebElement getMainContactRelationship() {
		return mainContactRelationship;
	}

	private WebElement getAddWitnessesButton() {
		return addWitnessesButton;
	}

	private WebElement getAddOfficialsButton() {
		return addOfficialsButton;
	}
	
	

	private WebElement getPhEditVehiclePickerIcon() {
		return phEditVehiclePickerIcon;
	}

	private WebElement getPhEditVehiclePickerEditVehicle() {
		return phEditVehiclePickerEditVehicle;
	}
	
	

	private WebElement getTpEditVehiclePickerIcon() {
		return tpEditVehiclePickerIcon;
	}

	private WebElement getTpEditVehiclePickerEditVehicle() {
		return tpEditVehiclePickerEditVehicle;
	}
	
	

	private WebElement getPhEditVehiclePickerRemoveVehicle() {
		return phEditVehiclePickerRemoveVehicle;
	}

	private WebElement getTpEditVehiclePickerRemoveVehicle() {
		return tpEditVehiclePickerRemoveVehicle;
	}

	private WebElement getEditPropertyPickerIcon() {
		return editPropertyPickerIcon;
	}

	private WebElement getEditPropertyPickerEditProperty() {
		return editPropertyPickerEditProperty;
	}

	private WebElement getEditPropertyPickerRemoveProperty() {
		return editPropertyPickerRemoveProperty;
	}

	private WebElement getEditPedestrianPickerIcon() {
		return editPedestrianPickerIcon;
	}

	private WebElement getEditPedestrianPickerEditPedestrian() {
		return editPedestrianPickerEditPedestrian;
	}

	private WebElement getEditPedestrianPickerRemovePedestrian() {
		return editPedestrianPickerRemovePedestrian;
	}
	
	

	private WebElement getPhEditDriver() {
		return phEditDriver;
	}

	private WebElement getTpEditDriver() {
		return tpEditDriver;
	}

	private WebElement getPhEditPassenger() {
		return phEditPassenger;
	}

	private WebElement getTpEditPassenger() {
		return tpEditPassenger;
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