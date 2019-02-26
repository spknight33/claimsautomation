@Ignore
Feature: CBPCL-xx

  Background: 
    And I use test data set "postfnol_set1"
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandler"

  Scenario: CBPCL-xx TC1
    And I Select an existing Claim
    
    And I select "Overview" submenu for "Summary" on the Claim Navigator
    
    And I select "Status" submenu for "Summary" on the Claim Navigator
    And I will see post FNOL summary status screen
    And I select "Health Metrics" submenu for "Summary" on the Claim Navigator
    And I will see post FNOL summary health metrics screen
    
    And I select "General" submenu for "Loss Details" on the Claim Navigator
    And I select "Associations" submenu for "Loss Details" on the Claim Navigator
    And I select "Special Investigation Details" submenu for "Loss Details" on the Claim Navigator
    
    And I select "Contacts" submenu for "Parties Involved" on the Claim Navigator
    And I will see post FNOL Parties Involved Contacts screen
    And I select "Users" submenu for "Parties Involved" on the Claim Navigator
    And I will see post FNOL Parties Involved Users screen
    
    And I select "General" submenu for "Policy" on the Claim Navigator
    And I will see post FNOL Policy General screen
    And I select "vehicles" submenu for "Policy" on the Claim Navigator
    And I will see post FNOL Policy Vehicles screen
    
    And I select "Transactions" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Financials Transactions screen
    And I select "Cheques" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Financials Cheques screen
    And I select "Summary" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Financials Summary screen
    
     And I select "Evaluations" submenu for "Plan of Action" on the Claim Navigator
    And I select "Negotiations" submenu for "Plan of Action" on the Claim Navigator
    
    And I select "Loss Details" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Exposures" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Notes" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Documents" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Additional Fields" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Policy" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Parties Involved" submenu for "FNOL Snapshot" on the Claim Navigator

