@Ignore
Feature: Regression test for errors for step3 New Police

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandler" I am at step3 for FNOL

  Scenario: FNOL Regression - check error messages
    And I will be on step3 for FNOL
    And I click add Police Details on step3
    And I will be on new police details screen for FNOL
    And I click ok button on FNOL new police incident
    Then Mandatory field error messages will be shown for New Police screen in FNOL
      | Police Force : Missing required field "Police Force"                      |
     