package com.big.automation.selenium_webdriver.claimcenter.pages;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

public class ClaimCenterVehicleDetailsPOM extends BaseTest{

	
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	
		

	
	@FindBy(id = "FNOLVehicleIncidentPopup:FNOLVehicleIncidentScreen:0")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "FNOL Wizard Step3 Vehicle Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(4);
		logger.info(format("%s -check page title for Vehicle page :"+expected, getName()));
		logger.info(format("%s -found page title for Vehicle page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		getCancelButton().click();
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	

   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	
	
	
	
	


}