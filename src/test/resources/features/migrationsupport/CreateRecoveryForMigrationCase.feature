@Ignore @migrationsupport
Feature: migration support - create recovery reserve

  Background: 
    Given I use test data set "postfnol_set1"
     Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000101"

  Scenario: Migration Create Recovery reserve
    And I select the Actions Popup Menu Hierarchy "Recovery" for parent "New Transaction"
    And I will see post FNOL Create Recoveries screen
    And I click "edit" on post FNOL Reserves screen
    And I select the reserve for exposure "S99SJA - Steve Knight-itb1 - 1st Party Vehicle" and coverage "Accidental Damage" and sub type "Accidental Damage - Vehicle Damage"
    #And I select the reserve for exposure "PY17GGU - Roy Racer - 3rd Party Credit Hire" and coverage "Third Party Liability" and sub type "Liability - Credit Hire"
    And I click "add recovery reserve" on post FNOL Reserves screen
    #todo issue with setting the amount
    And I create a recovery reserve for category "Salvage" and amount "100"
   
    
    

