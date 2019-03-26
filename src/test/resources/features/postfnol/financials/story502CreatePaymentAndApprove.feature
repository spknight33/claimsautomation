
Feature: CBPCL-502  Create a payment and approve

  Background: 
    Given I use test data set "postfnol_set1"

  Scenario: CBPCL-502 create payment and approve
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Cheque"
    And I will see post FNOL New System Cheque Step1 screen
    And I select "Ainsley Lamb" from field "Claimant" at New System Cheque Step1 post FNOL
    And I select "Ainsley Lamb" from field "Payee" at New System Cheque Step1 post FNOL
    And I select "Cheque" Payment Method at New System Cheque Step1 post FNOL
  #  And I input "This is a test pay to name" into the "Cheque PayTo" field at New System Cheque Step1 post FNOL
  #  And I select "No cheque needed" from field "Cheque Delivery" at New System Cheque Step1 post FNOL
  #  And I input "This is a test recipient" into the "Cheque Recipient" field at New System Cheque Step1 post FNOL
    And I click next button on New System Cheque Step1 post FNOL
    And I will see post FNOL New System Cheque Step2 screen
    And I select "NL68OXW - Ainsley Lamb - 1st Party Vehicle; Claim Cost/Accidental Damage Repair" from field "Reserve Line" at New System Cheque Step2 post FNOL
    And I select "Partial" from field "Payment Type" at New System Cheque Step2 post FNOL
    And I input "This is a test comment" into the "Internal Comments" field at New System Cheque Step2 post FNOL
    And I input "145.29" into the "Line Item Amount" field at New System Cheque Step2 post FNOL
    And I click next button on New System Cheque Step2 post FNOL
    And I will see post FNOL New System Cheque Step3 screen
    And I input "myref123" into the "Reference" field at New System Cheque Step3 post FNOL
    And I input "the purpose of this payment is to reimburse you" into the "Purpose" field at New System Cheque Step3 post FNOL
  #  And I select "Bulk check" from field "Cheque Batching" at New System Cheque Step3 post FNOL
  #  And I select "Hold for supporting documentation" from field "Cheque Instructions" at New System Cheque Step3 post FNOL
    And I click finish button on New System Cheque Step3 post FNOL
    And I will see post FNOL Financials Cheques screen
    And I will see cheque with status "Pending approval" for Payee "Ainsley Lamb" for amount "145.29" on Financials Cheques screen
    And I will log off
    
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADTeamManager"
    And I select "Activities" on the Desktop Navigator
    And I will see desktop activities details screen
    And I select the activity for subject "Review and approve new payment" for claim "000-00-000149" for insured "Ainsley Lamb" and for exposure "NL68OXW - Ainsley Lamb - 1st Party Vehicle"