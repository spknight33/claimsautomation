package com.big.automation.selenium_webdriver.common.utilities;


import org.openqa.selenium.WebElement;

public class VerifyTextUtil {

   public static void verifyTextInElement(WebElement webElement, String value) throws Exception {

      String textValue = webElement.getText();
      if (textValue.equals(value)) {
         System.out.println("Text values match, expected text '" + value +"', text returned from element '" + textValue + "'.");
      } else {
         String verifyTextInElementErrorString =  "ERROR - text should be - '" + value + "', but actual text was -  '" + textValue + "'";
         System.out.println(verifyTextInElementErrorString);
         throw new Exception(verifyTextInElementErrorString);
      }

   }

   public static void verifyTextNotInElement(WebElement webElement, String value) throws Exception {

      String textValue = webElement.getText();
      if (!textValue.equals(value)) {
         System.out.println("Text is correctly not present, text searched for, '" + value +"'.");
      } else {
         String verifyTextInElementErrorString =  "ERROR - text is showing when is should not be - text searched for in element '" + value + "', text found in element -  '" + textValue + "'";
         System.out.println(verifyTextInElementErrorString);
         throw new Exception(verifyTextInElementErrorString);
      }

   }
}


