package com.big.automation.selenium_webdriver.TestScripts.ClaimCenter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs","com.big.automation.selenium_webdriver.TestScripts.ClaimCenter"},
        tags = {"~@Ignore"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/jsonReports/CucumberTestReport.json",
                 "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
                "rerun:target/cucumber-reports/rerun.txt"
        })
public class CucumberRunner extends BaseTest {

	// from original
    @BeforeTest(dependsOnMethods = "beforeTest")
    public void extentTestName() {
        logger = extent.createTest("ClaimCenter Cucumber Tests");
    }

    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
    	 System.out.println("TestNG @beforeClass in CucumberRunner");
    	//super.beforeTest();
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
       testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
   public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
    	System.out.println("TestNG @afterClass in CucumberRunner");
        testNGCucumberRunner.finish();
    }
}
    
    
  


