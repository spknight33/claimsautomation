@Ignore
Feature: Regression test for errors for step3 New Pedestrian

  Background: 
    Given I use test data set "regression_accident_fault"
    And As a "ClaimsHandler" I am at step3 for FNOL

  Scenario: FNOL Regression - check error messages
    And I will be on step3 for FNOL
    And I click add Pedestrian on step3
    And I will be on pedestrian screen for FNOL
    And I click ok button on FNOL new pedestrian incident
    Then Mandatory field error messages will be shown for New Pedestrian screen in FNOL
      | Address 1 : Missing required field "Address 1"                       |
      | Postcode : Missing required field "Postcode"                         |
      | Location Description : Missing required field "Location Description" |
      | Last name : Missing required field "Last name"                       |
