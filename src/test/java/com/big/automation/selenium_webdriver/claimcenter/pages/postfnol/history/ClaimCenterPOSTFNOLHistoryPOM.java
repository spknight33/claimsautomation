package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.history;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLHistoryPOM extends BaseTest {

	@FindBy(id = "ClaimHistory:ClaimHistoryScreen:0")
	private WebElement pageTitle;
	
	@FindBy(id = "ClaimHistory:ClaimHistoryScreen:HistoryLV:HistoryFilter-inputEl")
	private WebElement filterDropdown;
	
	@FindBy(id = "ClaimHistory:ClaimHistoryScreen:ClaimHistory_RefreshButton")
	private WebElement refreshButton;
	
	@FindBy(id = "ClaimHistory:ClaimHistoryScreen:HistoryLV-body")
	private WebElement historyTable;
	
	

	public String getName() {

		return "Post FNOL History Screen";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(1);

		logger.info(format("%s -found page title:" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	
	public void selectFilter(String option) {
		logger.info(format("%s - going to select Filter", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getFilterDropdown(), 1);
	}
	
	public void clickRefresh() {
		logger.info(format("%s - going to click refresh", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getRefreshButton());
	}

	private WebElement getFilterDropdown() {
		return filterDropdown;
	}

	private WebElement getRefreshButton() {
		return refreshButton;
	}

	private WebElement getHistoryTable() {
		return historyTable;
	}
	
	

}