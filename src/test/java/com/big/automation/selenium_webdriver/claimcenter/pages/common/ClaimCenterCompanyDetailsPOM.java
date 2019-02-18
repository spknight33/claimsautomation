package com.big.automation.selenium_webdriver.claimcenter.pages.common;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterCompanyDetailsPOM extends BaseTest{

	// this could likely be merged with person pom
	
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ttlBar")
	private WebElement pageTitle;
		
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:CustomUpdateButton-btnEl")
	private WebElement updateButton;
	
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:Cancel-btnEll")
	private WebElement cancelButton;

	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:CheckDuplicatesButton-btnEl")
	private WebElement duplicatesButton;


	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:OrganizationName:GlobalContactNameInputSet:Name-inputEl")
	private WebElement companyName;
	
	
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl")
	private WebElement addressLine1;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine2-inputEl")
	private WebElement addressLine2;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine3-inputEl")
	private WebElement addressLine3;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement city;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement postCode;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:Address_AddressType-inputEl")
	private WebElement addressType;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement locationDesc;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:Address_ValidUntil-inputEl")
	private WebElement validUntil;
	
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:BusinessContactInfoInputSet:Work:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement workPhone;
	
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonContactInfoInputSet:Cell:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement mobile;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:BusinessContactInfoInputSet:Email1-inputEl")
	private WebElement mainEmail;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:Notes-inputEl")
	private WebElement notes;
	
	//TODO rest of locators
	
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "Person Contact Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(4);
		
		logger.info(format("%s -found page title for Person page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		
	}
	
	public void selectUpdate() {
		logger.info(format("%s -  going to click Update", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpdateButton());
		
	}
	
	
	
	
	public void selectAddressType(String option)
	{
		logger.info(format("%s -  going to select address type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressType(), 1);
		
	}
	
	public void setCompanyName(String text)
	{
		logger.info(format("%s -  going to set company name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCompanyName());
		
	}
	
	public void setWorkPhone(String text)
	{
		logger.info(format("%s -  going to set work phone", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getWorkPhone());
		
	}
	public void setMobile(String text)
	{
		logger.info(format("%s -  going to set mobile", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMobile());
		
	}
	public void setEmail(String text)
	{
		logger.info(format("%s -  going to set email", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMainEmail());
		
	}
	public void setAddressLine1(String text)
	{
		logger.info(format("%s -  going to set address line1", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine1());
		
	}
	public void setAddressLine2(String text)
	{
		logger.info(format("%s -  going to set address line2", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());
		
	}
	public void setAddressLine3(String text)
	{
		logger.info(format("%s -  going to set address line3", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine3());
		
	}
	public void setCity(String text)
	{
		logger.info(format("%s -  going to set city", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCity());
		
	}
	public void setPostCode(String text)
	{
		logger.info(format("%s -  going to set postcode:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostCode());
		// as postcode causes display off other address fields, but this can take a couple of seconds - the next method should wait until available but add a slug anyway
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				sleep(2);
	}
	public void setLocationDesc(String text)
	{
		logger.info(format("%s -  going to set location desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());
		logger.info(format("%s - done, location desc set", getName()));
	}
	
	public void setNotes(String text)
	{
		logger.info(format("%s -  going to set notes", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNotes());
		logger.info(format("%s - done, notes", getName()));
	}
   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getDuplicatesButton() {
		return duplicatesButton;
	}

	

	private WebElement getMobile() {
		return mobile;
	}

	private WebElement getMainEmail() {
		return mainEmail;
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

	private WebElement getAddressType() {
		return addressType;
	}

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	private WebElement getCompanyName() {
		return companyName;
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

	private WebElement getValidUntil() {
		return validUntil;
	}

	private WebElement getWorkPhone() {
		return workPhone;
	}

	private WebElement getNotes() {
		return notes;
	}
	

	
	
	


}