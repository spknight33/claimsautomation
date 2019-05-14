package com.big.automation.selenium_webdriver.common.baseTest;

import static com.big.automation.selenium_webdriver.common.utilities.ScreenshotUtils.capture;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import com.big.automation.selenium_webdriver.claimcenter.pages.policycreate.*;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.documents.ClaimCenterPOSTFNOLCreateDocumentFromTemplatePOM;
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
import com.big.automation.selenium_webdriver.claimcenter.pages.claimclose.ClaimCenteClaimClosePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterCompanyDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterInfoBarPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterLoginPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterMenuBarPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterNavigatorBarPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterPersonDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterSearchAddressBookPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterSearchChequesPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterSearchGroupsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.common.ClaimCenterTotalLossCalulatorPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.desktop.ClaimCenterDesktopActivitiesPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.desktop.ClaimCenterDesktopQueuesPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLClaimSavedPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLDriverDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLNewPassengerDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLNewPoliceDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLPedestrianDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLPropertyDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLStep1POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLStep2POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLStep3POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLStep4POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLStep5POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.ClaimCenterFNOLVehicleDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.exposures.ClaimCenterFNOLNewCreditHireExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.exposures.ClaimCenterFNOLNewExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.exposures.ClaimCenterFNOLNewInjuryExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.exposures.ClaimCenterFNOLNewPropertyExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.exposures.ClaimCenterFNOLNewProtocolHireExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.exposures.ClaimCenterFNOLNewTPCaptureExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.exposures.ClaimCenterFNOLNewVehicleExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.fnol.services.ClaimCenterFNOLNewServicePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.activities.ClaimCenterPOSTFNOLNewActivityPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.activities.ClaimCenterPOSTFNOLWorkplanPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.documents.ClaimCenterPOSTFNOLDocumentsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLEditCreditHireExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLEditInjuryExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLEditPropertyExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLEditProtocolHireExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLEditTPCaptureExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLEditVehicleExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLExposuresPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLViewCreditHireExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLViewInjuryExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLViewPropertyExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLViewProtocolHireExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLViewTPCaptureExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures.ClaimCenterPOSTFNOLViewVehicleExposurePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLCreateRecoveryPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLFinancialChequesPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLFinancialSummaryPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLFinancialTransactionsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLNewChequeStep1POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLNewChequeStep2POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLNewChequeStep3POM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLReservePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials.ClaimCenterPOSTFNOLSetReservesPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.fnolsnapshot.ClaimCenterPOSTFNOLFnolSnapshotLossPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.history.ClaimCenterPOSTFNOLHistoryPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.litigation.ClaimCenterPOSTFNOLLitigationPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.associations.ClaimCenterPOSTFNOLLossDetailsAssociationsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLDriverDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLEditPropertyPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLEditVehicleDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLLossDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLNewPoliceDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLNewPropertyPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLNewVehicleDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLPassengerDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general.ClaimCenterPOSTFNOLPedestrianDetailsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.liability.ClaimCenterPOSTFNOLLossDetailsLiabilityPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.siu.ClaimCenterPOSTFNOLLossDetailsSIUPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.notes.ClaimCenterPOSTFNOLNewNotePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.notes.ClaimCenterPOSTFNOLNotesPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.parties.ClaimCenterPOSTFNOLPartiesInvolvedPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.parties.ClaimCenterPOSTFNOLPartiesInvolvedUsersPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.policy.ClaimCenterPOSTFNOLPolicyGeneralPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.policy.ClaimCenterPOSTFNOLPolicyVehiclesPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.services.ClaimCenterPOSTFNOLNewServicePOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.services.ClaimCenterPOSTFNOLServicesPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.summary.ClaimCenterPOSTFNOLSummaryMetricsPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.summary.ClaimCenterPOSTFNOLSummaryPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.summary.ClaimCenterPOSTFNOLSummaryStatusPOM;
import com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.tpcare.ClaimCenterPOSTFNOLTPCarePOM;
import com.big.automation.selenium_webdriver.common.extent_reports.ExtentManager;
import com.big.automation.selenium_webdriver.common.rules.ScreenshotTestRule;
import com.big.automation.selenium_webdriver.common.rules.WebDriverRule;
import com.big.automation.selenium_webdriver.common.utilities.ScreenshotUtils;
import com.big.automation.selenium_webdriver.common.utilities.TimeStampUtils;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@Listeners(com.big.automation.selenium_webdriver.common.testlistener.TestListener.class)

