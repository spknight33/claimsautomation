@Ignore @regressionmandatoryfields @
Feature: Regression test for errors for step4

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step4 for FNOL

  Scenario: FNOL Regression - check error messages for step3
    And I will be on step4 for FNOL
    And I click next button on step4 FNOL
    Then Mandatory field error messages will be shown for step4 FNOL
      | Capture Opportunity : Missing required field "Capture Opportunity"              |
     | PH Claiming? : Missing required field "PH Claiming?"                               |
     
     
