package com.big.automation.selenium_webdriver.claimcenter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
//NOT USED
public interface BasePOM {
	
	public static WebDriver webDriver = BaseTest.driver;
	public static ExtentTest logger = BaseTest.extent.createTest("Suite of Tests for Claims Center");
	
	ClaimCenterLoginPOM loginPOM = PageFactory.initElements(webDriver, ClaimCenterLoginPOM.class);

}
