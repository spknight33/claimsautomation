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
      | role          | menu options                                     | not allowed menu options |
      | ClaimsHandler | Desktop,Claim,Search,Address Book                | Administration           |
      | TeamManager   | Desktop,Claim,Search,Address Book,Dashboard,Team | Administration           |
      | ClaimsManager | Desktop,Claim,Search,Address Book,Dashboard,Team | Administration           |
      | OpsAdmin      | Claim                                            | Administration           |
      | ITAdmin       | Desktop,Claim,Search,Address Book,Administration |                          |

  @Ignore
  Scenario Outline: top menus are accessible
    When I login to ClaimCenter as role "<role>"
    Then I can select top level menus "<menu options>"

    Examples: 
      | role          | menu options                                     |
      | ClaimsHandler | Desktop,Claim,Search,Address Book                |
      | TeamManager   | Desktop,Claim,Search,Address Book,Dashboard,Team |
      | ClaimsManager | Desktop,Claim,Search,Address Book,Dashboard,Team |
      | OpsAdmin      | Claim                                            |
      | ITAdmin       | Desktop,Claim,Search,Address Book,Administration |

  @Ignore
  Scenario Outline: sub menus are accessible
    When I login to ClaimCenter as role "<role>"
    Then I can select sub level menus "<sub menus>" for menu "<top menu>"

    Examples: 
      | role          | top menu | sub menus                                                     |
      | ClaimsHandler | Desktop  | Activities                                                    |
      | ClaimsHandler | Desktop  | Claims                                                        |
      | ClaimsHandler | Desktop  | Exposures                                                     |
      | ClaimsHandler | Desktop  | Subrogations                                                  |
      | ClaimsHandler | Desktop  | Queues                                                        |
      | ClaimsHandler | Desktop  | Bulk Invoices                                                 |
      | ClaimsHandler | Search   | Activities                                                    |
      | ClaimsHandler | Search   | Checks                                                        |
      | ClaimsHandler | Search   | Recoveries                                                    |
      | ClaimsHandler | Search   | Bulk Invoices                                                 |
      | ClaimsHandler | Desktop  | Activities,Claims,Exposures,Subrogations,Queues,Bulk Invoices |
 # some of these work individally but not one after another
