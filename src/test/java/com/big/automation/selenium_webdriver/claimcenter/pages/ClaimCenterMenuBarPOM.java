package com.big.automation.selenium_webdriver.claimcenter.pages;


import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

public class ClaimCenterMenuBarPOM extends BaseTest {

  // private final WebDriver webDriver;

  // @FindBy(id = "TabBar:ClaimTab-btnIconEl")
  // @FindBy(id = "TabBar:ClaimTab-btnEl")
   @FindBy(id = "TabBar:ClaimTab-btnEl")
   private WebElement claimsMenuDropdown;

   @FindBy(id = "TabBar:ClaimTab:ClaimTab_FNOLWizard-textEl")
   private WebElement newClaimMenuOption;


   @FindBy(id = "Login:LoginScreen:LoginDV:username-inputEl")
   private WebElement loginUsername;
   
   @FindBy(id = "Desktop:DesktopMenuActions-btnEl")
   private WebElement desktopActionLink;

 // //*[@id="TabBar:ClaimTab-btnEl"]//following-sibling::*
   @FindBy(id = ":TabLinkMenuButton-btnEl")
   private WebElement settingsMenu;
   
   
   @FindBy(id = "TabBar:LogoutTabBarLink-itemEl")
   private WebElement logoutMenuOption;


   //public ClaimCenterMenuBarPOM(WebDriver webDriver) {

    //  this.webDriver = webDriver;//

    //  AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(webDriver, 60);
   //   PageFactory.initElements(ajaxElementLocatorFactory, this);
  // }

   public String getName() {

      return "ClaimCenter Menubar";
   }


   public void selectClaimsMenu() {

	      WebElement claimsDropDown =  getClaimsDropdown();
	      //claimsDropDown.click();
	      //sleep(2);
	      //((JavascriptExecutor)driver).executeScript("return window.getComputedStyle(arguments[0], ':after').click",claimsDropDown);

	      // use the down arrow key
	      claimsDropDown.sendKeys(Keys.DOWN,Keys.ENTER);
	      
	      Actions actions = new Actions(driver);
	      actions.moveToElement(claimsDropDown);
	      actions.click();
	      actions.sendKeys(Keys.DOWN);
	      actions.sendKeys(Keys.ENTER);
	      actions.build().perform();
	      //newClaimMenuOption.click();
	      logger.info(format("%s - done, New Claims menubar clicked", getName()));
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
	   sleep(4);
	   this.getLogoutMenuOption().click();
	   logger.info(format("%s - done, logout menu option clicked", getName()));
	   sleep(4);
	   
   }
   
   public WebElement getClaimsDropdown() {

      return claimsMenuDropdown;
   }


private WebElement getSettingsMenu() {
	return settingsMenu;
}


private WebElement getLogoutMenuOption() {
	return logoutMenuOption;
}

 

}