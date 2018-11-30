Feature: CBPCL-71 As a user I want to login to Claims Center

  Background: 
    Given I access ClaimCenter login page
 
  Scenario Outline: CBPCL-71 TC7 login valid user
    When I login to ClaimCenter as "<user>" with "<password>"
    Then I will be logged on to ClaimsCenter desktop
    And I will log off

    Examples: 
      | user    | password |
      | sknight | gw       |
      | rhenderson   | gw       |

    @Ignore
    Examples: 
      | user         | password |
      | sknight      | gw       |
      | mbest        | gw       |
      | rhenderson   | gw       |
      | bchmielewska | gw       |
      | awilson      | gw       |
      | sakbar       | gw       |
      | gdick        | gw       |
      | jbutler      | gw       |

 
  Scenario Outline: invalid login should get error message
    When I login to ClaimCenter as "<user>" with "<password>"
    Then an error message "<error message displayed>" will be shown

    Examples: 
      | user     | password | error message displayed                      | validation reason  |
      | sthomson | GW       | The submitted user name/password is invalid. | uppercase password |
