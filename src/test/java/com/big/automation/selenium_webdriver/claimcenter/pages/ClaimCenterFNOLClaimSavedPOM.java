package com.big.automation.selenium_webdriver.claimcenter.pages;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLClaimSavedPOM extends BaseTest{

	
	
	@FindBy(id = "NewClaimSaved:NewClaimSavedScreen:ttlBar")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	
	
	
	
	public String getName() {

		return "Claim saved FNOL confirmation";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(5);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getPageTitle()).equalsIgnoreCase(expected);
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
	
	

}