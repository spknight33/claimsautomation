package com.big.automation.selenium_webdriver.claimcenter.pages.policycreate;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPolicySubmissionStep2PolicyInfoPOM extends BaseTest{

	@FindBy(id = "SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "SubmissionWizard:Next")
	private WebElement nextButton;
	
	
	@FindBy(id ="SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:MarketingQuestionInputSet:MarketingQuestion-inputEl")
	private WebElement selectHowHeard;
	
	


	public String getName() {

		return "Policy Info";
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

	public void selectHowHeard(String option)
	{
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getSelectHowHeard(), 1);
	}
	
	public void clickNext()
	{
		GuideWireAccessors.clickGWButton(driver, this.getNextButton());
	}



	private WebElement getSelectHowHeard() {
		return selectHowHeard;
	}



	private WebElement getNextButton() {
		return nextButton;
	}



	
	
	
}