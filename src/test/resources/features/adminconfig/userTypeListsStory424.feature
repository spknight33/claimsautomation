@Ignore
Feature: CBPCL-424 admin maintenance of user typeslists

  Background: 
   Given  I use test data set "regress_fnol_accident_fault"
  
    
 
 Scenario: FNOL Regression - Create new claim
    Scenario:  CBPCL-424 TC1 -  As IT Admin I can view the configurable dropdown lists
		Given I access ClaimCenter login page
		And I login to ClaimCenter as role "ITAdmin"
	  And I can select top level menus "Administration"
    And I select "Reference Data" on the Administration Navigator