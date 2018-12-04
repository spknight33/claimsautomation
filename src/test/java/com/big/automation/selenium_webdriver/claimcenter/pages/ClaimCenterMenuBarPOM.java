package com.big.automation.selenium_webdriver.claimcenter.pages;


import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

public class ClaimCenterMenuBarPOM extends BaseTest {

   @FindBy(id = "TabBar:DesktopTab-btnEl")
   private WebElement desktopMenuDropdown;
 
   @FindBy(id = "TabBar:ClaimTab-btnEl")
   private WebElement claimsMenuDropdown;
   
   @FindBy(id = "TabBar:SearchTab-btnEl")
   private WebElement searchMenuDropdown;

   @FindBy(id = "TabBar:AdminTab-btnEl")
   private WebElement adminMenuDropdown;
   
   @FindBy(id = "TabBar:DesktopTab:Desktop_DesktopActivities-itemEl")
   private WebElement desktopActivitiesMenuOption;
   
   //TODO other desktop options
 
   
   @FindBy(id = "TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl")
   private WebElement newClaimMenuOption;
   
   // search menu options
   
   @FindBy(id = "TabBar:SearchTab:Search_ActivitySearch-itemEl")
   private WebElement searchActivitiesMenuOption;
   

   @FindBy(id = "TabBar:SearchTab:Search_ClaimSearchesGroup:ClaimSearchesGroup_SimpleClaimSearch-itemEl")
   private WebElement searchClaimsSimpleMenuOption;
   

   @FindBy(id = "Login:LoginScreen:LoginDV:username-inputEl")
   private WebElement loginUsername;
   
   @FindBy(id = "Desktop:DesktopMenuActions-btnEl")
   private WebElement desktopActionLink;

   @FindBy(id = ":TabLinkMenuButton-btnEl")
   private WebElement settingsMenu;
   
      @FindBy(id = "TabBar:LogoutTabBarLink-itemEl")
   private WebElement logoutMenuOption;


   //public ClaimCenterMenuBarPOM(WebDriver webDriver) {

    //  this.webDriver = webDriver;//

    //  AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(webDriver, 60);
   //   PageFactory.initElements(ajaxElementLocatorFactory, this);
  // }
   
   private Map<String,String> menuItemMap;
	public ClaimCenterMenuBarPOM()
	{
		menuItemMap = new HashMap<String, String>();
		menuItemMap.put("Desktop".toUpperCase(),"TabBar:DesktopTab-btnEl");
		menuItemMap.put("Claim".toUpperCase(),"TabBar:ClaimTab-btnEl");
		menuItemMap.put("Search".toUpperCase(),"TabBar:SearchTab-btnEl");
		menuItemMap.put("Address Book".toUpperCase(),"TabBar:AddressBookTab-btnEl");
		menuItemMap.put("Dashboard".toUpperCase(),"TabBar:DashboardTab-btnEl");
		menuItemMap.put("Team".toUpperCase(),"TabBar:TeamTab-btnEl");
		menuItemMap.put("Administration".toUpperCase(),"TabBar:AdminTab-btnEl");
	}

   public String getName() {

      return "ClaimCenter Menubar";
   }

   
   public boolean menuOnMenuBar(String menuItem) throws Exception
	{
		boolean onscreen = false;
		logger.info(format("%s - check menuItem on menubar: "+menuItem, getName()));
		
		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = menuItemMap.get(menuItem.toUpperCase());
		
		
		if (locatorId == null )
			throw new Exception("unknown menuItem in menuItemmap map : "+ menuItem);
		
		String xpathLocator = "//span[contains(@id,'" + locatorId + "')]";
		onscreen = driver.findElements( By.xpath(xpathLocator) ).size() == 1;
		
		return onscreen;
	}
   
   public boolean menuNotOnMenuBar(String menuItem) throws Exception
	{
		boolean onscreen = false;
		logger.info(format("%s - check menuItem NOT on menubar: "+menuItem, getName()));
		
		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = menuItemMap.get(menuItem.toUpperCase());
		
		
		if (locatorId == null )
			throw new Exception("unknown menuItem in menuItemmap map : "+ menuItem);
		
		String xpathLocator = "//span[contains(@id,'" + locatorId + "')]";
		onscreen = driver.findElements( By.xpath(xpathLocator) ).size() == 0;
		
		return onscreen;
	}

