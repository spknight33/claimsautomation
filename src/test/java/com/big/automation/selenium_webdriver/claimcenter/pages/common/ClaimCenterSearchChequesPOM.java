package com.big.automation.selenium_webdriver.claimcenter.pages.common;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterSearchChequesPOM extends BaseTest{

	
	@FindBy(id = "PaymentSearch:PaymentSearchScreen:ttlBar")
	private WebElement pageTitle;
		
	
		
	@FindBy(id = "PaymentSearch:PaymentSearchScreen:PaymentSearchDV:PaymentSearchRequiredInputSet:ApprovedByGroup:ApprovedByGroupMenuIcon")
	private WebElement approvedByGroupPickerIcon;
	@FindBy(id = "PaymentSearch:PaymentSearchScreen:PaymentSearchDV:PaymentSearchRequiredInputSet:ApprovedByGroup:GroupSearchMenuIcon-itemEl")
	private WebElement approvedByGroupSearchFor;
		
	@FindBy(id = "PaymentSearch:PaymentSearchScreen:PaymentSearchDV:PaymentSearchRequiredInputSet:IncludeSubGroups_true-inputEl")
	private WebElement includeChildGroupsYesOption;
	@FindBy(id = "PaymentSearch:PaymentSearchScreen:PaymentSearchDV:PaymentSearchRequiredInputSet:IncludeSubGroups_false-inputEl")
	private WebElement includeChildGroupsNoOption;
	
	
	@FindBy(id = "PaymentSearch:PaymentSearchScreen:PaymentSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")
	private WebElement searchButton;
	
	
	
	@FindBy(id = "PaymentSearch:PaymentSearchScreen:PaymentSearchDV:PaymentSearchOptionalInputSet:Status-inputEl")
	private WebElement chequeStatusDropdown;
	
	@FindBy(id = "??")
	private WebElement selectFirstResultButton;
		
	
	

	public String getName() {

		return "Search Cheques";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		
		logger.info(format("%s -found page title for Person page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void searchForApprovedByGroup()
	{
		logger.info(format("%s -  going to search for approvedby group", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getApprovedByGroupPickerIcon(), this.getApprovedByGroupSearchFor());
	}
	

	public void selectIncludeChildGroups(boolean childgroups)
	{
		logger.info(format("%s -  going to set include child groups to:"+childgroups, getName()));
	    if (childgroups)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getIncludeChildGroupsYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getIncludeChildGroupsYesOption());
	    }
	}
	
	public void selectChequeStatus(String option)
	{
		logger.info(format("%s -  going to set cheque status:"+option, getName()));
	    GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getChequeStatusDropdown(), 1);
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

	private WebElement getApprovedByGroupPickerIcon() {
		return approvedByGroupPickerIcon;
	}

	private WebElement getApprovedByGroupSearchFor() {
		return approvedByGroupSearchFor;
	}

	private WebElement getIncludeChildGroupsYesOption() {
		return includeChildGroupsYesOption;
	}

	private WebElement getIncludeChildGroupsNoOption() {
		return includeChildGroupsNoOption;
	}

	private WebElement getSearchButton() {
		return searchButton;
	}

	private WebElement getChequeStatusDropdown() {
		return chequeStatusDropdown;
	}

	private WebElement getSelectFirstResultButton() {
		return selectFirstResultButton;
	}
	
	
	
	
   
	

}