public class BaseTest extends AbstractTestNGCucumberTests {

	public static final String testDataExcelFilename = "testdata.xlsx";

	public static ITestResult result;
	public static WebDriverRule webDriverRule;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static ScreenshotTestRule screenshotTestRule;
	public static RemoteWebDriver driver;
	
	
	//------------------------------------
	
	
	public static ClaimCenterPolicyCenterLoginPOM policyCenterLoginPOM;
	public static ClaimCenterPolicyAccountPOM policyAccountPOM;
	public static ClaimCenterPolicyAccountCreatePOM policyCreateAccountPOM;
	public static ClaimCenterPolicySubmissionStep1POM policyCreateStep1SubmissionPOM;
	public static ClaimCenterPolicySubmissionStep2PolicyInfoPOM policyCreateStep2PolicyInfoPOM;
	public static ClaimCenterPolicySubmissionStep3DriversPOM policyCreateStep3DriversPOM;
	public static ClaimCenterPolicySubmissionStep4VehiclePOM policyCreateStep4VehiclePOM;
	public static ClaimCenterPolicySubmissionStep5QuotePOM policyCreateStep5QuotePOM;
	public static ClaimsCenterPolicyNewDriverPOM policyCreateNewDriverPOM;
	public static ClaimCenterPolicySubmissionPaymentPOM policyCenterPolicySubmissionPaymentPOM;
	
	


	// Authentication/common pages
	// -------------------------------
	public static ClaimCenterLoginPOM loginPOM;
	public static ClaimCenterMenuBarPOM menuBarPOM;
	public static ClaimCenterInfoBarPOM infoBarPOM;
	public static ClaimCenterNavigatorBarPOM navigatorBarPOM;
	public static ClaimCenterPersonDetailsPOM personContactDetailsPOM;
	public static ClaimCenterCompanyDetailsPOM companyContactDetailsPOM;
	public static ClaimCenterSearchAddressBookPOM searchAddressBookPOM;
	public static ClaimCenterTotalLossCalulatorPOM totalLossCalcPOM;
	public static ClaimCenterSearchChequesPOM searchChequesPOM;
	public static ClaimCenterSearchGroupsPOM searchGroupsPOM;
	
	

	// FNOL pages
	// ----------------------------------
	public static ClaimCenterFNOLStep1POM fnolStep1POM;
	public static ClaimCenterFNOLStep2POM fnolStep2POM;
	public static ClaimCenterFNOLStep3POM fnolStep3POM;
	public static ClaimCenterFNOLStep4POM fnolStep4POM;
	public static ClaimCenterFNOLStep5POM fnolStep5POM;
	public static ClaimCenterFNOLClaimSavedPOM fnolClaimSavedPOM;

	public static ClaimCenterFNOLNewPoliceDetailsPOM fnolNewPolicePOM;
	public static ClaimCenterFNOLPedestrianDetailsPOM fnolPedestrianPOM;
	public static ClaimCenterFNOLVehicleDetailsPOM fnolVehicleDetailsPOM;
	public static ClaimCenterFNOLDriverDetailsPOM fnolDriverDetailsPOM;
	public static ClaimCenterFNOLPropertyDetailsPOM fnolPropertyDetailsPOM;
	
	public static ClaimCenterFNOLNewServicePOM fnolNewServicePOM; 

	// FNOL exposures (likely to become redundant once auto generation is done)
	// ----------------------
	public static ClaimCenterFNOLNewExposurePOM fnolNewExposurePOM;
	public static ClaimCenterFNOLNewPropertyExposurePOM fnolNewPropertyExposurePOM;
	public static ClaimCenterFNOLNewInjuryExposurePOM fnolNewInjuryExposurePOM;
	public static ClaimCenterFNOLNewVehicleExposurePOM fnolNewVehicleExposurePOM;
	public static ClaimCenterFNOLNewCreditHireExposurePOM fnolNewCreditHireExposurePOM;
	public static ClaimCenterFNOLNewProtocolHireExposurePOM fnolNewProtocolHireExposurePOM;
	public static ClaimCenterFNOLNewTPCaptureExposurePOM fnolNewTPCaptureExposurePOM;
	public static ClaimCenterFNOLNewPassengerDetailsPOM fnolNewPassengerPOM;

