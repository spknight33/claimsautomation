package com.big.automation.selenium_webdriver.claimcenter.pages.policycreate;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPolicySubmissionStep3DriversPOM extends BaseTest{

	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:ttlBar")
	private WebElement pageTitle;
	
	
	@FindBy(id ="SubmissionWizard:Next")
	private WebElement nextButton;
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver")
	private WebElement addDriverButton;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact-itemEl")
	private WebElement addExistingDriverLink;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:0:UnassignedDriver-itemEl")
	private WebElement addDriverNameLink;
	
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Prefix-inputEl")
	private WebElement driverTitleDropdown;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Gender-inputEl")
	private WebElement driverGenderDropdown;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Occupation-inputEl")
	private WebElement driverOccupationDropdown;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl")
	private WebElement dob;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Gender-inputEl")
	private WebElement genderDropdown;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:MaritalStatus-inputEl")
	private WebElement maritalStatusDropdown;
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:UKResident5Years_true-inputEl")
	private WebElement residentYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:UKResident5Years_false-inputEl")
	private WebElement residentNoOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Homeowner_true-inputEl")
	private WebElement ownHomeYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Homeowner_false-inputEl")
	private WebElement ownHomeNoOption;
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:RolesCardTab")
	private WebElement rolesTab;
	
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:LicenseType-inputEl")
	private WebElement licenseTypeDropdown;
	
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:PassedTest10Years_true-inputEl")
	private WebElement license10YesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:PassedTest10Years_false-inputEl")
	private WebElement license10NoOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:AccessToOtherVehicles_true-inputEl")
	private WebElement otherVehiclesYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:AccessToOtherVehicles_false-inputEl")
	private WebElement otherVehiclesNoOption;
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:DrivingQualifications-inputEl")
	private WebElement addQualDropdown;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:MedicalConditions-inputEl")
	private WebElement medicalDropdown;
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:NonMotoringConvictions_true-inputEl")
	private WebElement rehabYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:NonMotoringConvictions_false-inputEl")
	private WebElement rehabNoOption;
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:CancelledPreviousInsurance_true-inputEl")
	private WebElement cancelledYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:CancelledPreviousInsurance_false-inputEl")
	private WebElement cancelledNoOption;
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:MotorClaims_true-inputEl")
	private WebElement claims5YesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:MotorClaims_false-inputEl")
	private WebElement claims5NoOption;
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:MotorConvictions_true-inputEl")
	private WebElement convict5YesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMDriversScreen:PMDriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PMPolicyDriverInfoPanelSet:MotorConvictions_false-inputEl")
	private WebElement convict5NoOption;

	private WebElement getRolesTab() {
		return rolesTab;
	}



	public String getName() {

		return "Drivers";
	}
	
	
	
	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	public void clickNext()
	{
		GuideWireAccessors.clickGWButton(driver, this.getNextButton());
	}

	public void selectNamedDriver()
	{
		GuideWireAccessors.clickGWButton(driver, this.getAddDriverButton());
		GuideWireAccessors.clickGWButton(driver, this.getAddExistingDriverLink());
		GuideWireAccessors.clickGWButton(driver, this.getAddDriverNameLink());
	}
	
	public void selectTitle(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDriverTitleDropdown(), 1);
	}
	public void selectOccupation(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDriverOccupationDropdown(),1);
	}
	public void selectGender(String option)
	{
		logger.info(format("%s -  going to set gender"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDriverGenderDropdown(),1);
	}
	
	public void selectMaritalStatus(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getMaritalStatusDropdown(),1);
	}
	public void setDob(String text)
	{
		GuideWireAccessors.setGWTextBox(driver, text, this.getDob());
	}
	
	public void selectResident(boolean resident)
	{
		logger.info(format("%s -  going to set resident"+resident, getName()));
		
		if (resident)
		{
		GuideWireAccessors.clickGWButton(driver, this.getResidentYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getResidentNoOption());
		}
		
	}
	
	public void selectOwnHome(boolean own)
	{
		logger.info(format("%s -  going to set own home"+own, getName()));
		
		if (own)
		{
		GuideWireAccessors.clickGWButton(driver, this.getOwnHomeYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getOwnHomeNoOption());
		}
		
	}
	
	public void clickRolesTab()
	{
		logger.info(format("%s -  going to clickroles tab", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getRolesTab());
		sleep(2);
	}
	
	//Roles tab 
	//-----------------------------------------------------------------------------------
	public void selectLicenseType(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getLicenseTypeDropdown(),1);
	}
	
	public void selectLicense10(boolean license10)
	{
		logger.info(format("%s -  going to set license 10 years"+license10, getName()));
		
		if (license10)
		{
		GuideWireAccessors.clickGWButton(driver, this.getLicense10YesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getLicense10NoOption());
		}
		
	}
	
	
	public void selectOtherVehicles(boolean other)
	{
		logger.info(format("%s -  going to set access to other vehicles"+other, getName()));
		
		if (other)
		{
		GuideWireAccessors.clickGWButton(driver, this.getOtherVehiclesYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getOtherVehiclesNoOption());
		}
		
	}
	
	public void selectAddQuals(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddQualDropdown(),1);
	}
	public void selectMedicals(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getMedicalDropdown(),1);
	}
	
	public void selectRehab(boolean rehab)
	{
		logger.info(format("%s -  going to set access to rehab"+rehab, getName()));
		
		if (rehab)
		{
		GuideWireAccessors.clickGWButton(driver, this.getRehabYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getRehabNoOption());
		}
	}
	public void selectCancelled(boolean cancelled)
	{
		logger.info(format("%s -  going to set access to cancelled"+cancelled, getName()));
		
		if (cancelled)
		{
		GuideWireAccessors.clickGWButton(driver, this.getCancelledYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getCancelledNoOption());
		}
	}
	
	public void selectClaims5(boolean claims)
	{
		logger.info(format("%s -  going to set access to claims5"+claims, getName()));
		
		if (claims)
		{
		GuideWireAccessors.clickGWButton(driver, this.getClaims5YesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getClaims5NoOption());
		}
	}
	
	public void selectConvict5(boolean convict)
	{
		logger.info(format("%s -  going to set access to convict5"+convict, getName()));
		
		if (convict)
		{
		GuideWireAccessors.clickGWButton(driver, this.getConvict5YesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getConvict5NoOption());
		}
	}
	
	

	private WebElement getAddDriverButton() {
		return addDriverButton;
	}



	private WebElement getAddExistingDriverLink() {
		return addExistingDriverLink;
	}



	private WebElement getAddDriverNameLink() {
		return addDriverNameLink;
	}



	private WebElement getDriverTitleDropdown() {
		return driverTitleDropdown;
	}



	private WebElement getDriverGenderDropdown() {
		return driverGenderDropdown;
	}



	private WebElement getDriverOccupationDropdown() {
		return driverOccupationDropdown;
	}



	private WebElement getDob() {
		return dob;
	}



	private WebElement getGenderDropdown() {
		return genderDropdown;
	}



	private WebElement getMaritalStatusDropdown() {
		return maritalStatusDropdown;
	}



	private WebElement getResidentYesOption() {
		return residentYesOption;
	}



	private WebElement getResidentNoOption() {
		return residentNoOption;
	}



	private WebElement getOwnHomeYesOption() {
		return ownHomeYesOption;
	}



	private WebElement getOwnHomeNoOption() {
		return ownHomeNoOption;
	}



	private WebElement getLicenseTypeDropdown() {
		return licenseTypeDropdown;
	}



	private WebElement getLicense10YesOption() {
		return license10YesOption;
	}



	private WebElement getLicense10NoOption() {
		return license10NoOption;
	}



	private WebElement getOtherVehiclesYesOption() {
		return otherVehiclesYesOption;
	}



	private WebElement getOtherVehiclesNoOption() {
		return otherVehiclesNoOption;
	}



	private WebElement getAddQualDropdown() {
		return addQualDropdown;
	}



	private WebElement getMedicalDropdown() {
		return medicalDropdown;
	}



	private WebElement getRehabYesOption() {
		return rehabYesOption;
	}



	private WebElement getRehabNoOption() {
		return rehabNoOption;
	}



	private WebElement getCancelledYesOption() {
		return cancelledYesOption;
	}



	private WebElement getCancelledNoOption() {
		return cancelledNoOption;
	}



	private WebElement getClaims5YesOption() {
		return claims5YesOption;
	}



	private WebElement getClaims5NoOption() {
		return claims5NoOption;
	}



	private WebElement getConvict5YesOption() {
		return convict5YesOption;
	}



	private WebElement getConvict5NoOption() {
		return convict5NoOption;
	}



	private WebElement getNextButton() {
		return nextButton;
	}



	
	
	




	
	
	
}