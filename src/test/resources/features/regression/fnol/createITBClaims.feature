@Ignore @createclaimsitb
Feature: Regression test for create claim FNOL path - ITB claims

  Scenario: FNOL Regression - Create new claim - FIRE claim with exposure
    Given I use test data set "regress_fnol_fire" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Workplan" on the Claim Navigator
    And I will see post FNOL Workplan screen
    And I select "All open activities" from "Activities" on Workplan screen for post FNOL
    #And I will see the "New Fire" activity on Workplan screen for post FNOL


  Scenario: FNOL Regression - Create new claim - THEFT claim
    Given I use test data set "regress_fnol_theft" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test


  Scenario: FNOL Regression - Create new claim - GLASS REPAIR claim
    Given I use test data set "regress_fnol_glass_repair" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Glass" and claimant "PH Driver" has been assigned to a user in group "Claims Support"
  


  Scenario: FNOL Regression - Create new claim - GLASS REPLACE claim
    Given I use test data set "regress_fnol_glass_replace" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test


  Scenario: FNOL Regression - Create new claim - MISFUELLING claim
    Given I use test data set "regress_fnol_misfuelling" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Misfuelling Cover" and claimant "PH Driver" has been assigned to a user in group "Accidental Damage"
    

  Scenario: FNOL Regression - Create new claim - FLOOD claim
    Given I use test data set "regress_fnol_flood" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - MALICIOUS DAMAGE but incident only claim - no reserves to be created
    Given I use test data set "regress_fnol_inconly" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test


  Scenario: FNOL Regression - Create new claim - PROPERTY only
    Given I use test data set "regress_fnol_propertyonly" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
     And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Property" for coverage "Third Party Liability" and claimant "TP Property Owner" has been assigned to a user in group "Third Party Property Damage"


  Scenario: FNOL Regression - Create new claim - CYCLIST only no injury
    Given I use test data set "regress_fnol_cyclistonly" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Third Party Property Damage"
    

  Scenario: FNOL Regression - Create new claim - MOTORBIKE only
    Given I use test data set "regress_fnol_motorbike" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    
  
     Scenario: FNOL Regression - Create new claim - PEDESTRIAN only
    Given I use test data set "regress_fnol_accident_pedest" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - PH COURTESY CAR only
    Given I use test data set "regress_fnol_courtesycar" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    
     Scenario: FNOL Regression - Create new claim - ACCIDENT (PH ONLY	)
    Given I use test data set "regress_fnol_accident_phonly" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test

  Scenario: FNOL Regression - Create new claim - ACCIDENT (NON FAULT) in credit hire but no injuries
    Given I use test data set "regress_fnol_accident_nonfault" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Accidental Damage" and claimant "PH Driver" has been assigned to a user in group "Accidental Damage"
    And I will see type "Credit Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire"
    And I will see type "Protocol Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire Protocol"
    And I will see type "Property" for coverage "Third Party Liability" and claimant "TP Property Owner" has been assigned to a user in group "Credit Hire"
 


  Scenario: FNOL Regression - Create new claim - ACCIDENT (SPLIT) - also check expsoure assignments
    Given I use test data set "regress_fnol_accident_split" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Accidental Damage" and claimant "PH Driver" has been assigned to a user in group "Accidental Damage"
    And I will see type "Vehicle" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Personal Injury - MOJ"
    And I will see type "Credit Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire"
    And I will see type "Protocol Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire Protocol"
     And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Personal Injury - MOJ"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "TP Passenger" has been assigned to a user in group "Personal Injury - MOJ"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "PH Passenger" has been assigned to a user in group "Personal Injury - MOJ"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "Pedestrian" has been assigned to a user in group "Personal Injury - MOJ"
    And I will see type "Property" for coverage "Third Party Liability" and claimant "TP Property Owner" has been assigned to a user in group "Personal Injury - MOJ"
 

  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT)
    Given I use test data set "regress_fnol_accident_fault" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    
      Scenario: FNOL Regression - Create new claim - ACCIDENT (CREDITHIRE)collision with TP , No Injuries WITH Credit Hire
    Given I use test data set "regress_fnol_accident_credhire" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Accidental Damage" and claimant "PH Driver" has been assigned to a user in group "Accidental Damage"
    And I will see type "Credit Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire"
    And I will see type "Vehicle" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire"
    And I will see type "Protocol Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire Protocol"
  

  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT- NAMED DRIVER)
    Given I use test data set "regress_fnol_accident_namedriv" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Accidental Damage" and claimant "PH Named Driver" has been assigned to a user in group "Accidental Damage"
    And I will see type "Credit Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire"
    And I will see type "Vehicle" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Personal Injury - MOJ"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Protocol Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire Protocol"
   

  Scenario: FNOL Regression - Create new claim - ACCIDENT (FAULT- NOT NAMED DRIVER)
    Given I use test data set "regress_fnol_accident_notnamed" for brand "ITB"
    And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    When I create a claim as part of a regression test
