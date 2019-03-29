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

	//-------------------------------
	// worksheet buttons
	@FindBy(id ="ApprovalDetailWorksheet:ApprovalDetailScreen:ApprovalDetailWorksheet_ApproveButton")
	private WebElement worksheetApproveButton;
	

	public String getName() {

		return "Desktop Activities screen";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void selectActivityType(String option) {

		logger.info(format("%s -  going to select activity type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getActivityFilterDropdown(), 1);
		
	}
	
	public void approveActivityOnWorksheet()
	{
		logger.info(format("%s - click approve activity on worksheet", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getWorksheetApproveButton());
	}
	
	
	public void clickActivityToAction(String subject,String claim, String insured,String exposure) throws Throwable
	{
		logger.info(format("%s - click activity for subject:"+subject+",claim:"+claim+",insured:"+insured+",exposure:"+exposure, getName()));
	    sleep(1);
		String locator = "//*[@id=\"DesktopActivities:DesktopActivitiesScreen:DesktopActivitiesLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement activitySubject;
		WebElement activityClaim;
		WebElement activityInsured;
		WebElement activityExposure;
			
		// loop till find first with mathcing type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
				//find the type
			activitySubject = driver.findElement(By.xpath(rowLocator+"//tr//td[7]"));
			activityClaim = driver.findElement(By.xpath(rowLocator+"//tr//td[8]"));
			activityInsured = driver.findElement(By.xpath(rowLocator+"//tr//td[9]"));
			activityExposure = driver.findElement(By.xpath(rowLocator+"//tr//td[10]"));
		
			if (activitySubject.getText().equalsIgnoreCase(subject) && activityClaim.getText().equalsIgnoreCase(claim) && activityInsured.getText().equalsIgnoreCase(insured)&& activityExposure.getText().equalsIgnoreCase(exposure))
			{
				logger.info(format("%s - Found match in activity table to click", getName()));
				
				// now get the anchor link
				WebElement anchor = driver.findElement(By.xpath(rowLocator+"//tr//td[7]//a"));
				
				GuideWireAccessors.clickGWButton(driver, anchor);
				return;
				
			}
		}
		
		logger.info(format("%s - NO match in activity table ", getName()));
		throw new Exception("cannot find activity in table for:"+subject+",claim:"+claim+",insured:"+insured+",exposure:"+exposure);
	
		
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

	private WebElement getWorksheetApproveButton() {
		return worksheetApproveButton;
	}
	
	
	
	


	
	
	
}