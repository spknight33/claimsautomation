@Ignore
Feature: CBPCL-224 As a ClaimCenter user with the role of Adjuster or Manager, I want to be able maintain claim related exposures (Property Damage) so that I can make sure that the data on the claim represents our current understanding of the loss.

  @Ignore
  Scenario: CBPCL-224 TC1_1 ClaimsHandler can create an exposure for TP property damage at Step5 FNOL
    Given As a "ADClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL

  @Ignore
  Scenario: CBPCL-224 TC1_2 ClaimsManager can create an exposure for TP property damage at Step5 FNOL
    Given As a "ADClaimsManager" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL

  @Ignore
  Scenario: CBPCL-224 TC1_3 TeamManager can create an exposure for TP property damage at Step5 FNOL
    Given As a "ADTeamManager" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL

  @Ignore
  Scenario: CBPCL-224 TC2 Mandatory fields are completed in TP Property Damage screen at step5 FNOL
    Given As a "ADClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
    When I select "Ok" on new exposure screen for FNOL
    Then I will see the error messages on the New Exposures screen
      | Claimant : Missing required field "Claimant"           |
      | Type : Missing required field "Type"                   |
      | Property Name : Missing required field "Property Name" |

  @Ignore
  Scenario: CBPCL-224 TC3 New Claimant can be created on exposures TP Property Damage screen at step5 FNOL
    Given As a "ADClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
        And I click "New Person" on claimant picker on new property exposure screen
    And I complete the "Claimant" details on the new person contact screen
    
    @Ignore
     Scenario: CBPCL-224 TC5 New property can be created on exposures TP Property Damage screen at step5 FNOL
    Given As a "ADClaimsHandler" I am at step5 for FNOL
    When I select the Add Exposures Popup Menu Hierarchy "BMW 3 SERIES (ND58PFL / United Kingdom),Third Party Liability,Liability - Property Damage"
    Then I will be on the new exposure screen for FNOL
       And I click "New Person" on claimant picker on new property exposure screen
    And I complete the "Claimant" details on the new person contact screen
    And I click "New Incident..." on property name picker
    And I complete the new property screen for FNOL
    And I select "Ok" on new exposure screen for FNOL
    And I click finish button on step5
    