   private void openSearchMenu() {

	      WebElement searchDropDown =  getSearchMenuDropdown();
	      Actions actions = new Actions(driver);
	      actions.moveToElement(searchDropDown);
	      actions.click();
	      actions.click();
	      actions.sendKeys(Keys.DOWN);
	      actions.build().perform();
	      
	      logger.info(format("%s - done, Search menu opened", getName()));
}
   
   private void openSearchClaimsSubMenu() {

	      WebElement searchDropDown =  getSearchMenuDropdown();
	      Actions actions = new Actions(driver);
	      actions.moveToElement(searchDropDown);
	      actions.click();
	      actions.click(); //have to do this twice
	      actions.sendKeys(Keys.DOWN);
	      actions.sendKeys(Keys.RIGHT); 
	      actions.build().perform();
	      
	      logger.info(format("%s - done, Search claims sub menu opened", getName()));
}
   
   private void openDesktopMenu() {

	      WebElement desktopDropDown =  getDesktopMenuDropdown();
	      Actions actions = new Actions(driver);
	      actions.moveToElement(desktopDropDown);
	      actions.click();
	      actions.sendKeys(Keys.DOWN);
	      actions.build().perform();
	      
	      logger.info(format("%s - done, Desktop menu opened", getName()));
}
   
   private void openAdminMenu() {

	      WebElement adminDropDown =  getAdminMenuDropdown();
	      Actions actions = new Actions(driver);
	      actions.moveToElement(adminDropDown);
	      actions.click();
	      actions.sendKeys(Keys.DOWN);
	      actions.build().perform();
	      logger.info(format("%s - done, Admin menu opened", getName()));
   } 
	 
   
   private void openClaimsMenu() {

	      WebElement claimsDropDown =  getClaimsMenuDropdown();
	      Actions actions = new Actions(driver);
	      actions.moveToElement(claimsDropDown);
	      actions.click();
	      actions.sendKeys(Keys.DOWN);
	      actions.build().perform();
	      
	      logger.info(format("%s - done, Claims menu opened", getName()));
   }
   
   public void selectNewClaimMenuItem()
   {
	      openClaimsMenu();
	      newClaimMenuOption.click();
	      logger.info(format("%s - done, New Claims menuitem clicked", getName()));
	   }
   
   public void selectDesktopActivitiesMenuItem()
   {
	      openDesktopMenu();
	      desktopActivitiesMenuOption.click();
	      logger.info(format("%s - done, Desktop Activites menu item clicked", getName()));
	   }
   
   public void selectSearchActivitiesMenuItem()
   {
	      openSearchMenu();
	      searchActivitiesMenuOption.click();
	      logger.info(format("%s - done, Search Activites menu item clicked", getName()));
	   }
   
   
   public void selectSearchClaimSimpleMenuItem()
   {
	   openSearchClaimsSubMenu();
	   searchClaimsSimpleMenuOption.click();
	      logger.info(format("%s - done, Search Claims simple menu item clicked", getName()));
	   }
   
  
   public WebElement getClaimsDesktopActionLink() {

	      return claimsMenuDropdown;
	   }
   
   //public boolean isDesktopDisplayed()
   //{
	//   boolean exists = driver.findElements( By.id("Desktop:DesktopMenuActions-btnEl") ).size() != 0;
	//   return exists;
  // }
   
   public void logout()
   {
	   this.getSettingsMenu().click();
	   logger.info(format("%s - done, setting menu link clicked", getName()));
	   sleep(1);
	   this.getLogoutMenuOption().click();
	   logger.info(format("%s - done, logout menu option clicked", getName()));
	   sleep(1);
	   
   }
   
   public WebElement getClaimsMenuDropdown() {

      return claimsMenuDropdown;
   }
   
   


private WebElement getDesktopActivitiesMenuOption() {
	return desktopActivitiesMenuOption;
}

private WebElement getDesktopMenuDropdown() {
	return desktopMenuDropdown;
}

private WebElement getSearchMenuDropdown() {
	return searchMenuDropdown;
}

private WebElement getAdminMenuDropdown() {
	return adminMenuDropdown;
}

private WebElement getSettingsMenu() {
	return settingsMenu;
}


private WebElement getLogoutMenuOption() {
	return logoutMenuOption;
}

 

}