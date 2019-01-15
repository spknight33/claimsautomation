package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLExposuresPOM extends BaseTest{

	@FindBy(id = "ClaimExposures:ClaimExposuresScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "ClaimExposures:ClaimExposuresScreen:ExposuresLV:ExposuresFilter-inputEl")
	private WebElement filterDropdown;
	
	@FindBy(id = "ClaimExposures:ClaimExposuresScreen:ClaimExposures_Assign")
	private WebElement assignButton;
	@FindBy(id = "ClaimExposures:ClaimExposuresScreen:ClaimExposures_Refresh")
	private WebElement refreshButton;
	@FindBy(id ="ClaimExposures:ClaimExposuresScreen:ClaimExposures_CloseExposure")
	private WebElement closeExposureButton;
	@FindBy(id ="ClaimExposures:ClaimExposuresScreen:ClaimExposures_Print")
	private WebElement printExportButton;
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	
	
	public String getName() {

		return "Post FNOL Exposure Details";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		
		logger.info(format("%s -found page title for step3 :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
		
	//TODO
	//other buttons
	public void assign() {

		logger.info(format("%s -  going to click assign", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAssignButton());
		
	}
	public void refresh() {

		logger.info(format("%s -  going to click refresh", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getRefreshButton());
	}
	public void closeExposure() {

		logger.info(format("%s -  going to click close Exposure", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCloseExposureButton());
	}
	
	//TODO	
	//click exposure checkbox
	
	public void selectFilter(String option)
	{
		logger.info(format("%s - going to select Filter option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getFilterDropdown(),1);
	}
	
	public void selectExposureOfType(String type)
	{
	    sleep(2);
		String locator = "//*[@id=\"ClaimExposures:ClaimExposuresScreen:ExposuresLV-body\"]//table//tr/td[3]//a";
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
	
	
	private List<WebElement> getErrorMessages(){
		return errorMessages;
	}
	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	
	
	private WebElement getFilterDropdown() {
		return filterDropdown;
	}

	private WebElement getAssignButton() {
		return assignButton;
	}

	private WebElement getRefreshButton() {
		return refreshButton;
	}

	private WebElement getCloseExposureButton() {
		return closeExposureButton;
	}

	private WebElement getPrintExportButton() {
		return printExportButton;
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