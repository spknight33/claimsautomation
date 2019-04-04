@Ignore @Passed04042019
Feature: CBPCL-502  Create a payment and approve

  Background: 
    Given I use test data set "postfnol_set1"

  Scenario Outline: CBPCL-502 create payment and approve
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "<cheque creator role>"
    And I Select existing Claim "300000015"
    And I select the Actions Popup Menu Hierarchy "Cheque"
    And I will see post FNOL New System Cheque Step1 screen
    And I select "Doug Dimmerdome" from field "Claimant" at New System Cheque Step1 post FNOL
    And I select "Doug Dimmerdome" from field "Payee" at New System Cheque Step1 post FNOL
    And I select "Cheque" Payment Method at New System Cheque Step1 post FNOL
    And I click next button on New System Cheque Step1 post FNOL
    And I will see post FNOL New System Cheque Step2 screen
    And I select "ND58HFL - Doug Dimmerdome - 1st Party Vehicle; Claim Cost/Accidental Damage Repair" from field "Reserve Line" at New System Cheque Step2 post FNOL
    And I select "Partial" from field "Payment Type" at New System Cheque Step2 post FNOL
    And I input "This is a test comment" into the "Internal Comments" field at New System Cheque Step2 post FNOL
    And I input "<amount>" into the "Line Item Amount" field at New System Cheque Step2 post FNOL
    And I click next button on New System Cheque Step2 post FNOL
    And I will see post FNOL New System Cheque Step3 screen
    And I input "myref123" into the "Reference" field at New System Cheque Step3 post FNOL
    And I input "the purpose of this payment is to reimburse you" into the "Purpose" field at New System Cheque Step3 post FNOL
    And I click finish button on New System Cheque Step3 post FNOL
    And I will see post FNOL Financials Cheques screen
    And I will log off
    
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "<cheque approver role>"
    And I select "Activities" on the Desktop Navigator
    And I will see desktop activities details screen
    And I select "All open" from "Activity Type" field on desktop activities details screen
    And I select the activity for subject "Review and approve new payment" for claim "300000015" for insured "Doug Dimmerdome" and for exposure "ND58HFL - Doug Dimmerdome - 1st Party Vehicle"
    And I click on approve activity on the desktop activities worksheet screen

    Examples: 
      | cheque creator role     | amount | cheque approver role |
      | ADClaimsHandlerTm1      |   1.99 | ADTeamManagerTm1     |
      | ADClaimsHandlerTm2      |   2.99 | ADTeamManagerTm2     |
      | ClaimsSupportHandlerTm1 |   3.99 | CSTeamManagerTm1     |
      | ClaimsSupportHandlerTm2 |   4.99 | CSTeamManagerTm2     |
      | PIClaimsHandlerTm1      |   5.99 | PITeamManagerTm1     |
      | PIClaimsHandlerTm2      |   6.99 | PITeamManagerTm2     |
      | CHClaimsHandlerTm1      |   7.99 | CHTeamManagerTm1     |
      | TPCClaimsHandlerTm1     |   8.99 | TPCTeamManagerTm1    |
      | TPDClaimsHandlerTm1     |   9.99 | TPDTeamManagerTm1    |
      | SIUUserTm1              |  10.99 | SIUManagerTm1        |
      | ADTeamManagerTm1        |   1.01 | CustOpsTeamManager   |
      | ADTeamManagerTm2        |   2.01 | CustOpsTeamManager   |
      | CSTeamManagerTm1        |   3.01 | CustOpsTeamManager   |
      | CSTeamManagerTm2        |   4.01 | CustOpsTeamManager   |
      | TPCTeamManagerTm1       |   5.01 | CustOpsTeamManager   |
      | TPDTeamManagerTm1       |   6.01 | CustOpsTeamManager   |
      | CHTeamManagerTm1        |   7.01 | TechOpsTeamManager   |
      | PITeamManagerTm1        |   8.01 | TechOpsTeamManager   |
      | PITeamManagerTm2        |   9.01 | TechOpsTeamManager   |
      | SIUManagerTm1           |  10.01 | TechOpsTeamManager   |
