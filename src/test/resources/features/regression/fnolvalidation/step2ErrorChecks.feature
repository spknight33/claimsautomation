@Ignore
Feature: Regression test for errors for step2

  Background: 
    Given I use test data set "regression_set1"
    And As a "ClaimsHandler" I am at step2 for FNOL

  Scenario: FNOL Regression - check error messages
    And I will be on step2 for FNOL
    And I click next button on step2
    Then Mandatory field error messages will be shown for step2
      | Name : Missing required field "Name"                               |
      | Relation to Insured : Missing required field "Relation to Insured" |
      | Notified by Alert? : Missing required field "Notified by Alert?"   |
    When I select "true" from "Alert Notified" field on step2
    And I click next button on step2
    Then Mandatory field error messages will be shown for step2
      | Name : Missing required field "Name"                               |
      | Relation to Insured : Missing required field "Relation to Insured" |
      | Alert ID : Missing required field "Alert ID"                       |
