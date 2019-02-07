package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLEditTPCaptureExposurePOM extends BaseTest {

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ttlBar")
	private WebElement pageTitle;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:Edit")
	private WebElement editButton;
	@FindBy(id = "ExposureDetail:ExposureDetail_UpLink")
	private WebElement upToExposuresLink;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:Update")
	private WebElement updateButton;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:Cancel")
	private WebElement cancelButton;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Coverage-inputEl")
	private WebElement coverageDropdown;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Claimant_Picker-inputEl")
	private WebElement claimantDropdown;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Claimant_Picker:Claimant_PickerMenuIcon")
	private WebElement claimantPickerIcon;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Claimant_Picker:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement claimantPickerNewPerson;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Claimant_Type-inputEl")
	private WebElement claimantTypeDropdown;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Claimant_ContactProhibited_true-inputEl")
	private WebElement claimantContactProhibYes;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Claimant_ContactProhibited_false-inputEl")
	private WebElement claimantContactProhibNo;

	// @FindBy(id =
	// "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:AltContact_Name-inputEl")
	// private WebElement altContactDropdown;
	// @FindBy(id =
	// "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:AltContact_Name:AltContact_NameMenuIcon")
	// private WebElement altContactPickerIcon;
	// @FindBy(id =
	// "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:AltContact_Name:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-textEl")
	// private WebElement altContactPickerNewPerson;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Vehicle_Incident-inputEl")
	private WebElement vehicleDropdown;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Vehicle_Incident:Vehicle_IncidentMenuIcon")
	private WebElement vehiclePickerIcon;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:VehicleDamageDV:Vehicle_Incident:VehicleDamageDV_NewIncidentMenuItem-itemEl")
	private WebElement vehiclePickerNewIncident;

	// TODO excess stuff?

	public String getName() {

		return "Edit TP Capture Exposure FNOL";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(4);

		logger.info(format("%s -found page title for Exposure page :" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}

	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());

	}

	public void selectEdit() {
		logger.info(format("%s -  going to click Edit", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getEditButton());
	}

	public void selectUpdate() {
		logger.info(format("%s -  going to click Update", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpdateButton());

	}

	public void selectNewClaimant() {
		logger.info(format("%s - going to select New Person from Claimant picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getClaimantPickerIcon(),
				this.getClaimantPickerNewPerson());
	}

	public void selectNewVehicle() {
		logger.info(format("%s - going to select New Incident from Vehicle picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getVehiclePickerIcon(),
				this.getVehiclePickerNewIncident());
	}

	public void selectClaimantType(String option) {
		logger.info(format("%s - going to select Claimant type option:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getClaimantTypeDropdown(), 1);
	}

	public void selectUpToExposures() {
		logger.info(format("%s -  going to click up to exposures link", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpToExposuresLink());

	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getUpToExposuresLink() {
		return upToExposuresLink;
	}

	private WebElement getCoverageDropdown() {
		return coverageDropdown;
	}

	private WebElement getClaimantDropdown() {
		return claimantDropdown;
	}

	private WebElement getClaimantPickerIcon() {
		return claimantPickerIcon;
	}

	private WebElement getClaimantPickerNewPerson() {
		return claimantPickerNewPerson;
	}

	private WebElement getClaimantTypeDropdown() {
		return claimantTypeDropdown;
	}

	private WebElement getClaimantContactProhibYes() {
		return claimantContactProhibYes;
	}

	private WebElement getClaimantContactProhibNo() {
		return claimantContactProhibNo;
	}

	private WebElement getVehicleDropdown() {
		return vehicleDropdown;
	}

	private WebElement getVehiclePickerIcon() {
		return vehiclePickerIcon;
	}

	private WebElement getVehiclePickerNewIncident() {
		return vehiclePickerNewIncident;
	}

	private WebElement getUpdateButton() {
		return updateButton;
	}

}