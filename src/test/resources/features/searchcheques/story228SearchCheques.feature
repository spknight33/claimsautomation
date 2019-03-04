@Ignore
Feature: CBPCL-228 Search Cheques

Background:
Given I use test data set "regression_accident_nonfault"
Given I access ClaimCenter login page

  Scenario: search for cheque
    
    When I login to ClaimCenter as role "ADTeamManager"
    Then I can select top level menu "Search"
    And I select "Cheques" on the Search Navigator
    

