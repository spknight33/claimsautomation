package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLEditInjuryExposurePOM extends BaseTest {

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

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Coverage-inputEl")
	private WebElement coverageDropdown;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Claimant_Picker-inputEl")
	private WebElement claimantDropdown;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Claimant_Picker:Claimant_PickerMenuIcon")
	private WebElement claimantPickerIcon;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Claimant_Picker:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement claimantPickerNewPerson;

	

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Claimant_ContactProhibited_true-inputEl")
	private WebElement claimantContactProhibYes;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Claimant_ContactProhibited_false-inputEl")
	private WebElement claimantContactProhibNo;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:AltContact_Name-inputEl")
	private WebElement altContactDropdown;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:AltContact_Name:AltContact_NameMenuIcon")
	private WebElement altContactPickerIcon;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:AltContact_Name:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement altContactPickerNewPerson;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:BIDamageInputSet:Injury_Incident-inputEl")
	private WebElement injuryDropdown;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:BIDamageInputSet:Injury_Incident:Injury_IncidentMenuIcon")
	private WebElement injuryPickerIcon;
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:BIDamageInputSet:Injury_Incident:BodilyInjuryDamageDV_NewIncidentMenuItem-itemEl")
	private WebElement injuryPickerNewIncident;

	public String getName() {

		return "Edit Injury Exposure Post FNOL";
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
		logger.info(format("%s - done, cancel clicked", getName()));
	}

	public void selectUpdate() {
		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpdateButton());

	}

	public void selectEdit() {
		logger.info(format("%s -  going to click Edit", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getEditButton());

	}

	public void selectUpToExposures() {
		logger.info(format("%s -  going to click up to exposures link", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpToExposuresLink());

	}

	public void selectNewClaimant() {
		logger.info(format("%s - going to select New Person from Claimant picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getClaimantPickerIcon(),
				this.getClaimantPickerNewPerson());
	}

	public void selectNewInjury() {
		logger.info(format("%s - going to select New Incident from Injury picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getInjuryPickerIcon(),
				this.getInjuryPickerNewIncident());
	}

	

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getPageTitle() {
		return pageTitle;
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

	

	private WebElement getClaimantContactProhibYes() {
		return claimantContactProhibYes;
	}

	private WebElement getClaimantContactProhibNo() {
		return claimantContactProhibNo;
	}

	private WebElement getAltContactDropdown() {
		return altContactDropdown;
	}

	private WebElement getAltContactPickerIcon() {
		return altContactPickerIcon;
	}

	private WebElement getAltContactPickerNewPerson() {
		return altContactPickerNewPerson;
	}

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getUpToExposuresLink() {
		return upToExposuresLink;
	}

	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getInjuryDropdown() {
		return injuryDropdown;
	}

	private WebElement getInjuryPickerIcon() {
		return injuryPickerIcon;
	}

	private WebElement getInjuryPickerNewIncident() {
		return injuryPickerNewIncident;
	}

}