	// POST FNOL Exposures pages
	// --------------------------
	public static ClaimCenterPOSTFNOLExposuresPOM postFnolExposuresPOM;
	public static ClaimCenterPOSTFNOLEditInjuryExposurePOM postFnolEditInjuryExposurePOM;
	public static ClaimCenterPOSTFNOLViewInjuryExposurePOM postFnolViewInjuryExposurePOM;

	public static ClaimCenterPOSTFNOLEditPropertyExposurePOM postFnolEditPropertyExposurePOM;
	public static ClaimCenterPOSTFNOLViewPropertyExposurePOM postFnolViewPropertyExposurePOM;

	public static ClaimCenterPOSTFNOLEditVehicleExposurePOM postFnolEditVehicleExposurePOM;
	public static ClaimCenterPOSTFNOLViewVehicleExposurePOM postFnolViewVehicleExposurePOM;

	public static ClaimCenterPOSTFNOLEditCreditHireExposurePOM postFnolEditCreditHireExposurePOM;
	public static ClaimCenterPOSTFNOLViewCreditHireExposurePOM postFnolViewCreditHireExposurePOM;

	public static ClaimCenterPOSTFNOLEditProtocolHireExposurePOM postFnolEditProtocolHireExposurePOM;
	public static ClaimCenterPOSTFNOLViewProtocolHireExposurePOM postFnolViewProtocolHireExposurePOM;

	public static ClaimCenterPOSTFNOLEditTPCaptureExposurePOM postFnolEditTPCaptureExposurePOM;
	public static ClaimCenterPOSTFNOLViewTPCaptureExposurePOM postFnolViewTPCaptureExposurePOM;

	// POST FNOL Summary pages
	// ------------------------
	public static ClaimCenterPOSTFNOLSummaryPOM postFnolSummaryPOM;
	public static ClaimCenterPOSTFNOLSummaryMetricsPOM postFnolSummaryMetricsPOM;
	public static ClaimCenterPOSTFNOLSummaryStatusPOM postFnolSummaryStatusPOM;

	// POST FNOL Loss details pages
	// ------------------------------
	public static ClaimCenterPOSTFNOLLossDetailsPOM postFnolLossDetailsPOM;
	// TODO other loss details pages

	public static ClaimCenterPOSTFNOLDriverDetailsPOM postFnolDriverPOM;
	public static ClaimCenterPOSTFNOLPassengerDetailsPOM postFnolPassengerPOM;
	public static ClaimCenterPOSTFNOLPedestrianDetailsPOM postFnolPedestrianPOM;

	public static ClaimCenterPOSTFNOLNewPropertyPOM postFnolNewPropertyPOM;
	public static ClaimCenterPOSTFNOLEditPropertyPOM postFnolEditPropertyPOM;

	public static ClaimCenterPOSTFNOLNewVehicleDetailsPOM postFnolNewVehiclePOM;
	public static ClaimCenterPOSTFNOLEditVehicleDetailsPOM postFnolEditVehiclePOM;

	public static ClaimCenterPOSTFNOLNewPoliceDetailsPOM postFnolNewPolicePOM;
	
	public static ClaimCenterPOSTFNOLLossDetailsLiabilityPOM postFnolLossDetailsLiabilityPOM;
	public static ClaimCenterPOSTFNOLLossDetailsAssociationsPOM postFnolLossDetailsAssociationsPOM;
	public static ClaimCenterPOSTFNOLLossDetailsSIUPOM postFnolLossDetailsSIUPOM;
	
	
	

	// POST FNOL Activities pages
	// --------------------------
	public static ClaimCenterPOSTFNOLWorkplanPOM postFnolWorkplanPOM;
	public static ClaimCenterPOSTFNOLNewActivityPOM postFnolNewActivityPOM;

	// POST FNOL notes pages
	// -----------------------
	public static ClaimCenterPOSTFNOLNewNotePOM postFnolNewNotePOM;
	public static ClaimCenterPOSTFNOLNotesPOM postFnolNotesPOM;
	

	// POST FNOL Policy pages
	// -----------------------
	public static ClaimCenterPOSTFNOLPolicyGeneralPOM postFnolPolicyGeneralPOM;
	public static ClaimCenterPOSTFNOLPolicyVehiclesPOM postFnolPolicyVehiclesPOM;

	// POST FNOL Services pages
	// -------------------------
	public static ClaimCenterPOSTFNOLNewServicePOM postFnolNewServicePOM;
	public static ClaimCenterPOSTFNOLServicesPOM postFnolServicesPOM;
	
