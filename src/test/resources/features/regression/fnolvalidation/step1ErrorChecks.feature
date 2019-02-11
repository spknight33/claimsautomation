@Ignore
Feature: Regression test for errors for step1

  Background: 
    Given I use test data set "regression_set1"
    And As a "ClaimsHandler" I am at step1 for FNOL

  Scenario: FNOL Regression - check error messages
    And I will be on step1 for FNOL
    When I Click Search at step1 FNOL 
    Then Mandatory field error messages will be shown at step1 FNOL
      | Error: You must enter some criteria    |
    