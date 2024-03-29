package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.summary;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLSummaryPOM extends BaseTest{

	@FindBy(id = "ClaimSummary:ClaimSummaryScreen:ttlBar")
	private WebElement pageTitle;

	
	//Loss detials section
	//--------------------------
	@FindBy(id ="ClaimSummary:ClaimSummaryScreen:ClaimSummaryHeadlinePanelSet:LossDate-inputEl")
	private WebElement lossDate;
	@FindBy(id ="ClaimSummary:ClaimSummaryScreen:ClaimSummaryHeadlinePanelSet:ReportDate-inputEl")
	private WebElement noticeDate;
	@FindBy(id ="ClaimSummary:ClaimSummaryScreen:ClaimSummaryHeadlinePanelSet:Location-inputEl")
	private WebElement lossLocation;
	
	
	// Circumstances
	//-------------------------------
	@FindBy(id ="ClaimSummary:ClaimSummaryScreen:ClaimSummaryHeadlinePanelSet:Description-inputEl")
	private WebElement circumstances;

	public String getName() {

		return "Post FNOL Summary";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	private WebElement getCircumstances() {
		return circumstances;
	}
	
	
	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	

	private WebElement getLossDate() {
		return lossDate;
	}

	
	
}