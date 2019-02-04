@Ignore
Feature: CBPCL-xx

  Background: 
  And I use test data set "postfnol_set1"
    Given I access ClaimCenter login page
     And I login to ClaimCenter as role "ClaimsHandler"

  Scenario: CBPCL-xx TC1
  And I Select an existing Claim
  And I select "Transactions" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Financials Transactions screen

  And I select "Cheques" submenu for "Financials" on the Claim Navigator
And I will see post FNOL Financials Cheques screen

  And I select "Summary" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Financials Summary screen
    
    And I select "Loss Details" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Exposures" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Notes" submenu for "FNOL Snapshot" on the Claim Navigator
     And I select "Documents" submenu for "FNOL Snapshot" on the Claim Navigator
      And I select "Additional Fields" submenu for "FNOL Snapshot" on the Claim Navigator
  And I select "Policy" submenu for "FNOL Snapshot" on the Claim Navigator
   And I select "Parties Involved" submenu for "FNOL Snapshot" on the Claim Navigator