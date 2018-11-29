package com.big.automation.selenium_webdriver.TestScripts.ClaimCenter.Login;

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
        features = "src/test/resources/features/authenticationauthorisation",
        glue = {"stepdefs"},
        tags = {"~@Ignore"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/auth/cucumber-pretty",
                "json:target/cucumber-reports/jsonReports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/auth/rerun.txt"
        })
public class ClaimCenterLogin extends BaseTest {

	// from original
    @BeforeTest(dependsOnMethods = "beforeTest")
    public void extentTestName() {
        logger = extent.createTest("ClaimCenter Authentication Cucumber Tests");
    }

    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
    	 System.out.println("TestNG @beforeClass in ClaimCenterLoginDefault");
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
    	System.out.println("TestNG @afterClass in ClaimCenterLoginDefault");
        testNGCucumberRunner.finish();
    }
}
    
    
  


