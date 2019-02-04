package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewChequeStep3POM extends BaseTest {

	@FindBy(id = "NormalCreateCheckWizard:CheckWizard_CheckInstructionsScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NormalCreateCheckWizard:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "NormalCreateCheckWizard:Prev")
	private WebElement backButton;
	@FindBy(id = "NormalCreateCheckWizard:Finish")
	private WebElement finishButton;
	
	

	public String getName() {

		return "Post FNOL New Cheque Step3";
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
	public void back() {

		logger.info(format("%s -  going to click back", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getBackButton());
		
	}
	public void finish() {

		logger.info(format("%s -  going to click finish", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getFinishButton());
		
	}
	
	
	//TODO - rest of this page

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getBackButton() {
		return backButton;
	}

	private WebElement getFinishButton() {
		return finishButton;
	}



	
	


	


	
	
	

}