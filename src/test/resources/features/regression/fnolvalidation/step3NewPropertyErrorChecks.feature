@Ignore
Feature: Regression test for errors for step3 New Property

  Background: 
    Given I use test data set "regression_set1"
    And As a "ClaimsHandler" I am at step3 for FNOL

  Scenario: FNOL Regression - check error messages
    And I will be on step3 for FNOL
    And I click add Property Damage on step3
    And I will be on FNOL new property screen
    And I click ok button on FNOL new property incident
    Then Mandatory field error messages will be shown for New Property screen in FNOL
      | Address 1 : Missing required field "Address 1"                       |
      | Postcode : Missing required field "Postcode"                         |
      | Location Description : Missing required field "Location Description" |
      | Property Owner : Missing required field "Property Owner"             |
