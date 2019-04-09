package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.liability;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLLossDetailsLiabilityPOM extends BaseTest {

	@FindBy(id = "ClaimLiability:Cancel")
	private WebElement cancelButton;

	@FindBy(id = "ClaimLiability:Update")
	private WebElement updateButton;

	@FindBy(id = "ClaimLiability:Edit")
	private WebElement editButton;

	@FindBy(id = "ClaimLiability:ttlBar")
	private WebElement pageTitle;



	public String getName() {

		return "Post FNOL Loss Details - Liability";
	}

	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(1);
		logger.info(format("%s -found page title for :" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	public void cancel() {
		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, getCancelButton());
	}

	public void update() {
		logger.info(format("%s -  going to click Update", getName()));
		GuideWireAccessors.clickGWButton(driver, getUpdateButton());
	}

	public void edit() {
		logger.info(format("%s -  going to click Edit", getName()));
		GuideWireAccessors.clickGWButton(driver, getEditButton());

	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	
	

}