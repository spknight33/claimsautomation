@Ignore
Feature: Regression test for create claim FNOL path - DGT claims


  Scenario: FNOL Regression - Create new claim - FIRE claim
    Given I use test data set "regress_fnol_fire" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test


  Scenario: FNOL Regression - Create new claim - THEFT claim
    Given I use test data set "regress_fnol_theft" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - GLASS REPAIR claim
    Given I use test data set "regress_fnol_glass_repair" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - GLASS REPLACE claim
    Given I use test data set "regress_fnol_glass_replace" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - MISFUELLING claim
    Given I use test data set "regress_fnol_misfuelling" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - FLOOD claim
    Given I use test data set "regress_fnol_flood" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - MALICIOUS DAMAGE but incident only claim - no reserves to be created
    Given I use test data set "regress_fnol_inconly" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - PROPERTY only
    Given I use test data set "regress_fnol_propertyonly" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - CYCLIST only
    Given I use test data set "regress_fnol_cyclistonly" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    
        @inprogress
    Scenario: FNOL Regression - Create new claim - MOTORBIKE only
    Given I use test data set "regress_fnol_motorbike" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - PH COURTESY CAR only
    Given I use test data set "regress_fnol_courtesycar" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  
  Scenario: FNOL Regression - Create new claim - ACCIDENT (NON FAULT)
    Given I use test data set "regress_fnol_accident_nonfault" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - ACCIDENT (SPLIT)
    Given I use test data set "regress_fnol_accident_split" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT)
    Given I use test data set "regress_fnol_accident_fault" for brand "DGT"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
