@Ignore
Feature: CBPCL-201 As a claims handler once the Fault rating has been completed, and/or a trigger has been selected the system will then create an exposure and an automatic reserve.

@Ignore
  Scenario: CBPCL-201 TC1 For "Split Liability" TP VEHICLE DAMAGE Liability auto create a TP Vehicle exposure with reserve,
    TC3 For "Split Liability" TP INJURY (TP Driver) Liability auto create a TP Injury exposure with reserve,
    TC5 For "Split Liability" TP INJURY (TP Passenger) Liability auto create a TP Injury exposure with reserve,
    TC8 For "Split Liability" PH INJURY (PH Driver) Liability DO NOT auto create a TP Injury exposure with reserve,
    TC9 For "Split Liability" TP INJURY (PH Passenger) Liability auto create a TP Injury exposure with reserve,
    TC11 For "Split Liability" TP INJURY (Pedestrian) Liability auto create a TP Injury exposure with reserve,
    TC15 For "Split Liability" PH VEHICLE DAMAGE Liability auto create a PH Vehicle exposure with reserve,
    TC22 If CREDIT HIRE set for TP VEHICLE DAMAGE Liability auto create a Credit Hire exposure with reserve
    CBPCL-221 TC3 For PROPERTY DAMAGE Liability (property owned by non PH) auto create a Property exposure with no reserve,
    CBPCL-221 TC5 If PROTOCOL HIRE set for TP VEHICLE DAMAGE Liability auto create a Protocol Hire exposure with reserve

  
    Given I use test data set "autoexposure_set1"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    And I click finish button on step5
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Driver" with reserves amount "1,507.00"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Driver" with reserves amount "4,050.00"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Passenger" with reserves amount "4,050.00"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "PH Passenger" with reserves amount "4,050.00"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "Pedestrian" with reserves amount "4,050.00"
    And I will see type "Vehicle" for coverage "Accidental Damage" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "1,307.00"
    And I will see type "Credit Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire" for Claimant "TP Driver" with reserves amount "1,307.00"
    And I will see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Property Owner" with reserves amount "-"
    And I select the exposure for type "Vehicle" for coverage "Third Party Liability" and claimant "TP Driver"
Then I will see post FNOL exposure screen for "1st Party Vehicle"
#And I will see "Claimant" is "TP Driver" on post FNOL "1st Party Vehicle" exposure screen
And I will see "Claimant Type" is "Insured" on post FNOL "1st Party Vehicle" exposure screen

  @Ignore
  Scenario: CBPCL-201 TC2 If Insureds "Fault" for TP VEHICLE DAMAGE Liability auto create a TP Vehicle exposure with reserve,
    TC4 For Insureds "Fault" TP INJURY (TP Driver) Liability auto create a TP Injury exposure with reserve,
    TC6 For Insureds "Fault" TP INJURY (TP Passenger) Liability auto create a TP Injury exposure with reserve,
    TC10 For Insureds "Fault" TP INJURY (PH Passenger) Liability auto create a TP Injury exposure with reserve,
    TC12 For Insureds "Fault" TP INJURY (Pedestrian) Liability auto create a TP Injury exposure with reserve,
    TC16 For Insureds "Fault" PH VEHICLE DAMAGE Liability where PH is claiming auto create a PH Vehicle exposure with reserve,
    CBPCL-201 TC23 If CREDIT HIRE not set for TP VEHICLE DAMAGE Liability do not create a Credit Hire exposure with reserve
    CBPCL-221 TC4 For PROPERTY DAMAGE (property owned by PH) DO NOT auto create a Property exposure ,
    CBPCL-221 TC6 If PROTOCOL HIRE not set for TP VEHICLE DAMAGE Liability then dont create a Protocol Hire exposure

    Given I use test data set "autoexposure_set2"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    And I click finish button on step5
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Driver" with reserves amount "1,507.00"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Driver" with reserves amount "4,050.00"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Passenger" with reserves amount "4,050.00"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "PH Passenger" with reserves amount "4,050.00"
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "Pedestrian" with reserves amount "4,050.00"
    And I will see type "Vehicle" for coverage "Accidental Damage" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "1,307.00"
    And I will NOT see type "Credit Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire" for Claimant "TP Driver" with reserves amount "1,307.00"
    And I will NOT see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Property Owner" with reserves amount ""

  @Ignore
  Scenario: CBPCL-201 TCxx - non fault should only create PH
    Given I use test data set "autoexposure_set5"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    And I click finish button on step5
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Accidental Damage" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "1,307.00"

  @Ignore
  Scenario: CBPCL-201 TC18 For "Fire" cause PH VEHICLE DAMAGE Liability where PH is claiming auto create a PH Vehicle exposure with reserve
    Given I use test data set "autoexposure_set3"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    And I click finish button on step5
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Fire" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "2,107.00"

 @Ignore
  Scenario: CBPCL-201 TC20 For "Theft" cause PH VEHICLE DAMAGE Liability where PH is claiming auto create a PH Vehicle exposure with reserve
    Given I use test data set "autoexposure_set4"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    And I click finish button on step5
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Theft" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "2,107.00"

  @Ignore
  Scenario: CBPCL-221 TC1 For "Misfuelling" cause PH VEHICLE DAMAGE Liability where PH is claiming?? auto create a PH Vehicle exposure with no reserve
    Given I use test data set "autoexposure_set5"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    And I click finish button on step5
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Misfuelling Cover" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "-"
    
    @Ignore
     Scenario: CBPCL-221 TC2 For "Glass cover" cause PH VEHICLE DAMAGE Liability where PH is claiming?? auto create a PH Vehicle exposure with no reserve
    Given I use test data set "autoexposure_set6"
    And As a "ADClaimsHandler" I am at step5 for FNOL
    And I click finish button on step5
    And I will be on Claim Saved screen in FNOL
    And I click on the created claim link on Claim Saved screen
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    And I will see type "Vehicle" for coverage "Glass" has been assigned to a user in group "Claims Support" for Claimant "PH Driver" with reserves amount "-"
    

