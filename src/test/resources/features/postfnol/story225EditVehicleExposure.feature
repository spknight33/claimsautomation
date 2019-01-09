Feature: CBPCL-225 As a ClaimCenter user with the role of Adjuster or Manager, I want to be able maintain claim related exposures (Vehicle Damage) so that I can make sure that the data on the claim represents our current understanding of the loss.
Background: 
Given I access ClaimCenter login page
And I login to ClaimCenter as role "ClaimsHandler"

Scenario: CBPCL-225 TC30 Vehicle Damage Exposure can be edited in post FNOL
And I Select an existing Claim
And I select "Exposures" on the Claim Navigator
And I will see post FNOL exposures screen
When I select the "Vehicle" exposure on the post FNOL exposures screen
And I select "Edit" on edit vehicle exposure screen for Post FNOL
And I select "Customer" from "Claimant Type" on edit vehicle exposure screen for Post FNOL
And I click "New Incident..." on vehicle picker on edit vehicle exposure screen for Post FNOL
And I complete all fields on Post FNOL new vehicle incident
And I select "Update" on edit vehicle exposure screen for Post FNOL