package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLPropertyDetailsPOM extends BaseTest {

	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:0")
	private WebElement pageTitle;

	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:Update-btnEl")
	private WebElement okButton;

	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;

	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyDescription-inputEl")
	private WebElement propertyDesc;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:Description-inputEl")
	private WebElement damageDesc;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:LossEstimate-inputEl")
	private WebElement lossEstimate;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:ExtDamagetxt-inputEl")
	private WebElement extentDamage;

	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl")
	private WebElement addressLine1;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine2-inputEl")
	private WebElement addressLine2;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine3-inputEl")
	private WebElement addressLine3;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement city;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement postCode;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement locationDesc;

	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyOwner_itb-inputEl")
	private WebElement ownerDropDown;

	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyOwner_itb:PropertyOwner_itbMenuIcon")
	private WebElement ownerPicker;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyOwner_itb:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement ownerNewPerson;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyOwner_itb:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-itemEl")
	private WebElement ownerNewCompany;

	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimatedReceived-inputEl")
	private WebElement estimateReceivedDropdown;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimateCost-inputEl")
	private WebElement estimateCost;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimateTime-inputEl")
	private WebElement estimateRepairTime;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:AlreadyRepaired_true-inputEl")
	private WebElement alreadyRepairedYesRadio;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:AlreadyRepaired_false-inputEl")
	private WebElement alreadyRepairedNoRadio;


	public String getName() {

		return "FNOL Property Incident";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(2);
		logger.info(format("%s -found page title for Add Property page :" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public boolean containsErrorMessage(String contains)
	{
				
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

	public void setPropertyDesc(String text) {
		logger.info(format("%s -  going to set property desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPropertyDesc());
	
	}

	public void setDamageDesc(String text) {
		logger.info(format("%s -  going to set damage desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDamageDesc());
		
	}

	public void setLossEstimate(String text) {
		logger.info(format("%s -  going to set loss estimate", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLossEstimate());
	}

	public void setExtentDamage(String text) {
		logger.info(format("%s -  going to set extent damage desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getExtentDamage());
	
	}

	public void setAddressLine1(String text) {
		logger.info(format("%s -  going to set address line1", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine1());
		
	}

	public void setAddressLine2(String text) {
		logger.info(format("%s -  going to set address line2", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());
	}

	public void setAddressLine3(String text) {
		logger.info(format("%s -  going to set address line3", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine3());
		
	}

	public void setCity(String text) {
		logger.info(format("%s -  going to set city", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCity());
	
	}

	public void setPostcode(String text) {
		logger.info(format("%s -  going to set postcode", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostCode());
		// as postcode causes display off other address fields, but this can take a couple of seconds - the next method should wait until available but add a slug anyway
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				sleep(2);
	}

	public void setLocationDescription(String text) {
		logger.info(format("%s -  going to set location description", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());
		
	}

	public void selectPropertyOwner(String option) {
		logger.info(format("%s -  going to select property owner:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getOwnerDropDown(), 1);
	
	}
	
	public void selectNewOwnerPerson() {
		logger.info(format("%s - going to select New Person from owner picker", getName()));
		sleep(1);
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getOwnerPicker(), this.getOwnerNewPerson());
	}

	public void selectNewOwnerCompany() {
		logger.info(format("%s - going to select New Compnay from owner picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getOwnerPicker(), this.getOwnerNewCompany());
	}

	public void selectEstimateReceived(String option) {
		logger.info(format("%s -  going to set estimate received:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getEstimateReceivedDropdown(), 1);
	
	}

	public void setEstimateCost(String text) {
		logger.info(format("%s -  going to set esitmate cost", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getEstimateCost());
		logger.info(format("%s - done, estimate cost set", getName()));
	}

	public void setEstimateRepairTime(String text) {
		logger.info(format("%s -  going to set esitmate repair time", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getEstimateRepairTime());
		logger.info(format("%s - done, estimate repair time set", getName()));
	}

	public void selectAlreadyRepaired(boolean repaired) {
		logger.info(format("%s -  going to set already repaired:" + repaired, getName()));
		if (repaired) {
			GuideWireAccessors.clickGWButton(driver, this.getAlreadyRepairedYesRadio());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getAlreadyRepairedNoRadio());
		}
		logger.info(format("%s - done, already repaired set", getName()));
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

	private WebElement getPropertyDesc() {
		return propertyDesc;
	}

	private WebElement getDamageDesc() {
		return damageDesc;
	}

	private WebElement getLossEstimate() {
		return lossEstimate;
	}

	private WebElement getExtentDamage() {
		return extentDamage;
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

	private WebElement getCity() {
		return city;
	}

	private WebElement getPostCode() {
		return postCode;
	}

	private WebElement getLocationDesc() {
		return locationDesc;
	}

	private WebElement getOwnerDropDown() {
		return ownerDropDown;
	}

	private WebElement getOwnerPicker() {
		return ownerPicker;
	}

	private WebElement getOwnerNewPerson() {
		return ownerNewPerson;
	}

	private WebElement getOwnerNewCompany() {
		return ownerNewCompany;
	}

	private WebElement getEstimateReceivedDropdown() {
		return estimateReceivedDropdown;
	}

	private WebElement getEstimateCost() {
		return estimateCost;
	}

	private WebElement getEstimateRepairTime() {
		return estimateRepairTime;
	}

	private WebElement getAlreadyRepairedYesRadio() {
		return alreadyRepairedYesRadio;
	}

	private WebElement getAlreadyRepairedNoRadio() {
		return alreadyRepairedNoRadio;
	}

	

}