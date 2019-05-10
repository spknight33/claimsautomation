@Ignore @regressionmandatoryfields 
Feature: Regression test for errors for step3 New TP Driver

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step3 for FNOL

   Scenario: FNOL Regression for TP vehicle - TC1 - check error messages for Accident type
    And I will be on step3 for FNOL
    And I select "Accident" from "Incident Type" field on step3
     And I click add Vehicle on step3
    And I click ok button on vehicle screen
    Then Mandatory field error messages will be shown for Vehicle screen in FNOL
    | Do you know the number of occupants, including the driver? : Missing required field "Do you know the number of occupants, including the driver?" |
    | Insurer Details Available? : Missing required field "Insurer Details Available?" |
    | Style :Missing required field "Style" |