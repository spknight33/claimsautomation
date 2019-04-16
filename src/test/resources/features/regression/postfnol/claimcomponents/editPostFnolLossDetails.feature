@Ignore
Feature: POST FNOL REGRESSION - various test of the Loss Details pages


  Background: 
    Given I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000143"
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details


  Scenario: LOSS DETAILS POST FNOL Regression TC1 ClaimsHandler can edit field in Loss Details screen post FNOL
    And I click edit button on post FNOL loss details
    When I input "Purpose changed by regression script test" into the "Journey Purpose" field on Loss Details post FNOL
    And I click update button on post FNOL loss details
 
  @inprogress
  Scenario: LOSS DETAILS POST FNOL Regression TC2 ClaimsHandler can add Vehicle from Loss Details post FNOL and VRN lookup works
    And I click edit button on post FNOL loss details
    And I click add Vehicle on post FNOL loss details
    And I will be on new vehicle screen on post FNOL
    And I input "CY17NBX" into the "VRN" box on new vehicle screen on post FNOL
    And I input "DAMAGE DESC ADDED BY REGRESSION SCRIPT" into the "Damage Description" box on new vehicle screen on post FNOL
    #todo - check vrn lookup has returned modeletc
    And I click "Ok" on new vehicle screen on post FNOL

  @Ignore
  Scenario: CBPCL-216 TC3 ClaimsHandler can add Property from Loss Details post FNOL
      When I click edit button on post FNOL loss details
    When I click add Property Damage on post FNOL loss details
    Then I will be on new property screen
    And I complete all fields on post FNOL new property incident
    And I click update button on post FNOL loss details

  @inprogress
  Scenario: LOSS DETAILS POST FNOL Regression TC4 ClaimsHandler can add Pedestrian from Loss Details post FNOL
    When I click edit button on post FNOL loss details
    When I click add Pedestrian on post FNOL loss details
    Then I will be on new pedestrian screen on post FNOL
  #  And I complete all fields on post FNOL new pedestrian incident
   
  @Ignore
  Scenario: CBPCL-216 TC13  ClaimsHandler can edit PH Vehicle from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit PH Vehicle on post FNOL loss details
    Then I will be on edit vehicle screen on post FNOL
    And I click cancel button on edit vehicle screen on post FNOL edit

  @Ignore
  Scenario: CBPCL-216 TC14  ClaimsHandler can edit TP Vehicle from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit TP Vehicle on post FNOL loss details
    Then I will be on edit vehicle screen on post FNOL
    And I click cancel button on edit vehicle screen on post FNOL edit

  @Ignore
  Scenario: CBPCL-216 TC15  ClaimsHandler can edit Pedestrian from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit Pedestrian on post FNOL loss details
    Then I will be on edit pedestrian screen on post FNOL
    And I change fields on post FNOL edit pedestrian incident
    And I click update button on post FNOL loss details 

  @Ignore
  Scenario: CBPCL-216 TC16  ClaimsHandler can edit property from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit Property on post FNOL loss details
    Then I will be on edit property screen on post FNOL
    And I click cancel button on edit property screen on post FNOL

  @Ignore
  Scenario: CBPCL-216 TC17  ClaimsHandler can edit PH driver from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit PH Driver on post FNOL loss details
    Then I will be on edit Driver screen for post FNOL
    And I change fields on post FNOL edit PH driver incident
    And I click update button on post FNOL loss details 

  @Ignore
  Scenario: CBPCL-216 TC18  ClaimsHandler can edit TP driver from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit TP Driver on post FNOL loss details
    Then I will be on edit Driver screen for post FNOL
    And I change fields on post FNOL edit TP driver incident
     And I click update button on post FNOL loss details 

@Ignore
  Scenario: CBPCL-216 TC19  ClaimsHandler can edit PH passenger from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit PH Passenger on post FNOL loss details
    Then I will be on Edit Passenger screen for post FNOL
    And I click edit button on edit passenger screen on post FNOL
    And I change fields on post FNOL edit PH passenger incident
    And I click ok button on edit passenger screen for post FNOL
    And I click update button on post FNOL loss details 

  @Ignore
  Scenario: CBPCL-216 TC20  ClaimsHandler can edit TP passenger from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit TP Passenger on post FNOL loss details
    Then I will be on Edit Passenger screen for post FNOL
    And I click cancel button on edit passenger screen for post FNOL
