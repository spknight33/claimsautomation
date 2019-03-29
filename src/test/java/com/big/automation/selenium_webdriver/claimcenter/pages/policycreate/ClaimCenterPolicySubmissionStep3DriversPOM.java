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
	public void selecttOccupation(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDriverOccupationDropdown(),1);
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



	
	
	




	
	
	
}