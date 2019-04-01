package com.big.automation.selenium_webdriver.claimcenter.pages.policycreate;

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

public class ClaimCenterPolicySubmissionStep4VehiclePOM extends BaseTest{

	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:ttlBar")
	private WebElement pageTitle;
	
	
	@FindBy(id ="SubmissionWizard:Next")
	private WebElement nextButton;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:JobWizardToolbarButtonSet:QuoteOrReview")
	private WebElement quoteButton;
	
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel_tb:Add")
	private WebElement addButton;
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:RegistrationNumber-inputEl")
	private WebElement vrn;
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:SecurityDevices-inputEl")
	private WebElement securityDevice;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:SecurityTracker_true-inputEl")
	private WebElement trackerYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:SecurityTracker_false-inputEl")
	private WebElement trackerNoOption;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:MarketValue-inputEl")
	private WebElement marketValue;
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:HasBeenModified_true-inputEl")
	private WebElement modifiedYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:HasBeenModified_false-inputEl")
	private WebElement modifiedNoOption;
		
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:DayTimeParking-inputEl")
	private WebElement dayParkingDropdown;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:NightTimeParking-inputEl")
	private WebElement nightParkingDropdown;
	
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:MonthPurchased-inputEl")
	private WebElement buyMonthDropdown;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:YearPurchased-inputEl")
	private WebElement buyYear;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:ClassOfUse-inputEl")
	private WebElement useCarDropdown;
	
	
	
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:RegisteredKeeper_true-inputEl")
	private WebElement regKeeperYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:RegisteredKeeper_false-inputEl")
	private WebElement regKeeperNoOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:RightHandDrive_true-inputEl")
	private WebElement rhDriveYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:RightHandDrive_false-inputEl")
	private WebElement rhDriveNoOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:Imported_true-inputEl")
	private WebElement importedYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:Imported_false-inputEl")
	private WebElement importedNoOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:LessThanEightSeats_true-inputEl")
	private WebElement less8SeatsYesOption;
	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:LessThanEightSeats_false-inputEl")
	private WebElement less8SeatsNoOption;
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:ProductMiles-inputEl")
	private WebElement productMilesDropdown;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:AnnualMileage-inputEl")
	private WebElement estimateMiles;
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:VoluntaryExcess-inputEl")
	private WebElement volExcessDropdown;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:VehicleDetails:PMVehicleDetailsDV:NCDYears-inputEl")
	private WebElement ncdDropdown;
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:PersonalMotor_AssignDriversDV:MainDriverLV_tb:AddDriver")
	private WebElement assignDriverButton;
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:PersonalMotor_AssignDriversDV:MainDriverLV_tb:AddDriver:0:Driver-itemEl")
	private WebElement addDriverNameLink;
	
	
	@FindBy(xpath="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PMVehicleScreen:PMVehiclePanelSet:CoverableListDetailPanel:CoverableDetailsCV:PersonalMotor_AssignDriversDV:MainDriverLV-body']//table[1]//tr/td[3]//img")
	private WebElement mainDriverCB;
	
	private WebElement getImportedYesOption() {
		return importedYesOption;
	}



	private WebElement getImportedNoOption() {
		return importedNoOption;
	}



	private WebElement getLess8SeatsYesOption() {
		return less8SeatsYesOption;
	}



	private WebElement getLess8SeatsNoOption() {
		return less8SeatsNoOption;
	}



	private WebElement getProductMilesDropdown() {
		return productMilesDropdown;
	}



	private WebElement getEstimateMiles() {
		return estimateMiles;
	}



	private WebElement getVolExcessDropdown() {
		return volExcessDropdown;
	}



	private WebElement getNcdDropdown() {
		return ncdDropdown;
	}



	private WebElement getAssignDriverButton() {
		return assignDriverButton;
	}



	private WebElement getAddDriverNameLink() {
		return addDriverNameLink;
	}



	private WebElement getMainDriverCB() {
		return mainDriverCB;
	}



	public String getName() {

		return "vehicle";
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
	
	public void clickQuote()
	{
		GuideWireAccessors.clickGWButton(driver, this.getQuoteButton());
	}
	public void clickAddVehicle()
	{
		GuideWireAccessors.clickGWButton(driver, this.getAddButton());
	}

	//public void selectNamedDriver()
	//{
	//	GuideWireAccessors.clickGWButton(driver, this.getAddDriverButton());
	//	GuideWireAccessors.clickGWButton(driver, this.getAddExistingDriverLink());
	//	GuideWireAccessors.clickGWButton(driver, this.getAddDriverNameLink());
	//}
	
	public void setVrn(String text)
	{
		GuideWireAccessors.setGWTextBox(driver, text, this.getVrn());
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		sleep(2);
	}
	
	public void selectSecurityDevice(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getSecurityDevice(), 1);
	}
	public void selectTracker(boolean tracker)
	{
		logger.info(format("%s -  going to set tracker"+tracker, getName()));
		
		if (tracker)
		{
		GuideWireAccessors.clickGWButton(driver, this.getTrackerYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getTrackerNoOption());
		}
		
	}
	
