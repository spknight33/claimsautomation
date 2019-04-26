@Ignore @regressionmandatoryfields 
Feature: Regression test for errors for step3 New PH Passenger

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step3 for FNOL

  Scenario: FNOL Regression - TC1- check error messages
    And I will be on step3 for FNOL
    And I select the insureds vehicle at step3
    And I select "AddPassenger" on vehicle screen
    And I will be on New Passenger screen for FNOL
    And I click ok button on passenger screen in FNOL
    Then Mandatory field error messages will be shown for New Passenger screen in FNOL
          | Last name : Missing required field "Last name" |
