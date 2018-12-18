package com.big.automation.selenium_webdriver.claimcenter.pages;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterNavigatorBarPOM extends BaseTest {
	
	


	@FindBy(xpath = "//span[@class='x-tree-node-text ']")
	private List<WebElement> navigationLinks;

	
	

	public String getName() {

		return "ClaimCenter Navigator Bar";
	}

	

	
    public void clickTopLevelLossDetails() throws Exception {
    	logger.info(format("%s - done, going to click Navigator", getName()));
    	
    	for (WebElement option : navigationLinks) {
    		
    		String Str = "Loss Details";
    		

    		if(Str.equalsIgnoreCase(option.getText())){
    		    GuideWireAccessors.clickGWButton(driver, option); 
    		    logger.info(format("%s - done, clicked navigator", getName()));
    		   break;
    		}
    	}
		
	}

	


	

	

}