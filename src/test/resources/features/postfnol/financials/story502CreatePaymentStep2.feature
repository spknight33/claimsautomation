@Ignore
Feature: CBPCL-502  Create a payment step2 and 3

  Background: 
    Given I use test data set "regression_accident_fault"

  Scenario: CBPCL-502 TC1  Step2 Cheque for payment
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Cheque"
    And I will see post FNOL New System Cheque Step1 screen
    And I select "John SideBottom" from field "Claimant" at New System Cheque Step1 post FNOL
    And I select "John SideBottom" from field "Payee" at New System Cheque Step1 post FNOL
    And I select "Cheque" Payment Method at New System Cheque Step1 post FNOL
    And I input "This is a test pay to name" into the "Cheque PayTo" field at New System Cheque Step1 post FNOL
    And I select "No cheque needed" from field "Cheque Delivery" at New System Cheque Step1 post FNOL
    And I input "This is a test recipient" into the "Cheque Recipient" field at New System Cheque Step1 post FNOL
    And I click next button on New System Cheque Step1 post FNOL
    And I will see post FNOL New System Cheque Step2 screen
    And I select "(3) 3rd Party Bodily Injury - John SideBottom; Claim Cost/Claimants Costs" from field "Reserve Line" at New System Cheque Step2 post FNOL
    And I select "Partial" from field "Payment Type" at New System Cheque Step2 post FNOL
    And I input "This is a test comment" into the "Internal Comments" field at New System Cheque Step2 post FNOL
    And I input "145" into the "Line Item Amount" field at New System Cheque Step2 post FNOL
    And I click next button on New System Cheque Step2 post FNOL
    And I will see post FNOL New System Cheque Step3 screen
    And I input "my ref" into the "Reference" field at New System Cheque Step3 post FNOL
    And I input "the purpose of this payment is to reimburse you" into the "Purpose" field at New System Cheque Step3 post FNOL
    And I select "Bulk check" from field "Cheque Batching" at New System Cheque Step3 post FNOL
    And I select "Hold for supporting documentation" from field "Cheque Instructions" at New System Cheque Step3 post FNOL
    And I click finish button on New System Cheque Step3 post FNOL
