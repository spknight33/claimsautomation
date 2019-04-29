#Framework
This is based on a copy of the current ITB test automation project 'WebDriver' and is ongoing work in progress. The priority has been to get functional automation testing up and running. 
Some aspects if tidying up the framework and adding robustness are still to do - these are detailed in this readme.

##Changes added to that framework:

1) Inclusion of Cucumber support

2) Addition of Cucumber reporting (Masterthought), although this is work in progress. The original TestExtent is retained.

3) Use of cucumber tags to run tests or subsets of tests

##Main Structure (Features):

Cucumber feature files are located at src/test/resources/features in which subfolders are used to group similar functional tests e.g. fnol, post fnol, authentication. 

In addition a folder for specific regression tests is used.

Example feature file:

```
@Ignore @regressionmandatoryfields 
Feature: Regression test for errors for step1

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step1 for FNOL

  Scenario: FNOL Regression - check error messages for Step1 of FNOL
    And I will be on step1 for FNOL
    When I Click Search at step1 FNOL
    Then Mandatory field error messages will be shown at step1 FNOL
           | Error: You must enter some criteria    |
```

##Main Structure (Steps):

As per the norm, statements in the feature files map on to step definition java classes.

The step definitions are located at src/test/java/stepdefs.

The step definitions are grouped into java packages based on functional arears, e.g. fnol, post fnol, common

Within Step definition java classes, there are two types of method present.

1) Typical regex mapped methods used by gherkin scripts, following the given, when,then syntax. These are used for most adhoc automation tests and regression tests.

Example:
```
@Then("^I will be on step4 for FNOL$")
	public void i_will_be_on_step4_for_FNOL() throws Throwable {
		fnolStep4POM.isPageTitleDisplayed("Step 4 of 5: Services");
	}
```

2) Data driven methods used to construct a user journery through the FNOL process as part of claim creation. These are used mainly to build claims of various types and incidents.They are Excel Spreadsheet driven - data is preloaded from the spreadsheet into a java map at the start of the test.

Example:
```
public void completeFNOLStep4ForTestScenario()  throws Throwable
	{
		String fieldValue=null;
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_PhClaiming");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.selectPhClaiming(true);
		}
		else
		{
			fnolStep4POM.selectPhClaiming(false);
		}
	
		completeFNOLStep4Services();

		completeFNOLStep4TPCapture();
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_WaiveExcess");
		if (fieldValue !=null && fieldValue.equalsIgnoreCase("TRUE"))
		{
			fnolStep4POM.selectWaiveExcess(true);
		}
		else
		{
			fnolStep4POM.selectWaiveExcess(false);
		}
		
		fieldValue = ExcelUtil.getTestDataValue("Fnol_Step4_BonusStatus");
		if (fieldValue !=null)
		{
			fnolStep4POM.selectBonusStatus(fieldValue);
		}
			
		fnolStep4POM.next();
	}
```


##Main Structure (Page Objects):

Page object java classes are used to represent the screens. As per the norm, they have no test specific functionality other than to set fields, return data from fields, or check for the presence of data on fields.


Example POM method:
```
public void selectBonusStatus(String option) {
		logger.info(format("%s -  going to set bonus status to:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getBonusStatusDropdown(), 1);
	}
```

##Main Structure (Utilities/helpers):

Access to guidwire screen objects from POMs has been centralised in Java class **GuideWireAccessors**

Access to load data from Excel spreadsheet at the start of a test is located in java class **ExcelUtils**

Getting the correct user for login is currently coded in Java class **UserFactory** - partial method extract is:
```
public static final String ADHANDLERTM1 = "ADClaimsHandlerTm1";
public static UserConfig getUserConfig(String role) {
		switch (role) {
		case (ADHANDLERTM1):
			return new UserConfig("had1", "gw","unknown");
			
			
```

# Running Tests in Eclipse:

## Use of Cucumber tags to run specific tests:


# Running Tests from Maven:
To run a test via cmd choose the location on the POM....
Example -
C:\integration-test\trunk\selenium-webdriver


Example to run the testsuite by path:

mvn clean test -Pdev -DsuitePath=ClaimsCenter\ClaimCenterRegressionTests.xml  
mvn clean test -Ptest -DsuitePath=ClaimsCenter\ClaimCenterRegressionTests.xml 

TODO..

Note that the @Ignore cucumber tag can be used to switch off inidividual cucumber tests
No Cucumber hook has been specified, the framework currently uses the original testNG @before and @after annotations to launch browser etc



