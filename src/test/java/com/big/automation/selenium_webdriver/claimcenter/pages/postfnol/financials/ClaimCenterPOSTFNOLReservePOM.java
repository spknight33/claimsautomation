package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLReservePOM extends BaseTest {

	@FindBy(id = "ClaimFinancialsTransactionsDetail:ClaimFinancialsTransactionsDetailScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "ClaimFinancialsTransactionsDetail:ClaimFinancialsTransactionsDetailScreen:TransactionDetailToolbarButtonSet:TransactionDetailToolbarButtons_EditButton")
	private WebElement editButton;
	@FindBy(id = "ClaimFinancialsTransactionsDetail:ClaimFinancialsTransactionsDetailScreen:TransactionDetailToolbarButtonSet:TransactionDetailToolbarButtons_DeleteButton")
	private WebElement deleteButton;
	@FindBy(id = "ClaimFinancialsTransactionsDetail:ClaimFinancialsTransactionsDetailScreen:TransactionDetailToolbarButtonSet:TransactionDetailToolbarButtons_CreateCheckButton")
	private WebElement createCheckButton;
	
	
	@FindBy(id = "ClaimFinancialsTransactionsDetail:ClaimFinancialsTransactionsDetail_UpLink")
	private WebElement upToFinancialsLink;
	
	

	public String getName() {

		return "Post FNOL Reserve Details";
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
	public void delete() {

		logger.info(format("%s -  going to click delete", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getDeleteButton());
		
	}
	
	public void clickUpToFinancials() {

		logger.info(format("%s -  going to click upto financials", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getUpToFinancialsLink());
		
	}
	
	

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getDeleteButton() {
		return deleteButton;
	}

	private WebElement getCreateCheckButton() {
		return createCheckButton;
	}

	private WebElement getUpToFinancialsLink() {
		return upToFinancialsLink;
	}
	
	
	

}