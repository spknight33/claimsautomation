@Ignore
Feature: CBPCL-216 As a ClaimCenter user with the role of Adjuster or Manager,
  I want to be able update the details on the loss so that I can make sure that the data on the claim represents our current understanding of the loss.

  Background: 
    Given  I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ClaimsHandler"

@Ignore
 Scenario: CBPCL-47 TC11 Police details can be added in Loss Details of post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
   When I click add Police details on post FNOL loss details
   Then I will be on new police details screen for post FNOL
   And I complete fields on post FNOL new police details screen
   And I click update button on post FNOL loss details
 
  @Ignore
  Scenario: CBPCL-216 TC1 ClaimsHandler can edit fields in Loss Details screen post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    Then I can enter data into the Loss Details fields
    | Circumstances | Incident Type | Cause | Sub Cause | Fault Rating | Catastrophe | Date Of Loss |
    And I can enter data into the Loss Locations fields
      | Location | Country | Address 1 | Address 2 | Address 3 | City | PostCode | Location Description | Location Code | Jurisdiction |
    And I can enter data into the Incident Question fields
      | What were you using the vehicle for | What was the pourpose of your Journey | Do You know the other driver | At what speed were you travelling at impact | Weather | Road Conditions | Supporting photgraphic evidence | CCTv/Dashcam footage available |
    And I can enter data into the Notifcation and Contact fields
      | How Reported | Reported By | Relationship to Insured | Main Contact | Contact Relationship to Insured |

    @Ignore
    Scenario: CBPCL-216 TC2 ClaimsHandler can add Vehicle from Loss Details post FNOL 
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
     When I click edit button on post FNOL loss details
    When I click add Vehicle on post FNOL loss details
    Then I will be on new vehicle screen on post FNOL
    
 
    Scenario: CBPCL-216 TC3 ClaimsHandler can add Property from Loss Details post FNOL 
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
     When I click edit button on post FNOL loss details
    When I click add Property Damage on post FNOL loss details
    Then I will be on new property screen
    And I complete all fields on post FNOL new property incident
    
      @Ignore
      Scenario: CBPCL-216 TC4 ClaimsHandler can add Pedestrian from Loss Details post FNOL 
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
     When I click edit button on post FNOL loss details
    When I click add Pedestrian on post FNOL loss details
    Then I will be on new pedestrian screen on post FNOL