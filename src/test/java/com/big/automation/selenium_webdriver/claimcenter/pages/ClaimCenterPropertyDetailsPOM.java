package com.big.automation.selenium_webdriver.claimcenter.pages;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPropertyDetailsPOM extends BaseTest{

	
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	
		

	
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:0")
	private WebElement pageTitle;
		
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:Update-btnEl")
	private WebElement okButton;

	
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
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "FNOL Property Incident";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(4);
		logger.info(format("%s -check page title for Add Property page :"+expected, getName()));
		logger.info(format("%s -found page title for Add Property page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getOkButton());
		logger.info(format("%s - done, OK clicked", getName()));
	}
	
	public void setPropertyDesc(String text)
	{
		logger.info(format("%s -  going to set property desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPropertyDesc());
		logger.info(format("%s - done, properrty desc set", getName()));
	}
	public void setDamageDesc(String text)
	{
		logger.info(format("%s -  going to set damage desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDamageDesc());
		logger.info(format("%s - done, properrty damage set", getName()));
	}
	public void setLossEstimate(String text)
	{
		logger.info(format("%s -  going to set loss estimate", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLossEstimate());
		logger.info(format("%s - done, loss estimate set", getName()));
	}
	public void setExtentDamage(String text)
	{
		logger.info(format("%s -  going to set extent damage desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getExtentDamage());
		logger.info(format("%s - done, extent damage set", getName()));
	}
	public void setAddressLine1(String text)
	{
		logger.info(format("%s -  going to set address line1", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine1());
		logger.info(format("%s - done, address line1 set", getName()));
	}
	
	public void selectNewOwnerPerson()
	{
		logger.info(format("%s - going to select New Person from owner picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getOwnerPicker(),this.getOwnerNewPerson());
	}
	
	public void selectNewOwnerCompany()
	{
		logger.info(format("%s - going to select New Compnay from owner picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getOwnerPicker(),this.getOwnerNewCompany());
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

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	


}