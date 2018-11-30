Feature: Step1 of FNOL wizard
  As a ClaimsHandler I want to login and create a claim


  Scenario: login
    Given I login to ClaimCenter
    And I Select New Claim
    And I Search For Policy With Default Criteria
    And I Select The First Policy
    And I Set the lossdate to "01/11/2018"
    When I click next button on step1