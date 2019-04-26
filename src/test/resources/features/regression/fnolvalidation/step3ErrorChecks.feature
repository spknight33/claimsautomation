@Ignore @regressionmandatoryfields 
Feature: Regression test for errors for step3

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step3 for FNOL

  Scenario: FNOL Regression - check error messages for step3
    And I will be on step3 for FNOL
    And I click next button on step3
    Then Mandatory field error messages will be shown for step3
      | Incident Type : Missing required field "Incident Type"               |
      | Cause : Missing required field "Cause"                               |
      | Sub Cause : Missing required field "Sub Cause"                       |
 
    When I select "Misfuelling" from "Incident Type" field on step3
    And I select "Misfuelling" from "Cause" field on step3
    And I select "Misfuelling - Diesel into Petrol" from "Sub Cause" field on step3
    And I click next button on step3
    Then Mandatory field error messages will be shown for step3
      | Add Address Line 1, Postcode or Location Description |
