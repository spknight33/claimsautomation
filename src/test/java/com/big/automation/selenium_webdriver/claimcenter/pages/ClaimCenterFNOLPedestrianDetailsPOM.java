package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLPedestrianDetailsPOM extends BaseTest{

	// could be merged with person later
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ttlBar")
	private WebElement pageTitle;
		
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:Update-btnEl")
	private WebElement okButton;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:Cancel-btnEl")
	private WebElement cancelButton;

	
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:Prefix-inputEl")
	private WebElement prefix;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl")
	private WebElement firstName;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:MiddleName-inputEl")
	private WebElement middleName;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:LastName-inputEl")
	private WebElement lastName;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Gender-inputEl")
	private WebElement gender;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:DateOfBirth-inputEl")
	private WebElement dob;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl")
	private WebElement addressLine1;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine2-inputEl")
	private WebElement addressLine2;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine3-inputEl")
	private WebElement addressLine3;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement city;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement postCode;
	
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_AddressType-inputEl")
	private WebElement addressType;
	//TODO
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_businessphone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement workPhone;
	//TODO rest of locators
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_mobile:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement mobile;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_email-inputEl")
	private WebElement mainEmail;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Email2-inputEl")
	private WebElement altEmail;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:NationalInsurance_itb-inputEl")
	private WebElement niNumber;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:DriverLicense-inputEl")
	private WebElement licenseNumber;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Notes-inputEl")
	private WebElement notes;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuredBoolean_true-inputEl")
	private WebElement injuredTrueRadio;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuredBoolean_false-inputEl")
	private WebElement injuredFalseRadio;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:InjuryDescription-inputEl")
	private WebElement injuredDesc;
	
		@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV_tb:Add")
		private WebElement addInjuryButton;
	
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
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkButton());
		logger.info(format("%s - done, OK clicked", getName()));
	}
	
	public void selectPrefix(String option)
	{
		logger.info(format("%s -  going to select prefix ", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrefix(), 1);
		logger.info(format("%s - done, prefix selected", getName()));
	}
	
	
	public void selectAddressType(String option)
	{
		logger.info(format("%s -  going to select address type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressType(), 1);
		logger.info(format("%s - done, address type selected", getName()));
	}
	
	public void setFirstName(String text)
	{
		logger.info(format("%s -  going to set first name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFirstName());
		logger.info(format("%s - done, first name set", getName()));
	}
	public void setLastName(String text)
	{
		logger.info(format("%s -  going to set last name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLastName());
		logger.info(format("%s - done, last name set", getName()));
	}
	public void setMobile(String text)
	{
		logger.info(format("%s -  going to set mobile", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMobile());
		logger.info(format("%s - done, mobile set", getName()));
	}
	public void setEmail(String text)
	{
		logger.info(format("%s -  going to set email", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMainEmail());
		logger.info(format("%s - done, email set", getName()));
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
		// TODO tab off
		
	}
	
	public void setNotes(String text)
	{
		logger.info(format("%s -  going to set notes", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNotes());
	}
	
	// Injury Section
		//-------------------------------------
		public void selectInjured(boolean injured)
		{
			logger.info(format("%s -  going to set injured"+injured, getName()));
			
			if (injured)
			{
			GuideWireAccessors.clickGWButton(driver, this.getInjuredTrueRadio());
			}
			else
			{
				GuideWireAccessors.clickGWButton(driver, this.getInjuredFalseRadio());
			}
			
		}
		public void selectAddInjury()
		{
			logger.info(format("%s -  going to clikc add injury button", getName()));
			
				GuideWireAccessors.clickGWButton(driver, this.getAddInjuryButton());
		
			
		}
		
		public void setInjuryDesc(String text) {
		logger.info(format("%s -  going to set injury desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getInjuredDesc());
	}
		
		public void selectAreaOfBody(String option, int sequence)
		{
			logger.info(format("%s -  going to select area of body"+option, getName()));
			// use to select the area of body for the first (for now) change to be able to set for any row
		    // just change to use table[x]
			String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table[" + sequence + "]//tr/td[2]/div";
			WebElement element = driver.findElement(By.xpath(locator));
			GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
			
		}
		
		public void selectDetailedInjury(String option, int sequence)
		{
			logger.info(format("%s -  going to select detald injury"+option, getName()));
			// use to select the detailed injury for the first (for now) change to be able to set for any row
			sleep(2);
			String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table[" + sequence + "]//tr/td[3]/div";
			WebElement element = driver.findElement(By.xpath(locator));
			GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
			
		}
   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
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

	private WebElement getAddressType() {
		return addressType;
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

	private WebElement getOkButton() {
		return okButton;
	}

	private WebElement getMiddleName() {
		return middleName;
	}

	private WebElement getGender() {
		return gender;
	}

	private WebElement getDob() {
		return dob;
	}

	private WebElement getInjuredTrueRadio() {
		return injuredTrueRadio;
	}

	private WebElement getInjuredFalseRadio() {
		return injuredFalseRadio;
	}

	private WebElement getInjuredDesc() {
		return injuredDesc;
	}

	private WebElement getAddInjuryButton() {
		return addInjuryButton;
	}

	private WebElement getAltEmail() {
		return altEmail;
	}

	private WebElement getNiNumber() {
		return niNumber;
	}

	private WebElement getLicenseNumber() {
		return licenseNumber;
	}

	private WebElement getNotes() {
		return notes;
	}
	

	
	
	


}