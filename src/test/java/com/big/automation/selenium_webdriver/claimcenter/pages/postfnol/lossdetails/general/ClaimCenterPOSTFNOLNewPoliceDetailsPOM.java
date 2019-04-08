package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewPoliceDetailsPOM extends BaseTest{

	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:ttlBar")
	private WebElement pageTitle;
		
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:Update-btnEl")
	private WebElement okButton;
	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:Cancel-btnEl")
	private WebElement cancelButton;

	
	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeForceDetails:policeForceName-inputEl")
	private WebElement policeForceDropdown;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeForceDetails:policeForceName:policeForceNameMenuIcon")
	private WebElement policeForcePickerIcon;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeForceDetails:policeForceName:MenuItem_Search-textEl")
	private WebElement policeForceSearchPicker;
	
	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:stationDetails:stationName-inputEl")
	private WebElement stationDealingDropdown;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:stationDetails:stationName:stationNameMenuIcon")
	private WebElement stationDealingPickerIcon;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:stationDetails:stationName:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-textEl")
	private WebElement stationDealingNewStationPicker;
	//TODO change locator once new station ready
	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:dateReported-inputEl")
	private WebElement dateReported;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:timeReported-inputEl")
	private WebElement timeReported;
	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeReferenceNumber-inputEl")
	private WebElement incidentReference;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:crimeReferenceNumber-inputEl")
	private WebElement crimeReference;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:officerName-inputEl")
	private WebElement officerName;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:badgeNumber-inputEl")
	private WebElement badgeNumber;
	
	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeAttended_true-inputEl")
	private WebElement officerAttendYesOption;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeAttended_false-inputEl")
	private WebElement officerAttendNoOption;
	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeConsidering_true-inputEl")
	private WebElement furtherActionYesOption;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeConsidering_false-inputEl")
	private WebElement furtherActionNoOption;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:policeProceedingNotes-inputEl")
	private WebElement furtherActionDetails;

	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:anyoneApprehend_true-inputEl")
	private WebElement apprehendedYesOption;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:anyoneApprehend_false-inputEll")
	private WebElement apprehendedNoOption;
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:apprehendDetails-inputEl")
	private WebElement apprehendedDetails;
	
	@FindBy(id = "NewPoliceDetailsPopup:PoliceDetailsScreen:PoliceDetailsDV:additionalNotes-inputEl")
	private WebElement notes;
	
	
	private List <WebElement> errorMessages;

	public String getName() {

		return "New Police Details";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);

		logger.info(format("%s -found page title for Person page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkButton());
		logger.info(format("%s - done, OK clicked", getName()));
	}
	
	
	
	public void selectSearchPoliceForce()
	{
		logger.info(format("%s - going to select Search from police force picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getPoliceForcePickerIcon(),this.getPoliceForceSearchPicker());
	}
	
	public void setDateReported(String text)
	{
		logger.info(format("%s -  going to set date reported", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDateReported());
		logger.info(format("%s - done, date reported set", getName()));
	}
	
	public void setTimeReported(String text)
	{
		logger.info(format("%s -  going to set time reported", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getTimeReported());
		logger.info(format("%s - done, time reported set", getName()));
	}
	
	public void setIncidentReference(String text)
	{
		logger.info(format("%s -  going to set incident ref", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getIncidentReference());
		logger.info(format("%s - done, incident ref set", getName()));
	}
	
	public void setCrimeReference(String text)
	{
		logger.info(format("%s -  going to set crime ref", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCrimeReference());
		logger.info(format("%s - done, crime ref set", getName()));
	}
   
	public void setOfficerName(String text)
	{
		logger.info(format("%s -  going to set officername", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getOfficerName());
		logger.info(format("%s - done, officername set", getName()));
	}
	public void setBadgeNumber(String text)
	{
		logger.info(format("%s -  going to set badge number", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getBadgeNumber());
		logger.info(format("%s - done, badge number set", getName()));
	}
	
	public void selectPoliceAttended(boolean attended) {
		logger.info(format("%s -  going to set police attended:"+attended, getName()));
		if (attended)
		{
		GuideWireAccessors.clickGWButton(driver, this.getOfficerAttendYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getOfficerAttendNoOption());
		}
		logger.info(format("%s - done, police attended set", getName()));
	}
	
	public void selectFurtherAction(boolean action) {
		logger.info(format("%s -  going to set police action:"+action, getName()));
		if (action)
		{
		GuideWireAccessors.clickGWButton(driver, this.getFurtherActionYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getFurtherActionNoOption());
		}
		logger.info(format("%s - done, police action set", getName()));
	}
	
	public void selectApprehended(boolean apprehended) {
		logger.info(format("%s -  going to set police apprehended:"+apprehended, getName()));
		if (apprehended)
		{
		GuideWireAccessors.clickGWButton(driver, this.getApprehendedYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getApprehendedNoOption());
		}
		
	}
	
	public void setFurtherActionDetails(String text)
	{
		logger.info(format("%s -  going to set further action details", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFurtherActionDetails());
		logger.info(format("%s - done, further action details set", getName()));
	}
	
	public void setApprehendedDetails(String text)
	{
		logger.info(format("%s -  going to set apprehended details", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getApprehendedDetails());
		logger.info(format("%s - done, apprehended details set", getName()));
	}
	
	public void setNotes(String text)
	{
		logger.info(format("%s -  going to set notes", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNotes());
		logger.info(format("%s - done, notes set", getName()));
	}
	
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getOkButton() {
		return okButton;
	}

	private WebElement getPoliceForceDropdown() {
		return policeForceDropdown;
	}

	private WebElement getPoliceForcePickerIcon() {
		return policeForcePickerIcon;
	}

	private WebElement getPoliceForceSearchPicker() {
		return policeForceSearchPicker;
	}

	private WebElement getStationDealingDropdown() {
		return stationDealingDropdown;
	}

	private WebElement getStationDealingPickerIcon() {
		return stationDealingPickerIcon;
	}

	private WebElement getStationDealingNewStationPicker() {
		return stationDealingNewStationPicker;
	}

	private WebElement getDateReported() {
		return dateReported;
	}

	private WebElement getTimeReported() {
		return timeReported;
	}

	private WebElement getIncidentReference() {
		return incidentReference;
	}

	private WebElement getCrimeReference() {
		return crimeReference;
	}

	private WebElement getOfficerName() {
		return officerName;
	}

	private WebElement getBadgeNumber() {
		return badgeNumber;
	}

	private WebElement getOfficerAttendYesOption() {
		return officerAttendYesOption;
	}

	private WebElement getOfficerAttendNoOption() {
		return officerAttendNoOption;
	}

	private WebElement getFurtherActionYesOption() {
		return furtherActionYesOption;
	}

	private WebElement getFurtherActionNoOption() {
		return furtherActionNoOption;
	}

	private WebElement getFurtherActionDetails() {
		return furtherActionDetails;
	}

	private WebElement getApprehendedYesOption() {
		return apprehendedYesOption;
	}

	private WebElement getApprehendedNoOption() {
		return apprehendedNoOption;
	}

	private WebElement getApprehendedDetails() {
		return apprehendedDetails;
	}

	private WebElement getNotes() {
		return notes;
	}


	
	
	
	


}