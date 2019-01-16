package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPersonDetailsPOM extends BaseTest{

	
	
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ttlBar")
	private WebElement pageTitle;
		
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:CustomUpdateButton-btnEl")
	private WebElement updateButton;
	
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:Cancel-btnEll")
	private WebElement cancelButton;

	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV_tb:ContactDetailToolbarButtonSet:CheckDuplicatesButton-btnEl")
	private WebElement duplicatesButton;

	// person section
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:Prefix-inputEl")
	private WebElement prefix;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl")
	private WebElement firstName;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl")
	private WebElement middleName;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:GlobalPersonNameInputSet:LastName-inputEl")
	private WebElement lastName;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonNameInputSet:FormerName-inputEl")
	private WebElement formerName;
	
	// phone section
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonContactInfoInputSet:Work:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement workPhone;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonContactInfoInputSet:Home:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement homePhone;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonContactInfoInputSet:Cell:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement mobile;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonContactInfoInputSet:Fax:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement fax;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonContactInfoInputSet:PrimaryPhone-inputEl")
	private WebElement primaryPhoneDropdown;
	
	// email
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonContactInfoInputSet:Primary-inputEl")
	private WebElement mainEmail;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PersonContactInfoInputSet:Secondary-inputEl")
	private WebElement altEmail;
	
	// address
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
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement locationDesc;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:Address_AddressType-inputEl")
	private WebElement addressTypeDropDown;
	@FindBy(id = "NewContactPopup:ContactDetailScreen:ContactBasicsDV:PrimaryAddressInputSet:CCAddressInputSet:globalAddressContainer:Address_ValidUntil-inputEl")
	private WebElement addressValidUntil;

	//TODO rest of locators
	// additonal info
	// compnay
	// license
	// notes
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "Person Contact Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(4);
		logger.info(format("%s -check page title for Person page :"+expected, getName()));
		logger.info(format("%s -found page title for Person page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void selectUpdate() {
		logger.info(format("%s -  going to click Update", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpdateButton());
		
	}
	
	
	// person section
	//----------------------------------------------------------------
	public void selectPrefix(String option)
	{
		logger.info(format("%s -  going to select prefix ", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrefix(), 1);
		
	}
	public void setFirstName(String text)
	{
		logger.info(format("%s -  going to set first name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFirstName());
		
	}
	public void setMiddleName(String text)
	{
		logger.info(format("%s -  going to set middle name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMiddleName());
		
	}
	public void setLastName(String text)
	{
		logger.info(format("%s -  going to set last name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLastName());
		
	}
	public void setFormerName(String text)
	{
		logger.info(format("%s -  going to set former name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFormerName());
		
	}
	
	//phone section
	//------------------------------------------------
	
	public void setWorkPhone(String text)
	{
		logger.info(format("%s -  going to set workphone", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getWorkPhone());
	
	}
	public void setHomePhone(String text)
	{
		logger.info(format("%s -  going to set homephone", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getHomePhone());
	
	}
	public void setMobile(String text)
	{
		logger.info(format("%s -  going to set mobile", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMobile());
	
	}
	public void setFax(String text)
	{
		logger.info(format("%s -  going to set fax", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFax());
	
	}
	public void selectPrimaryPhone(String option)
	{
		logger.info(format("%s -  going to select primary phone type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrimaryPhoneDropdown(), 1);
		
	}
	
	// email section
	//-------------------------------------------
	public void setEmail(String text)
	{
		logger.info(format("%s -  going to set email", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMainEmail());
		
	}
	public void setAltEmail(String text)
	{
		logger.info(format("%s -  going to set alt email", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAltEmail());
		
	}
	
	
	// address section
	//----------------------------------------------
	
	public void selectAddressType(String option)
	{
		logger.info(format("%s -  going to select address type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressTypeDropDown(), 1);
		
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
	public void setPostCode(String text)
	{
		logger.info(format("%s -  going to set postcode", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostCode());
		// as postcode causes display off other address fields, but this can take a couple of seconds - the next method should wait until available but add a slug anyway
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		sleep(2);
		
	}
	
	public void setLocationDesc(String text)
	{
		logger.info(format("%s -  going to set location description", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());
	
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

	private WebElement getPrefix() {
		return prefix;
	}

	private WebElement getFirstName() {
		return firstName;
	}

	private WebElement getLastName() {
		return lastName;
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

	

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	private WebElement getCity() {
		return city;
	}

	private WebElement getPostCode() {
		return postCode;
	}

	private WebElement getWorkPhone() {
		return workPhone;
	}

	private WebElement getLocationDesc() {
		return locationDesc;
	}

	private WebElement getMiddleName() {
		return middleName;
	}

	private WebElement getFormerName() {
		return formerName;
	}

	private WebElement getHomePhone() {
		return homePhone;
	}

	private WebElement getFax() {
		return fax;
	}

	private WebElement getPrimaryPhoneDropdown() {
		return primaryPhoneDropdown;
	}

	private WebElement getAltEmail() {
		return altEmail;
	}

	private WebElement getAddressTypeDropDown() {
		return addressTypeDropDown;
	}

	private WebElement getAddressValidUntil() {
		return addressValidUntil;
	}
	

	
	
	


}