Scenario: CBPCL-201 TC17 For Insureds "Fault" PH VEHICLE DAMAGE Liability where PH is NOT claiming Do not create a PH Vehicle exposure with reserve
Given I use test data set "autoexposure_set2"
And As a "ADClaimsHandler" I am at step4 for FNOL
And I select "No" from field "PH Claiming" at step4 FNOL
And I complete the TP Capture details on step4 FNOL
And I click finish button on step4 FNOL
And I will be on Claim Saved screen in FNOL
And I click on the created claim link on Claim Saved screen
And I select "Exposures" on the Claim Navigator
And I will see post FNOL exposures screen
 And I will NOT see type "Vehicle" for coverage "Accidental Damage" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount ""

 @Ignore
 Scenario: CBPCL-201 TC19 For "Fire" cause PH VEHICLE DAMAGE Liability where PH is Not claiming will not create a PH Vehicle exposure with reserve
 Given I use test data set "autoexposure_set3"
And As a "ADClaimsHandler" I am at step4 for FNOL
And I select "No" from field "PH Claiming" at step4 FNOL
And I click finish button on step4 FNOL
And I will be on Claim Saved screen in FNOL
And I click on the created claim link on Claim Saved screen
And I select "Exposures" on the Claim Navigator
And I will see post FNOL exposures screen
And I will NOT see type "Vehicle" for coverage "Fire" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "2,107.00"
 
 @Ignore
 Scenario: CBPCL-201 TC21 For "Theft" cause PH VEHICLE DAMAGE Liability where PH is claiming auto create a PH Vehicle exposure with reserve
 Given I use test data set "autoexposure_set4"
And As a "ADClaimsHandler" I am at step4 for FNOL
And I select "No" from field "PH Claiming" at step4 FNOL
And I click finish button on step4 FNOL
And I will be on Claim Saved screen in FNOL
And I click on the created claim link on Claim Saved screen
And I select "Exposures" on the Claim Navigator
And I will see post FNOL exposures screen
And I will NOT see type "Vehicle" for coverage "Theft" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "2,107.00"
 
 @Ignore
 Scenario: CBPCL-201 TC27 For non-fault case, there are no TP exposures created
Given I use test data set "autoexposure_set7"
And As a "ADClaimsHandler" I am at step5 for FNOL
And I click finish button on step5
And I will be on Claim Saved screen in FNOL
And I click on the created claim link on Claim Saved screen
And I select "Exposures" on the Claim Navigator
And I will see post FNOL exposures screen
And I will NOT see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Driver" with reserves amount "1,507.00"
And I will NOT see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Driver" with reserves amount "4,050.00"
And I will NOT see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Passenger" with reserves amount "4,050.00"
And I will NOT see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "PH Passenger" with reserves amount "4,050.00"
And I will NOT see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "Pedestrian" with reserves amount "4,050.00"
And I will see type "Vehicle" for coverage "Accidental Damage" has been assigned to a user in group "Accidental Damage" for Claimant "PH Driver" with reserves amount "1,307.00"
And I will see type "Credit Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire" for Claimant "TP Driver" with reserves amount "1,307.00"
And I will see type "Protocol Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire" for Claimant "TP Driver" with reserves amount "-"
And I will see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ" for Claimant "TP Property Owner" with reserves amount "-"
 
 