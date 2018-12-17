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

public class ClaimCenterDriverDetailsPOM extends BaseTest{

	
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	
		

	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ttlBar")
	private WebElement pageTitle;
		
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:Update-btnEl")
	private WebElement okButton;

	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:ClaimContactPerson-inputEl")
	private WebElement driverNameDropdown;
	

	
	
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "FNOL Wizard Step3 Add Driver";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(4);
		logger.info(format("%s -check page title for Add Driver page :"+expected, getName()));
		logger.info(format("%s -found page title for Add Driver page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getOkButton());
		logger.info(format("%s - done, OK clicked", getName()));
	}
	
	public void selectDriverName(String option)
	{
		logger.info(format("%s - going to select Driver name option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDriverNameDropdown(),1);
	}

   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}
	

	

	
	private WebElement getDriverNameDropdown() {
		return driverNameDropdown;
	}

	private WebElement getOkButton() {
		return okButton;
	}

	/*
	private void selectOptionFromGWDropDown(String option,WebElement gwDropDown,int occurrence )
	{
		sleep(1); //TODO change to explicit
		// as it might be down the page, always scroll into view?
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",gwDropDown);
		gwDropDown.click(); // need to click it first
		sleep(1);
		String optionLocator = "//li[contains(text(),'"  + option + "')]";
		// as we cant get access to the li elements directly under the guidewire dropdown node, we have to just search the whole document
		// this makes it very messy as there could be more than one dropdown list with the same values
		// therefore for now, get a list of list matches and used the occurence 1st 2nd etc of the order in the page
		if (occurrence > 1)
		{
			List<WebElement> elements = gwDropDown.findElements(By.xpath(optionLocator));
			elements.get(occurrence-1).click();
		}
		else
		{
			// we can just take the first or only
			gwDropDown.findElement(By.xpath(optionLocator)).click();
		}
	}*/
	
	/*private void setGWTextBox(String text, WebElement gwTextBox)
	{
		sleep(1); //TODO change
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",gwTextBox);
		gwTextBox.clear();
		gwTextBox.sendKeys(text);
	}
	
	private void clickGWButton(WebElement gwButton)
	{
		sleep(2); //TODO change
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",gwButton);
		gwButton.click();
	
	}
	*/
	
	
	
	


}