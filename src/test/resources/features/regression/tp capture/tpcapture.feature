
Feature: TP Capture Regression Tests

  Background: 
    Given I use test data set "regression_accident_fault"

  Scenario: TPC Regression -  View queue, activities and TPC table
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "TPCClaimsHandler"
    And I select "Queues" on the Desktop Navigator
    And I will see desktop queue details screen
   # And I will click assign next on desktop queue screen
    And I select "Activities" on the Desktop Navigator
		And I will see desktop activities details screen	
		And I click on claim on desktop activities screen
    And I select "TP Care" on the Claim Navigator
    And I will be on TP Care screen
    And I click edit button on TP Care screen
    And I select "Y" from field "Capture Opportunity" on TP Care screen for row "1")
    And I select "Low" from field "Lead Type" on TP Care screen for row "1")
    And I click update button on TP Care screen