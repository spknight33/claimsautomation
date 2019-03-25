@Ignore
Feature: CBPCL-204


@Ignore
  Scenario: CBPCL-204 TC4
    Given I use test data set "regress_fnol_accident_fault"
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Close Claim"
    And I will be on Claim Close screen
    And I input "This is a test close of claim" into the "Note" box on Close Claim screen
    And I select "Completed" from "Outcome" field on Close Claim screen
    And I click Close Claim button on Close Claim screen
    Then Error messages will be shown on Close Claim screen
      | Recovery reserve still outstanding and the exposure is unable to close. |

      
       Scenario: CBPCL-204 TC1
    Given I use test data set "regress_fnol_accident_fault"
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Close Claim"
    And I will be on Claim Close screen
    And I input "This is a test close of claim" into the "Note" box on Close Claim screen
    And I select "Completed" from "Outcome" field on Close Claim screen
    And I click Close Claim button on Close Claim screen
    Then I will see "Closed" in field "Status" on Claim Info Bar
    And I select "Exposures" on the Claim Navigator
    And All exposures are at status "Closed" on post FNOL exposures screen