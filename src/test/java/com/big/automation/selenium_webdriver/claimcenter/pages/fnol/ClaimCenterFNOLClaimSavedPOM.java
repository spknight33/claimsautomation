package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLClaimSavedPOM extends BaseTest{

	
	
	@FindBy(id = "NewClaimSaved:NewClaimSavedScreen:ttlBar")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	@FindBy(id = "NewClaimSaved:NewClaimSavedScreen:NewClaimSavedDV:GoToClaim-inputEl")
	private WebElement claimLink;
	
	
	
	public String getName() {

		return "Claim saved FNOL confirmation";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(20); //it can take a long time to save a claim
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getPageTitle()).equalsIgnoreCase(expected);
	}
	
	
	private List<WebElement> getErrorMessages(){
		return errorMessages;
	}
	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	public void clickClaimLink() {

		logger.info(format("%s -  going to click claim link", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getClaimLink());
		
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

	private WebElement getClaimLink() {
		return claimLink;
	}
	
	
	

}