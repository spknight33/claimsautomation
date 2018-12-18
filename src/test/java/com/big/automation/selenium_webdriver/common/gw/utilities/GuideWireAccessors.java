package com.big.automation.selenium_webdriver.common.gw.utilities;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.big.automation.selenium_webdriver.common.utilities.WaitForUtils;

public class GuideWireAccessors {

	
	public static void clickGWButton(WebDriver driver, WebElement gwButton)
	{
		
		WaitForUtils.waitForElementToBeClickable(driver, gwButton);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",gwButton);
		// we can get a element not clickable, even though we have waited!
				try {
					gwButton.click(); // need to click it first
				}
				catch (Exception e)
				{
					sleep(4);
					gwButton.click();
				}
	
	}
	
	public static void setGWTextBox(WebDriver driver, String text, WebElement gwTextBox)
	{
		WaitForUtils.waitForElementToBeClickable(driver, gwTextBox);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",gwTextBox);
		gwTextBox.clear();
		gwTextBox.sendKeys(text);
	}
	
	public static void selectOptionFromGWDropDown(WebDriver driver, String option,WebElement gwDropDown,int occurrence )
	{
		WaitForUtils.waitForElementToBeClickable(driver, gwDropDown);
		// as it might be down the page, always scroll into view
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",gwDropDown);
		
		// we can get a element not clickable, even though we have waited!
		try {
		gwDropDown.click(); // need to click it first
		}
		catch (Exception e)
		{
			sleep(5);
			gwDropDown.click();
		}
		
		
		
		String optionLocator = "//li[contains(text(),'"  + option + "')]";
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(optionLocator)));

		
		// as we cant get access to the li elements directly under the guidewire dropdown node, we have to just search the whole document
		// this makes it very messy as there could be more than one dropdown list with the same values
		// therefore for now, get a list of list matches and used the occurence 1st 2nd etc of the order in the page
		if (occurrence > 1)
		{
			List<WebElement> elements = gwDropDown.findElements(By.xpath(optionLocator));
			// it could be that there is only one occurrence in the page, even though occurrence 2 was asked for
			// as a workaround for now, just click the last?
			if (occurrence != elements.size())
			{
				occurrence = elements.size();
			}
			elements.get(occurrence-1).click();
		}
		else
		{
			// we can just take the first or only
			gwDropDown.findElement(By.xpath(optionLocator)).click();
		}
	}
	
	// used to select the link from a gw picker icon drop mdown (e.g for new person)
	public static void selectOptionFromGWPicker(WebDriver driver, WebElement picker ,WebElement pickerOption )
	{
		WaitForUtils.waitForElementToBeClickable(driver, picker);
		// as it might be down the page, always scroll into view
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",picker);
		
		// we can get a element not clickable, even though we have waited!
		try {
			picker.click(); // need to click it first
		}
		catch (Exception e)
		{
			sleep(5);
			picker.click();
		}
		
		
		WaitForUtils.waitForElementToBeClickable(driver, pickerOption);
		pickerOption.click();
		
		
	}
	
}
