@Ignore
Feature: CBPCL-230 Manual Activities

  Background: 
    Given I use test data set "postfnol_set1"
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000017"

  Scenario Outline: CBPCL-230 TC1 - When creating a new activity on a claim from the actions menu, correct hierarchy is shown for "Customer" main category
    And I select the Actions Popup Menu Hierarchy "<MenuHierarchy>" for parent "New Activity"
    And I will see post FNOL New Activity screen
    And I click cancel button on New Activity screen for post FNOL

    Examples: 
      | MenuHierarchy                                             |
      | Customer,Alert,9g Alert Follow Up                         |
      | Customer,FNOL,FNOL Follow Up Task                         |
      | Customer,FNOL,TP Contact Details - Follow Up              |
      | Customer,OOH,Mansfield Actions                            |
      | Customer,OOH,Mansfield Storage                            |
      | Custome,OOH,Mansfield Follow Up                           |
      | Custome,Recovery,Awaiting Outlay From TPI                 |
      | Customer,Recovery,Lyons Davidson Dealing                  |
      | Customer,Recovery,Recovery - AD Paid                      |
      | Customer,Recovery,Recovery From An Individual             |
      | Customer,Supplier,Supplier Response                       |
      | Customer,Theft / Fire,Theft Statement Required            |
      | Customer,Total Loss,Excess Storage Spread Sheet Review    |
      | Customer,Total Loss,Finance Company Response              |
      | Customer,Total Loss,Finance Marker Removed                |
      | Customer,Total Loss,Is Vehicle on Site with Charles Trent |
      | Customer,Total Loss,New Car Replacement - Waiting Invoice |
      | Customer,Total Loss,New Car Replacement Review            |
      | Customer,Total Loss,PCL - Can we pay Total Loss           |
      | Customer,Total Loss,Policyholder Salvage Recovery Chase   |

  Scenario Outline: CBPCL-230 TC2 - When creating a new activity on a claim from the actions menu, correct hierarchy is shown for Claimant main category
    And I select the Actions Popup Menu Hierarchy "<MenuHierarchy>" for parent "New Activity"
    And I will see post FNOL New Activity screen
    And I click cancel button on New Activity screen for post FNOL

    Examples: 
      | MenuHierarchy                                              |
      | Claimant,Credit Hire,Credit Hire - Awaiting Payment Pack   |
      | Claimant,Credit Hire,Credit Hire Portal Offer Required     |
      | Claimant,Litigation,Litigation Response                    |
      | Claimant,Litigation,SIU Litigation                         |
      | Claimant,PI,CRU Only Outstanding                           |
      | Claimant,PI,LSI Response                                   |
      | Claimant,Protocol,ERAC Protocol Dispute Diary              |
      | Claimant,Protocol,ERAC Protocol Liability Dispute          |
      | Claimant,Protocol,Credit Hire with Accident Exchange       |
      | Claimant,Protocol,Credit Hire with Auxillis                |
      | Claimant,Protocol,Credit Hire with Enterprise              |
      | Claimant,Protocol,Credit Hire with Slater Gordon           |
      | Claimant,Supplier,Capio Law                                |
      | Claimant,Total Loss,Third Party Salvage Recovery Chase     |
      | Claimant,TP Capture,Copley Diary                           |
      | Claimant,TP Capture,Estimated Completion Date              |
      | Claimant,TP Capture,Finance Company Response               |
      | Claimant,TP Capture,Hire Review                            |
      | Claimant,TP Capture,Hire Review - In Hire                  |
      | Claimant,TP Capture,Hire Review - Ongoing In Hire 21 Plus  |
      | Claimant,TP Capture,Hire Review - Prestige                 |
      | Claimant,TP Capture,Hire Review - TPI Dealing With Repairs |
      | Claimant,TP Capture,Hire Review - Undriveable              |
      | Claimant,TP Capture,Recovery From Capture Supplier         |
      | Claimant,TP Capture,Warm Follow Up                         |

  Scenario Outline: CBPCL-230 TC3 - When creating a new activity on a claim from the actions menu, correct hierarchy is shown for the "General" main category
    And I select the Actions Popup Menu Hierarchy "<MenuHierarchy>" for parent "New Activity"
    And I will see post FNOL New Activity screen
    And I click cancel button on New Activity screen for post FNOL

    Examples: 
      | MenuHierarchy                                     |
      | General,Review,Diary Review                       |
      | General,Review,Urgent Review Task                 |
      | General,Review,Credit Hire - Case Review          |
      | General,Review,Liability Review                   |
      | General,Review,Theft and Fire Review              |
      | General,Review,6 Month Review - Close If No Claim |
      | General,Review,Diary Review - Scottish Deadline   |
      | General,Review,Claim To Be Closed                 |
      | General,Review,Late Intimation Review             |
      | General,Review,Diminution Review                  |
      | General,Review,LSI Review Diary                   |
      | General,Engineers,Engineers Reply                 |
      | General,Engineers,Urgent Engineers Reply          |
      | General,Policyholder,Response from Insd           |
      | General,Policyholder,CCTV Chase                   |
      | General,Witness,Witness Statement Task            |

  Scenario Outline: CBPCL-230 TC4 - When creating a new activity on a claim from the actions menu, correct hierarchy is shown for the "General" main category
    And I select the Actions Popup Menu Hierarchy "<MenuHierarchy>" for parent "New Activity"
    And I will see post FNOL New Activity screen
    And I click cancel button on New Activity screen for post FNOL

    Examples: 
      | MenuHierarchy                                                    |            |
      | Internal,CDIA                                                    | CDIA Diary |
      | Internal,Engineers,Chris Hasson dealing with inspection          |            |
      | Internal,Engineers,Chris Hubbuck dealing with inspection         |            |
      | Internal,Engineers,David Lynch Dealing with Inspection           |            |
      | Internal,Engineers,Diminution Report Review Task                 |            |
      | Internal,Engineers,Fire and Theft (Unrecovered)                  |            |
      | Internal,Engineers,General Enquiry – Policyholder Vehicle task   |            |
      | Internal,Engineers,General Enquiry – Third Party Vehicle task    |            |
      | Internal,Engineers,Gordon Richardson Dealing with Inspection     |            |
      | Internal,Engineers,Ian Davison Dealing With Inspection           |            |
      | Internal,Engineers,In-house Engineer - Disputed Valuation Task   |            |
      | Internal,Engineers,New Car Replacement Review Task               |            |
      | Internal,Engineers,Review PH Estimate/Photos task                |            |
      | Internal,Engineers,Review TP Estimate/Photos task                |            |
      | Internal,Engineers,Urgent Action - TP in hire task / MOJ dropper |            |
      | Internal,Engineers,Triage PH Images                              |            |
      | Internal,Finance,Cheque Expired to Claims Operations             |            |
      | Internal,Finance,Finance Response                                |            |
      | Internal,Finance,Unexpected Payment Received                     |            |
      | Internal,Finance,Verify BACs Details Task                        |            |
      | Internal,Finance,Over 250k Approval Needed                       |            |
      | Internal,Large Loss,Large Loss Response                          |            |
      | Internal,Large Loss,Credit Hire LLR Required                     |            |
      | Internal,Large Loss,Large Loss Reporting                         |            |
      | Internal,Re-Assign Claim,New Credit Hire                         |            |
      | Internal,Re-Assign Claim,New PI Claim                            |            |
      | Internal,Re-Assign Claim,New PI Claim - Scottish                 |            |
      | Internal,Re-Assign Claim,New PI Pre-Med Settled                  |            |
      | Internal,Re-Assign Claim,New TPPD – 100% Fault Accepted          |            |
      | Internal,Re-Assign Claim,New TPPD – Probable Dispute             |            |
      | Internal,Re-Assign Claim,New Total Loss                          |            |
      | Internal,Re-Assign Post,Misdirected Post                         |            |
      | Internal,SIU,Claim Under Review KS                               |            |
      | Internal,SIU,Claim Under Review NC                               |            |
      | Internal,SIU,Claim Under Review NS                               |            |
      | Internal,SIU,Claim Under Review PR                               |            |
      | Internal,SIU,Claim Under Review QR                               |            |
      | Internal,SIU,Claim Under Review SD                               |            |
      | Internal,SIU,Claim Under Review VK                               |            |
      | Internal,SIU,SIU Recovery Diary                                  |            |
      | Internal,U/W Referral,Underwriting Response                      |            |
      | Internal,U/W Referral,Underwriting Response - SIU                |            |

  Scenario Outline: CBPCL-230 TC6 - When creating a new activity on a claim from the actions menu, URGENT Activities are created correctly
    And I select the Actions Popup Menu Hierarchy "<MenuHierarchy>" for parent "New Activity"
    And I will see post FNOL New Activity screen
    Then Field "Priority" is set to "Urgent" on New Activity screen for post FNOL
    And I click cancel button on New Activity screen for post FNOL

    Examples: 
      | MenuHierarchy                                                    |
      | General,Review,Urgent Review Task                                |
      | General,Engineers,Urgent Engineers Reply                         |
      | Internal,Engineers,Urgent Action – TP in hire task / MOJ dropper |
      | Internal,Re-Assign Claim,New Credit Hire                         |
      | Internal,Re-Assign Claim,New PI Claim                            |
      | Internal,Re-Assign Claim,New PI Claim - Scottish                 |
      | Internal,Re-Assign Claim,New PI Pre-Med Settled                  |
      | Internal,Re-Assign Claim,New TPPD – 100% Fault Accepted          |
      | Internal,Re-Assign Claim,New TPPD – Probable Dispute             |
      | Internal,Re-Assign Claim,New Total Loss                          |

  Scenario Outline: CBPCL-230 TC7 - When creating a new activity on a claim from the actions menu, HIGH Activities are created correctly
    Given I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000017"
    And I select the Actions Popup Menu Hierarchy "<MenuHierarchy>" for parent "New Activity"
    And I will see post FNOL New Activity screen
    Then Field "Priority" is set to "Normal" on New Activity screen for post FNOL
    And I click cancel button on New Activity screen for post FNOL

    Examples: 
      | MenuHierarchy                              |
      | Internal,Re-Assign Post , Misdirected Post |

  Scenario Outline: CBPCL-230 - TC8
    And I select the Actions Popup Menu Hierarchy "<MenuHierarchy>" for parent "New Activity"
    And I will see post FNOL New Activity screen
    Then Field "Priority" is set to "Normal" on New Activity screen for post FNOL
    And I click cancel button on New Activity screen for post FNOL

    Examples: 
      | MenuHierarchy                         |
      | Third Party Capture,Make TP Care call |
