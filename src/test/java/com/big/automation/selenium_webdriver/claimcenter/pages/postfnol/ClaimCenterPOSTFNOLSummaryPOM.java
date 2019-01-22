package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

public class ClaimCenterPOSTFNOLSummaryPOM extends BaseTest{

	@FindBy(id = "ClaimSummary:ClaimSummaryScreen:ttlBar")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	
	//Loss detials section
	//--------------------------
	@FindBy(id ="ClaimSummary:ClaimSummaryScreen:ClaimSummaryHeadlinePanelSet:LossDate-inputEl")
	private WebElement lossDate;
	@FindBy(id ="ClaimSummary:ClaimSummaryScreen:ClaimSummaryHeadlinePanelSet:ReportDate-inputEl")
	private WebElement noticeDate;
	@FindBy(id ="ClaimSummary:ClaimSummaryScreen:ClaimSummaryHeadlinePanelSet:Location-inputEl")
	private WebElement lossLocation;
	
	
	// Circumstances
	//-------------------------------
	@FindBy(id ="ClaimSummary:ClaimSummaryScreen:ClaimSummaryHeadlinePanelSet:Description-inputEl")
	private WebElement circumstances;

	public String getName() {

		return "Post FNOL Summary";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
	    sleep(1);
		logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	private WebElement getCircumstances() {
		return circumstances;
	}
	
	
	private List<WebElement> getErrorMessages(){
		return errorMessages;
	}
	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	
	
	
	
	

	

	private WebElement getLossDate() {
		return lossDate;
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