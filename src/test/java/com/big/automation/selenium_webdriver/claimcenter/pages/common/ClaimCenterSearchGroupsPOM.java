package com.big.automation.selenium_webdriver.claimcenter.pages.common;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterSearchGroupsPOM extends BaseTest{

	
	@FindBy(id = "GroupSearchPopup:GroupSearchPickerScreen:ttlBar")
	private WebElement pageTitle;
		
	
		
	@FindBy(id = "GroupSearchPopup:GroupSearchPickerScreen:GroupSearchDV:GroupName-inputEl")
	private WebElement groupName;

	
	@FindBy(id = "GroupSearchPopup:GroupSearchPickerScreen:GroupSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")
	private WebElement searchButton;
	
	
	
	@FindBy(id = "GroupSearchPopup:GroupSearchPickerScreen:GroupSearchPickerResultsLV:0:_Select")
	private WebElement selectFirstResultButton;
		
	
	

	public String getName() {

		return "Search Groups";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		
		logger.info(format("%s -found page title for Person page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	
	
	public void setGroupName(String text)
	{
		logger.info(format("%s -  going to set group name:"+text, getName()));
	    GuideWireAccessors.setGWTextBox(driver, text, this.getGroupName());
	}
	
	public void selectSearch() {
		logger.info(format("%s -  going to click Search", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getSearchButton());
		
	}
	
	public void selectFirstResult() {
		logger.info(format("%s -  going to click Select on result", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getSelectFirstResultButton());
		
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getGroupName() {
		return groupName;
	}

	private WebElement getSearchButton() {
		return searchButton;
	}

	private WebElement getSelectFirstResultButton() {
		return selectFirstResultButton;
	}

	
	

}