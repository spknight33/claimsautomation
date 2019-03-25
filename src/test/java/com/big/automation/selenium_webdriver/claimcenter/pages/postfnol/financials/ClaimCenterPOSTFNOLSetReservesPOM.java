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
	
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Edit")
	private WebElement editButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Update")
	private WebElement saveButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Add")
	private WebElement addButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Remove")
	private WebElement removeButton;
	
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ReserveAndRecoveryReserveListDetailPanel:EditableRecoveryReservesLV_tb:Add")
	private WebElement addRecoveryReserveButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ReserveAndRecoveryReserveListDetailPanel:EditableRecoveryReservesLV_tb:Remove")
	private WebElement removeRecoveryReserveButton;
	
	

	public String getName() {

		return "Post FNOL Reserves and recovery reserves";
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
	
	public void edit() {

		logger.info(format("%s -  going to click edit", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getEditButton());
		
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
	public void addRecoveryReserve() {

		logger.info(format("%s -  going to click add recovery reserve", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddRecoveryReserveButton());
		
	}
	
	//TODO - rest of this page
	// TODO - set values for new reserver
	//TODO - update values for existing reserve
	

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getAddButton() {
		return addButton;
	}

	private WebElement getRemoveButton() {
		return removeButton;
	}

	private WebElement getSaveButton() {
		return saveButton;
	}

	private WebElement getAddRecoveryReserveButton() {
		return addRecoveryReserveButton;
	}

	private WebElement getRemoveRecoveryReserveButton() {
		return removeRecoveryReserveButton;
	}

	
	
	
	

}