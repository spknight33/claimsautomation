package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewChequeStep1POM extends BaseTest {

	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NormalCreateCheckWizard:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "NormalCreateCheckWizard:Next")
	private WebElement nextButton;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:Add")
	private WebElement addPayeeButton;
	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckPayeesScreen:Remove")
	private WebElement removePayeeButton;

	

	public String getName() {

		return "Post FNOL New Cheque Step1";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(1);

		logger.info(format("%s -found page title:" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().contains(expected);
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	public void next() {

		logger.info(format("%s -  going to click next", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getNextButton());
		
	}
	public void addPayee() {

		logger.info(format("%s -  going to click addPayee", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddPayeeButton());
		
	}
	public void removePayee() {

		logger.info(format("%s -  going to click removePayee", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getRemovePayeeButton());
		
	}
	
	//TODO - rest of this page

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getNextButton() {
		return nextButton;
	}

	private WebElement getAddPayeeButton() {
		return addPayeeButton;
	}

	private WebElement getRemovePayeeButton() {
		return removePayeeButton;
	}
	


	


	
	
	

}