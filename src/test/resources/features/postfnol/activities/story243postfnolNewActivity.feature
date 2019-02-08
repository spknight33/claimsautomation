@Ignore
Feature: CBPCL-243 As a TPC Handler I want to be able to set subsequent call attempt activities for a date and specific time (down to minutes).
  SO that I can call a TP back at the time they suggest or be reminded to attempt to try again to contact them as its an urgent process.

  Background: 
    Given I use test data set "postfnol_set1"


  Scenario: CBPCL-243 TC1, TC2 -When creating a new activity on a claim, the due date and overdue date will include the time in 24 hour format
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Reminder,30 day diary"
    And I will see post FNOL New Activity screen
    And I input "30 day diary adjusted" into the "Subject" box on New Activity screen for post FNOL
    And I input "This is a test description add to the activity" into the "Description" box on New Activity screen for post FNOL
    And I input "20/02/2019 15:35" into the "Due Date" box on New Activity screen for post FNOL
    And I input "20/02/2019 15:36" into the "Overdue Date" box on New Activity screen for post FNOL
    And I select "Urgent" from "Priority" on New Activity screen for post FNOL
    And I select "Not On Calendar" from "Calendar Importance" on New Activity screen for post FNOL
    And I select "yes" from "Externally Owned" on New Activity screen for post FNOL
    And I click update button on New Activity screen for post FNOL
    And I will see post FNOL Workplan screen


     Scenario: TC3 - When creating a new activity on a claim, error message shown for invalid time for due date/overdue date
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ClaimsHandler"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Reminder,30 day diary"
    And I will see post FNOL New Activity screen
    And I input "30 day diary adjusted" into the "Subject" box on New Activity screen for post FNOL
    And I input "This is a test description add to the activity" into the "Description" box on New Activity screen for post FNOL
     And I select "Urgent" from "Priority" on New Activity screen for post FNOL
    And I input "20/02/2019 24:00" into the "Due Date" box on New Activity screen for post FNOL
    #And I input "20/02/2019 24:00" into the "Overdue Date" box on New Activity screen for post FNOL
    
    Then field error messages will be shown on New Activity screen for post FNOL
      | Due Date : Field must be a valid date/time in the format   |
    #  | Overdue Date : Field must be a valid date/time in the format  |
   
   
   Scenario: CBPCL-243 TC4 - When creating a new activity on a claim, due date is mandatory
Given I access ClaimCenter login page
And I login to ClaimCenter as role "ClaimsHandler"
And I Select an existing Claim
And I select the Actions Popup Menu Hierarchy "Reminder,30 day diary"
And I will see post FNOL New Activity screen
And I input "30 day diary adjusted" into the "Subject" box on New Activity screen for post FNOL
And I input "This is a test description add to the activity" into the "Description" box on New Activity screen for post FNOL
And I select "Low" from "Calendar Importance" on New Activity screen for post FNOL
And I input "" into the "Due Date" box on New Activity screen for post FNOL
And I click update button on New Activity screen for post FNOL
Then field error messages will be shown on New Activity screen for post FNOL
| Due Date : Missing required field "Due Date" |


 Scenario: CBPCL-243 TC5 - When creating a new activity on a claim, overdue date is not mandatory
Given I access ClaimCenter login page
And I login to ClaimCenter as role "ClaimsHandler"
And I Select an existing Claim
And I select the Actions Popup Menu Hierarchy "Reminder,30 day diary"
And I will see post FNOL New Activity screen
And I input "30 day diary adjusted" into the "Subject" box on New Activity screen for post FNOL
And I input "This is a test description add to the activity" into the "Description" box on New Activity screen for post FNOL
And I input "" into the "Overdue Date" box on New Activity screen for post FNOL
And I click update button on New Activity screen for post FNOL


 Scenario: CBPCL-243 TC6 - When creating a new activity on a claim, overdue date time is defaulted to 00:01 if hours and minutes not set
Given I access ClaimCenter login page
And I login to ClaimCenter as role "ClaimsHandler"
And I Select an existing Claim
And I select the Actions Popup Menu Hierarchy "Reminder,30 day diary"
And I will see post FNOL New Activity screen
And I input "30 day diary adjusted" into the "Subject" box on New Activity screen for post FNOL
And I input "This is a test description add to the activity" into the "Description" box on New Activity screen for post FNOL
And I input "01/03/2019" into the "Overdue Date" box on New Activity screen for post FNOL
And I click update button on New Activity screen for post FNOL
And I will see the "30 day diary adjusted" activity on Workplan screen for post FNOL with Overdue Time "01/03/2019 00:01"

Scenario: CBPCL-243 TC7 - When creating a new activity on a claim, when over due time is set to 'now', the workplan shows the time red text
Given I access ClaimCenter login page
And I login to ClaimCenter as role "ClaimsHandler"
And I Select an existing Claim
And I select the Actions Popup Menu Hierarchy "Reminder,60 day diary"
And I will see post FNOL New Activity screen
And I input "60 day diary adjusted" into the "Subject" box on New Activity screen for post FNOL
And I input "This is a test description add to the activity" into the "Description" box on New Activity screen for post FNOL
And I input "Now" into the "Overdue Date" box on New Activity screen for post FNOL
And I click update button on New Activity screen for post FNOL
And I will see the "60 day diary adjusted" activity on Workplan screen for post FNOL with Overdue Time "now"
#And The text will be in red 