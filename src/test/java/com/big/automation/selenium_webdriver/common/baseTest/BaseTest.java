package com.big.automation.selenium_webdriver.common.baseTest;


import static com.big.automation.selenium_webdriver.common.utilities.ScreenshotUtils.capture;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterCompanyDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterFNOLDriverDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterFNOLPedestrianDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterFNOLStep1POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterFNOLStep2POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterFNOLStep3POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterFNOLStep4POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterLoginPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterMenuBarPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterNavigatorBarPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterPersonDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterPropertyDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterSearchAddressBookPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.ClaimCenterFNOLVehicleDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.ClaimCenterPOSTFNOLLossDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.ClaimCenterPOSTFNOLNewInjuryPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.ClaimCenterPOSTFNOLNewPropertyPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.ClaimCenterPOSTFNOLPedestrianDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.ClaimCenterPOSTFNOLVehicleDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterData;
import com.big.automation.selenium_webdriver.claimcenter.testdata.ClaimCenterDataBuilder;
import com.big.automation.selenium_webdriver.common.extent_reports.ExtentManager;
import com.big.automation.selenium_webdriver.common.rules.ScreenshotTestRule;
import com.big.automation.selenium_webdriver.common.rules.WebDriverRule;
import com.big.automation.selenium_webdriver.common.utilities.ScreenshotUtils;
import com.big.automation.selenium_webdriver.common.utilities.TimeStampUtils;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@Listeners(com.big.automation.selenium_webdriver.common.testlistener.TestListener.class)

public class BaseTest extends AbstractTestNGCucumberTests{

   public static ITestResult result;
   public static WebDriverRule webDriverRule;
   public static ExtentHtmlReporter htmlReporter;
   public static ExtentReports extent;
   public static ExtentTest logger;
   public static ScreenshotTestRule screenshotTestRule;
   public static RemoteWebDriver driver;
   
   public static ClaimCenterData testDataset;
  
   
   
   public static ClaimCenterLoginPOM loginPOM;
   public static ClaimCenterMenuBarPOM menuBarPOM;
   public static ClaimCenterNavigatorBarPOM navigatorBarPOM;
   public static ClaimCenterFNOLStep1POM fnolStep1POM;
   public static ClaimCenterFNOLStep2POM fnolStep2POM;
   public static ClaimCenterFNOLStep3POM fnolStep3POM;
   public static ClaimCenterFNOLStep4POM fnolStep4POM;
   public static ClaimCenterFNOLPedestrianDetailsPOM fnolPedestrianPOM;
   public static ClaimCenterFNOLVehicleDetailsPOM fnolVehicleDetailsPOM;
   public static ClaimCenterFNOLDriverDetailsPOM fnolDriverDetailsPOM;
   public static ClaimCenterPersonDetailsPOM personContactDetailsPOM;
   public static ClaimCenterPropertyDetailsPOM fnolPropertyDetailsPOM;
   public static ClaimCenterPOSTFNOLLossDetailsPOM postFnolLossDetailsPOM;
   public static ClaimCenterPOSTFNOLNewPropertyPOM postFnolNewPropertyPOM;
   public static ClaimCenterPOSTFNOLNewInjuryPOM postFnolNewInjuryPOM;
   public static ClaimCenterPOSTFNOLPedestrianDetailsPOM postFnolPedestrianPOM;
   public static ClaimCenterPOSTFNOLVehicleDetailsPOM postFnolVehicleDetailsPOM;
   public static ClaimCenterCompanyDetailsPOM companyContactDetailsPOM;
   public static ClaimCenterSearchAddressBookPOM searchAddressBookPOM;
   
 
   

   @BeforeTest(timeOut = 30000)
   public void beforeTest() {
      //For extent reports
	  System.out.println("TestNG @beforeTest in BaseTest - creating Extent folder and instance");
      File OutputFolder = new File("./target/extent");
      if (!OutputFolder.exists()) {
         if (OutputFolder.mkdir()) {
            System.out.println("Directory is created!");
         } else {
            System.out.println("Failed to create Directory");
         }
      } else {
         System.out.println("Directory already exists");
      }
      String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
      htmlReporter = new ExtentHtmlReporter("./target/extent/STMExtentReport.html");
      extent = ExtentManager.GetExtent();
      extent.attachReporter(htmlReporter);
      htmlReporter.config().setChartVisibilityOnOpen(true);
      htmlReporter.config().setDocumentTitle("Smoke Tests");
      htmlReporter.config().setReportName("Smoke Tests Report");
      htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
      htmlReporter.config().setTheme(Theme.DARK);
   }


