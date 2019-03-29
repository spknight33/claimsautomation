@Ignore
Feature: Check that main components of the claim system are present when viewing an existing claim

  Background: 
    Given I use test data set "postfnol_set1"

  Scenario Outline: Check All Navigator sections for roles
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "<role>"
    And I Select an existing Claim
    
  #  And I select "Overview" submenu for "Summary" on the Claim Navigator
  #  And I will see post FNOL summary details
  #  And I select "Status" submenu for "Summary" on the Claim Navigator
  #  And I will see post FNOL summary status screen
  #  And I select "Health Metrics" submenu for "Summary" on the Claim Navigator
  #  And I will see post FNOL summary health metrics screen
    
  #  And I select "TP Care" on the Claim Navigator
  #  And I will be on TP Care screen
  #  And I select "Workplan" on the Claim Navigator
  #  And I will see post FNOL Workplan screen
    
    
  #  And I select "General" submenu for "Loss Details" on the Claim Navigator
  #  And I will see post FNOL loss details
  #  And I select "Associations" submenu for "Loss Details" on the Claim Navigator
  #  And I select "Special Investigation Details" submenu for "Loss Details" on the Claim Navigator
    
    And I select "Exposures" on the Claim Navigator
    And I will see post FNOL exposures screen
    
    And I select "Contacts" submenu for "Parties Involved" on the Claim Navigator
    And I will see post FNOL Parties Involved Contacts screen
    And I select "Users" submenu for "Parties Involved" on the Claim Navigator
    And I will see post FNOL Parties Involved Users screen
    
    And I select "General" submenu for "Policy" on the Claim Navigator
    And I will see post FNOL Policy General screen
    And I select "Vehicles" submenu for "Policy" on the Claim Navigator
    And I will see post FNOL Policy Vehicles screen
    
    And I select "Summary" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Financials Summary screen
    And I select "Reserves" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Reserves screen
    And I select "Cheques" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Financials Cheques screen
    And I select "Transactions" submenu for "Financials" on the Claim Navigator
    And I will see post FNOL Financials Transactions screen
    
     And I select "Evaluations" submenu for "Plan of Action" on the Claim Navigator
    And I select "Negotiations" submenu for "Plan of Action" on the Claim Navigator
    
    And I select "Loss Details" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Exposures" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Notes" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Documents" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Additional Fields" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Policy" submenu for "FNOL Snapshot" on the Claim Navigator
    And I select "Parties Involved" submenu for "FNOL Snapshot" on the Claim Navigator

    Examples: 
      | role                 |
      | ADClaimsHandlerTm1      |
   
   @Ignore
    Examples:
      | TPCClaimsHandler     |
      | PIClaimsHandler      |
      | CHClaimsHandler      |
      | SIUUser              |
      | ClaimsSupportHandlerTm1 |
      | TPDClaimsHandler     |
      | ADTeamManager        |
      | TPCTeamManager       |
      | TPDTeamHandler       |
      | PITeamManager        |
      | TCHTeamManager       |
      | CSTeamManager        |
      | SIUManager           |
      | ClaimsManager        |
      | ITAdmin              |
