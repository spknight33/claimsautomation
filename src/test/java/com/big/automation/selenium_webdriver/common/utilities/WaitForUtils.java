package com.big.automation.selenium_webdriver.common.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

public class WaitForUtils {

   public static boolean waitForValueInElementId(WebDriver webDriver, String elementId, String value) {

      WebDriverWait wait = new WebDriverWait(webDriver, 60);
      wait.until(x -> {
         String textValue = x.findElement(By.id(elementId)).getAttribute("value");
         return value.equals(textValue);
      });
      return false;
   }

   public static void waitForTextInWebElement(WebDriver webDriver, WebElement webElement, String value) {

      WebDriverWait wait = new WebDriverWait(webDriver, 60);
      sleep(1);
      wait.until(ExpectedConditions.textToBePresentInElement(webElement, value));
   }

   public static void waitForTextInElementId(WebDriver webDriver, String elementId, String value) {
      // TODO this shouldn't be needed but getting stale object exception
      WebDriverWait wait = new WebDriverWait(webDriver, 60);
      wait.until(x -> {
         try {
            String textValue = x.findElement(By.id(elementId)).getText();
            return value.equals(textValue);
         } catch (Exception e) {
            return false;
         }
      });
   }

   public static void waitForPartialTextInElementId(WebDriver webDriver, String elementId, String value) {
      // TODO this shouldn't be needed but getting stale object exception
      WebDriverWait wait = new WebDriverWait(webDriver, 60);
      wait.until(x -> {
         try {
            String textValue = x.findElement(By.id(elementId)).getText();
            return textValue.contains(value);
         } catch (Exception e) {
            return false;
         }
      });
   }

   public static void waitForTextInElementIdFor10Seconds(WebDriver webDriver, String elementId, String value) {

      WebDriverWait wait = new WebDriverWait(webDriver, 10);
      wait.until(x -> {
         try {
            String textValue = x.findElement(By.id(elementId)).getText();
            return value.equals(textValue);
         } catch (Exception e) {
            return false;
         }
      });
   }

   public static void waitForTextInElementXpath(WebDriver webDriver, String elementXpath, String value) {

      WebDriverWait wait = new WebDriverWait(webDriver, 60);

      wait.until(x -> {
         try {
            String textValue = x.findElement(By.xpath(elementXpath)).getText();
            return value.equals(textValue);
         } catch (Exception e) {
            return false;
         }
      });
   }

   public static void waitForValueInElementXpath(WebDriver webDriver, String elementXpath, String value) {

      WebDriverWait wait = new WebDriverWait(webDriver, 60);

      wait.until(x -> {
         String textValue = x.findElement(By.xpath(elementXpath)).getAttribute("value");
         return value.equals(textValue);
      });
   }


   public static void waitForElementToBeInvisible(WebDriver webDriver, WebElement webElement) {

      WebDriverWait wait = new WebDriverWait(webDriver, 60);

      wait.until(ExpectedConditions.invisibilityOf(webElement));
   }

   public static void waitForElementToBeVisible(WebDriver webDriver, WebElement webElement) {

      WebDriverWait wait = new WebDriverWait(webDriver, 60);

      wait.until(ExpectedConditions.visibilityOf(webElement));
   }

   public static void waitForElementToBeVisibleVariable (WebDriver webDriver, WebElement webElement, int timeInSeconds) {

      WebDriverWait wait = new WebDriverWait(webDriver, timeInSeconds);

      wait.until(ExpectedConditions.visibilityOf(webElement));
   }

   public static void waitForElementToBeClickable(WebDriver webDriver, WebElement webElement) {

      WebDriverWait wait = new WebDriverWait(webDriver, 60);

      wait.until(ExpectedConditions.elementToBeClickable(webElement));
   }

   public static void waitForElementToBeClickableVariable (WebDriver webDriver, WebElement webElement, int timeOutSeconds) {

      WebDriverWait wait = new WebDriverWait(webDriver, timeOutSeconds);

      wait.until(ExpectedConditions.elementToBeClickable(webElement));
   }

   public static void waitForElementNotToBeClickableVariable (WebDriver webDriver, WebElement webElement, int timeOutSeconds) {

      WebDriverWait wait = new WebDriverWait(webDriver, timeOutSeconds);
      wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(webElement)));

   }

}


