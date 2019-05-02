@Ignore 
Feature: migration support - create payment

  Background: 
    Given I use test data set "postfnol_set1"
     Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000101"

  Scenario: Migration Create Physical cheque payment and approve
    And I select the Actions Popup Menu Hierarchy "Cheque" for parent "New Transaction"
    And I will see post FNOL New System Cheque Step1 screen
    And I select "Steve Knight-itb1" from field "Claimant" at New System Cheque Step1 post FNOL
    And I select "Steve Knight-itb1" from field "Payee" at New System Cheque Step1 post FNOL
    And I select "Cheque" Payment Method at New System Cheque Step1 post FNOL
    And I click next button on New System Cheque Step1 post FNOL
    And I will see post FNOL New System Cheque Step2 screen
    And I select "S99SJA - Steve Knight-itb1 - 1st Party Vehicle; Claim Cost/Accidental Damage Repair" from field "Reserve Line" at New System Cheque Step2 post FNOL
    And I select "Partial" from field "Payment Type" at New System Cheque Step2 post FNOL
    And I input "This is a test comment" into the "Internal Comments" field at New System Cheque Step2 post FNOL
    And I input "10.99" into the "Line Item Amount" field at New System Cheque Step2 post FNOL
    And I click "next" button on New System Cheque Step2 post FNOL
    And I will see post FNOL New System Cheque Step3 screen
    And I input "myref123" into the "Reference" field at New System Cheque Step3 post FNOL
    And I input "the purpose of this payment is to reimburse you" into the "Purpose" field at New System Cheque Step3 post FNOL
    And I click finish button on New System Cheque Step3 post FNOL
    And I will see post FNOL Financials Cheques screen
    And I will log off
    
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADTeamManagerTm1"
    And I select "Activities" on the Desktop Navigator
    And I will see desktop activities details screen
    And I select "All open" from "Activity Type" field on desktop activities details screen
    And I select the activity for subject "Review and approve new payment" for claim "300000101" for insured "Steve Knight-itb1" and for exposure "S99SJA - Steve Knight-itb1 - 1st Party Vehicle"
    And I click on approve activity on the desktop activities worksheet screen




   Scenario: Migration create payment and approve (BACS) partial (multi payments)
    And I select the Actions Popup Menu Hierarchy "Cheque" for parent "New Transaction"
    And I will see post FNOL New System Cheque Step1 screen
    And I select "Steve Knight-itb1" from field "Claimant" at New System Cheque Step1 post FNOL
    And I select "Steve Knight-itb1" from field "Payee" at New System Cheque Step1 post FNOL
    And I select "EFT" Payment Method at New System Cheque Step1 post FNOL
    And I input "Co-op Bank" into the "EFT Bank Name" field at New System Cheque Step1 post FNOL
    And I input "11118888" into the "EFT AccountNumber" field at New System Cheque Step1 post FNOL
    And I input "089900" into the "EFT SortCode" field at New System Cheque Step1 post FNOL
    And I click next button on New System Cheque Step1 post FNOL
    And I will see post FNOL New System Cheque Step2 screen
    And I select "S99SJA - Steve Knight-itb1 - 1st Party Vehicle; Claim Cost/Accidental Damage Repair" from field "Reserve Line" at New System Cheque Step2 post FNOL
    And I select "Partial" from field "Payment Type" at New System Cheque Step2 post FNOL
    And I input "This is a test comment1" into the "Internal Comments" field at New System Cheque Step2 post FNOL
    And I input "11.99" into the "Line Item Amount" field at New System Cheque Step2 post FNOL
    And I click "add payment" button on New System Cheque Step2 post FNOL
    
    And I select "S99SJA - Steve Knight-itb1 - 1st Party Vehicle; Claim Cost/Accidental Damage Repair" from field "Reserve Line" at New System Cheque Step2 post FNOL
    And I select "Partial" from field "Payment Type" at New System Cheque Step2 post FNOL
    And I input "This is a test comment2" into the "Internal Comments" field at New System Cheque Step2 post FNOL
    And I input "11.99" into the "Line Item Amount" field at New System Cheque Step2 post FNOL
    And I click "next" button on New System Cheque Step2 post FNOL
    And I will see post FNOL New System Cheque Step3 screen
    And I input "myref123" into the "Reference" field at New System Cheque Step3 post FNOL
    And I input "the purpose of this BACS payment is to reimburse you" into the "Purpose" field at New System Cheque Step3 post FNOL
    And I click finish button on New System Cheque Step3 post FNOL
    And I will see post FNOL Financials Cheques screen
    And I will log off
    
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADTeamManagerTm1"
    And I select "Activities" on the Desktop Navigator
    And I will see desktop activities details screen
    And I select "All open" from "Activity Type" field on desktop activities details screen
    And I select the activity for subject "Review and approve new payment" for claim "300000101" for insured "Steve Knight-itb1" and for exposure "S99SJA - Steve Knight-itb1 - 1st Party Vehicle"
    And I click on approve activity on the desktop activities worksheet screen


