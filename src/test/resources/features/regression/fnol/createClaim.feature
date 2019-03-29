@Ignore
Feature: Regression test for create claim FNOL path


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
    
 @Ignore
      Scenario: FNOL Regression - Create new claim - FLOOD claim
    Given I use test data set "regress_fnol_flood"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test
    @Ignore
      Scenario: FNOL Regression - Create new claim - MALICIOUS DAMAGE but incident only claim - no reserves to be created
    Given I use test data set "regress_fnol_inconly"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test
    
      Scenario: FNOL Regression - Create new claim - property only
    Given I use test data set "regress_fnol_propertyonly"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test
    

@Ignore
  Scenario: FNOL Regression - Create new claim - ACCIDENT (NON FAULT)
    Given I use test data set "regress_fnol_accident_nonfault"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test
 @Ignore
  Scenario: FNOL Regression - Create new claim - ACCIDENT (SPLIT)
    Given I use test data set "regress_fnol_accident_split"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test
   
@Ignore
  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT)
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    When I create a claim as part of a regression test


 