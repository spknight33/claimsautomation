package com.big.automation.selenium_webdriver.claimcenter.pages.common;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterMenuBarPOM extends BaseTest {
	
	private static final String DESKTOP = "Desktop";
	private static final String CLAIMS = "Claims";
	private static final String SEARCH = "Search";
	private static final String ADMINISTRATION = "Administration";
	// TODO anymore submenus
	

	// top level menus
	@FindBy(id = "TabBar:DesktopTab-btnEl")
	private WebElement desktopMenu;

	@FindBy(id = "TabBar:ClaimTab-btnEl")
	private WebElement claimsMenu;

	@FindBy(id = "TabBar:SearchTab-btnEl")
	private WebElement searchMenu;

	@FindBy(id = "TabBar:AddressBookTab-btnEl")
	private WebElement addressBookMenu;

	@FindBy(id = "TabBar:DashboardTab-btnEl")
	private WebElement dashboardMenu;

	@FindBy(id = "TabBar:TeamTab-btnEl")
	private WebElement teamMenu;

	@FindBy(id = "TabBar:AdminTab-btnEl")
	private WebElement adminMenu;

	// desktop menuitems
	@FindBy(id = "TabBar:DesktopTab:Desktop_DesktopActivities-textEl")
	private WebElement desktopActivitiesMenuOption;

	@FindBy(id = "TabBar:DesktopTab:Desktop_DesktopClaims-textEl")
	private WebElement desktopClaimsMenuOption;

	@FindBy(id = "TabBar:DesktopTab:Desktop_DesktopExposures-textEl")
	private WebElement desktopExposuresMenuOption;

	@FindBy(id = "TabBar:DesktopTab:Desktop_DesktopSubrogations-textEl")
	private WebElement desktopSubrogationsMenuOption;

	@FindBy(id = "TabBar:DesktopTab:Desktop_DesktopQueuedActivities-textEl")
	private WebElement desktopQueuesMenuOption;

	@FindBy(id = "TabBar:DesktopTab:Desktop_BulkPay-textEl")
	private WebElement desktopBulkInvoicesMenuOption;

	// TODO other desktop options- calendar and submenu

	// Claim menuitems
	@FindBy(id = "TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl")
	private WebElement newClaimMenuOption;

	@FindBy(id = "TabBar:ClaimTab:ClaimTab_FindClaim-inputEl")
	private WebElement existingClaimTextBox;
	@FindBy(id = "TabBar:ClaimTab:ClaimTab_FindClaim_Button")
	private WebElement findClaimButton;
	
	
	
	// TODO - search claim menuitem and selection of claim from menu

	// search menuitem options
	@FindBy(id = "TabBar:SearchTab:Search_ActivitySearch-textEl")
	private WebElement searchActivitiesMenuOption;

	@FindBy(id = "TabBar:SearchTab:Search_PaymentSearch-textEl")
	private WebElement searchChecksMenuOption;

	@FindBy(id = "TabBar:SearchTab:Search_RecoverySearch-textEl")
	private WebElement searchRecoveriesMenuOption;

	@FindBy(id = "TabBar:SearchTab:Search_BulkInvoiceSearch-textEl")
	private WebElement searchBulkInvoicesMenuOption;

	@FindBy(id = "TabBar:SearchTab:Search_ClaimSearchesGroup:ClaimSearchesGroup_SimpleClaimSearch-textEl")
	private WebElement searchClaimsSimpleMenuOption;

	// ??
	@FindBy(id = "Desktop:DesktopMenuActions-btnEl")
	private WebElement desktopActionLink;

	// settings icon
	@FindBy(id = ":TabLinkMenuButton-btnEl")
	private WebElement settingsMenu;

	// settings menu items
	@FindBy(id = "TabBar:LogoutTabBarLink-itemEl")
	private WebElement logoutMenuOption;

	
	private Map<String, String> menuItemMap;

	public ClaimCenterMenuBarPOM() {
		menuItemMap = new HashMap<String, String>();
		menuItemMap.put("Desktop".toUpperCase(), "TabBar:DesktopTab-btnEl");
		menuItemMap.put("Claim".toUpperCase(), "TabBar:ClaimTab-btnEl");
		menuItemMap.put("Search".toUpperCase(), "TabBar:SearchTab-btnEl");
		menuItemMap.put("Address Book".toUpperCase(), "TabBar:AddressBookTab-btnEl");
		menuItemMap.put("Dashboard".toUpperCase(), "TabBar:DashboardTab-btnEl");
		menuItemMap.put("Team".toUpperCase(), "TabBar:TeamTab-btnEl");
		menuItemMap.put("Administration".toUpperCase(), "TabBar:AdminTab-btnEl");
		
		// sublevel menus, concatenate topmenu with sub menu name as key
		menuItemMap.put("Desktop".toUpperCase()+"Activities".toUpperCase(), "TabBar:DesktopTab:Desktop_DesktopActivities-textEl");
		menuItemMap.put("Desktop".toUpperCase()+"Claims".toUpperCase(), "TabBar:DesktopTab:Desktop_DesktopClaims-textEl");
		menuItemMap.put("Desktop".toUpperCase()+"Exposures".toUpperCase(), "TabBar:DesktopTab:Desktop_DesktopExposures-textEl");
		menuItemMap.put("Desktop".toUpperCase()+"Subrogations".toUpperCase(), "TabBar:DesktopTab:Desktop_DesktopSubrogations-textEl");
		menuItemMap.put("Desktop".toUpperCase()+"Queues".toUpperCase(), "TabBar:DesktopTab:Desktop_DesktopQueuedActivities-textEl");
		menuItemMap.put("Desktop".toUpperCase()+"Bulk Invoices".toUpperCase(), "TabBar:DesktopTab:Desktop_BulkPay-textEl");
		menuItemMap.put("Search".toUpperCase()+"Activities".toUpperCase(), "TabBar:SearchTab:Search_ActivitySearch-textEl");
		menuItemMap.put("Search".toUpperCase()+"Checks".toUpperCase(), "TabBar:SearchTab:Search_PaymentSearch-textEl");
		menuItemMap.put("Search".toUpperCase()+"Recoveries".toUpperCase(), "TabBar:SearchTab:Search_RecoverySearch-textE1");
		menuItemMap.put("Search".toUpperCase()+"Bulk Invoices".toUpperCase(), "TabBar:SearchTab:Search_BulkInvoiceSearch-textEl");
		//TODO rest of sub menus 
	}

	public String getName() {

		return "ClaimCenter Menubar";
	}

	public boolean menuOnMenuBar(String menuItem) throws Exception {
		boolean onscreen = false;
		logger.info(format("%s - check menuItem on menubar: " + menuItem, getName()));

		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = menuItemMap.get(menuItem.toUpperCase());

		if (locatorId == null)
			throw new Exception("unknown menuItem in menuItemmap map : " + menuItem);

		String xpathLocator = "//span[contains(@id,'" + locatorId + "')]";
		onscreen = driver.findElements(By.xpath(xpathLocator)).size() == 1;

		return onscreen;
	}

	public boolean menuNotOnMenuBar(String menuItem) throws Exception {
		boolean onscreen = false;
		logger.info(format("%s - check menuItem NOT on menubar: " + menuItem, getName()));

		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = menuItemMap.get(menuItem.toUpperCase());

		if (locatorId == null)
			throw new Exception("unknown menuItem in menuItemmap map : " + menuItem);

		String xpathLocator = "//span[contains(@id,'" + locatorId + "')]";
		onscreen = driver.findElements(By.xpath(xpathLocator)).size() == 0;

		return onscreen;
	}
	
	public void clickTopMenu(String menuItem) throws Exception {
		
		
		logger.info(format("%s - click menu item on menubar: " + menuItem, getName()));
		sleep(2);

		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = menuItemMap.get(menuItem.toUpperCase());

		if (locatorId == null)
			throw new Exception("unknown menuItem in menuItemmap map : " + menuItem);

		String xpathLocator = "//span[contains(@id,'" + locatorId + "')]";
		driver.findElement(By.xpath(xpathLocator)).click();
		sleep(2);
		
	}
	
public void clickSubMenu(String topmenu, String submenuitem) throws Exception {
		
	    openTopLevelMenu(topmenu);
	    sleep(2);
	
		logger.info(format("%s - click sub menu item on menubar: " + submenuitem, getName()));
		

		// Will get passed in name that user knows - need to map to xpath id
		String locatorId = menuItemMap.get(topmenu.toUpperCase()+submenuitem.toUpperCase());

		if (locatorId == null)
			throw new Exception("unknown menuItem in menuItemmap map : " + topmenu+submenuitem);

		String xpathLocator = "//span[contains(@id,'" + locatorId + "')]";
		driver.findElement(By.xpath(xpathLocator)).click();

		sleep(2);
	}

	


	private void openTopLevelMenu(String topmenu)
	{
		WebElement topMenu = getTopMenu(topmenu);
		Actions actions = new Actions(driver);
		actions.moveToElement(topMenu);
		actions.click();
		actions.sendKeys(Keys.DOWN);
		actions.build().perform();

		logger.info(format("%s - done, " + topmenu +" top menu opened", getName()));
	}
	
	private WebElement getTopMenu(String topmenu)
	{
		switch (topmenu)
		{
		case (DESKTOP):
		
		   return this.getDesktopMenu();
		  
		case(CLAIMS):
			return this.getClaimsMenu();
		
		case(SEARCH):
			return this.getSearchMenu();
		
		
		case (ADMINISTRATION):
			return this.getAdminMenu();
			
		}
		
		return null;
		
	}
	
	

	public void selectNewClaimMenuItem() {
		openTopLevelMenu(CLAIMS);
		sleep(2);
		
		
		// for some reason, if the user does not have a previous claim, then the key down on top menu doesnt work!
		// In this case a link is on a main page
		// for not check that link exists and lick it other wise se the menu
		List <WebElement> elements = driver.findElements(By.id("NoClaim:NoClaimScreen:NoClaimDV:CreateNewClaim-inputEl"));
		if (elements != null && elements.size() > 0)
		{
		    GuideWireAccessors.clickGWButton(driver, elements.get(0));// should only be one anyway
			logger.info(format("%s - done, New Claims LINK clicked", getName()));
		}
		else
		{
		newClaimMenuOption.click();
		logger.info(format("%s - done, New Claims menuitem clicked", getName()));
		}
	}
	
	public void selectExistingClaim(String claimnumber) {
		openTopLevelMenu(CLAIMS);
		sleep(3);
		this.existingClaimTextBox.sendKeys(claimnumber);
		this.findClaimButton.click();
		logger.info(format("%s - done, Search Claim for claimnumber clicked:"+claimnumber, getName()));
	}
	
	
	

	public void selectSearchClaimSimpleMenuItem() {
		
		// doesnt work, for now just click on the top level search which does the same currently
		//openSearchClaimsSubMenu();
		//searchClaimsSimpleMenuOption.click();
		//logger.info(format("%s - done, Search Claims simple menu item clicked", getName()));
		this.getSearchMenu().click();
		logger.info(format("%s - done, Search menu clicked", getName()));
	}

	// public boolean isDesktopDisplayed()
	// {
	// boolean exists = driver.findElements(
	// By.id("Desktop:DesktopMenuActions-btnEl") ).size() != 0;
	// return exists;
	// }

	public void logout() {
		this.getSettingsMenu().click();
		logger.info(format("%s - done, setting menu link clicked", getName()));
		sleep(1);
		this.getLogoutMenuOption().click();
		logger.info(format("%s - done, logout menu option clicked", getName()));
		sleep(1);

	}

	public WebElement getClaimsMenu() {

		return claimsMenu;
	}

	private WebElement getDesktopActivitiesMenuOption() {
		return desktopActivitiesMenuOption;
	}

	private WebElement getDesktopMenu() {
		return desktopMenu;
	}

	private WebElement getSearchMenu() {
		return searchMenu;
	}

	private WebElement getAdminMenu() {
		return adminMenu;
	}

	private WebElement getSettingsMenu() {
		return settingsMenu;
	}

	private WebElement getLogoutMenuOption() {
		return logoutMenuOption;
	}

	private WebElement getAddressBookMenu() {
		return addressBookMenu;
	}

	private WebElement getDashboardMenu() {
		return dashboardMenu;
	}

	private WebElement getTeamMenu() {
		return teamMenu;
	}

	private WebElement getDesktopClaimsMenuOption() {
		return desktopClaimsMenuOption;
	}

	private WebElement getDesktopExposuresMenuOption() {
		return desktopExposuresMenuOption;
	}

	private WebElement getDesktopSubrogationsMenuOption() {
		return desktopSubrogationsMenuOption;
	}

	private WebElement getDesktopQueuesMenuOption() {
		return desktopQueuesMenuOption;
	}

	private WebElement getDesktopBulkInvoicesMenuOption() {
		return desktopBulkInvoicesMenuOption;
	}

	private WebElement getSearchActivitiesMenuOption() {
		return searchActivitiesMenuOption;
	}

	private WebElement getSearchChecksMenuOption() {
		return searchChecksMenuOption;
	}

	private WebElement getSearchRecoveriesMenuOption() {
		return searchRecoveriesMenuOption;
	}

	private WebElement getSearchBulkInvoicesMenuOption() {
		return searchBulkInvoicesMenuOption;
	}

	private WebElement getSearchClaimsSimpleMenuOption() {
		return searchClaimsSimpleMenuOption;
	}
	
	

}