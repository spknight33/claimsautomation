package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures;

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
	
	public String getHandlerForExposure(String type,String coverage)
	{
		logger.info(format("%s - get handler for exposure ", getName()));
	    sleep(2);
		String locator = "//*[@id=\"ClaimExposures:ClaimExposuresScreen:ExposuresLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement expType;
		WebElement expCoverage;
		WebElement expHandler;
		
		// loop till find first with mathcing type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
				//find the type
			expType = driver.findElement(By.xpath(rowLocator+"//tr//td[3]"));
			expCoverage = driver.findElement(By.xpath(rowLocator+"//tr//td[4]"));
			expHandler = driver.findElement(By.xpath(rowLocator+"//tr//td[6]"));
			
			logger.info(format("%s - get handler for exposure - check row:"+expType.getText()+" "+expCoverage.getText()+" "+expHandler.getText(), getName()));
			
			
			//logger.info(format("%s - check exposure table row for matching entry ", getName()));
			//logger.info(format("%s - check exposure table type "+expType.getText(), getName()));
			//logger.info(format("%s - check exposure table coverage "+expCoverage.getText(), getName()));
			if (expType.getText().equalsIgnoreCase(type) && expCoverage.getText().equalsIgnoreCase(coverage))
			{
				logger.info(format("%s - Found match in exposure table: "+expHandler.getText(), getName()));
				return expHandler.getText();
				
			}
		}
		
		logger.info(format("%s - NO match in exposure table: "+type+" "+coverage, getName()));
		return null;
	
		
	}
	
	public String getClaimantForExposure(String type,String coverage)
	{
		logger.info(format("%s - get claimant for exposure ", getName()));
	    sleep(1);
		String locator = "//*[@id=\"ClaimExposures:ClaimExposuresScreen:ExposuresLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement expType;
		WebElement expCoverage;
		WebElement expClaimant;
		
		// loop till find first with mathcing type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
				//find the type
			expType = driver.findElement(By.xpath(rowLocator+"//tr//td[3]"));
			expCoverage = driver.findElement(By.xpath(rowLocator+"//tr//td[4]"));
			expClaimant = driver.findElement(By.xpath(rowLocator+"//tr//td[5]"));
			
			logger.info(format("%s - get claimant for exposure - check row:"+expType.getText()+" "+expCoverage.getText()+" "+expClaimant.getText(), getName()));
			
	
			if (expType.getText().equalsIgnoreCase(type) && expCoverage.getText().equalsIgnoreCase(coverage))
			{
				logger.info(format("%s - Found match in exposure table: "+expClaimant.getText(), getName()));
				return expClaimant.getText();
				
			}
		}
		
		logger.info(format("%s - NO match in exposure table: "+type+" "+coverage, getName()));
		return null;
	
		
	}
	
	public String getReserveForExposure(String type,String coverage,String claimant)
	{
		logger.info(format("%s - get reserve for exposure type,coverage and claimant", getName()));
	    sleep(1);
		String locator = "//*[@id=\"ClaimExposures:ClaimExposuresScreen:ExposuresLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement expType;
		WebElement expCoverage;
		WebElement expClaimant;
		WebElement expReserve;
		
		// loop till find first with mathcing type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
				//find the type
			expType = driver.findElement(By.xpath(rowLocator+"//tr//td[3]"));
			expCoverage = driver.findElement(By.xpath(rowLocator+"//tr//td[4]"));
			expClaimant = driver.findElement(By.xpath(rowLocator+"//tr//td[5]"));
			expReserve = driver.findElement(By.xpath(rowLocator+"//tr//td[8]"));
			
			logger.info(format("%s - get reserve for exposure - check row:"+expType.getText()+" "+expCoverage.getText()+" "+expClaimant.getText(), getName()));
			
	
			if (expType.getText().equalsIgnoreCase(type) && expCoverage.getText().equalsIgnoreCase(coverage)&& expClaimant.getText().equalsIgnoreCase(claimant))
			{
				logger.info(format("%s - Found match in exposure table: "+expReserve.getText(), getName()));
				return expReserve.getText();
				
			}
		}
		
		logger.info(format("%s - NO match in exposure table: "+type+" "+coverage, getName()));
		return null;
	
		
	}
	
	public void clickExposure(String type,String coverage, String claimant)
	{
		logger.info(format("%s - click exposure type,coverage and claimant", getName()));
	    sleep(3);
		String locator = "//*[@id=\"ClaimExposures:ClaimExposuresScreen:ExposuresLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement expType;
		WebElement expCoverage;
		WebElement expClaimant;
			
		// loop till find first with mathcing type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
				//find the type
			expType = driver.findElement(By.xpath(rowLocator+"//tr//td[3]"));
			expCoverage = driver.findElement(By.xpath(rowLocator+"//tr//td[4]"));
			expClaimant = driver.findElement(By.xpath(rowLocator+"//tr//td[5]"));
			
			//logger.info(format("%s - find exposure - check row:"+expType.getText()+" "+expCoverage.getText()+" "+expClaimant.getText(), getName()));
			
	
			if (expType.getText().equalsIgnoreCase(type) && expCoverage.getText().equalsIgnoreCase(coverage)&& expClaimant.getText().equalsIgnoreCase(claimant))
			{
				logger.info(format("%s - Found match in exposure table to click", getName()));
				
				// now get the anchor link
				WebElement anchor = driver.findElement(By.xpath(rowLocator+"//tr//td[3]//a"));
				
				GuideWireAccessors.clickGWButton(driver, anchor);
				return;
				
			}
		}
		
		logger.info(format("%s - NO match in exposure table: "+type+" "+coverage, getName()));
	
		
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