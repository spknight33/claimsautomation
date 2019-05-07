@Ignore 
Feature: Regression test for create claim FNOL path - ITB claims

  Background: 
    Given I use test data set "regress_fnol_accident_split"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000016"

  Scenario: FNOL Regression - Create new claim - ACCIDENT (SPLIT) checking for exposure assignment
    # Given I use test data set "regress_fnol_accident_split" for brand "ITB"
    #And As a "ADClaimsHandlerTm1" I am at step5 for FNOL
    #When I create a claim as part of a regression test
    #	And I will be on Claim Saved screen in FNOL
    #  And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Accidental Damage" and claimant "PH Driver" has been assigned to a user in group "Accidental Damage"
 #   And I will see type "Vehicle" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Personal Injury - MOJ"
 #   And I will see type "Credit Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire"
 #   And I will see type "Protocol Hire" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Credit Hire Protocol"
 #    And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "TP Driver" has been assigned to a user in group "Personal Injury - MOJ"
 #   And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "TP Passenger" has been assigned to a user in group "Personal Injury - MOJ"
 #   And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "PH Passenger" has been assigned to a user in group "Personal Injury - MOJ"
 #   And I will see type "Bodily Injury" for coverage "Third Party Liability" and claimant "Pedestrian" has been assigned to a user in group "Personal Injury - MOJ"
 #   And I will see type "Property" for coverage "Third Party Liability" and claimant "TP Property Owner" has been assigned to a user in group "Personal Injury - MOJ"
   And I select "Workplan" on the Claim Navigator
   And I will see post FNOL Workplan screen
   And I select "All open activities" from "Activities" on Workplan screen for post FNOL
   And I will see the "LSI Response" activity on Workplan screen for post FNOL