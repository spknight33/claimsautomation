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

public class ClaimCenterPolicySubmissionStep5QuotePOM extends BaseTest{

	@FindBy(id = "SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar")
	private WebElement pageTitle;

	@FindBy(id = "SubmissionWizard:Next-btnInnerEl")
	private WebElement nextButton;

	@FindBy(id ="SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindAndIssue")
	private WebElement issuePolicyButton;
	
	
	//div[contains(@id,"-toolbar-target")]/a[1]
	@FindBy(xpath ="//div[contains(@id,\"-toolbar-target\")]/a[1]")
	private WebElement confirmCreatePolicyButton;


	public String getName() {

		return "quote";
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
	
	public void clickIssuePolicy()
	{
		GuideWireAccessors.clickGWButton(driver, this.getIssuePolicyButton());
	}

	public void clickNext(){
		GuideWireAccessors.clickGWButton(driver,getNextButton());
	}

	public void clickConfirmIssuePolicy()
	{
		GuideWireAccessors.clickGWButton(driver, this.getConfirmCreatePolicyButton());
		sleep(10);
	}

	private WebElement getIssuePolicyButton() {
		return issuePolicyButton;
	}

	public WebElement getNextButton() { return nextButton; }

	private WebElement getConfirmCreatePolicyButton() {
		return confirmCreatePolicyButton;
	}
	
	
	
	
}