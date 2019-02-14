@Ignore
Feature: CBPCL-422 As a ClaimCenter user with the role of Adjuster or Manager, I want to be able maintain claim related exposures (Injury Damage) so that I can make sure that the data on the claim represents our current understanding of the loss.

  

  @Ignore
  Scenario: CBPCL-222 TC1 ClaimsHandler can create an exposure for TP Bodily Injury liability at step5 FNOL
    Given As a "ClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Third Party Liability,Liability - Personal Injury"
    Then I will be on the new exposure screen for FNOL

  @Ignore
  Scenario: CBPCL-222 TC2 ClaimsHandler can create an exposure for Insureds personal accident bodily injury at step5 FNOL
    Given As a "ClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Personal Accident"
    Then I will be on the new exposure screen for FNOL

  @Ignore
  Scenario: CBPCL-222 TC3 ClaimsHandler can create an exposure for Insureds Medical Expenses at step5 FNOL
    Given As a "ClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Medical Expenses"
    Then I will be on the new exposure screen for FNOL

  @Ignore
  Scenario: CBPCL-222 TC4 Mandatory fields are completed in Bodily injury screen at step5 FNOL
    Given As a "ClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Personal Accident"
    Then I will be on the new exposure screen for FNOL
    When I select "Ok" on new exposure screen for FNOL
    Then I will see the error messages on the New Exposures screen
      | Claimant : Missing required field "Claimant" |
      | Type : Missing required field "Type"         |
      | Injury : Missing required field "Injury"     |

  @Ignore
  Scenario: CBPCL-222 TC5 Mandatory fields are completed in TP Bodily injury screen at step5 FNOL
    Given As a "ClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Third Party Liability,Liability - Personal Injury"
    Then I will be on the new exposure screen for FNOL
    When I select "Ok" on new exposure screen for FNOL
    Then I will see the error messages on the New Exposures screen
      | Claimant : Missing required field "Claimant" |
      | Type : Missing required field "Type"         |
      | Injury : Missing required field "Injury"     |
  
  @Ignore
  Scenario: CBPCL-222 TC6 Mandatory fields are completed in Medical Expenses screen at step5 FNOL
    Given As a "ClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Medical Expenses"
    Then I will be on the new exposure screen for FNOL
    When I select "Ok" on new exposure screen for FNOL
    Then I will see the error messages on the New Exposures screen
      | Claimant : Missing required field "Claimant" |
      | Type : Missing required field "Type"         |
      | Injury : Missing required field "Injury"     |
      
    
     Scenario: CBPCL-222 TC8 New injury can be created on exposures Medical Expenses screen at step5 FNOL
     Given As a "ClaimsHandler" I am at step5 for FNOL
     When I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Medical Expenses"
    Then I will be on the new exposure screen for FNOL
       And I click "New Person" on claimant picker on new injury exposure screen
    And I complete the "Claimant" details on the new person contact screen
    And I click "New Incident..." on injury picker
    And I complete all fields on FNOL new injury incident
    And I select "Ok" on new exposure screen for FNOL
    And I click finish button on step5
