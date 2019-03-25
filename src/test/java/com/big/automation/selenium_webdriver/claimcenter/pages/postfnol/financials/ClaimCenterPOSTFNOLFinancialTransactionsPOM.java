package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLFinancialTransactionsPOM extends BaseTest {

	@FindBy(id = "ClaimFinancialsTransactions:ClaimFinancialsTransactionsScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "ClaimFinancialsTransactions:ClaimFinancialsTransactionsScreen:TransactionsLVRangeInput-inputEl")
	private WebElement transactionTypeDropdown;
	

	public String getName() {

		return "Post FNOL Financial Transactions";
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
	
	public void selectTransactionType(String option) {

		logger.info(format("%s -  going to select transaction type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getTransactionTypeDropdown(), 1);
		
	}

	private WebElement getTransactionTypeDropdown() {
		return transactionTypeDropdown;
	}
	
	

}