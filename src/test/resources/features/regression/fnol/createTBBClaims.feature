@Ignore
Feature: Regression test for create claim FNOL path - TBB claims

  Scenario: FNOL Regression - Create new claim - FIRE claim
    Given I use test data set "regress_fnol_fire" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - THEFT claim
    Given I use test data set "regress_fnol_theft" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - GLASS REPAIR claim
    Given I use test data set "regress_fnol_glass_repair" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - GLASS REPLACE claim
    Given I use test data set "regress_fnol_glass_replace" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - MISFUELLING claim
    Given I use test data set "regress_fnol_misfuelling" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - FLOOD claim
    Given I use test data set "regress_fnol_flood" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - MALICIOUS DAMAGE but incident only claim - no reserves to be created
    Given I use test data set "regress_fnol_inconly" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - PROPERTY only
    Given I use test data set "regress_fnol_propertyonly" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - CYCLIST only
    Given I use test data set "regress_fnol_cyclistonly" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - MOTORBIKE only
    Given I use test data set "regress_fnol_motorbike" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - PH COURTESY CAR only
    Given I use test data set "regress_fnol_courtesycar" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - ACCIDENT (NON FAULT)
    Given I use test data set "regress_fnol_accident_nonfault" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - ACCIDENT (SPLIT)
    Given I use test data set "regress_fnol_accident_split" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT)
    Given I use test data set "regress_fnol_accident_fault" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    
          Scenario: FNOL Regression - Create new claim - ACCIDENT (CREDITHIRE)
    Given I use test data set "regress_fnol_accident_credhire" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT- NAMED DRIVER)
    Given I use test data set "regress_fnol_accident_namedriv" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT- NOT NAMED DRIVER)
    Given I use test data set "regress_fnol_accident_notnamed" for brand "TBB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
