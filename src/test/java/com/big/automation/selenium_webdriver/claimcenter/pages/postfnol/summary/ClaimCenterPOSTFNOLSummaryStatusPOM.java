package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.summary;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLSummaryStatusPOM extends BaseTest{

	@FindBy(id = "ClaimStatus:ttlBar")
	private WebElement pageTitle;

	@FindBy(id = "ClaimStatus:Edit")
	private WebElement editButton;

	@FindBy(id = "ClaimStatus:Update")
	private WebElement updateButton;
	
	@FindBy(id = "ClaimStatus:IncidentOnly_true-inputEl")
	private WebElement incidentOnlyYesRadio;
	@FindBy(id = "ClaimStatus:IncidentOnly_false-inputEl")
	private WebElement incidentOnlyNoRadio;
	
	@FindBy(id = "ClaimStatus:DateReported-inputEl")
	private WebElement dateReported;
	
	@FindBy(id = "ClaimStatus:SpecialClaimPermission-inputEl")
	private WebElement specialPermissionDropdown;
	
	//TODO others
	
	@FindBy(id = "ClaimStatus:0:ClaimIndicatorInputSet:LitigationStatusEdit-inputEl")
	private WebElement litigationStatusDropdown;
	
	
	@FindBy(id = "ClaimStatus:3:ClaimIndicatorInputSet:CoverageInQuestion_true-inputEl")
	private WebElement coverageQuestionYesRadio;
	@FindBy(id = "ClaimStatus:3:ClaimIndicatorInputSet:CoverageInQuestion_false-inputEl")
	private WebElement coverageQuestionNoRadio;
	
	@FindBy(id = "ClaimStatus:6:ClaimIndicatorInputSet:SubrogationStatus-inputEl")
	private WebElement subrogationStatusDropdown;


	public String getName() {

		return "Post FNOL Claim Status";
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
	
	
	public void edit() {
		logger.info(format("%s -  going to click edit", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getEditButton());
	}
	public void update() {
		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getUpdateButton());
	}
	
	public void selectIncidentOnly(boolean incident)
	{
		logger.info(format("%s -  going to set incidentonly to:"+incident, getName()));
	    if (incident)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getIncidentOnlyYesRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getIncidentOnlyNoRadio());
	    }

	}
	
	public void setDateReported(String text) {
		logger.info(format("%s -  going to set date reported:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDateReported());
	}
	
	public void selectSpecialPermission(String option) {
		logger.info(format("%s -  going to select special permission:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getSpecialPermissionDropdown(), 1);
	}
	
	//TODO others
	
	public void selectLitigationStatus(String option) {
		logger.info(format("%s -  going to select litigation status:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getLitigationStatusDropdown(), 1);
	}
	
	public void selecCoverageInQuestion(boolean inquestion)
	{
		logger.info(format("%s -  going to set coverage in question to:"+inquestion, getName()));
	    if (inquestion)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getCoverageQuestionYesRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getCoverageQuestionNoRadio());
	    }

	}
	
	//TODO others
	public void selectSubrogationStatus(String option) {
		logger.info(format("%s -  going to select subrogation status:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getSubrogationStatusDropdown(), 1);
	}
	
	
	
	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getIncidentOnlyYesRadio() {
		return incidentOnlyYesRadio;
	}

	private WebElement getIncidentOnlyNoRadio() {
		return incidentOnlyNoRadio;
	}

	private WebElement getDateReported() {
		return dateReported;
	}

	private WebElement getSpecialPermissionDropdown() {
		return specialPermissionDropdown;
	}

	private WebElement getLitigationStatusDropdown() {
		return litigationStatusDropdown;
	}

	private WebElement getCoverageQuestionYesRadio() {
		return coverageQuestionYesRadio;
	}

	private WebElement getCoverageQuestionNoRadio() {
		return coverageQuestionNoRadio;
	}

	private WebElement getSubrogationStatusDropdown() {
		return subrogationStatusDropdown;
	}

	private WebElement getUpdateButton() {
		return updateButton;
	}
	
	

	
}