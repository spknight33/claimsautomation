package com.big.automation.selenium_webdriver.common.utilities;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;


public class ScreenshotUtils {

   //this is the base screen capture method
   public static String capture(WebDriver driver, String screenShotName) throws IOException {

      TakesScreenshot ts = (TakesScreenshot) driver;
      File source = ts.getScreenshotAs(OutputType.FILE);
      String dest = "target/extent/screenshots/" + screenShotName + ".png";
      File destination = new File(dest);
      FileUtils.copyFile(source, destination);
      String loctionForReport = "screenshots/" + screenShotName + ".png";
      return loctionForReport;
   }

   public static void captureScreenshotMidTest(WebDriver driver, ExtentTest logger, String screenShotName) throws Exception {

      captureScreenshotMidTestFullPage(driver, logger, "result -");
        /*
        driver.manage().window().maximize();
        sleep(1);
        String screenShotPath = capture(driver, screenShotName + "-" + TimeStampUtils.createTimeStamp("HHmmss-ddMMyyyy"));
        logger.log(Status.INFO,  screenShotName + "-" + TimeStampUtils.createTimeStamp("HHmmss-ddMMyyyy"), MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
        Dimension dimensionRestored = new Dimension(1300, 700);
        driver.manage().window().setSize(dimensionRestored);
        sleep(1);
        */
   }

   public static void captureScreenshotMidTestFullPage(WebDriver driver, ExtentTest logger, String screenShotName) throws Exception {

      JavascriptExecutor js = (JavascriptExecutor) driver;
      int contentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
      Dimension fullWindowHeight = new Dimension(1300, contentHeight);
      driver.manage().window().setSize(fullWindowHeight);
      sleep(1);
      String screenShotPath = capture(driver, screenShotName + "-" + TimeStampUtils.createTimeStamp("HHmmss-ddMMyyyy"));
      logger.log(Status.INFO, screenShotName + "-" + TimeStampUtils.createTimeStamp("HHmmss-ddMMyyyy"), MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
      Dimension dimensionRestored = new Dimension(1300, 700);
      driver.manage().window().setSize(dimensionRestored);
      sleep(2);
   }


   public static void fullScreenCapture(WebDriver driver, ExtentTest logger, ITestResult result) throws Exception {

      captureScreenshotMidTestFullPage(driver, logger, "result - ");

        /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int contentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
        System.out.println("Page height - " + contentHeight);
        int standardHeight = 0;
        int screenshotNumber = 1;
        js.executeScript("window.scrollTo(0, 0);");

        while (contentHeight > standardHeight) {

            String screenshotReportNumber = Integer.toString(screenshotNumber);
            String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
            String screenShotName = "Screenshot part - " + screenshotReportNumber + " - " + timeStamp;
            String screenShotPath = capture(driver, screenShotName);
            logger.log(Status.INFO, "Screenshot part " + screenshotNumber + " : " + screenShotName, MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
            js.executeScript("window.scrollBy(0,600)");
            standardHeight = new Integer(standardHeight + 600);
            ++screenshotNumber;
            System.out.println("Screenshot down to height " + standardHeight);
            sleep(2);
             }
           */
    }



    public static void fullScreenCaptureForYourQuote(WebDriver driver, ExtentTest logger, ITestResult result) throws Exception {
       captureScreenshotMidTestFullPage(driver, logger, "result -");

      /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int contentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
        System.out.println("Page height - " + contentHeight);
        int standardHeight = 0;
        int screenshotNumber = 1;
        js.executeScript("window.scrollTo(0, 0);");

        while (contentHeight > standardHeight) {

            String screenshotReportNumber = Integer.toString(screenshotNumber);
            String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
            String screenShotName = "Screenshot part - " + screenshotReportNumber + " - " + timeStamp;
            String screenShotPath = capture(driver, screenShotName);
            logger.log(Status.INFO, "Screenshot part " + screenshotNumber + " : " + screenShotName, MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
            js.executeScript("window.scrollBy(0,300)");
            standardHeight = new Integer(standardHeight + 300);
            ++screenshotNumber;
            System.out.println("Screenshot down to height " + standardHeight);
            sleep(2);
        }
    */
    }

    public static void screenshotOnFailForSureFireReports(ITestResult testResult, RemoteWebDriver driver) throws IOException {


        String timeStamp = new SimpleDateFormat("HHmmssddMMyyyy").format(new java.util.Date());
        System.out.println(testResult.getStatus());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filename = "target/surefire-reports/html/" + testResult.getName() + timeStamp + ".png";
        //String filename = "target/screenshot/"+ testResult.getName() + timeStandardStamp +  ".png";
        FileUtils.copyFile(scrFile, new File(filename));

        String screen_shot_path = /* "target\\surefire-reports\\html\\" + */
      testResult.getName() + timeStamp + ".png";
      //String screen_shot_path = System.getProperty("user.dir") + "\\target\\screenshot\\"+ testResult.getName() + timeStandardStamp +  ".png";
      System.out.println(screen_shot_path);

      //String filePath = scrFile.toString();
      //String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";;
      //Reporter.log(path);

      //String screen_shot_path = System.getProperty("user.dir") + "\\screen_shot\\filename";
      System.setProperty("org.uncommons.reportng.escape-output", "false");
      Reporter.log("<td><a href='" + screen_shot_path
              + "'><img src='" + screen_shot_path
              + "' height='100' width='100' /></a></td>");
      Reporter.log(testResult.getName());
      System.out.print("This is the name of the failed test " + testResult.getName());

   }

}