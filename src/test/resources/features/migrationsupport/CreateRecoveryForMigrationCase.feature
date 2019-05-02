@Ignore @migrationsupport
Feature: migration support - create recovery 

  Background: 
    Given I use test data set "postfnol_set1"
     Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000101"

  Scenario: Migration Create Recovery 
    And I select the Actions Popup Menu Hierarchy "Recovery" for parent "New Transaction"
    And I will see post FNOL Recovery screen
    And I select "Charles Trent Ltd (Insured Jobs)" from "Payer" field on post FNOL Recovery screen
    
    And I click "Add" on post FNOL Recovery screen
   
    And I create a recovery for reserve "S99SJA - Steve Knight-itb1 - 1st Party Vehicle; Claim Cost/Accidental Damage Repair" and category "Salvage" and amount "100"
    And I click "Update" on post FNOL Recovery screen
    
    