	//POST FNOL History page
	//---------------------------
	public static ClaimCenterPOSTFNOLHistoryPOM postFnolHistoryPOM;
	

	// POST FNOL Documents pages
	// --------------------------
	public static ClaimCenterPOSTFNOLDocumentsPOM postFnolDocumentsPOM;
	public static ClaimCenterPOSTFNOLCreateDocumentFromTemplatePOM postFnolCreateDocumentFromTemplatePOM;

	// POST FNOL Litigation pages
	// ---------------------------
	public static ClaimCenterPOSTFNOLLitigationPOM postFnolLitigationPOM;

	// POST FNOL parties involved pages
	// --------------------------------
	public static ClaimCenterPOSTFNOLPartiesInvolvedPOM postFnolPartiesInvolvedPOM;
	public static ClaimCenterPOSTFNOLPartiesInvolvedUsersPOM postFnolPartiesInvolvedUsersPOM;

	// FNOL Snapshot pages
	// ---------------------
	public static ClaimCenterPOSTFNOLFnolSnapshotLossPOM postFnolSnapshotPOM;
	// TODO rest of snapshot stuff

	// POST FNOL financials pages
	// -----------------------
	public static ClaimCenterPOSTFNOLFinancialSummaryPOM postFnolFinancialSummaryPOM;
	public static ClaimCenterPOSTFNOLFinancialTransactionsPOM postFnolFinancialTransactionsPOM;
	public static ClaimCenterPOSTFNOLFinancialChequesPOM postFnolFinancialChequesPOM;
	public static ClaimCenterPOSTFNOLReservePOM postFnolReservePOM;
	public static ClaimCenterPOSTFNOLCreateRecoveryPOM postFnolRecoveryPOM;
	
	
	
	public static ClaimCenterPOSTFNOLSetReservesPOM postFnolSetReservesPOM;
	public static ClaimCenterPOSTFNOLNewChequeStep1POM postFnolNewChequeStep1POM;
	public static ClaimCenterPOSTFNOLNewChequeStep2POM postFnolNewChequeStep2POM;
	public static ClaimCenterPOSTFNOLNewChequeStep3POM postFnolNewChequeStep3POM;
	
	//POST FNOL TPC pages
	//---------------------
	public static ClaimCenterPOSTFNOLTPCarePOM postFnolTPCarePOM;
	
	
	//close claim
	//-----------------
	public static ClaimCenteClaimClosePOM closeClaimPOM;
	

	// desktop pages
	// ------------------------
	public static ClaimCenterDesktopQueuesPOM desktopQueuesPOM;
	public static ClaimCenterDesktopActivitiesPOM desktopActivitiesPOM;
	