   @BeforeClass(timeOut = 50000)
   public void browserConfig() {
	   System.out.println("TestNG @beforeClass in BaseTest - creating Webdriver instance and POMs");
      int count = 0;
      int maxTries = 5;
      while (true) {
         try {
            System.out.println("Starting Browser Config Setup");
            //driver.findElement(By.id("lkdjgksdgj"));
            webDriverRule = new WebDriverRule();
            driver = webDriverRule.getDriver();
            //logger = new LoggerRule().getLogger();
            Dimension dimension = new Dimension(1800, 1200);
            driver.manage().window().setSize(dimension);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            // disable the exit alert - deosnt work
            //driver.executeScript("window.onbeforeunload = function() {};");
            System.out.println("Browser Config Setup Complete");
            break;
         } catch (Exception e) {
            //sleep(2);
            System.out.println("This test failed to start after 5 attempts");
            if (++count == maxTries) {
               logger.log(Status.SKIP, "This test failed to start after 5 attempts");
               extent.flush();
               throw e;
            }
         }
      }
   
     
     //AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver, 60);
      loginPOM = PageFactory.initElements(driver, ClaimCenterLoginPOM.class);
      menuBarPOM = PageFactory.initElements(driver, ClaimCenterMenuBarPOM.class);
      navigatorBarPOM = PageFactory.initElements(driver, ClaimCenterNavigatorBarPOM.class);
      fnolStep1POM = PageFactory.initElements(driver, ClaimCenterFNOLStep1POM.class);
      fnolStep2POM = PageFactory.initElements(driver, ClaimCenterFNOLStep2POM.class);
      fnolStep3POM = PageFactory.initElements(driver, ClaimCenterFNOLStep3POM.class);
      fnolStep4POM = PageFactory.initElements(driver, ClaimCenterFNOLStep4POM.class);
      fnolPedestrianPOM= PageFactory.initElements(driver, ClaimCenterFNOLPedestrianDetailsPOM.class);
      
      fnolVehicleDetailsPOM= PageFactory.initElements(driver, ClaimCenterFNOLVehicleDetailsPOM.class);
      fnolDriverDetailsPOM= PageFactory.initElements(driver, ClaimCenterFNOLDriverDetailsPOM.class);
      personContactDetailsPOM= PageFactory.initElements(driver, ClaimCenterPersonDetailsPOM.class);  
      fnolPropertyDetailsPOM= PageFactory.initElements(driver, ClaimCenterPropertyDetailsPOM.class);  
     
      postFnolLossDetailsPOM= PageFactory.initElements(driver, ClaimCenterPOSTFNOLLossDetailsPOM.class); 
      postFnolNewPropertyPOM= PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewPropertyPOM.class);
      postFnolNewInjuryPOM= PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewInjuryPOM.class);
      postFnolPedestrianPOM= PageFactory.initElements(driver, ClaimCenterPOSTFNOLPedestrianDetailsPOM.class);
      postFnolVehicleDetailsPOM= PageFactory.initElements(driver, ClaimCenterPOSTFNOLVehicleDetailsPOM.class);
      

      
      companyContactDetailsPOM= PageFactory.initElements(driver, ClaimCenterCompanyDetailsPOM.class);
      searchAddressBookPOM= PageFactory.initElements(driver, ClaimCenterSearchAddressBookPOM.class);
      
      
      // TODO - for now 
      this.testDataset = ClaimCenterDataBuilder.createDataSet();
		
      
   }

   

   @AfterMethod(timeOut = 30000, alwaysRun = true)
   public void afterMethod(ITestResult result) throws IOException {
	   System.out.println("TestNG @bafterMethod in BaseTest - capture screen shot if pass or fail");
	   
	   // we may get a leave page message, so accept at end of test
	   //try {
	   //driver.manage().deleteAllCookies();
	  // driver.switchTo().alert().accept();
	  // }
	   //catch(NoAlertPresentException e) {}
	   
	   
      if (result.getStatus() == ITestResult.FAILURE) {
         logger.log(Status.FAIL, "This Test Failed - See Below");
         sleep(2);
         System.out.println("Starting After Method");
         System.out.println("Starting After Method");
         JavascriptExecutor js = (JavascriptExecutor) driver;

         try {int contentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
         Dimension fullWindowHeight = new Dimension(1300, contentHeight);
         driver.manage().window().setSize(fullWindowHeight);
         sleep(1);}
         catch (Exception failWindowSize){}

         String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
         String screenShotName = result.getName() + "- part " + timeStamp;
         String screenShotPath = capture(driver, screenShotName);
         logger.log(Status.FAIL, "Failed step screenshot part " + screenShotName, MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
         Dimension dimensionRestored = new Dimension(1300, 700);
         driver.manage().window().setSize(dimensionRestored);
         //Above is a test

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
				String screenShotName = result.getName() + "- part " + screenshotReportNumber + " - " + timeStamp;
				String screenShotPath = capture(driver, screenShotName);
				logger.log(Status.FAIL, "Failed step screenshot part " + screenshotNumber + " : " + screenShotName, MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
				js.executeScript("window.scrollBy(0,600)");
				standardHeight = new Integer(standardHeight + 600);
				++screenshotNumber;
				System.out.println("Screenshot down to height " + standardHeight);
				sleep(2);
			}
			*/
         logger.log(Status.FAIL, result.getThrowable());
         //logger.log(Status.FAIL, "Snapshot below: " + logger.addScreenCaptureFromPath(screenShotPath));
         System.out.println("After Method");
         System.out.println("Entering screenshot script from failed test");
         ///Below 3 lines only needed for the old Junit report
         ScreenshotUtils.screenshotOnFailForSureFireReports(result, driver);
         sleep(2);
      }
      //SCREENSHOT ON PASS -
      //
      //***********JENKINS****************************************************
      //*********If Jenkins Hangs May Need to Remove screenshot on success****
      if (result.getStatus() == ITestResult.SUCCESS) {
         logger.log(Status.PASS, "Test Execution Complete.");
         sleep(2);

         //this is a test
         System.out.println("Starting After Method");
         JavascriptExecutor js = (JavascriptExecutor) driver;
         int contentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
         Dimension fullWindowHeight = new Dimension(1300, contentHeight);
         driver.manage().window().setSize(fullWindowHeight);
         sleep(1);
         //Above is a test

         String finalScreenshotTimeStamp = TimeStampUtils.createTimeStamp("HHmmss-ddMMyyyy");
         String finalScreenShotName = "Screenshot -";
         String screenShotPath = capture(driver, finalScreenShotName + finalScreenshotTimeStamp);
         logger.log(Status.PASS, finalScreenShotName + finalScreenshotTimeStamp, MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());

         //this is a test
         Dimension dimensionRestored = new Dimension(1300, 700);
         driver.manage().window().setSize(dimensionRestored);
         //Above is a test

         System.out.println("After Method complete");
         System.out.println("Final screenshot added");
         sleep(2);
      }
      
  
     
   }


   @AfterTest(timeOut = 30000, alwaysRun = true)
   public void afterTest() {
	   System.out.println("TestNG @afterTest in BaseTest - close webdriver");
      System.out.println("Starting afterTest method");
      String className = this.getClass().getSimpleName();
      logger.log(Status.INFO, "The Test Class Name is - " + className);
      extent.flush();
      sleep(2);
  
      //((JavascriptExecutor)driver).executeScript("window.onbeforeunload = null;");
      driver.quit();
      //driver.switchTo().alert().accept();
      System.out.println("afterTest method complete");
   }

  /// @AfterClass()
  // public void AfterClass() {
	//   driver.switchTo().alert().accept();
   //}

private static RemoteWebDriver getDriver() {
	return driver;
}
   
   
   
}