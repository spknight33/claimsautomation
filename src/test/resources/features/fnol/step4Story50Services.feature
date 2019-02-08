@Ignore
Feature: CBPCL-50 

     Scenario: CBPCL-50 TC2 -ClaimsHandler can select REPAIR service and see search defaults for contact manager for a Repair service
    Given I use test data set "autoexposure_set6"
    Given As a "ClaimsHandler" I am at step4 for FNOL
    And I select "Yes" from field "PH Claiming" at step4 FNOL
    And I click the "Repair" service checkbox at step4 FNOL
    And I click the Search menu for the "Repair" service at step4 FNOL
    Then I will be on the search address book screen for Vendors
    And I select "Cancel" on search address book screen
    
    And I click the "Recovery" service checkbox at step4 FNOL
    And I click the Search menu for the "Recovery" service at step4 FNOL
    Then I will be on the search address book screen for Vendors
    And I select "Cancel" on search address book screen
    
    And I click the "Salvage" service checkbox at step4 FNOL
    And I click the Search menu for the "Salvage" service at step4 FNOL
    Then I will be on the search address book screen for Vendors
    And I select "Cancel" on search address book screen
    
    And I click the "Inspection" service checkbox at step4 FNOL
    And I click the Search menu for the "Inspection" service at step4 FNOL
    Then I will be on the search address book screen for Vendors
    And I select "Cancel" on search address book screen
    
    And I click the "Non Fault Referral" service checkbox at step4 FNOL
    And I click the Search menu for the "Non Fault Referral" service at step4 FNOL
    Then I will be on the search address book screen for Vendors
    And I select "Cancel" on search address book screen
    
    And I click the "Non Fault Vehicle Referral" service checkbox at step4 FNOL
    And I click the Search menu for the "Non Fault Vehicle Referral" service at step4 FNOL
    Then I will be on the search address book screen for Vendors
    And I select "Cancel" on search address book screen
    
  #  And I select "Search" on search address book screen
  #  And I select the first item on search results address book screen
 #   And I will see "Limit to service vendors" is ticked on search address book screen 
#And I will see the service category "Auto" Subcategory "Repairer" service type "Repair"