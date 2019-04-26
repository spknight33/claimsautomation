@Ignore @regressionmandatoryfields 
Feature: Regression test for errors for step3 New TP Driver

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step3 for FNOL

  Scenario: FNOL Regression - TC1- check error messages
    And I will be on step3 for FNOL
    And I click add Vehicle on step3
    And I select "AddDriver" on vehicle screen
    And I will be on Driver screen for FNOL
    And I click ok button on driver screen
    Then Mandatory field error messages will be shown for New Driver screen in FNOL
        | Last name : Missing required field "Last name"                       |
    And I select "Yes" from "Injured" on driver screen
    And I click addinjury button on driver screen
    And I click ok button on driver screen
    Then Mandatory field error messages will be shown for New Driver screen in FNOL
     | Last name : Missing required field "Last name"                       |
    | Area of Body : Missing required field "Area of Body" |
    | Detailed Injury : Missing required field "Detailed Injury" |