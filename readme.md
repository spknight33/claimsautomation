Notes:

This is based on a copy of the current ITB test automation project 'WebDriver' and is work in progress.

Changes added to that framework:
1) Inclusion of Cucumber support
2) Addition of Cucumber reporting (Masterthought), although this is work in progress. The original TestExtent is retained.
3) Change to Cucumber Testrunners per functional area.


To run a test via cmd choose the location on the POM....
Example -
C:\integration-test\trunk\selenium-webdriver


Example to run the testsuite by path:

mvn clean test -Pdev -DsuitePath=ClaimsCenter\ClaimCenterRegressionTests.xml  
mvn clean test -Ptest -DsuitePath=ClaimsCenter\ClaimCenterRegressionTests.xml 

TODO..

Note that the @Ignore cucumber tag can be used to switch off inidividual cucumber tests
No Cucumber hook has been specified, the framework currently uses the original testNG @before and @after annotations to launch browser etc