	@BeforeTest(timeOut = 30000)
	public void beforeTest() {
		// For extent reports
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
				// driver.findElement(By.id("lkdjgksdgj"));
				webDriverRule = new WebDriverRule();
				driver = webDriverRule.getDriver();
				// logger = new LoggerRule().getLogger();
				Dimension dimension = new Dimension(1800, 1200);
				driver.manage().window().setSize(dimension);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				// disable the exit alert - deosnt work
				// driver.executeScript("window.onbeforeunload = function() {};");
				System.out.println("Browser Config Setup Complete");
				break;
			} catch (Exception e) {
				// sleep(2);
				System.out.println("This test failed to start after 5 attempts");
				if (++count == maxTries) {
					logger.log(Status.SKIP, "This test failed to start after 5 attempts");
					extent.flush();
					throw e;
				}
			}
		}

		
		policyCenterLoginPOM = PageFactory.initElements(driver, ClaimCenterPolicyCenterLoginPOM.class);
		policyAccountPOM = PageFactory.initElements(driver, ClaimCenterPolicyAccountPOM.class);
		policyCreateAccountPOM = PageFactory.initElements(driver, ClaimCenterPolicyAccountCreatePOM.class);
		policyCreateStep1SubmissionPOM = PageFactory.initElements(driver, ClaimCenterPolicySubmissionStep1POM.class);
		policyCreateStep2PolicyInfoPOM = PageFactory.initElements(driver, ClaimCenterPolicySubmissionStep2PolicyInfoPOM.class);
		policyCreateStep3DriversPOM = PageFactory.initElements(driver, ClaimCenterPolicySubmissionStep3DriversPOM.class);
		policyCreateStep4VehiclePOM = PageFactory.initElements(driver, ClaimCenterPolicySubmissionStep4VehiclePOM.class);
		policyCreateStep5QuotePOM = PageFactory.initElements(driver, ClaimCenterPolicySubmissionStep5QuotePOM.class);
		policyCreateNewDriverPOM = PageFactory.initElements(driver, ClaimsCenterPolicyNewDriverPOM.class);
		policyCenterPolicySubmissionPaymentPOM = PageFactory.initElements(driver, ClaimCenterPolicySubmissionPaymentPOM.class);
		
		
	
		// AjaxElementLocatorFactory ajaxElementLocatorFactory = new
		// AjaxElementLocatorFactory(driver, 60);
		loginPOM = PageFactory.initElements(driver, ClaimCenterLoginPOM.class);
		menuBarPOM = PageFactory.initElements(driver, ClaimCenterMenuBarPOM.class);
		infoBarPOM = PageFactory.initElements(driver, ClaimCenterInfoBarPOM.class);
		navigatorBarPOM = PageFactory.initElements(driver, ClaimCenterNavigatorBarPOM.class);
		fnolStep1POM = PageFactory.initElements(driver, ClaimCenterFNOLStep1POM.class);
		fnolStep2POM = PageFactory.initElements(driver, ClaimCenterFNOLStep2POM.class);
		fnolStep3POM = PageFactory.initElements(driver, ClaimCenterFNOLStep3POM.class);
		fnolStep4POM = PageFactory.initElements(driver, ClaimCenterFNOLStep4POM.class);
		fnolStep5POM = PageFactory.initElements(driver, ClaimCenterFNOLStep5POM.class);
		fnolClaimSavedPOM = PageFactory.initElements(driver, ClaimCenterFNOLClaimSavedPOM.class);

		fnolPedestrianPOM = PageFactory.initElements(driver, ClaimCenterFNOLPedestrianDetailsPOM.class);
		fnolNewPolicePOM = PageFactory.initElements(driver, ClaimCenterFNOLNewPoliceDetailsPOM.class);
		fnolNewExposurePOM = PageFactory.initElements(driver, ClaimCenterFNOLNewExposurePOM.class);
		fnolNewPropertyExposurePOM = PageFactory.initElements(driver, ClaimCenterFNOLNewPropertyExposurePOM.class);
		fnolNewInjuryExposurePOM = PageFactory.initElements(driver, ClaimCenterFNOLNewInjuryExposurePOM.class);
		fnolNewVehicleExposurePOM = PageFactory.initElements(driver, ClaimCenterFNOLNewVehicleExposurePOM.class);
		fnolNewCreditHireExposurePOM = PageFactory.initElements(driver, ClaimCenterFNOLNewCreditHireExposurePOM.class);
		fnolNewProtocolHireExposurePOM = PageFactory.initElements(driver,
				ClaimCenterFNOLNewProtocolHireExposurePOM.class);
		fnolNewTPCaptureExposurePOM = PageFactory.initElements(driver, ClaimCenterFNOLNewTPCaptureExposurePOM.class);

		fnolVehicleDetailsPOM = PageFactory.initElements(driver, ClaimCenterFNOLVehicleDetailsPOM.class);
		fnolDriverDetailsPOM = PageFactory.initElements(driver, ClaimCenterFNOLDriverDetailsPOM.class);
		personContactDetailsPOM = PageFactory.initElements(driver, ClaimCenterPersonDetailsPOM.class);
		fnolPropertyDetailsPOM = PageFactory.initElements(driver, ClaimCenterFNOLPropertyDetailsPOM.class);

		fnolNewPassengerPOM = PageFactory.initElements(driver, ClaimCenterFNOLNewPassengerDetailsPOM.class);
		
		fnolNewServicePOM = PageFactory.initElements(driver, ClaimCenterFNOLNewServicePOM.class);
		
		

		postFnolExposuresPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLExposuresPOM.class);
		postFnolEditInjuryExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLEditInjuryExposurePOM.class);
		postFnolViewInjuryExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLViewInjuryExposurePOM.class);

		postFnolEditPropertyExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLEditPropertyExposurePOM.class);
		postFnolViewPropertyExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLViewPropertyExposurePOM.class);

		postFnolEditVehicleExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLEditVehicleExposurePOM.class);
		postFnolViewVehicleExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLViewVehicleExposurePOM.class);

		postFnolEditCreditHireExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLEditCreditHireExposurePOM.class);
		postFnolViewCreditHireExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLViewCreditHireExposurePOM.class);

		postFnolEditProtocolHireExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLEditProtocolHireExposurePOM.class);
		postFnolViewProtocolHireExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLViewProtocolHireExposurePOM.class);

		postFnolEditTPCaptureExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLEditTPCaptureExposurePOM.class);
		postFnolViewTPCaptureExposurePOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLViewTPCaptureExposurePOM.class);

		// post fnol summary
		// ------------------
		postFnolSummaryPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLSummaryPOM.class);
		postFnolSummaryMetricsPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLSummaryMetricsPOM.class);
		postFnolSummaryStatusPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLSummaryStatusPOM.class);

		postFnolLossDetailsPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLLossDetailsPOM.class);
		postFnolNewPropertyPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewPropertyPOM.class);
		postFnolNewVehiclePOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewVehicleDetailsPOM.class);

		postFnolPedestrianPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLPedestrianDetailsPOM.class);
		postFnolEditVehiclePOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLEditVehicleDetailsPOM.class);
		postFnolDriverPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLDriverDetailsPOM.class);
		postFnolPassengerPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLPassengerDetailsPOM.class);

		postFnolNewPolicePOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewPoliceDetailsPOM.class);
		postFnolEditPropertyPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLEditPropertyPOM.class);

		companyContactDetailsPOM = PageFactory.initElements(driver, ClaimCenterCompanyDetailsPOM.class);
		searchAddressBookPOM = PageFactory.initElements(driver, ClaimCenterSearchAddressBookPOM.class);
		searchChequesPOM = PageFactory.initElements(driver, ClaimCenterSearchChequesPOM.class);
		searchGroupsPOM = PageFactory.initElements(driver, ClaimCenterSearchGroupsPOM.class);
		
		postFnolLossDetailsLiabilityPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLLossDetailsLiabilityPOM.class);
		postFnolLossDetailsAssociationsPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLLossDetailsAssociationsPOM.class);
		postFnolLossDetailsSIUPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLLossDetailsSIUPOM.class);
		
		postFnolWorkplanPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLWorkplanPOM.class);
		postFnolNewActivityPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewActivityPOM.class);
		postFnolNewNotePOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewNotePOM.class);
		postFnolNotesPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNotesPOM.class);
		

		// services
		postFnolServicesPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLServicesPOM.class);
		postFnolNewServicePOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewServicePOM.class);

		// documents
		postFnolDocumentsPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLDocumentsPOM.class);
		postFnolCreateDocumentFromTemplatePOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLCreateDocumentFromTemplatePOM.class);

		// litigation
		postFnolLitigationPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLLitigationPOM.class);

		// parties involved
		postFnolPartiesInvolvedPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLPartiesInvolvedPOM.class);
		postFnolPartiesInvolvedUsersPOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLPartiesInvolvedUsersPOM.class);

		totalLossCalcPOM = PageFactory.initElements(driver, ClaimCenterTotalLossCalulatorPOM.class);

		desktopQueuesPOM = PageFactory.initElements(driver, ClaimCenterDesktopQueuesPOM.class);
		desktopActivitiesPOM = PageFactory.initElements(driver, ClaimCenterDesktopActivitiesPOM.class);
		

		// policy
		postFnolPolicyGeneralPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLPolicyGeneralPOM.class);
		postFnolPolicyVehiclesPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLPolicyVehiclesPOM.class);

		// snapshot
		postFnolSnapshotPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLFnolSnapshotLossPOM.class);

		// financials
		postFnolFinancialSummaryPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLFinancialSummaryPOM.class);
		postFnolFinancialTransactionsPOM = PageFactory.initElements(driver,
				ClaimCenterPOSTFNOLFinancialTransactionsPOM.class);
		postFnolFinancialChequesPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLFinancialChequesPOM.class);
		postFnolSetReservesPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLSetReservesPOM.class);
		postFnolReservePOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLReservePOM.class);
		postFnolRecoveryPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLCreateRecoveryPOM.class);
		 
		
		postFnolNewChequeStep1POM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewChequeStep1POM.class);
		postFnolNewChequeStep2POM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewChequeStep2POM.class);
		postFnolNewChequeStep3POM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLNewChequeStep3POM.class);
		
		// history
		postFnolHistoryPOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLHistoryPOM.class);
		
		postFnolTPCarePOM = PageFactory.initElements(driver, ClaimCenterPOSTFNOLTPCarePOM.class);
		
		
		
		//close claim
		closeClaimPOM = PageFactory.initElements(driver, ClaimCenteClaimClosePOM.class);
		

	}

	@AfterMethod(timeOut = 30000, alwaysRun = true)
	public void afterMethod(ITestResult result) throws IOException {
		System.out.println("TestNG @bafterMethod in BaseTest - capture screen shot if pass or fail");

		// we may get a leave page message, so accept at end of test
		// try {
		// driver.manage().deleteAllCookies();
		// driver.switchTo().alert().accept();
		// }
		// catch(NoAlertPresentException e) {}

		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, "This Test Failed - See Below");
			sleep(2);
			System.out.println("Starting After Method");
			System.out.println("Starting After Method");
			JavascriptExecutor js = (JavascriptExecutor) driver;

			try {
				int contentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
				Dimension fullWindowHeight = new Dimension(1300, contentHeight);
				driver.manage().window().setSize(fullWindowHeight);
				sleep(1);
			} catch (Exception failWindowSize) {
			}

			String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
			String screenShotName = result.getName() + "- part " + timeStamp;
			String screenShotPath = capture(driver, screenShotName);
			logger.log(Status.FAIL, "Failed step screenshot part " + screenShotName,
					MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			Dimension dimensionRestored = new Dimension(1300, 700);
			driver.manage().window().setSize(dimensionRestored);
			// Above is a test

			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver; int contentHeight =
			 * ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
			 * System.out.println("Page height - " + contentHeight); int standardHeight = 0;
			 * int screenshotNumber = 1; js.executeScript("window.scrollTo(0, 0);");
			 * 
			 * while (contentHeight > standardHeight) {
			 * 
			 * String screenshotReportNumber = Integer.toString(screenshotNumber); String
			 * timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new
			 * java.util.Date()); String screenShotName = result.getName() + "- part " +
			 * screenshotReportNumber + " - " + timeStamp; String screenShotPath =
			 * capture(driver, screenShotName); logger.log(Status.FAIL,
			 * "Failed step screenshot part " + screenshotNumber + " : " + screenShotName,
			 * MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
			 * js.executeScript("window.scrollBy(0,600)"); standardHeight = new
			 * Integer(standardHeight + 600); ++screenshotNumber;
			 * System.out.println("Screenshot down to height " + standardHeight); sleep(2);
			 * }
			 */
			logger.log(Status.FAIL, result.getThrowable());
			// logger.log(Status.FAIL, "Snapshot below: " +
			// logger.addScreenCaptureFromPath(screenShotPath));
			System.out.println("After Method");
			System.out.println("Entering screenshot script from failed test");
			/// Below 3 lines only needed for the old Junit report
			ScreenshotUtils.screenshotOnFailForSureFireReports(result, driver);
			sleep(2);
		}
		// SCREENSHOT ON PASS -
		//
		// ***********JENKINS****************************************************
		// *********If Jenkins Hangs May Need to Remove screenshot on success****
		if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, "Test Execution Complete.");
			sleep(2);

			// this is a test
			System.out.println("Starting After Method");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			int contentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
			Dimension fullWindowHeight = new Dimension(1300, contentHeight);
			driver.manage().window().setSize(fullWindowHeight);
			sleep(1);
			// Above is a test

			String finalScreenshotTimeStamp = TimeStampUtils.createTimeStamp("HHmmss-ddMMyyyy");
			String finalScreenShotName = "Screenshot -";
			String screenShotPath = capture(driver, finalScreenShotName + finalScreenshotTimeStamp);
			logger.log(Status.PASS, finalScreenShotName + finalScreenshotTimeStamp,
					MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());

			// this is a test
			Dimension dimensionRestored = new Dimension(1300, 700);
			driver.manage().window().setSize(dimensionRestored);
			// Above is a test

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

		// ((JavascriptExecutor)driver).executeScript("window.onbeforeunload = null;");
		driver.quit();
		// driver.switchTo().alert().accept();
		System.out.println("afterTest method complete");
	}

	/// @AfterClass()
	// public void AfterClass() {
	// driver.switchTo().alert().accept();
	// }

	private static RemoteWebDriver getDriver() {
		return driver;
	}

}