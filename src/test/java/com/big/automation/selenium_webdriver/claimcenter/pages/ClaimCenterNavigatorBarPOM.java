package com.big.automation.selenium_webdriver.claimcenter.pages;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterNavigatorBarPOM extends BaseTest {
	
	
	@FindBy(id = "Claim:ClaimMenuActions-btnEl")
	private WebElement actionsMenu;
	

	@FindBy(xpath = "//span[@class='x-tree-node-text ']")
	private List<WebElement> navigationLinks;

	
	

	public String getName() {

		return "ClaimCenter Navigator Bar";
	}

	

	
    public void clickTopLevel(String toplink) throws Exception {
    	logger.info(format("%s - done, going to click Navigator", getName()));
    	
    	for (WebElement option : navigationLinks) {
    		
    		    		

    		if(toplink.equalsIgnoreCase(option.getText())){
    		    GuideWireAccessors.clickGWButton(driver, option); 
    		    logger.info(format("%s - done, clicked navigator", getName()));
    		   break;
    		}
    	}
		
	}
    
    public void clickDesktopTopLevel(String toplink) throws Exception {
    	logger.info(format("%s - done, going to click desktop Navigator", getName()));
    	
    	for (WebElement option : navigationLinks) {
    		
    		    		
         // desktop links include a count of items, so exclude that
    		if(option.getText().startsWith(toplink)){
    		    GuideWireAccessors.clickGWButton(driver, option); 
    		    logger.info(format("%s - done, clicked navigator", getName()));
    		   break;
    		}
    	}
		
	}
    
    
    public void selectActionsSubMenuHierarchy(List<String> menuHierarchy)
	{
		logger.info(format("%s - going to select Actions sub menu item ",getName()));
		GuideWireAccessors.selectOptionFromPopupMenu(driver, menuHierarchy, this.getActionsMenu());
	}




	private WebElement getActionsMenu() {
		return actionsMenu;
	}




	private List<WebElement> getNavigationLinks() {
		return navigationLinks;
	}
    
    
    

	


	

	

}