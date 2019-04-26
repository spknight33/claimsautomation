@Ignore @regressionmandatoryfields 
Feature: Regression test for errors for step3 New Pedestrian

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step3 for FNOL

  Scenario: FNOL Regression - TC1 - check error messages for new pedestrian
    And I will be on step3 for FNOL
    And I click add Pedestrian on step3
    And I will be on pedestrian screen for FNOL
    And I click ok button on FNOL new pedestrian incident
    Then Mandatory field error messages will be shown for New Pedestrian screen in FNOL
      | Last name : Missing required field "Last name"                       |
