package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.summary;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLSummaryMetricsPOM extends BaseTest{

	@FindBy(id = "ClaimKeyMetrics:ClaimKeyMetricsScreen:ttlBar")
	private WebElement pageTitle;



	public String getName() {

		return "Post FNOL Summary Health Metrics";
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
	
	
	
	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	
	
	
	
	
}