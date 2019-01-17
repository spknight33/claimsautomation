package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterSearchAddressBookPOM extends BaseTest{

	
	@FindBy(id = "AddressBookPickerPopup:AddressBookSearchScreen:ttlBar")
	private WebElement pageTitle;
		
	@FindBy(id = "AddressBookPickerPopup:AddressBookSearchScreen:cancel-btnEl")
	private WebElement cancelButton;

		
	@FindBy(id = "AddressBookPickerPopup:AddressBookSearchScreen:AddressBookSearchDV:ContactSubtype-inputEl")
	private WebElement contactType;
		
	@FindBy(id = "AddressBookPickerPopup:AddressBookSearchScreen:AddressBookSearchDV:NameInputSet:GlobalContactNameInputSet:Name-inputEl")
	private WebElement searchName;
	
	
	@FindBy(id = "AddressBookPickerPopup:AddressBookSearchScreen:AddressBookSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")
	private WebElement searchButton;
	
	@FindBy(id = "AddressBookPickerPopup:AddressBookSearchScreen:AddressBookSearchLV:0:_Select")
	private WebElement selectFirstResultButton;
		
	
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
	
	public void selectSearch() {
		logger.info(format("%s -  going to click Search", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getSearchButton());
		
	}
	
	public void selectFirstResult() {
		logger.info(format("%s -  going to click Select on result", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getSelectFirstResultButton());
		
	}
	
	
	
	public void setSearchName(String text)
	{
		sleep(1); // add a delay as 
		logger.info(format("%s -  going to set search name:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getSearchName());
		
	}
	
	public void selectSearchType(String option)
	{
		logger.info(format("%s -  going to set search type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getContactType(), 1);
		
	}
	
	
   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getContactType() {
		return contactType;
	}

	private WebElement getSearchName() {
		return searchName;
	}

	private WebElement getSearchButton() {
		return searchButton;
	}

	private WebElement getSelectFirstResultButton() {
		return selectFirstResultButton;
	}

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	

}