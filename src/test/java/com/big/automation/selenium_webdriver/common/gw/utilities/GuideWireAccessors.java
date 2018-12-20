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
	public static final int MAX_RETRY_ON_CLICK_ELEMENT = 5;
	public static final int MAX_RETRY_ON_TEXT_INPUT = 5;
	public static final int MAX_RETRY_ON_PICKER = 5;
	public static final int MAX_RETRY_ON_DROPDOWN = 5;

	/**
	 * Common method to click a Guidewire button or link It is possible to get a
	 * element not clickable exception, even though we have waited for the element
	 * to become clickable. Therefore max tries is used to try and circumvent this
	 * 
	 * @param driver
	 * @param gwButton
	 */
	public static void clickGWButton(WebDriver driver, WebElement gwButton) {
		int findAttempts = 0;
		while (findAttempts < MAX_RETRY_ON_CLICK_ELEMENT) {
			try {
				WaitForUtils.waitForElementToBeClickable(driver, gwButton);
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwButton);
				gwButton.click();
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("clickGWButton Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}
	}

	/**
	 * Common method to enter text into a text box or area. It is possible to get a
	 * element not clickable exception, even though we have waited for the element
	 * to become clickable. Therefore max tries is used to try and circumvent this
	 * 
	 * @param driver
	 * @param text
	 * @param gwTextBox
	 */
	public static void setGWTextBox(WebDriver driver, String text, WebElement gwTextBox) {
		int findAttempts = 0;
		while (findAttempts < MAX_RETRY_ON_TEXT_INPUT) {
			try {
				WaitForUtils.waitForElementToBeClickable(driver, gwTextBox);
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwTextBox);
				gwTextBox.clear();
				gwTextBox.sendKeys(text);
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("setkGWTestBox Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}
	}

	/**
	 * select an option from a dropdown GW uses an unusual mechanism in that the
	 * list of items does not appear to be held as children of the dropdown input
	 * element but instead the options are held in a List at the bottom of the html
	 * document. We can open up the combo which will display the options, but then
	 * to find the option I have had to use a list search. Using a list search means
	 * there could be more than one option of that value on the page (e.g. for a
	 * dfferent list) This has meant convoluted use of occurence on the page
	 * parameter which is not ideal.
	 * 
	 * @param driver
	 * @param option
	 * @param gwDropDown
	 * @param occurrence
	 */
	
	
	public static void selectOptionFromGWDropDown(WebDriver driver, String option, WebElement gwDropDown,
			int occurrence, boolean caseSensitive) {
		int findAttempts = 0;
		while (findAttempts < MAX_RETRY_ON_DROPDOWN) {
			try {
				WaitForUtils.waitForElementToBeClickable(driver, gwDropDown);
				// as it might be down the page, always scroll into view
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwDropDown);
				gwDropDown.click();
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("selectOptionFromGWDropDown Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}

		String optionLocator; 
		
		if (caseSensitive)
		{
			// need to use double quotes in case therea re any single quotes in the locator text
			optionLocator = "//li[contains(text(),\"" + option + "\")]";
		}
		else
		{
			//TODO 
			optionLocator = "//li[contains(text(),\"" + option + "\")]";
		}
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(optionLocator)));
		WebElement optionElement = null;
		// as we cant get access to the li elements directly under the guidewire
		// dropdown node, we have to just search the whole document
		// this makes it very messy as there could be more than one dropdown list with
		// the same values
		// therefore for now, get a list of list matches and used the occurence 1st 2nd
		// etc of the order in the page
		if (occurrence > 1) {
			List<WebElement> elements = gwDropDown.findElements(By.xpath(optionLocator));
			// it could be that there is only one occurrence in the page, even though
			// occurrence 2 was asked for
			// as a workaround for now, just click the last?
			if (occurrence != elements.size()) {
				occurrence = elements.size();
			}
			optionElement = elements.get(occurrence - 1);
		} else {
			// we can just take the first or only
			optionElement = gwDropDown.findElement(By.xpath(optionLocator));
		}

		findAttempts = 0;
		while (findAttempts < MAX_RETRY_ON_DROPDOWN) {
			try {
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", optionElement);
				optionElement.click();
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("selectOptionFromGWDropDown (option) Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}
	}
	
	
	public static void selectOptionFromGWDropDown(WebDriver driver, String option, WebElement gwDropDown,
			int occurrence) {
		    selectOptionFromGWDropDown(driver,option,gwDropDown,occurrence,false); // default to case insensitve

	}

	/*
	 * public static void selectOptionFromGWDropDown(WebDriver driver, String
	 * option, WebElement gwDropDown, int occurrence) {
	 * WaitForUtils.waitForElementToBeClickable(driver, gwDropDown); // as it might
	 * be down the page, always scroll into view JavascriptExecutor je =
	 * (JavascriptExecutor) driver;
	 * je.executeScript("arguments[0].scrollIntoView(true);", gwDropDown);
	 * 
	 * // we can get a element not clickable, even though we have waited! try {
	 * gwDropDown.click(); // need to click it first } catch (Exception e) {
	 * sleep(5); gwDropDown.click(); }
	 * 
	 * String optionLocator = "//li[contains(text(),'" + option + "')]";
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 10);
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(optionLocator
	 * )));
	 * 
	 * // as we cant get access to the li elements directly under the guidewire //
	 * dropdown node, we have to just search the whole document // this makes it
	 * very messy as there could be more than one dropdown list with // the same
	 * values // therefore for now, get a list of list matches and used the
	 * occurence 1st 2nd // etc of the order in the page if (occurrence > 1) {
	 * List<WebElement> elements = gwDropDown.findElements(By.xpath(optionLocator));
	 * // it could be that there is only one occurrence in the page, even though //
	 * occurrence 2 was asked for // as a workaround for now, just click the last?
	 * if (occurrence != elements.size()) { occurrence = elements.size(); }
	 * elements.get(occurrence - 1).click(); } else { // we can just take the first
	 * or only gwDropDown.findElement(By.xpath(optionLocator)).click(); } }
	 */

	/**
	 * used to select the link from a gw picker icon drop mdown (e.g for new person)
	 * 
	 * @param driver
	 * @param picker
	 * @param pickerOption
	 */
	public static void selectOptionFromGWPicker(WebDriver driver, WebElement picker, WebElement pickerOption) {

		int findAttempts = 0;
		while (findAttempts < MAX_RETRY_ON_PICKER) {
			try {
				WaitForUtils.waitForElementToBeClickable(driver, picker);
				// as it might be down the page, always scroll into view
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", picker);
				picker.click();
				break;

			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("selectOptionFromGWPicker Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}

		// select the option
		findAttempts = 0;
		while (findAttempts < MAX_RETRY_ON_PICKER) {
			try {
				WaitForUtils.waitForElementToBeClickable(driver, pickerOption);
				pickerOption.click();
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("selectOptionFromGWPicker (option) Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}

	}

}
