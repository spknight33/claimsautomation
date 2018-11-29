package com.big.automation.selenium_webdriver.common.utilities;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class LoopUtils {


   public static void liveSmokeTestLoopCatchBlock(WebDriver driver, ExtentTest logger, ITestResult result, int i, Exception e) throws Exception {

      if (i <= 2) {
         logger.log(Status.WARNING, "Failed test at attempted number " + i);
         ScreenshotUtils.fullScreenCapture(driver, logger, result);
         logger.log(Status.WARNING, ExceptionUtils.getStackTrace(e));
      }
      if (i == 3) {
         logger.log(Status.FAIL, "This test failed on the 3rd and final attempted.");
         throw e;
      }
      driver.quit();
      System.out.println("Quitting browser after failed test.");
      BaseTest baseTest = new BaseTest();
      baseTest.beforeTest();
      baseTest.browserConfig();
      logger.log(Status.WARNING, "Restarting test...");
   }

}
