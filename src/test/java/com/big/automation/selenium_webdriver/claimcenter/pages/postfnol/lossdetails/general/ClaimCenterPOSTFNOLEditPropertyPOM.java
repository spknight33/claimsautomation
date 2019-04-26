package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLEditPropertyPOM extends BaseTest{

	//
	// Keep this distinct from other property pages as they use different tags
	//
	
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:0")
	private WebElement pageTitle;

	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:Update")
	private WebElement updateButton;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:Cancel")
	private WebElement cancelButton;

	
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyDescription-inputEl")
	private WebElement propertyDesc;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:Description-inputEl")
	private WebElement damageDesc;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:LossEstimate-inputEl")
	private WebElement lossEstimate;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:ExtDamagetxt-inputEl")
	private WebElement extentDamage;
	
	
	
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl")
	private WebElement addressLine1;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine2-inputEl")
	private WebElement addressLine2;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine3-inputEl")
	private WebElement addressLine3;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement city;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:County-inputEl")
	private WebElement county;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement postCode;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:addresses-inputEl")
	private WebElement postCodeAddressDropdown;
	
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement locationDesc;
	
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyOwner_itb-inputEl")
	private WebElement ownerDropDown;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyOwner_itb:PropertyOwner_itbMenuIcon")
	private WebElement ownerPicker;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyOwner_itb:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-textEl")
	private WebElement ownerNewPerson;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:PropertyOwner_itb:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-textEl")
	private WebElement ownerNewCompany;
	

	
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimatedReceived-inputEl")
	private WebElement estimateRecievedDropdown;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimateCost-inputEl")
	private WebElement estimatedRepairCost;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:EstimateTime-inputEl")
	private WebElement estimatedRepairTime;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:AlreadyRepaired_true-inputEl")
	private WebElement repairedTrueRadio;
	@FindBy(id = "EditFixedPropertyIncidentPopup:EditFixedPropertyIncidentScreen:FixPropIncidentDetailDV:FixedPropertyIncidentDV:AlreadyRepaired_false-inputEl")
	private WebElement repairedFalseRadio;
	
	


	public String getName() {

		return "POST FNOL Edit Property";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		logger.info(format("%s -found page title for Edit Property page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	
	public void update() {
		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getUpdateButton());
		
	}
	public void ok() {
		logger.info(format("%s -  going to click ok", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getUpdateButton());
		
	}
	
	public void setPropertyDesc(String text)
	{
		logger.info(format("%s -  going to set property desc:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPropertyDesc());
		
	}
	public void setDamageDesc(String text)
	{
		logger.info(format("%s -  going to set damage desc:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDamageDesc());
		
	}
	public void setLossEstimate(String text)
	{
		logger.info(format("%s -  going to set loss estimate:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLossEstimate());
		
	}
	public void setExtentDamage(String text)
	{
		logger.info(format("%s -  going to set extent damage desc:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getExtentDamage());
		
	}
	public void setAddressLine1(String text)
	{
		logger.info(format("%s -  going to set address line1:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine1());
		
	}
	public void setAddressLine2(String text)
	{
		logger.info(format("%s -  going to set address line2:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());
		
	}
	public void setAddressLine3(String text)
	{
		logger.info(format("%s -  going to set address line3:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine3());
		
	}
	public void setCity(String text)
	{
		logger.info(format("%s -  going to set city:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCity());
	}	
	public void setPostcode(String text)
	{
		logger.info(format("%s -  going to set postcode:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostCode());
		// as postcode causes display off other address fields, but this can take a couple of seconds - the next method should wait until available but add a slug anyway
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				sleep(2);
	}	
	
	public void selectPostcodeAddress(String option)
	{
		logger.info(format("%s - going to select postcode address:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPostCodeAddressDropdown(), 1);
	}
	
	public void setLocationDescription(String text)
	{
		logger.info(format("%s -  going to set location description:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());
	}	
	
	public void selectPropertyOwner(String option)
	{
		logger.info(format("%s - going to select Property owner:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getOwnerDropDown(), 1);
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
		logger.info(format("%s -  going to set estimated repair cost:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getEstimatedRepairCost());
	}	
	public void setEstimatedRepairTime(String text)
	{
		logger.info(format("%s -  going to set estimated repair time:"+text, getName()));
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

	
	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getCounty() {
		return county;
	}

	private WebElement getPostCodeAddressDropdown() {
		return postCodeAddressDropdown;
	}

	
	


}