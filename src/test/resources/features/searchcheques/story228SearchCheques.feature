@Ignore
Feature: CBPCL-228 Search Cheques

Background:
Given I use test data set "regression_accident_nonfault"
Given I access ClaimCenter login page

  Scenario: search for cheque
    
    When I login to ClaimCenter as role "ADTeamManager"
    Then I can select top level menu "Search"
    And I select "Cheques" on the Search Navigator
    And I select "Yes" from field "Include Child Groups" on search Cheques screen
    And I select "Pending approval" from field "Cheque Status" on search Cheques screen
    And I search for "Accident" field "Approved By Group" on search Cheques screen

    And I will be on the search Groups screen
    And I input "accidental damage" into the "Group Name" box on search Groups screen
    And I select "Search" on search Groups screen
    And I select the first item on search results Groups screen
    And I select "Search" on search Cheques screen