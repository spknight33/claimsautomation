package com.big.automation.selenium_webdriver.common.gw.utilities;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.big.automation.selenium_webdriver.common.utilities.WaitForUtils;

public class GuideWireAccessors {
	public static final int MAX_RETRY_ON_CLICK_ELEMENT = 5;
	public static final int MAX_RETRY_ON_TEXT_INPUT = 5;
	public static final int MAX_RETRY_ON_PICKER = 5;
	public static final int MAX_RETRY_ON_DROPDOWN = 5;
	public static final int MAX_RETRY_ON_MENUITEM = 2;
	public static final int MAX_RETRY_ON_GETVALUE = 2;
	public static final int MAX_RETRY_ON_GETTEXT = 3;

	
	public static void useQuickJump(WebDriver driver, String command) {
		int findAttempts = 0;
		WebElement qjElement = driver.findElement(By.id("QuickJump-inputEl"));
		while (findAttempts < MAX_RETRY_ON_CLICK_ELEMENT) {
			try {
				WaitForUtils.waitForElementToBeClickableVariable(driver, qjElement,5);
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", qjElement);
				qjElement.click();
				qjElement.clear();
				qjElement.sendKeys(command);
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.ENTER);
				actions.build().perform();
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("useQuickJump Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}
	}
	
	
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
				WaitForUtils.waitForElementToBeClickableVariable(driver, gwButton,5);
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
	
	public static String getGWElementText(WebDriver driver, WebElement gwElement) {
		int findAttempts = 0;
		String text="";
		while (findAttempts < MAX_RETRY_ON_GETTEXT) {
			try {
				
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwElement);
				text = gwElement.getText();
				break;
			} catch (Exception e) {
				sleep(3);
				// TODO use a logger
				System.out.println("getext Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}
		return text;
	}
	
	public static String getGWElementTextFromValue(WebDriver driver, WebElement gwElement) {
		int findAttempts = 0;
		String text="";
		while (findAttempts < MAX_RETRY_ON_GETTEXT) {
			try {
				
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwElement);
				text = gwElement.getAttribute("value");
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("getext Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}
		return text;
	}
	

	
	
	public static boolean containsErrorMessage(WebDriver driver, String contains,By by)
	{
		int findAttempts = 0;
		boolean found=false;
	
		while (findAttempts < MAX_RETRY_ON_GETTEXT) {
			try {
				List<WebElement> elements = driver.findElements(by);
				
				
				for (WebElement element : elements) 
				{
					if (element.getText().equalsIgnoreCase(contains))
					{
						found = true;
						break;
					}
				}
			}
		 catch (Exception e) {
			sleep(1);
			// TODO use a logger
			System.out.println("containserrormessage Exception caught:" + e.getMessage());
		}
		findAttempts++;
		}
		return found;
	}
	
	public static boolean containsErrorMessagePart(WebDriver driver, String contains,By by)
	{
		int findAttempts = 0;
		boolean found=false;
	
		while (findAttempts < MAX_RETRY_ON_GETTEXT) {
			try {
				List<WebElement> elements = driver.findElements(by);
				
				
				for (WebElement element : elements) 
				{
					if (element.getText().contains(contains))
					{
						found = true;
						break;
					}
				}
			}
		 catch (Exception e) {
			sleep(1);
			// TODO use a logger
			System.out.println("containserrormessagepart Exception caught:" + e.getMessage());
		}
		findAttempts++;
		}
		return found;
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
				
				WaitForUtils.waitForElementToBeClickableVariable(driver, gwTextBox,5);
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwTextBox);
				gwTextBox.click();
				gwTextBox.clear();
				gwTextBox.sendKeys(text);
				break;
			} catch (Exception e) {
				sleep(3);
				// TODO use a logger
				System.out.println("setkGWTestBox Exception caught:" + e.getMessage());
				System.out.println("setkGWTestBox Exception trying to set text <"+text+"> for element <"+gwTextBox.getTagName()+">");
			}
			findAttempts++;
		}
	}
	
	
public static void setGWTextBoxWithPreWait(WebDriver driver, String text, WebElement gwTextBox,int waitSecs) {
		
		 sleep(waitSecs);
		 setGWTextBox(driver,text,gwTextBox);
	}

/**
 * these are slightly different - need to click the div first and then fine the input 
 * @param driver
 * @param text
 * @param gwTextBox
 */
public static void setGWTextBoxInTable(WebDriver driver, String text, String locator,String inputLocator) {
	WebElement element=null;
	int findAttempts = 0;
	while (findAttempts < MAX_RETRY_ON_TEXT_INPUT) {
		try {
			
			element = driver.findElement(By.xpath(locator));
			
			//WaitForUtils.waitForElementToBeClickableVariable(driver, gwTextBox,10);
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
			
			sleep(2);
			// the input tag should be available
			element = driver.findElement(By.xpath(inputLocator));
			
			element.clear();
			System.out.println("setGWTextBoxInTable setting:" + text);
			
			element.sendKeys(text);
			break;
		} catch (Exception e) {
			sleep(2);
			// TODO use a logger
			System.out.println("setGWTextBoxInTable Exception caught:" + e.getMessage());
			System.out.println("setGWTextBoxInTable Exception trying to set text <"+text+"> for element <"+element.getTagName()+">");
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
				WaitForUtils.waitForElementToBeClickableVariable(driver, gwDropDown,5); //10 seconds max
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

		String lowerCaseOption = option.toLowerCase();
		//optionLocator = "//li[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'" + lowerCaseOption + "')]";
		optionLocator = "//li[translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz') = \"" + lowerCaseOption + "\"]";

		
		/*if (caseSensitive)
		{
			// need to use double quotes in case therea re any single quotes in the locator text
			//optionLocator = "//li[contains(text(),\"" + option + "\")]";
			optionLocator = "//li[normalize-space()=\"" + option + "\"]";
		}
		else
		{
			//TODO 
			//optionLocator = "//li[contains(text(),\"" + option + "\")]";
			String lowerCaseOption = option.toLowerCase();
			optionLocator = "//li[contains(translate(normalize-space(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'" + lowerCaseOption + "')]";
		}*/
		
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
				System.out.println("element size is :"+elements.size());
				occurrence = elements.size();
				optionElement = elements.get(occurrence -1);
			}
			else {
				optionElement = elements.get(occurrence -1);
				}
			
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
				WaitForUtils.waitForElementToBeClickableVariable(driver, picker,5);
				// as it might be down the page, always scroll into view
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", picker);
				picker.click();
				sleep(1);
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
				WaitForUtils.waitForElementToBeClickableVariable(driver, pickerOption,10);
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
	
	public static String getSelectedValueFromGWDropdown(WebDriver driver, WebElement gwDropdown,int initialWait) {
		String selectedValue="";
		int findAttempts = 0;
		sleep(initialWait); // wait for a dropdown to be refreshed
		while (findAttempts < MAX_RETRY_ON_GETVALUE) {
			try {
			//	WaitForUtils.waitForElementToBeVisible(driver, gwDropdown);
				
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwDropdown);
				selectedValue = gwDropdown.getAttribute("value");
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("getSelectedValueFromGWDropdown Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}
		return selectedValue;
	}
	
	/**
	 * For accessing popup menus where user will drill down to the lower menu item
	 * @param driver
	 * @param menuHierarchy
	 * @param gwDropDown
	 */
	public static void selectOptionFromPopupMenu(WebDriver driver, List<String> menuHierarchy, WebElement gwDropDown) {
		int findAttempts = 0;
		while (findAttempts < MAX_RETRY_ON_DROPDOWN) {
			try {
				WaitForUtils.waitForElementToBeClickableVariable(driver, gwDropDown,5); //10 seconds max
				// as it might be down the page, always scroll into view
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwDropDown);
				gwDropDown.click();
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("selectOptionFromPopupMenu Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}

		
		// we need to loop round the list of items in the supplied hierarchy
		// finding each and clicking on each until the list is exhausted
		String optionLocator; 
		WebElement menuElement = null;
		
		for (String menuItem: menuHierarchy)
		{
			optionLocator = "//span[normalize-space()=\"" + menuItem + "\"]";
			menuElement = driver.findElement(By.xpath(optionLocator));
			findAttempts = 0;
			while (findAttempts < MAX_RETRY_ON_MENUITEM) {
				try {
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(true);", menuElement);
					menuElement.click();
					break;
				} catch (Exception e) {
					sleep(1);
					// TODO use a logger
					System.out.println("selectOptionFromPopupMenu (option) Exception caught:" + e.getMessage());
				}
				findAttempts++;
			}
			
		}
			
		
		

		
	}
	
	/**
	 * In progress work - the current menu hierarchy stuff for actions doesnt cater for duplicate submenu items
	 * This is a start to address that - so far it will limit to finidng withn the top parent (e.g. New Activity)
	 * @param driver
	 * @param menuHierarchy
	 * @param gwTopMenu
	 * @param parentElementIdPart
	 */
	public static void selectOptionFromPopupMenuForParent(WebDriver driver, List<String> menuHierarchy, WebElement gwTopMenu,String parentElementIdPart) {
		int findAttempts = 0;
		while (findAttempts < MAX_RETRY_ON_DROPDOWN) {
			try {
				WaitForUtils.waitForElementToBeClickableVariable(driver, gwTopMenu,5); //10 seconds max
				// as it might be down the page, always scroll into view
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", gwTopMenu);
				gwTopMenu.click();
				break;
			} catch (Exception e) {
				sleep(1);
				// TODO use a logger
				System.out.println("selectOptionFromPopupMenu Exception caught:" + e.getMessage());
			}
			findAttempts++;
		}

		
		// we need to loop round the list of items in the supplied hierarchy
		// finding each and clicking on each until the list is exhausted
		String optionLocator; 
		List<WebElement> menuElements = null;
		WebElement menuElement=null;
				
		for (String menuItem: menuHierarchy)
		{
			menuElement=null;
			menuElements = null;
			optionLocator = "//span[normalize-space()=\"" + menuItem + "\"]";
			menuElements = driver.findElements(By.xpath(optionLocator));
			// the element found must match the partial parent id (eg Claim:ClaimMenuActions:ClaimMenuActions_NewActivity:NewActivityMenuItemSet)
			for (WebElement foundMenuItem: menuElements)
			{
				String id =foundMenuItem.getAttribute("id");
				if (id.startsWith(parentElementIdPart))
				{
					menuElement = foundMenuItem;
					break;
				}
			}
			
			
			findAttempts = 0;
			while (findAttempts < MAX_RETRY_ON_MENUITEM) {
				try {
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(true);", menuElement);
					menuElement.click();
					break;
				} catch (Exception e) {
					sleep(1);
					// TODO use a logger
					System.out.println("selectOptionFromPopupMenu2 (option) Exception caught:" + e.getMessage());
				}
				findAttempts++;
			}
			
		}
			
		
		

		
	}

}
