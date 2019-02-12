package com.big.automation.selenium_webdriver.claimcenter.pages.claimclose;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenteClaimClosePOM extends BaseTest{


	@FindBy(id = "CloseClaimPopup:CloseClaimScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "CloseClaimPopup:__crumb__")
	private WebElement upToCrumb;
	
	@FindBy(id = "CloseClaimPopup:CloseClaimScreen:Update")
	private WebElement closeClaimButton;
	@FindBy(id = "CloseClaimPopup:CloseClaimScreen:Cancel")
	private WebElement cancelButton;


	@FindBy(id = "CloseClaimPopup:CloseClaimScreen:CloseClaimInfoDV:Note-inputEl")
	private WebElement note;
	
	
	@FindBy(id = "CloseClaimPopup:CloseClaimScreen:CloseClaimInfoDV:Outcome-inputEl")
	private WebElement outcomeDropdown;
	
	
	public String getName() {

		return "Close Claim Screen";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		
		logger.info(format("%s -found page title for page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().contains(expected); 
	}
	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	
	public void closeClaim() {
		logger.info(format("%s -  going to click closeClaim", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCloseClaimButton());
		
	}

	
	public void selectOutcome(String option)
	{
		logger.info(format("%s - going to select outcome to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getOutcomeDropdown(), 1);
	}
	
	public void clickBreadcrumb()
	{
		logger.info(format("%s -  going to click breadcrumb", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getUpToCrumb());
	}
	
	public void setNoteText(String text)
	{
		logger.info(format("%s - going to set note text to:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNote());
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getUpToCrumb() {
		return upToCrumb;
	}

	private WebElement getCloseClaimButton() {
		return closeClaimButton;
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getNote() {
		return note;
	}

	private WebElement getOutcomeDropdown() {
		return outcomeDropdown;
	}

	

}