@Ignore
Feature: CBPCL-58 As a ClaimCenter user with the role of Claims Handler or Team Manager I want ClaimCenter to establish the initial claim workplan for a Personal Auto claim.

  Background: 
  And I use test data set "regress_fnol_accident_fault"
  #  Given I access ClaimCenter login page
  #      And I login to ClaimCenter as role "ADClaimsHandlerTm1"

  Scenario: CBPCL-58 TC1
  #  And I Select an existing Claim
  #  And I select "Workplan" on the Claim Navigator
  #  And I will see post FNOL Workplan screen
  #  And I select "All open activities" from "Activities" on Workplan screen for post FNOL
  #  And I select the Actions Popup Menu Hierarchy "Reminder,30 day diary"
  #  And I will see post FNOL New Activity screen
    And I select "High" from "Priority" on New Activity screen for post FNOL
     And I select "Scott Thomson (Technical Ops)" from "Assign To" on New Activity screen for post FNOL
     And I select "Not On Calendar" from "Calendar Importance" on New Activity screen for post FNOL
     And I click update button on New Activity screen for post FNOL
     And I will see post FNOL Workplan screen
     And I will see the "30 day diary" activity on Workplan screen for post FNOL
     And I select the "30 day diary" activity on Workplan screen for post FNOL
     And I select the Actions Popup Menu Hierarchy "Reminder,General reminder (diary)"
    And I will see post FNOL New Activity screen
    And I select "Low" from "Priority" on New Activity screen for post FNOL
     And I select "Scott Thomson (Technical Ops)" from "Assign To" on New Activity screen for post FNOL
     And I select "Not On Calendar" from "Calendar Importance" on New Activity screen for post FNOL
     And I click update button on New Activity screen for post FNOL
     And I will see post FNOL Workplan screen
     And I will see the "General reminder (diary)" activity on Workplan screen for post FNOL
     And I select the "General reminder (diary)" activity on Workplan screen for post FNOL