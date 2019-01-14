@Ignore
Feature: CBPCL-337 As a ClaimCenter user with the role of Adjuster or Manager, I want to be able maintain claim related exposures (hire) so that I can make sure that the data on the claim represents our current understanding of the loss.

  Scenario: CBPCL-337  Create hire expsoures
    Given As a "ClaimsHandler" I am at step5 for FNOL
    And I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Third Party Liability,Liability - Credit Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Credit Hire exposure screen for FNOL
    And I select "Insured" from "Claimant Type" on new Credit Hire exposure screen for FNOL
    And I select "Ok" on new exposure screen for FNOL
    And I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Third Party Liability,Liability - Protocol Hire"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new Protocol Hire exposure screen for FNOL
    And I select "Insured" from "Claimant Type" on new Protocol Hire exposure screen for FNOL
    And I select "Ok" on new exposure screen for FNOL
    And I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Third Party Liability,Liability - TP Capture"
    And I will be on the new exposure screen for FNOL
    And I select the Insured as Claimant on new TP Capture exposure screen for FNOL
    And I select "Insured" from "Claimant Type" on new TP Capture exposure screen for FNOL
    And I select "Ok" on new exposure screen for FNOL
    And I select "Ok" on new exposure screen for FNOL
