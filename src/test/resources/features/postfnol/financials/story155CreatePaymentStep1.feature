Feature: CBPCL-155  Create a payment step1

  Background: 
    Given I use test data set "regression_set1"

  Scenario: CBPCL-155 TC1  Step1 Cheque for EFT
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Cheque"
    And I will see post FNOL New System Cheque Step1 screen
    And I select "Roy Racer" from field "Claimant" at New System Cheque Step1 post FNOL
    And I select "Action 365" from field "Payee" at New System Cheque Step1 post FNOL
    And I select "Cheque" Payment Method at New System Cheque Step1 post FNOL
    And I select "EFT" Payment Method at New System Cheque Step1 post FNOL
    And I select "Cheque" Payment Method at New System Cheque Step1 post FNOL
    And I input "This is a test pay to name" into the "Cheque PayTo" field at New System Cheque Step1 post FNOL
    And I select "No cheque needed" from field "Cheque Delivery" at New System Cheque Step1 post FNOL
    And I input "This is a test recipient" into the "Cheque Recipient" field at New System Cheque Step1 post FNOL
    And I input "NE31PX" into the "Cheque Address Postcode" field at New System Cheque Step1 post FNOL
    And I select "7 Dene Grove, Newcastle upon Tyne, Tyne and Wear, NE3 1PX" from field "Cheque Address" at New System Cheque Step1 post FNOL
 And I input "This is a test address location" into the "Cheque Address Location" field at New System Cheque Step1 post FNOL