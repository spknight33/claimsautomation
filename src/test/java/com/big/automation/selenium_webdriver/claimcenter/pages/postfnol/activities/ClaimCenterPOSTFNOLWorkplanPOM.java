package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.activities;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

public class ClaimCenterPOSTFNOLWorkplanPOM extends BaseTest{

	@FindBy(id = "ClaimWorkplan:ClaimWorkplanScreen:0")
	private WebElement pageTitle;
	
	@FindBy(id = "ClaimWorkplan:ClaimWorkplanScreen:ClaimWorkplan_AssignButton")
	private WebElement assignButton;
	
	@FindBy(id = "ClaimWorkplan:ClaimWorkplanScreen:ClaimWorkplan_SkipButton")
	private WebElement skipButton;
		
	@FindBy(id = "ClaimWorkplan:ClaimWorkplanScreen:ClaimWorkplan_CompleteButton")
	private WebElement completeButton;
	
	@FindBy(id = "ClaimWorkplan:ClaimWorkplanScreen:ClaimWorkplan_ApproveButton")
	private WebElement approveButton;
	
	@FindBy(id = "ClaimWorkplan:ClaimWorkplanScreen:ClaimWorkplan_RejectButton")
	private WebElement rejectButton;
	

	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	
	@FindBy(id = "ClaimWorkplan:ClaimWorkplanScreen:WorkplanLV:WorkplanFilter-inputEl")
	private WebElement activitiesDropdown;
	
	public String getName() {

		return "Post FNOL Workplan";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for step3 :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void assign() {

		logger.info(format("%s -  going to click assign", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAssignButton());
		logger.info(format("%s - done, assign clicked", getName()));
	}
	public void skip() {

		logger.info(format("%s -  going to click skip", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getSkipButton());
		logger.info(format("%s - done, skip clicked", getName()));
	}
	public void complete() {

		logger.info(format("%s -  going to click complete", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCompleteButton());
		logger.info(format("%s - done, complete clicked", getName()));
	}
	public void approve() {

		logger.info(format("%s -  going to click approve", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getApproveButton());
		logger.info(format("%s - done, skip approve", getName()));
	}
	public void reject() {

		logger.info(format("%s -  going to click reject", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getRejectButton());
		logger.info(format("%s - done, reject clicked", getName()));
	}
	
	public void selectActivities(String option) {

		logger.info(format("%s -  going to select activities:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getActivitiesDropdown(), 1);
		
	}
	
	public void selectActivityOfType(String type)
	{
	    sleep(1);
		String locator = "//*[@id=\"ClaimWorkplan:ClaimWorkplanScreen:WorkplanLV-body\"]//table//tr/td[7]//a";
		List <WebElement> elements = driver.findElements(By.xpath(locator));
		
		// loop till find first with mathcing type
		for (WebElement element:elements)
		{
			if (element.getText().equalsIgnoreCase(type))
			{
				GuideWireAccessors.clickGWButton(driver, element);
				break;
			}
		}
	}
	
	
	public boolean activityOfTypePresent(String type)
	{
		boolean found = false;
	    sleep(1);
		String locator = "//*[@id=\"ClaimWorkplan:ClaimWorkplanScreen:WorkplanLV-body\"]//table//tr/td[7]//a";
		List <WebElement> elements = driver.findElements(By.xpath(locator));
		
		// loop till find first with mathcing type
		for (WebElement element:elements)
		{
			if (element.getText().equalsIgnoreCase(type))
			{
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	public boolean activityPresent(String subject,String overdueTime)
	{
		logger.info(format("%s - activityPresent check ", getName()));
	    sleep(2);
		String locator = "//*[@id=\"ClaimWorkplan:ClaimWorkplanScreen:WorkplanLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement actSubject;
		WebElement actOverdue;
		
		
		// loop till find first with mathcing type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
				//find the type
			actSubject = driver.findElement(By.xpath(rowLocator+"//tr//td[8]"));
			actOverdue = driver.findElement(By.xpath(rowLocator+"//tr//td[5]"));
			
			
	
			if (actSubject.getText().equalsIgnoreCase(subject) && actOverdue.getText().equalsIgnoreCase(overdueTime))
			{
				logger.info(format("%s - Found match in activity workplan table ", getName()));
				return true;
				
			}
		}
		
		logger.info(format("%s - NO match in activity table: "+subject+" "+overdueTime, getName()));
		return false;
	
		
	}


	private WebElement getPageTitle() {
		return pageTitle;
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

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}
	
	

	private WebElement getActivitiesDropdown() {
		return activitiesDropdown;
	}

	public boolean containsErrorMessage(String contains)
	{
		boolean found=false;
		for (WebElement element : getErrorMessages()) 
		{
			if (element.getText().equalsIgnoreCase(contains))
			{
				found = true;
				break;
			}
		}
		return found;
	}
	
	
}