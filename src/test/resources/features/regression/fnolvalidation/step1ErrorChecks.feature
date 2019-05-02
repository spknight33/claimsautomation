@Ignore @regressionmandatoryfields 
Feature: Regression test for errors for step1

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step1 for FNOL

  Scenario: Regression Step1 Fnol - TC1_1 Mandatory fields must be supplied
    And I will be on step1 for FNOL
    When I Click Search at step1 FNOL
    Then Mandatory field error messages will be shown at step1 FNOL
           | Error: You must enter some criteria    |
