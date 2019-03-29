package com.big.automation.selenium_webdriver.claimcenter.pages.policycreate;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPolicyAccountPOM extends BaseTest{

	@FindBy(id = "NewAccount:NewAccountScreen:ttlBar")
	private WebElement pageTitle;
	
	
	@FindBy(id ="NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl")
	private WebElement firstName;
	@FindBy(id ="NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl")
	private WebElement lastName;

	//-------------------------------
	// worksheet buttons
	@FindBy(id ="NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")
	private WebElement searchButton;
	
	@FindBy(id ="NewAccount:NewAccountScreen:NewAccountButton")
	private WebElement createNewAccountButton;
	@FindBy(id ="NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-itemEl")
	private WebElement createNewAccountPerson;
	

	public String getName() {

		return "policy account";
	}
	
	
	public void setFirstName(String text)
	{
		GuideWireAccessors.setGWTextBox(driver, text, this.getFirstName());
	}
	public void setLastName(String text)
	{
		GuideWireAccessors.setGWTextBox(driver, text, this.getLastName());
	}
	public void clickSearch()
	{
		GuideWireAccessors.clickGWButton(driver, this.getSearchButton());
	}

	public void clickNewPersonAccount()
	{
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getCreateNewAccountButton(), this.getCreateNewAccountPerson());
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

	private WebElement getFirstName() {
		return firstName;
	}

	private WebElement getLastName() {
		return lastName;
	}

	private WebElement getSearchButton() {
		return searchButton;
	}


	private WebElement getCreateNewAccountButton() {
		return createNewAccountButton;
	}


	private WebElement getCreateNewAccountPerson() {
		return createNewAccountPerson;
	}
	
	
	
	
	
	
}