
Feature: CBPCL-71 As a user I want to login to Claims Center with the correct role

  Background: 
    Given I access ClaimCenter login page

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
