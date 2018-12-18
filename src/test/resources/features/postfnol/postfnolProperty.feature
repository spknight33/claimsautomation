Feature: CBPCL-xxx As an Operator, I want to be able to add theft detail to insured vehicle

  Background: 
  Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ClaimsHandler"

  Scenario: CBPCL-218 TC1
    And I Select existing Claim "000-00-000018"
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
