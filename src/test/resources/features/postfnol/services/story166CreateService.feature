@Ignore
Feature: CBPCL-166  As a Claims Support Handler, Claims Handler, Team Manager, SIU or SIU Manager we need to be able to view the Services screen.

  Background: 
    Given I use test data set "postfnol_set1"
    Given I access ClaimCenter login page
    

@Ignore
  Scenario: CBPCL-166 TC1  ClaimsHandler can view Services screen for existing claim and add a new service
  Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Service"
    And I will see post FNOL New Service screen
    And I select "Claim" from "Related To" on New Service screen for post FNOL
    And I click Add Service to Perform on New Service screen for post FNOL
    And I filter and select service "Repair" on New Service screen for post FNOL
    And I select "Perform Service" from "Request Type" on New Service screen for post FNOL
    And I click Search Vendor on New Service screen for post FNOL
    And I will be on the search address book screen for Vendors
    # And I input "Capio" into the "Search Name" box on search address book screen
    And I select "Search" on search address book screen
    And I select "Select First Result" on search address book screen
    And I input "please repair this vehicle for us" into the "Additional" box on New Service screen for post FNOL
    And I input "24/02/2019" into the "Completion Date" box on New Service screen for post FNOL
    And I select "steve anderson" from "Customer Contact" on New Service screen for post FNOL
    And I select "7 Fieldside, Sunderland, SR6 7LA" from "Service Address" on New Service screen for post FNOL
    And I click submit button on New Service screen for post FNOL
    And I will see post FNOL Services screen
    And I will see the service progress "Work Complete" on the post FNOL Services screen
    
    @Ignore
    Scenario: CBPCL-166 TC2  ClaimsSupportHandler can view Services screen for existing claim and add a new service
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ClaimsSupport"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Service"
    And I will see post FNOL New Service screen
    And I select "Claim" from "Related To" on New Service screen for post FNOL
    And I click Add Service to Perform on New Service screen for post FNOL
    And I filter and select service "Repair" on New Service screen for post FNOL
    And I select "Perform Service" from "Request Type" on New Service screen for post FNOL
    And I click Search Vendor on New Service screen for post FNOL
    And I will be on the search address book screen for Vendors
    # And I input "Capio" into the "Search Name" box on search address book screen
    And I select "Search" on search address book screen
    And I select "Select First Result" on search address book screen
    And I input "please repair this vehicle for us" into the "Additional" box on New Service screen for post FNOL
    And I input "24/02/2019" into the "Completion Date" box on New Service screen for post FNOL
    And I select "steve anderson" from "Customer Contact" on New Service screen for post FNOL
    And I select "7 Fieldside, Sunderland, SR6 7LA" from "Service Address" on New Service screen for post FNOL
    And I click submit button on New Service screen for post FNOL
    And I will see post FNOL Services screen
    And I will see the service progress "Work Complete" on the post FNOL Services screen

    @Ignore
    Scenario: CBPCL-166 TC3  Team Manager can view Services screen for existing claim and add a new service
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "TeamManager"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Service"
    And I will see post FNOL New Service screen
    And I select "Claim" from "Related To" on New Service screen for post FNOL
    And I click Add Service to Perform on New Service screen for post FNOL
    And I filter and select service "Repair" on New Service screen for post FNOL
    And I select "Perform Service" from "Request Type" on New Service screen for post FNOL
    And I click Search Vendor on New Service screen for post FNOL
    And I will be on the search address book screen for Vendors
    # And I input "Capio" into the "Search Name" box on search address book screen
    And I select "Search" on search address book screen
    And I select "Select First Result" on search address book screen
    And I input "please repair this vehicle for us" into the "Additional" box on New Service screen for post FNOL
    And I input "24/02/2019" into the "Completion Date" box on New Service screen for post FNOL
    And I select "steve anderson" from "Customer Contact" on New Service screen for post FNOL
    And I select "7 Fieldside, Sunderland, SR6 7LA" from "Service Address" on New Service screen for post FNOL
    And I click submit button on New Service screen for post FNOL
    And I will see post FNOL Services screen
    And I will see the service progress "Work Complete" on the post FNOL Services screen
    
    @Ignore
      Scenario: CBPCL-166 TC4  SIU Manager can view Services screen for existing claim and add a new service
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "SIUManager"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Service"
    And I will see post FNOL New Service screen
    And I select "Claim" from "Related To" on New Service screen for post FNOL
    And I click Add Service to Perform on New Service screen for post FNOL
    And I filter and select service "Repair" on New Service screen for post FNOL
    And I select "Perform Service" from "Request Type" on New Service screen for post FNOL
    And I click Search Vendor on New Service screen for post FNOL
    And I will be on the search address book screen for Vendors
    # And I input "Capio" into the "Search Name" box on search address book screen
    And I select "Search" on search address book screen
    And I select "Select First Result" on search address book screen
    And I input "please repair this vehicle for us" into the "Additional" box on New Service screen for post FNOL
    And I input "24/02/2019" into the "Completion Date" box on New Service screen for post FNOL
    And I select "steve anderson" from "Customer Contact" on New Service screen for post FNOL
    And I select "7 Fieldside, Sunderland, SR6 7LA" from "Service Address" on New Service screen for post FNOL
    And I click submit button on New Service screen for post FNOL
    And I will see post FNOL Services screen
    And I will see the service progress "Work Complete" on the post FNOL Services screen
    
       Scenario: CBPCL-166 TC5  SIU User can view Services screen for existing claim and add a new service
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "SIUUser"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Service"
    And I will see post FNOL New Service screen
    And I select "Claim" from "Related To" on New Service screen for post FNOL
    And I click Add Service to Perform on New Service screen for post FNOL
    And I filter and select service "Repair" on New Service screen for post FNOL
    And I select "Perform Service" from "Request Type" on New Service screen for post FNOL
    And I click Search Vendor on New Service screen for post FNOL
    And I will be on the search address book screen for Vendors
    # And I input "Capio" into the "Search Name" box on search address book screen
    And I select "Search" on search address book screen
    And I select "Select First Result" on search address book screen
    And I input "please repair this vehicle for us" into the "Additional" box on New Service screen for post FNOL
    And I input "24/02/2019" into the "Completion Date" box on New Service screen for post FNOL
    And I select "steve anderson" from "Customer Contact" on New Service screen for post FNOL
    And I select "7 Fieldside, Sunderland, SR6 7LA" from "Service Address" on New Service screen for post FNOL
    And I click submit button on New Service screen for post FNOL
    And I will see post FNOL Services screen
    And I will see the service progress "Work Complete" on the post FNOL Services screen