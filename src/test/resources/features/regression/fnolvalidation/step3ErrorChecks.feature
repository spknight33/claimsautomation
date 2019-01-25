@Ignore
Feature: Regression test for errors for step3

  Background: 
    Given I use test data set "regression_set1"
    And As a "ClaimsHandler" I am at step3 for FNOL

  Scenario: FNOL Regression - check error messages
    And I will be on step3 for FNOL
    And I click next button on step3
    Then Mandatory field error messages will be shown for step3
      | Incident Type : Missing required field "Incident Type"               |
      | Cause : Missing required field "Cause"                               |
      | Sub Cause : Missing required field "Sub Cause"                       |
      | Address 1 : Missing required field "Address 1"                       |
      | Postcode : Missing required field "Postcode"                         |
      | Location Description : Missing required field "Location Description" |
    When I select "Accident" from "Incident Type" field on step3
    And I select "Accident Involving Animal" from "Cause" field on step3
    And I select "Collided with animal - owner known" from "Sub Cause" field on step3
    And I click next button on step3
    Then Mandatory field error messages will be shown for step3
      | Address 1 : Missing required field "Address 1"                       |
      | Postcode : Missing required field "Postcode"                         |
      | Location Description : Missing required field "Location Description" |
