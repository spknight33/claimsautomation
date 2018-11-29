package com.big.automation.selenium_webdriver.common.testlistener;

import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.big.automation.selenium_webdriver.common.utilities.TimeStampUtils;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

public class TestListener extends BaseTest implements ITestListener{



	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		//webDriverRule.getDriver().quit();
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		try {
			System.out.println(TimeStampUtils.timeStandardStamp() + "-- Test Started --");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test Failed");

		try {
			System.out.println(TimeStampUtils.timeStandardStamp() + "  " +(result.getMethod() + " Test failed "));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test Failed");
		
		try {
			System.out.println(TimeStampUtils.timeStandardStamp() + "  " +(result.getMethod() + " Test skipped "));
			logger.log(Status.FAIL, "This test or part of the test has skipped or failed to start.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test started");
		try {
			System.out.println(TimeStampUtils.timeStandardStamp()+ "  " + arg0.getMethod() + " Test Started ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Passed");
		try {
			System.out.println(TimeStampUtils.timeStandardStamp()+ "  " + arg0.getMethod() + " Test executed Successfully ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
