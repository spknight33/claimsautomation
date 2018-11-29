package com.big.automation.selenium_webdriver.common.utilities;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoggerUtils {

   public static void logCallerClassName(ExtentTest logger) {

      //does not work when added to base class, as base class will be the caller.

      String callerClassName = new Exception().getStackTrace()[1].getClassName();
      String[] splitClassName = callerClassName.split("\\.");
      String onlyCallerClassName = splitClassName[splitClassName.length-1];
      logger.log(Status.INFO, "The Test Class Name is - " + onlyCallerClassName);
   }
}


