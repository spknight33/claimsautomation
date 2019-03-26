package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLFinancialChequesPOM extends BaseTest {

	@FindBy(id = "ClaimFinancialsChecks:ClaimFinancialsChecksScreen:ttlBar")
	private WebElement pageTitle;

	public String getName() {

		return "Post FNOL Financial Cheques";
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

	

	public boolean containsCheque(String status,String payee,String amount)
	{
		logger.info(format("%s - check if financials cheque contains cheque for: "+status+","+payee+","+amount, getName()));
	    sleep(1);
		String locator = "//*[@id=\"ClaimFinancialsChecks:ClaimFinancialsChecksScreen:ChecksLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement chequeStatus;
		WebElement chequePayee;
		WebElement chequeAmount;
	
		
		// loop till find first with matching type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
				//find the type
			chequeStatus = driver.findElement(By.xpath(rowLocator+"//tr//td[6]"));
			chequePayee = driver.findElement(By.xpath(rowLocator+"//tr//td[2]"));
			chequeAmount = driver.findElement(By.xpath(rowLocator+"//tr//td[3]"));
			
			
		
			if (chequeStatus.getText().equalsIgnoreCase(status) && chequePayee.getText().equalsIgnoreCase(payee)&& chequeAmount.getText().equalsIgnoreCase(amount))
			{
				logger.info(format("%s - Found match in cheque table", getName()));
				return true;
				
			}
		}
		
		logger.info(format("%s - NO match in cheque table ", getName()));
		return false;
	
		
	}
	
}