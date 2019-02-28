package com.big.automation.selenium_webdriver.claimcenter.pages.desktop;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterDesktopActivitiesPOM extends BaseTest{

	@FindBy(id = "DesktopActivities:DesktopActivitiesScreen:0")
	private WebElement pageTitle;
	
	@FindBy(id ="DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV:DesktopActivitiesFilter-inputEl")
	private WebElement activityFilterDropdown;

	@FindBy(id ="DesktopActivities:DesktopActivitiesScreen:DesktopActivities_AssignButton")
	private WebElement assignButton;
	@FindBy(id ="DesktopActivities:DesktopActivitiesScreen:DesktopActivities_SkipButton")
	private WebElement skipButton;
	@FindBy(id ="DesktopActivities:DesktopActivitiesScreen:DesktopActivities_CompleteButton")
	private WebElement completeButton;
	@FindBy(id ="DesktopActivities:DesktopActivitiesScreen:DesktopActivities_ApproveButton")
	private WebElement approveButton;
	@FindBy(id ="DesktopActivities:DesktopActivitiesScreen:DesktopActivities_RejectButton")
	private WebElement rejectButton;

	
	

	public String getName() {

		return "Desktop Activities screen";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	//TODO clicking of selected CBox and use of assign buttons etc
	
	public void clickOnClaimForActivity()
	{
		// just click on first for now
		logger.info(format("%s -  going to click on claim link for activity", getName()));
		String locator = "//*[@id=\"DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV-body\"]//table[1]//tr//td[8]//a";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.clickGWButton(driver,element);
	}
	
			
	
	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getActivityFilterDropdown() {
		return activityFilterDropdown;
	}

	private WebElement getAssignButton() {
		return assignButton;
	}

	private WebElement getSkipButton() {
		return skipButton;
	}

	private WebElement getCompleteButton() {
		return completeButton;
	}

	private WebElement getApproveButton() {
		return approveButton;
	}

	private WebElement getRejectButton() {
		return rejectButton;
	}
	
	
	
	


	
	
	
}