	public void setMarketValue(String text)
	{
		GuideWireAccessors.setGWTextBox(driver, text, this.getMarketValue());
	}
	
	public void selectModified(boolean modified)
	{
		logger.info(format("%s -  going to set modified"+modified, getName()));
		
		if (modified)
		{
		GuideWireAccessors.clickGWButton(driver, this.getModifiedYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getModifiedNoOption());
		}
		
	}
	
	public void selectDayParking(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDayParkingDropdown(),1);
	}
	public void selectNightParking(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getNightParkingDropdown(),1);
	}
	
	
	public void selectBuyMonth(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getBuyMonthDropdown(),1);
	}
	public void setBuyYear(String text)
	{
		GuideWireAccessors.setGWTextBox(driver, text, this.getBuyYear());
	}
	public void selectUseCar(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getUseCarDropdown(),1);
	}
	
	public void selectRegKeeper(boolean keeper)
	{
		logger.info(format("%s -  going to set kepper"+keeper, getName()));
		
		if (keeper)
		{
		GuideWireAccessors.clickGWButton(driver, this.getRegKeeperYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getRegKeeperNoOption());
		}
		
	}
	
	public void selectRhDrive(boolean rhDrive)
	{
		logger.info(format("%s -  going to set rhDrive"+rhDrive, getName()));
		
		if (rhDrive)
		{
		GuideWireAccessors.clickGWButton(driver, this.getRhDriveYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getRhDriveNoOption());
		}
		
	}
	public void selectImported(boolean imported)
	{
		logger.info(format("%s -  going to set imported"+imported, getName()));
		
		if (imported)
		{
		GuideWireAccessors.clickGWButton(driver, this.getImportedYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getImportedNoOption());
		}
		
	}
	public void selectLess8Seats(boolean less8)
	{
		logger.info(format("%s -  going to set less8"+less8, getName()));
		
		if (less8)
		{
		GuideWireAccessors.clickGWButton(driver, this.getLess8SeatsYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getLess8SeatsNoOption());
		}
		
	}
	
	public void selectProductMiles(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getProductMilesDropdown(),1);
	}
	
	public void setEstimateMiles(String text)
	{
		GuideWireAccessors.setGWTextBox(driver, text, this.getEstimateMiles());
	}
	public void selectVolExcess(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVolExcessDropdown(),1);
	}
	public void selectNcd(String option)
	{
		sleep(1);
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getNcdDropdown(),1);
	}
	
	public void selectAssignDriver()
	{
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getAssignDriverButton(), this.getAddDriverNameLink());
		sleep(2);
		GuideWireAccessors.clickGWButton(driver, this.getMainDriverCB());
	}
	
	
	

	private WebElement getNextButton() {
		return nextButton;
	}



	private WebElement getVrn() {
		return vrn;
	}



	private WebElement getSecurityDevice() {
		return securityDevice;
	}



	private WebElement getTrackerYesOption() {
		return trackerYesOption;
	}



	private WebElement getTrackerNoOption() {
		return trackerNoOption;
	}



	private WebElement getMarketValue() {
		return marketValue;
	}



	private WebElement getModifiedYesOption() {
		return modifiedYesOption;
	}



	private WebElement getModifiedNoOption() {
		return modifiedNoOption;
	}



	private WebElement getDayParkingDropdown() {
		return dayParkingDropdown;
	}



	private WebElement getNightParkingDropdown() {
		return nightParkingDropdown;
	}



	private WebElement getBuyMonthDropdown() {
		return buyMonthDropdown;
	}



	private WebElement getBuyYear() {
		return buyYear;
	}



	private WebElement getUseCarDropdown() {
		return useCarDropdown;
	}



	private WebElement getRegKeeperYesOption() {
		return regKeeperYesOption;
	}



	private WebElement getRegKeeperNoOption() {
		return regKeeperNoOption;
	}



	private WebElement getRhDriveYesOption() {
		return rhDriveYesOption;
	}



	private WebElement getRhDriveNoOption() {
		return rhDriveNoOption;
	}



	private WebElement getAddButton() {
		return addButton;
	}



	private WebElement getQuoteButton() {
		return quoteButton;
	}
	
	
	
	
	
}