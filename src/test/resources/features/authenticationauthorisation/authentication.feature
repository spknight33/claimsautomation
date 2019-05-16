@Ignore
Feature: test user logins

  Background: 
    Given I use test data set "postfnol_set1"
    Given I access ClaimCenter login page

  Scenario Outline: TC1 login as a team member
    And I login to ClaimCenter as role "<role>"
    Then I will be logged on to ClaimsCenter desktop

    Examples: 
      | role                    |
      | ADClaimsHandlerTm1      |
      | ADClaimsHandlerTm2      |
      | ClaimsSupportHandlerTm1 |
      | ClaimsSupportHandlerTm2 |
      | PIClaimsHandlerTm1      |
      | PIClaimsHandlerTm2      |
      | CHClaimsHandlerTm1      |
      | TPCClaimsHandlerTm1     |
      | TPDClaimsHandlerTm1     |
      | SIUUserTm1              |
      | ADTeamManagerTm1        |
      | ADTeamManagerTm2        |
      | CSTeamManagerTm1        |
      | CSTeamManagerTm2        |
      | TPCTeamManagerTm1       |
      | TPDTeamManagerTm1       |
      | CHTeamManagerTm1        |
      | PITeamManagerTm1        |
      | PITeamManagerTm2        |
      | SIUManagerTm1           |
      | Finance                 |
      | ITAdmin                 |
