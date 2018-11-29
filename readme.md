Notes:

To run a test via cmd chose the location on the POM....
Example -
C:\integration-test\trunk\selenium-webdriver

the run the command
mvn clean test -P{environment} -Dtest={testClassName}

Example -
mvn clean test -Ptest -Dtest=com.big.automation.selenium_webdriver.rq.brands.itb.ItbRqDefaultJourneySmokeTest

Example to run a testsuite by path:

mvn clean test -Ptest -DsuitePath=multibrand\MultiBrandSmokeTest.xml


mvn clean test -Ptest -DsuitePath=itb\ITBSmokeTests.xml



////////
C:\integration-test\trunk\selenium-webdriver
mvn clean test -Ptest -DsuitePath=itb\OpenCpOnly.xml


mvn clean test -Plive -DsuitePath=multibrand\MultiBrandSmokeTests.xml

mvn clean test -Plive -DsuitePath=ProjectSuite/pp_140/pp_140_GoLive.xml

/////
for IDD branch
C:\integration-test\branches\IDD\selenium-webdriver

/////////
data prep
mvn clean -Ptest -DnumberOfPols=1 -DcustFirstName=test -DcoverStartDay=17 -DcoverStartMonth=August -DcoverStartYear=2018 -DbdCoverLevel=0 -DkeysCover=1 -Dtest=TBB_RQ_AP_DataPrep_Jenkins test

mvn clean -Ptest -DnumberOfPols=1 -DcustFirstName=test -DcoverStartDay=17 -DcoverStartMonth=August -DcoverStartYear=2018 -DbdCoverLevel=0 -DkeysCover=0 -DcccpCover=0 -Dtest=DGT_RQ_AP_DataPrep_Jenkins test

mvn clean -Ptest -DnumberOfPols=1 -DcustFirstName=test -DcoverStartDay=17 -DcoverStartMonth=August -DcoverStartYear=2018 -estimatedAnnualMileage=7000 -DbdCoverLevel=0 -DkeysCover=0 -DcccpCover=0  -DdocsPreference=Electronic -Dtest=ITB_RQ_AP_DataPrep_Jenkins test

//
mvn clean -Ptest -DnumberOfPols=1 -DdobDaysToAdjust=0 -DdobMonthsToAdjust=0 -DdobYearsToAdjust=0 -Dtest=experimentalTests test


