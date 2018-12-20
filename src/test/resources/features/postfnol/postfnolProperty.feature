Feature: CBPCL-xxx As an Operator

  Background: 
  Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ClaimsHandler"

  @Ignore
  Scenario: CBPCL-218 TC1
    And I Select existing Claim "000-00-000005"
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    And I click edit button on post FNOL loss details
    And I click add Property Damage on post FNOL loss details
    And I complete all fields on post FNOL new property incident
    And I click update button on post FNOL loss details
 
