package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLSetReservesPOM extends BaseTest {

	@FindBy(id = "NewReserveSet:NewReserveSetScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NewReserveSet:NewReserveSetScreen:Update")
	private WebElement saveButton;
	@FindBy(id = "NewReserveSet:NewReserveSetScreen:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "NewReserveSet:NewReserveSetScreen:Add")
	private WebElement addButton;
	
	@FindBy(id = "NewReserveSet:NewReserveSetScreen:Remove")
	private WebElement removeButton;
	@FindBy(id = "NewReserveSet:NewReserveSetScreen:NewReserveSet_ShowGroupedReservesButton")
	private WebElement showGroupButton;
	
	

	public String getName() {

		return "Post FNOL Set Reserves";
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
	
	public void save() {

		logger.info(format("%s -  going to click save", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getSaveButton());
		
	}
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	public void add() {

		logger.info(format("%s -  going to click add", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddButton());
		
	}
	public void remove() {

		logger.info(format("%s -  going to click remove", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getRemoveButton());
		
	}
	
	//TODO - rest of this page
	// TODO - set values for new reserver
	//TODO - update values for existing reserve
	

	private WebElement getSaveButton() {
		return saveButton;
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getAddButton() {
		return addButton;
	}

	private WebElement getRemoveButton() {
		return removeButton;
	}

	private WebElement getShowGroupButton() {
		return showGroupButton;
	}
	
	
	

}