@Ignore
Feature: CBPCL-225 As a ClaimCenter user with the role of Adjuster or Manager, I want to be able maintain claim related exposures (Vehicle) so that I can make sure that the data on the claim represents our current understanding of the loss.
  
    
     Scenario: CBPCL-225  TC1,TC2,TC3,TC4,TC4,TC15 Vehicle exposures can be created
     Given As a "ADClaimsHandlerTm1" I am at step5 for FNOL
     When I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Accidental Damage - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select "2015 SKODA OCTAVIA (s99sja / United Kingdom)" from "Coverage" on new vehicle exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     When I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Glass - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     And I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Fire"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     And I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Personal Belongings"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
     And I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Theft"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
         And I select "Ok" on new exposure screen for FNOL
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Personal Belongings and Handbag Cover"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     When I select the Add Exposures Popup Menu Hierarchy "2015 SKODA OCTAVIA (s99sja / United Kingdom),Third Party Liability,Liability - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     And I select the Add Exposures Popup Menu Hierarchy "Choose by Coverage Type,Misfuelling - Vehicle Damage"
     And  I will be on the new exposure screen for FNOL
     And I select the Insured as Claimant on new vehicle exposure screen for FNOL
          And I select "Ok" on new exposure screen for FNOL
     And I click finish button on step5
