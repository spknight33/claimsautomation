
Feature: Regression test for create claim FNOL path

  Background: 
   Given  I use test data set "regression_set1"
    And As a "ClaimsHandler" I am at step5 for FNOL
    
 
 Scenario: FNOL Regression - Create new claim
    When I create a claim as part of a regression test
    