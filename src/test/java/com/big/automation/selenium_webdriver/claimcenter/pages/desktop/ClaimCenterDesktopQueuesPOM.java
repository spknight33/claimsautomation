package com.big.automation.selenium_webdriver.claimcenter.pages.desktop;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterDesktopQueuesPOM extends BaseTest{

	@FindBy(id = "DesktopQueuedActivities:DesktopQueuedActivitiesScreen:0")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	

	
	@FindBy(id ="DesktopQueuedActivities:DesktopQueuedActivitiesScreen:DesktopQueuedActivities_AssignNextButton2")
	private WebElement assignNextButton;

	
	

	public String getName() {

		return "Desktop Queue screen";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void clickAssignNext()
	{
		logger.info(format("%s -  going to click assign next in queue", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAssignNextButton());
	}
	
	
	
	private List<WebElement> getErrorMessages(){
		return errorMessages;
	}
	private WebElement getPageTitle() {
		return pageTitle;
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

	private WebElement getAssignNextButton() {
		return assignNextButton;
	}
	
	
}