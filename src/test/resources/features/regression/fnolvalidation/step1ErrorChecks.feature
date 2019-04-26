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
   