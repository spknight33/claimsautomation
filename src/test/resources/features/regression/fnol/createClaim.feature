
Feature: Regression test for create claim FNOL path
@Ignore
  Scenario: FNOL Regression - Create new claim - ACCIDENT (NON FAULT)
    Given I use test data set "regression_accident_nonfault"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test
@Ignore
  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT/SPLIT)
    Given I use test data set "regression_accident_fault"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test
@Ignore
  Scenario: FNOL Regression - Create new claim - FIRE claim
    Given I use test data set "regress_fnol_fire"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - THEFT claim
    Given I use test data set "regress_fnol_theft"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - GLASS claim
    Given I use test data set "regress_fnol_glass"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - MISFUELLING claim
    Given I use test data set "regress_fnol_misfuelling"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test
