@Ignore
Feature: CBPCL-210 As a ClaimCenter user with the role of Claims Adjuster or Manager, I want to be able to assign a claim, exposure or activity to a specific adjuster or queue. So that I can make sure that claims are assigned to the right person.

  Background: 
   Given I use test data set "autoexposure_set2"
   And As a "ADClaimsHandler" I am at step5 for FNOL

   @Ignore
    Scenario: CBPCL-210 TC1 Exposure created for INSURED ACCIDENTAL DAMAGE is assigned to Accidental Damage Group
    When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Accidental Damage - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
    # And I select "2015 SKODA OCTAVIA (s99sja / United Kingdom)" from "Coverage" on new vehicle exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
       And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Accidental Damage" has been assigned to a user in group "Accidental Damage"
     
    @Ignore
    Scenario: CBPCL-210 TC2 Exposure created for Insured MEDICAL EXPENSES is assigned to Personal Injury - MOJ Group
    When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Medical Expenses"
     Then I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new injury exposure screen for FNOL
           And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Bodily Injury" for coverage "Medical Expenses" has been assigned to a user in group "Personal Injury - MOJ"
     
    @Ignore
     Scenario: CBPCL-210 TC3 Exposure created for INSURED PERSONAL ACCIDENT is assigned to Personal Injury - MOJ Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Accident"
    Then I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new injury exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Bodily Injury" for coverage "Personal Accident" has been assigned to a user in group "Personal Injury - MOJ"
     
   @Ignore
      Scenario: CBPCL-210 TC4 Exposure created for PERSONAL BELONGINGS is assigned to Accidental Damage
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Belongings"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
       And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Personal Belongings" has been assigned to a user in group "Accidental Damage"
     
    @Ignore
       Scenario: CBPCL-210 TC5 Exposure created for PERSONAL BELOGINGS AND HANDBAG COVER is assigned to Accidental Damage
   And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Belongings and Handbag Cover"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Personal Belongings and Handbag Cover" has been assigned to a user in group "Accidental Damage"
     
   @Ignore
        Scenario: CBPCL-210 TC6 Exposure created for FIRE Vehicle damage is assigned to Accidental Damage
  And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Fire"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Fire" has been assigned to a user in group "Accidental Damage"

  @Ignore
   Scenario: CBPCL-210 TC7 Exposure created for MISFUELLING Vehicle damage is assigned to Accidental Damage
    And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Misfuelling - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
      And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Misfuelling Cover" has been assigned to a user in group "Accidental Damage"

