package com.big.automation.selenium_webdriver.common.utilities;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.DecimalFormat;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

public class PriceCompareUtils {


   public static void checkPriceAfterAddonSelected(ExtentTest logger, WebDriver webDriver, WebElement premiumElement, WebElement addonButton, Float addonValueF) throws Exception {


      String price = premiumElement.getText();
      Float floatPrice = Float.parseFloat(price);
      Float floatPriceWithAddon = floatPrice + addonValueF;
      DecimalFormat df = new DecimalFormat("0.00");
      df.setMaximumFractionDigits(2);
      String stringAddonPrice = df.format(addonValueF);
      String stringPriceWithAddon = df.format(floatPriceWithAddon);

      WaitForUtils.waitForElementToBeClickable(webDriver, addonButton);
      addonButton.click();
      sleep(2);
      WaitForUtils.waitForElementToBeClickable(webDriver, addonButton);
      sleep(2);
      WaitForUtils.waitForElementToBeClickable(webDriver, addonButton);
      sleep(2);

      String newScreenPrice = premiumElement.getText();

      if (newScreenPrice.equals(stringPriceWithAddon)) {
         logger.log(Status.INFO, "Price before Add-on selected/deselected, " + price);
         logger.log(Status.INFO, "Add-on adjustment value, " + stringAddonPrice + ". Prices Match, expected value " + stringPriceWithAddon + ", returned value " + newScreenPrice);
         System.out.println("Prices Match, expected value " + stringPriceWithAddon + ", returned value " + newScreenPrice);


      } else {
         logger.log(Status.INFO, "Price before Add-on selected/deselected -" + price);
         logger.log(Status.FAIL, "Add-on adjustment value, " + stringAddonPrice + ". Prices do not Match, expected price " + stringPriceWithAddon + ", returned price " + newScreenPrice);
         System.out.println("Expected price is " + stringPriceWithAddon + ", but price on screen shows as " + newScreenPrice);
         throw new Exception("Expected price is " + stringPriceWithAddon + ", but price on screen shows as " + newScreenPrice);
      }
   }

}