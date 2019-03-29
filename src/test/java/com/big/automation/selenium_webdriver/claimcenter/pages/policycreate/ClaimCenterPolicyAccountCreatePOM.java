package com.big.automation.selenium_webdriver.claimcenter.pages.policycreate;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPolicyAccountCreatePOM extends BaseTest{

	@FindBy(id = "CreateAccount:CreateAccountScreen:ttlBar")
	private WebElement pageTitle;
	@FindBy(id = "CreateAccount:CreateAccountScreen:Update")
	private WebElement updateButton;
	
	
	@FindBy(id ="CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:Brand-inputEl")
	private WebElement brandDropdown;
	
	@FindBy(id ="CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:PrimaryPhone-inputEl")
	private WebElement primaryPhoneDropdown;
	
	@FindBy(id ="CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl")
	private WebElement addressTypeDropdown;
	
	@FindBy(id ="CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement mobile;
	@FindBy(id ="CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:EmailAddress1-inputEl")
	private WebElement email;
	
	@FindBy(id ="CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement postcode;
	@FindBy(id ="CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:addresses-inputEl")
	private WebElement postcodeAddressDropdown;
	
	

	public String getName() {

		return "create account(policy)";
	}
	
	

	
	
	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	public void selectBrand(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getBrandDropdown(), 1);
	}
	
	public void setEmail(String text) {
		logger.info(format("%s -  going to set email:"+text, getName()));
		sleep(1);
		GuideWireAccessors.setGWTextBox(driver, text, this.getEmail());
		GuideWireAccessors.setGWTextBox(driver, text, this.getEmail());
	}
	public void setMobile(String text) {
		logger.info(format("%s -  going to set mobile:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMobile());
	}

	public void setPostcode(String text) {
		logger.info(format("%s -  going to set postcode:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostcode());
		// as postcode causes display off other address fields, but this can take a couple of seconds - the next method should wait until available but add a slug anyway
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				sleep(2);
	}
	public void selectPostcodeAddress(String option)
	{
		logger.info(format("%s -  going to select postcode address :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPostcodeAddressDropdown(), 1);
		
	}
	
	public void selectAddressType(String option)
	{
		logger.info(format("%s -  going to select address type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressTypeDropdown(), 1);
		
	}
	
	public void selectPrimaryPhone(String option)
	{
		logger.info(format("%s -  going to select primary phone type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrimaryPhoneDropdown(), 1);
		
	}
	
	public void clickUpdate()
	{
		GuideWireAccessors.clickGWButton(driver, this.getUpdateButton());
	}


	private WebElement getBrandDropdown() {
		return brandDropdown;
	}





	private WebElement getPrimaryPhoneDropdown() {
		return primaryPhoneDropdown;
	}





	private WebElement getAddressTypeDropdown() {
		return addressTypeDropdown;
	}





	private WebElement getPostcode() {
		return postcode;
	}





	private WebElement getPostcodeAddressDropdown() {
		return postcodeAddressDropdown;
	}





	private WebElement getUpdateButton() {
		return updateButton;
	}





	private WebElement getMobile() {
		return mobile;
	}





	private WebElement getEmail() {
		return email;
	}

	
	
	
	
}