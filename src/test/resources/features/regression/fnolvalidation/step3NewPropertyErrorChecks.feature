@Ignore @regressionmandatoryfields
Feature: Regression test for errors for step3 New Property

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step3 for FNOL

  Scenario: FNOL Regression - TC1 -check error messages
    And I will be on step3 for FNOL
    And I click add Property Damage on step3
    And I will be on FNOL new property screen
    And I click "Ok" on new property screen for FNOL
    Then Mandatory field error messages will be shown for New Property screen in FNOL
      | Property Owner : Missing required field "Property Owner" |
    And I click "New Person Owner" on new property screen for FNOL
    And I select "Mr." from "Prefix" on person details screen for Post FNOL
    And I input "Francois" into the "First Name" box on person details screen
    And I input "Leblanc" into the "Last Name" box on person details screen
    And I input "Lives in the property" into the "Location Description" box on person details screen
    And I select "Update" on person details screen
     And I click "Ok" on new property screen for FNOL
    Then Mandatory field error messages will be shown for New Property screen in FNOL
      |Add Address Line 1 or Location Description |