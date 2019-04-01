@Ignore
Feature: CBPCL-71 As a user I want to login to Claims Center with the correct role

  Background: 
    Given I access ClaimCenter login page

  @Ignore
  Scenario Outline: CBPCL-71 TC7 login valid user and check role
    When I login to ClaimCenter as role "<role>"
    Then I will be logged on to ClaimsCenter desktop
    Then I will see "<menu options>" relevant to my "<role>"
    And I will not see "<not allowed menu options>" which are not relevant to my "<role>"

    Examples: 
      | role               | menu options                                     | not allowed menu options |
      | ADClaimsHandlerTm1 | Desktop,Claim,Search,Address Book                | Administration           |
      | TeamManager        | Desktop,Claim,Search,Address Book,Dashboard,Team | Administration           |
      | ClaimsManager      | Desktop,Claim,Search,Address Book,Dashboard,Team | Administration           |
      | OpsAdmin           | Claim                                            | Administration           |
      | ITAdmin            | Desktop,Claim,Search,Address Book,Administration |                          |
  

  @Ignore
  Scenario Outline: top menus are accessible
    When I login to ClaimCenter as role "<role>"
    Then I can select top level menus "<menu options>"

    Examples: 
      | role               | menu options                                     |
      | ADClaimsHandlerTm1 | Desktop,Claim,Search,Address Book                |
      | TeamManager        | Desktop,Claim,Search,Address Book,Dashboard,Team |
      | ClaimsManager      | Desktop,Claim,Search,Address Book,Dashboard,Team |
      | OpsAdmin           | Claim                                            |
      | ITAdmin            | Desktop,Claim,Search,Address Book,Administration |

  @Ignore
  Scenario Outline: sub menus are accessible
    When I login to ClaimCenter as role "<role>"
    Then I can select sub level menus "<sub menus>" for menu "<top menu>"

    Examples: 
      | role               | top menu | sub menus                                                     |
      | ADClaimsHandlerTm1 | Desktop  | Activities                                                    |
      | ADClaimsHandlerTm1 | Desktop  | Claims                                                        |
      | ADClaimsHandlerTm1 | Desktop  | Exposures                                                     |
      | ADClaimsHandlerTm1 | Desktop  | Subrogations                                                  |
      | ADClaimsHandlerTm1 | Desktop  | Queues                                                        |
      | ADClaimsHandlerTm1 | Desktop  | Bulk Invoices                                                 |
      | ADClaimsHandlerTm1 | Search   | Activities                                                    |
      | ADClaimsHandlerTm1 | Search   | Checks                                                        |
      | ADClaimsHandlerTm1 | Search   | Recoveries                                                    |
      | ADClaimsHandlerTm1 | Search   | Bulk Invoices                                                 |
      | ADClaimsHandlerTm1 | Desktop  | Activities,Claims,Exposures,Subrogations,Queues,Bulk Invoices |
 # some of these work individally but not one after another
