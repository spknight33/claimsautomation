package com.big.automation.selenium_webdriver.claimcenter.pages;


import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterLoginPOM extends BaseTest{

   @FindBy(id = "Login:LoginScreen:LoginDV:submit-btnInnerEl")
   private WebElement continueButton;

   @FindBy(id = "title")
   private WebElement titleDropDown;

   @FindBy(id = "Login:LoginScreen:LoginDV:username-inputEl")
   private WebElement loginUsername;

   @FindBy(id = "Login:LoginScreen:LoginDV:password-inputEl")
   private WebElement loginPassword;

   @FindBy(id = "Login:LoginScreen:0")
   private WebElement errorMessage;

   

   public String getName() {

      return "ClaimCenter Login";
   }


   public void next() {

     GuideWireAccessors.clickGWButton(driver, getContinueButton());
      logger.info(format("%s - done, Login clicked", getName()));
   }


   
   public void populateUsername(String username) {
	   logger.info(format("username used for this test is - " + username));
	   GuideWireAccessors.setGWTextBox(driver, username,getUsername());
      logger.info(format("username used for this test is - " + username));
   }
   
   public void populatePassword(String password) {

	   GuideWireAccessors.setGWTextBox(driver,password,getPassword());
	      logger.info(format("password used for this test is - " + password));
	   }

   public String getErrorMessageValue()
   {
	   //TODO - remove sleep
	   sleep(2); 
	   logger.info(format("error message on login is: " + this.getErrorMessage().getText()));
	   return this.getErrorMessage().getText();
   }
   
   public boolean isLoggedOn()
   {
	   //TODO - remove sleep
	   sleep(3);
	   logger.info(format("check if logged on "));
	   boolean loggedon = driver.findElements( By.id("Login:LoginScreen:LoginDV:submit-btnInnerEl") ).size() == 0;
	   return loggedon;
   }


   private WebElement getContinueButton() {

      return continueButton;
   }

  

   public WebElement getUsername() {

      return loginUsername;
   }

   public WebElement getPassword() {

      return loginPassword;
   }


private WebElement getErrorMessage() {
	return errorMessage;
}
   
   


}