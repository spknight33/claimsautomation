package com.big.automation.selenium_webdriver.claimcenter.pages.policycreate;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPolicySubmissionStep1POM extends BaseTest{

	@FindBy(id = "NewAccount:NewAccountScreen:ttlBar")
	private WebElement pageTitle;
	
	
	@FindBy(id ="NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:0:addSubmission")
	private WebElement selectProductButton;


	public String getName() {

		return "New Submissions";
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

	public void clickSelectProduct()
	{
		GuideWireAccessors.clickGWButton(driver, this.getSelectProductButton());
	}



	private WebElement getSelectProductButton() {
		return selectProductButton;
	}
	
	
	
}