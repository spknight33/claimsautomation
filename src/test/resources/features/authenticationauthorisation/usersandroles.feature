Feature: CBPCL-71 As a user I want to login to Claims Center with the correct role

  Background: 
    Given I access ClaimCenter login page

  @Ignore
  Scenario Outline: CBPCL-71 TC7 login valid user and check role
    When I login to ClaimCenter as "<user>" with "<password>"
    Then I will be logged on to ClaimsCenter desktop
    Then I will see "<menu options>" relevant to my "<role>"
    And I will not see "<not allowed menu options>" which are not relevant to my "<role>"

    Examples: 
      | user         | password | role             | menu options                                     | not allowed menu options |
      | sthomson     | gw       | Claims Handler   | Desktop,Claim,Search,Address Book                | Administration           |
      | rhenderson   | gw       | Team Manager     | Desktop,Claim,Search,Address Book,Dashboard,Team | Administration           |
      | bchmielewska | gw       | Claims Manager   | Desktop,Claim,Search,Address Book,Dashboard,Team | Administration           |
      | awilson      | gw       | Operations Admin | Claim                                            | Administration           |
      | jbutler      | gw       | IT Admin         | Desktop,Claim,Search,Address Book,Administration |                          |

  @Ignore
  Scenario Outline: top menus are accessible
    When I login to ClaimCenter as "<user>" with "<password>"
    Then I can select top level menus "<menu options>"

    Examples: 
      | user         | password | role             | menu options                                     |
      | sthomson     | gw       | Claims Handler   | Desktop,Claim,Search,Address Book                |
      | rhenderson   | gw       | Team Manager     | Desktop,Claim,Search,Address Book,Dashboard,Team |
      | bchmielewska | gw       | Claims Manager   | Desktop,Claim,Search,Address Book,Dashboard,Team |
      | awilson      | gw       | Operations Admin | Claim                                            |
      | jbutler      | gw       | IT Admin         | Desktop,Claim,Search,Address Book,Administration |

  Scenario Outline: sub menus are accessible
    When I login to ClaimCenter as "<user>" with "<password>"
    Then I can select sub level menus "<sub menus>" for menu "<top menu>"

    Examples: 
      | user     | password | role           | top menu | sub menus                                                     |
      | sthomson | gw       | Claims Handler | Desktop  | Activities                                                    |
      | sthomson | gw       | Claims Handler | Desktop  | Claims                                                        |
      | sthomson | gw       | Claims Handler | Desktop  | Exposures                                                     |
      | sthomson | gw       | Claims Handler | Desktop  | Subrogations                                                  |
      | sthomson | gw       | Claims Handler | Desktop  | Queues                                                        |
      | sthomson | gw       | Claims Handler | Desktop  | Bulk Invoices                                                 |
      | sthomson | gw       | Claims Handler | Search   | Activities                                                    |
      | sthomson | gw       | Claims Handler | Search   | Checks                                                        |
      | sthomson | gw       | Claims Handler | Search   | Recoveries                                                    |
      | sthomson | gw       | Claims Handler | Search   | Bulk Invoices                                                 |
      | sthomson | gw       | Claims Handler | Desktop  | Activities,Claims,Exposures,Subrogations,Queues,Bulk Invoices |
 # some of these work individally but not one after another
