@Ignore
Feature: CBPCL-50 

     @Ignore
     Scenario: CBPCL-50 TC2 -ClaimsHandler can select REPAIR service and see search defaults for contact manager for a Repair service
    Given I use test data set "autoexposure_set6"
    Given As a "ADClaimsHandler" I am at step4 for FNOL
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
    
    
    Scenario: CBPCL-50 TC3 -ClaimsHandler can select other services
    Given I use test data set "autoexposure_set6"
    Given As a "ADClaimsHandler" I am at step4 for FNOL
    And I select "Yes" from field "PH Claiming" at step4 FNOL
    And I click the "Other" service checkbox at step4 FNOL
    And I click Add Other Service button on step4 FNOL
    And I will see FNOL New Service screen
    And I select "Claim" from "Related To" on New Service screen for FNOL
    And I click Add Service to Perform on New Service screen for FNOL
    And I filter and select service "Repair" on New Service screen for FNOL
    And I select "Perform Service" from "Request Type" on New Service screen for FNOL
    And I click Search Vendor on New Service screen for FNOL
    And I will be on the search address book screen for Vendors
    And I select "Search" on search address book screen
    And I select "Select First Result" on search address book screen
    And I input "please repair this vehicle for us" into the "Additional" box on New Service screen for FNOL
    And I input "24/02/2019" into the "Completion Date" box on New Service screen for FNOL
  #  And I select "steve anderson" from "Customer Contact" on New Service screen for FNOL
    And I select "30 Baden Powell Street, Gateshead, NE9 5LD" from "Service Address" on New Service screen for FNOL
    And I click ok button on New Service screen for FNOL
    #And I will see post FNOL Services screen
   # And I will see the service progress "Work Complete" on the post FNOL Services screen
    
    
   # Then I will be on the search address book screen for Vendors
  #  And I select "Cancel" on search address book screen
    
   
    
    
  #  And I select "Search" on search address book screen
  #  And I select the first item on search results address book screen
 #   And I will see "Limit to service vendors" is ticked on search address book screen 
#And I will see the service category "Auto" Subcategory "Repairer" service type "Repair"