@Ignore
Scenario: CBPCL-210 TC8 Exposure created for THIRD PARTY PERSONAL INJURY is assigned to Personal Injury - MOJ Group
       When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Personal Injury"
     And I select the Insured as Claimant on new injury exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
      And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
    And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
  
  @Ignore
    Scenario: CBPCL-210 TC9 Create For TP VEHICLE DAMAGE Liability, If no Personal Injury or Credit Hire exposure, then assign to TP Property Damage Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Third Party Property damage"
     
   @Ignore
     Scenario: CBPCL-210 TC10 Create For TP VEHICLE DAMAGE Liability, If no Personal Injury but there is Credit Hire exposure, then assign to Credit Hire Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Credit Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Credit Hire exposure screen for FNOL
       And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire"
      And I will see type "Credit Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire"

      @Ignore
     Scenario: CBPCL-210 TC11 Create For TP VEHICLE DAMAGE Liability, There is a Personal Injury (Personal Accident) Exposure but there is no Credit Hire exposure, then assign to PI Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
       When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Accident"
    Then I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new injury exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Bodily Injury" for coverage "Personal Accident" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     
    @Ignore
      Scenario: CBPCL-210 TC12 Create For TP VEHICLE DAMAGE Liability, There is a Personal Injury (Medical Expenses) Exposure but there is no Credit Hire exposure, then assign to PI Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
      When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Medical Expenses"
     Then I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new injury exposure screen for FNOL
           And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
      And I will see type "Bodily Injury" for coverage "Medical Expenses" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     
       @Ignore
      Scenario: CBPCL-210 TC13 Create For TP VEHICLE DAMAGE Liability, There is a Personal Injury (Third Party Injury) Exposure but there is no Credit Hire exposure, then assign to PI Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
      When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Personal Injury"
     And I select the Insured as Claimant on new injury exposure screen for FNOL
           And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
      And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     
       @Ignore
      Scenario: CBPCL-210 TC14 Create For TP VEHICLE DAMAGE Liability, There is a Personal Injury Exposure and there is a Credit Hire exposure, then assign to PI Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
      When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Personal Injury"
     And I select the Insured as Claimant on new injury exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
      And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Credit Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Credit Hire exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Vehicle" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Credit Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire"
     
      @Ignore
     Scenario: CBPCL-210 TC15 Exposure created for Third Party CREDIT HIRE is assigned to Credit Hire group
      And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Credit Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Credit Hire exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
        And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Credit Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire"
     
       @Ignore
     Scenario: CBPCL-210 TC16 Exposure created for TP CAPTURE is assigned to TP capture group
    And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - TP Capture"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new TP Capture exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
        And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "TP Capture" for coverage "Third Party Liability" has been assigned to a user in group "Third Party Capture"
     
     @Ignore
    Scenario: CBPCL-210 TC17 Create For TP PROPERTY Liability, If no Personal Injury or Credit Hire exposure, then assign to TP Property Damage Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new property exposure screen for FNOL
         And I click "New Incident..." on property name picker
    And I complete the new property screen for FNOL
     And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Third Party Property damage"
   
     
     @Ignore
     Scenario: CBPCL-210 TC18 Create For TP PROPERTY Damage Liability, If no Personal Injury but there is Credit Hire exposure, then assign to Credit Hire Group
    When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new property exposure screen for FNOL
        And I click "New Incident..." on property name picker
    And I complete the new property screen for FNOL
     And I select "Ok" on new exposure screen for FNOL
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Credit Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Credit Hire exposure screen for FNOL
       And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Credit Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire"
     And I will see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire"
     
      @Ignore
     Scenario: CBPCL-210 TC19 Create For TP PROPERTY Damage Liability, There is a Personal Injury (Personal Accident) Exposure but there is no Credit Hire exposure, then assign to PI Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new property exposure screen for FNOL
         And I click "New Incident..." on property name picker
    And I complete the new property screen for FNOL
     And I select "Ok" on new exposure screen for FNOL
       When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Accident"
    Then I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new injury exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
       And I will see type "Bodily Injury" for coverage "Personal Accident" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     
     @Ignore
      Scenario: CBPCL-210 TC20 Create For TP PROPERTY Damage Liability, There is a Personal Injury (Medical Expenses) Exposure but there is no Credit Hire exposure, then assign to PI Group
    When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new property exposure screen for FNOL
         And I click "New Incident..." on property name picker
    And I complete the new property screen for FNOL
     And I select "Ok" on new exposure screen for FNOL
      When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Medical Expenses"
     Then I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new injury exposure screen for FNOL
            And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
      And I will see type "Bodily Injury" for coverage "Medical Expenses" has been assigned to a user in group "Personal Injury - MOJ"
      And I will see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     
      @Ignore
      Scenario: CBPCL-210 TC21 Create For TP PROPERTY Damage Liability, There is a Personal Injury (Third Party Injury) Exposure but there is no Credit Hire exposure, then assign to PI Group
    When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new property exposure screen for FNOL
         And I click "New Incident..." on property name picker
    And I complete the new property screen for FNOL
     And I select "Ok" on new exposure screen for FNOL
      When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Personal Injury"
     And I select the Insured as Claimant on new injury exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     
   @Ignore
      Scenario: CBPCL-210 TC22 Create For TP PROPERTY Damage Liability, There is a Personal Injury Exposure and there is a Credit Hire exposure, then assign to PI Group
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new property exposure screen for FNOL
         And I click "New Incident..." on property name picker
    And I complete the new property screen for FNOL
     And I select "Ok" on new exposure screen for FNOL
      When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Personal Injury"
     And I select the Insured as Claimant on new injury exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
      And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Credit Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Credit Hire exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Bodily Injury" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     And I will see type "Credit Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire"
     And I will see type "Property" for coverage "Third Party Liability" has been assigned to a user in group "Personal Injury - MOJ"
     
     
    @Ignore
   Scenario: CBPCL-210 TC23 Exposure created for PROTOCOL HIRE Vehicle damage is assigned to credit hire protocol group
   And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Protocol Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Protocol Hire exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
      And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
    And I will see type "Protocol Hire" for coverage "Third Party Liability" has been assigned to a user in group "Credit Hire Protocol"
     
      @Ignore
      Scenario: CBPCL-210 TC24 Exposure created for THEFT Vehicle damage is assigned to accidental damage group
   And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Theft"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
      And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Theft" has been assigned to a user in group "Accidental Damage"
     
     @Ignore
      Scenario: CBPCL-210 TC25 Exposure created for GLASS Vehicle damage is assigned to claim support queue
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Glass - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
      And I click finish button on step5
     And I will be on Claim Saved screen in FNOL
     And I click on the created claim link on Claim Saved screen
     And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
     And I will see type "Vehicle" for coverage "Glass" has been assigned to a user in group "Claims Support"
     And I will log off
     And I login to ClaimCenter as role "ClaimsSupport"
     And I select "Queues" on the Desktop Navigator
     And I will see desktop queue details
    # And I will click assign next on desktop queue screen
     
     
     @Ignore
  Scenario: CBPCL-210 TC99 Create ALL exposures for assignment
    And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Credit Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Credit Hire exposure screen for FNOL
       And I select "Ok" on new exposure screen for FNOL
    
    And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Protocol Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Protocol Hire exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
    
    And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - TP Capture"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new TP Capture exposure screen for FNOL
        And I select "Ok" on new exposure screen for FNOL
    
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Accidental Damage - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
    # And I select "2015 SKODA OCTAVIA (s99sja / United Kingdom)" from "Coverage" on new vehicle exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Glass - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Fire"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Belongings"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Theft"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Belongings and Handbag Cover"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Misfuelling - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
           And I select "Ok" on new exposure screen for FNOL
     
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new property exposure screen for FNOL
        And I click "New Incident..." on property name picker
    And I complete the new property screen for FNOL
      And I select "Ok" on new exposure screen for FNOL
      
      When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Medical Expenses"
     Then I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new injury exposure screen for FNOL
             And I select "Ok" on new exposure screen for FNOL
      
       When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Accident"
    Then I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new injury exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
      
     When I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Third Party Liability,Liability - Personal Injury"
     And I select the Insured as Claimant on new injury exposure screen for FNOL
           And I select "Ok" on new exposure screen for FNOL
      
      And I click finish button on step5
      And I will be on Claim Saved screen in FNOL
      And I click on the created claim link on Claim Saved screen
      And I select "Exposures" on the Claim Navigator
     And I will see post FNOL exposures screen
    
