package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.services;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLServicesPOM extends BaseTest{

	@FindBy(id = "ClaimServiceRequests:ttlBar")
	private WebElement pageTitle;
	

	@FindBy(id = "ClaimServiceRequests:ServiceRequestPanelRow:ServiceRequestDV:Progress-inputEl")
	private WebElement serviceProgress;
	
	

	
	
	
	

	public String getName() {

		return "Post FNOL Services Details";
	}

	public boolean isPageTitleDisplayed(String expected)
	{	sleep(1);
		
		logger.info(format("%s -found page title :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
		
	
	public String getServiceProgressText() {
		return GuideWireAccessors.getGWElementText(driver, this.getServiceProgress());
	}
	
	
	
	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getServiceProgress() {
		return serviceProgress;
	}
	
	
	
	
	
	
	
}