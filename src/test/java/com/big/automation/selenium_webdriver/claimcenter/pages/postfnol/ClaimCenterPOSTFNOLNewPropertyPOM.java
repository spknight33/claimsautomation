package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

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

public class ClaimCenterPOSTFNOLNewPropertyPOM extends BaseTest{

	//
	// Keep this distinct from other property pages for now, they could be combined in future (fnol/postfnol new/edit)
	//
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
	
	
	//TODO - services to perform
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:AppraisalServiceInputSet:AppraisalServiceInputSet:AppraisalServiceInputGroup:_checkbox")
	private WebElement appraisalServicesCB;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:OtherServicesLVInputGroupInputSet:OtherServicesInputGroup:_checkbox")
	private WebElement otherServicesCB;
	//TODO - repairs
	
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimatedReceived-inputEl")
	private WebElement estimateRecievedDropdown;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimateCost-inputEl")
	private WebElement estimatedRepairCost;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimateTime-inputEl")
	private WebElement estimatedRepairTime;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:AlreadyRepaired_true-inputEl")
	private WebElement repairedTrueRadio;
	@FindBy(id = "NewFixedPropertyIncidentPopup:NewFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:AlreadyRepaired_false-inputEl")
	private WebElement repairedFalseRadio;
	
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "POST FNOL New Property";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
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
	public void setAddressLine2(String text)
	{
		logger.info(format("%s -  going to set address line2", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());
		logger.info(format("%s - done, address line2 set", getName()));
	}
	public void setAddressLine3(String text)
	{
		logger.info(format("%s -  going to set address line3", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine3());
		logger.info(format("%s - done, address line3 set", getName()));
	}
	public void setCity(String text)
	{
		logger.info(format("%s -  going to set city", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCity());
	}	
	public void setPostcode(String text)
	{
		logger.info(format("%s -  going to set postcode", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostCode());
	}	
	public void setLocationDescription(String text)
	{
		logger.info(format("%s -  going to set location description", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());
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
	
	public void selectEstimateReceived(String option)
	{
		logger.info(format("%s - going to select option from Estimate Received:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getEstimateRecievedDropdown(), 1);
	}
	
	public void setEstimatedRepairCost(String text)
	{
		logger.info(format("%s -  going to set estimated repair cost", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getEstimatedRepairCost());
	}	
	public void setEstimatedRepairTime(String text)
	{
		logger.info(format("%s -  going to set estimated repair time", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getEstimatedRepairTime());
	}
	public void selectAlreadyRepaired(boolean repaired)
	{
		logger.info(format("%s -  going to set already repaired to:"+repaired, getName()));
	    if (repaired)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getRepairedTrueRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getRepairedFalseRadio());
	    }
	
		
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
	

	private WebElement getAppraisalServicesCB() {
		return appraisalServicesCB;
	}

	private WebElement getOtherServicesCB() {
		return otherServicesCB;
	}

	private WebElement getEstimateRecievedDropdown() {
		return estimateRecievedDropdown;
	}

	private WebElement getEstimatedRepairCost() {
		return estimatedRepairCost;
	}

	private WebElement getEstimatedRepairTime() {
		return estimatedRepairTime;
	}

	private WebElement getRepairedTrueRadio() {
		return repairedTrueRadio;
	}

	private WebElement getRepairedFalseRadio() {
		return repairedFalseRadio;
	}

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	


}