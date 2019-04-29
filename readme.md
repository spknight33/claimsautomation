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

##Main Structure (Steps):

As per the norm, statements in the feature files map on to step definition java classes.

The step definitions are located at src/test/java/stepdefs.

The step definitions are grouped into java packages based on functional arears, e.g. fnol, post fnol, common

Within Step definition java classes, there are two types of method present.

1) Typical regex mapped methods used by gherkin scripts, following the given, when,then syntax. These are used for most adhoc automation tests and regression tests.

2) Data driven methods used to construct a user journery through the FNOL process as part of claim creation. These are used mainly to build claims of various types and incidents. They are Excel Spreadsheet driven - data is preloaded from the sp

##Main Structure (Page Objects):

Page object java classes are used to represent the screens. As per the norm, they have no test specific functionality other than to set fields, return data from fields, or check for the presence of data on fields.


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



