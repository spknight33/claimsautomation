@Ignore
Feature: CBPCL-155  Create a payment step1

  Background: 
    Given I use test data set "regression_accident_fault"


  Scenario: CBPCL-155 TC1  Step1 Cheque for payment
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Cheque"
    And I will see post FNOL New System Cheque Step1 screen
    And I select "John SideBottom" from field "Claimant" at New System Cheque Step1 post FNOL
    And I select "John SideBottom" from field "Payee" at New System Cheque Step1 post FNOL
    And I select "Cheque" Payment Method at New System Cheque Step1 post FNOL
   # And I select "EFT" Payment Method at New System Cheque Step1 post FNOL
  #  And I select "Cheque" Payment Method at New System Cheque Step1 post FNOL
    And I input "This is a test pay to name" into the "Cheque PayTo" field at New System Cheque Step1 post FNOL
    And I select "No cheque needed" from field "Cheque Delivery" at New System Cheque Step1 post FNOL
    And I input "This is a test recipient" into the "Cheque Recipient" field at New System Cheque Step1 post FNOL
    And I input "NE31PX" into the "Cheque Address Postcode" field at New System Cheque Step1 post FNOL
    And I select "7 Dene Grove, Newcastle upon Tyne, Tyne and Wear, NE3 1PX" from field "Cheque Address" at New System Cheque Step1 post FNOL
 And I input "This is a test address location" into the "Cheque Address Location" field at New System Cheque Step1 post FNOL
 And I click next button on New System Cheque Step1 post FNOL
 
 
 
 @Ignore
   Scenario: CBPCL-155 TC13 - ClaimsHandler creates a new cheque (step1) then the EFT fields account number and sortcode must be in correct format
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Cheque"
    And I will see post FNOL New System Cheque Step1 screen
    And I select "Roy Racer" from field "Claimant" at New System Cheque Step1 post FNOL
    And I select "Roy Racer" from field "Payee" at New System Cheque Step1 post FNOL
    And I select "EFT" Payment Method at New System Cheque Step1 post FNOL
    And I input "Mr Roy Racer" into the "EFT Account Name" field at New System Cheque Step1 post FNOL
    And I input "Barclays" into the "EFT Bank Name" field at New System Cheque Step1 post FNOL
    And I input "abcdefgh" into the "EFT AccountNumber" field at New System Cheque Step1 post FNOL
    And I input "abcdef" into the "EFT SortCode" field at New System Cheque Step1 post FNOL
    And I click next button on New System Cheque Step1 post FNOL
    Then Mandatory field error messages will be shown at New System Cheque Step1 post FNOL
    |Account Number : Account Number must be an 8-digit number|
|Sort Code : Sort Code must be an 6-digit number|
    