@Ignore
Feature: Regression test for errors for step3 New PH Driver

  Background: 
    Given I use test data set "regression_accident_fault"
    And As a "ADClaimsHandler" I am at step3 for FNOL

  Scenario: FNOL Regression - check error messages
    And I will be on step3 for FNOL
    And I select the insureds vehicle at step3
    And I select "AddDriver" on vehicle screen
    And I will be on Driver screen for FNOL
    And I click ok button on driver screen
    Then Mandatory field error messages will be shown for New Driver screen in FNOL
      | Address 1 : Missing required field "Address 1"                       |
      | Postcode : Missing required field "Postcode"                         |
      | Location Description : Missing required field "Location Description" |
      | Last name : Missing required field "Last name"                       |
    And I select "true" from "Injured" on driver screen
    And I click addinjury button on driver screen
    And I click ok button on driver screen
    Then Mandatory field error messages will be shown for New Driver screen in FNOL
    | Area of Body : Missing required field "Area of Body" |
    | Detailed Injury : Missing required field "Detailed Injury" |