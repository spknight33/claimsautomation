@Ignore
Feature: CBPCL-201 As a claims handler once the Fault rating has been completed, and/or a trigger has been selected the system will then create an exposure and an automatic reserve.

  Background: 
   Given I use test data set "autoexposure_set4"
   And As a "ClaimsHandler" I am at step5 for FNOL

    Scenario: CBPCL-201 TC1 For "Split Liability" TP VEHICLE DAMAGE Liability auto create a TP Vehicle exposure with reserve

     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "TP Property Damage" for Claimant "TP Driver"

  
#And I will see the reserve amount "1507"