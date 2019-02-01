
Feature: CBPCL-220 todo

  Background: 
    Given I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ClaimsHandler"

  @Ignore
  Scenario: CBPCL-220 TC13 Notes seen on summary when added via Actions menu and are limited to 5 before paging is implemented
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Note"
    And I will see post FNOL New Note screen
    And I input "This is a short test note added to the claim" into the "Note Text" box on New Note screen for post FNOL
    And I input "some subject" into the "Subject" box on New Note screen for post FNOL
    And I select "Medical issues" from "Topic" on New Note screen for post FNOL
    And I select "Medical" from "Security Type" on New Note screen for post FNOL
    And I click update button on New Note screen for post FNOL

@Ignore
  Scenario: CBPCL-220 TC14 Multiple Activity seen on summary when added via Actions menu
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Correspondence,Send claim acknowledgement letter"
    And I will see post FNOL New Activity screen
    And I input "This is a 1st activity I just created" into the "Description" box on New Activity screen for post FNOL
    And I select "Not On Calendar" from "Calendar Importance" on New Activity screen for post FNOL
    And I click update button on New Activity screen for post FNOL

   @Ignore
      Scenario: CBPCL-220 TC15 Service seen on summary when added via Actions menu
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Service"
    And I will see post FNOL New Service screen
    And I select "Claim" from "Related To" on New Service screen for post FNOL
    And I select "Perform Service" from "Request Type" on New Service screen for post FNOL
    And I click submit button on New Service screen for post FNOL
    
    
    