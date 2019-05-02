@Ignore
Feature: CBPCL-202

  Background: 
    Given I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"

  Scenario Outline: CBPCL-202 TC1 - Receipt of Document generates Activity for assignment to the Claim Owner
    And I Select existing Claim "300000017"
    # And I assign the claim to "<ClaimOwner>"
    # And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType>" is assigned to "<ClaimOwner>" with no related exposure set

    Examples: 
      | DocType                           | DocSubType                                              | ClaimOwner |
      | Insured                           | 1.1 Diagram & Statement / Statement of Fact /Images     | HAD2       |
      | Insured                           | 1.5 General Correspondence                              | HAD2       |
      | Insured Representative            | 2.2 General Correspondence - General Handler            | HAD2       |
      | Third Party                       | 3.1 General Correspondance                              | HAD2       |
      | Third Party                       | 3.2 Accident Description / Images                       | HAD2       |
      | Third Party                       | 3.3 Estimates                                           | HAD2       |
      | Third Party                       | 3.4Vehicle Documents                                    | HAD2       |
      | Third Party Insurers              | 4.2 Request for Payment                                 | HAD2       |
      | Third Party Insurers              | 4.3 General Correspondance                              | HAD2       |
      | Third Party Insurers              | 4.5 Threat to Issue / Selection 152                     | HAD2       |
      | Third Party Solicitors            | 5.1 Request for Payment                                 | HAD2       |
      | Third Party Solicitors            | 5.3 General Correspondance                              | HAD2       |
      | Third Party Solicitors            | 5.4 Threat to Issue / Selection 152                     | HAD2       |
      | Third Party Solicitors            | 5.5 Summons Received                                    | HAD2       |
      | Third Party Solicitors            | 5.6 Eng Report (24 hour)                                | HAD2       |
      | Third Party Solicitors            | 5.7 Litigation - Consent Order                          | HAD2       |
      | Third Party Solicitors            | 5.8 Part 36 Offer                                       | HAD2       |
      | Vehicle Damage Supplier           | 11.3Vehicle Total Report                                | HAD2       |
      | Vehicle Damage Supplier           | 11.5 General Correspondance - General Handler           | HAD2       |
      | Internal Engineer                 | 12.2 T/P Authorisation                                  | HAD2       |
      | Internal Engineer                 | 12.4 T/P Engineers Report                               | HAD2       |
      | Internal Engineer                 | 12.11 Eng TL Report - T/P                               | HAD2       |
      | Our Investigators                 | 13.1 General Correspondence                             | HAD2       |
      | Property Adjusters                | 15.1 General Correspondence                             | HAD2       |
      | Defence Solicitors                | 16.1 General Correspondence                             | HAD2       |
      | Defence Solicitors                | 16.4 Urgent Payment Request                             | HAD2       |
      | Defence Solicitors                | 16.5 Request for File                                   | HAD2       |
      | Defence Solicitors                | 16.6 Urgent Instructions                                | HAD2       |
      | Hill Dickinson                    | 17.1 Data Wash Red/Amber                                | HAD2       |
      | Lyons Davidson Solicitors         | 18.2 General Correspondence                             | HAD2       |
      | Rehabilitation Provider           | 19.1 Report                                             | HAD2       |
      | Rehabilitation Provider           | 19.2 General Correspondence                             | HAD2       |
      | Premex                            | 21.1 General Correspondence                             | HAD2       |
      | Coris                             | 23.1 General Correspondence                             | HAD2       |
      | Van Ameyde                        | 24.1 General Correspondence                             | HAD2       |
      | Enterprise                        | 26.4 Credit Hire Correspondence - General Handler       | HAD2       |
      | Court                             | 29.1 Judgement or Order                                 | HAD2       |
      | Court                             | 29.2 Court Funds Office                                 | HAD2       |
      | ITB Recovery Department           | 32.1 Recovery Email                                     | HAD2       |
      | Witness                           | 33.1 Witness Correspondence                             | HAD2       |
      | Police/Fire/Ambulance Service     | 34.2 Police/Emeregncy Services Report - General Handler | HAD2       |
      | URGENT Back Office                | 37.2 Not otherwise categorised                          | HAD2       |
      | Returned Post / Undelivered Email | 38.2 Returned Post / Undelivered Email                  | HAD2       |
      | Returned Cheque                   | 39.2 Returned Cheque                                    | HAD2       |
      | CCTV                              | 42.2 CCTV                                               | HAD2       |
      | Data Requests                     | 43.1 Section 29 Request                                 | HAD2       |
      | Box Data Requests Only            | 43.2 Section 35 Request                                 | HAD2       |

  Scenario Outline: CBPCL-202 TC2 -Receipt of Document generates Activity for assignment to the ADClaimsHandler and associated note when AD Exposure is present
    # Given as a ClaimsHandler I am viewing an existing claim without an AD Exposure
    #  And I assign the claim to "<ClaimOwner>"
    #   And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<GroupQueue>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #  And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                           | DocSubType                                           | GroupQueue                | ClaimOwner |
      | Insured                           | 1.2 Diagram & Statement  / Statement of Fact /Images | Customer Operations Queue | HAD2       |
      | Insured                           | 1.3 Vehicle Docs - Total Loss                        | Total Loss Queue          | HAD2       |
      | Insured                           | 1.4 General Correspondance                           | Customer Operations Queue | HAD2       |
      | Insured Representative            | 2.1 General Correspondance  - Front Office Mail      | Customer Operations Queue | HAD2       |
      | Third Party Insurers              | 4.4 General Correspondance                           | Customer Operations Queue | HAD2       |
      | Charles Trent                     | 10.1 General Correspondance                          | Total Loss Queue          | HAD2       |
      | Vehicle Damage Supplier           | 11.1 Vehicle Damage Report                           | Customer Operations Queue | HAD2       |
      | Vehicle Damage Supplier           | 11.2 Vehicle Total Report                            | Total Loss Queue          | HAD2       |
      | Vehicle Damage Supplier           | 11.4 General Correspondance - Front Office Mail      | Customer Operations Queue | HAD2       |
      | Vehicle Damage Supplier           | 11.6 Repair Invoice                                  | Customer Operations Queue | HAD2       |
      | Internal Engineer                 | 12.1 A/D Authorisation                               | Customer Operations Queue | HAD2       |
      | Internal Engineer                 | 12.3 A/D Engineers Report                            | Customer Operations Queue | HAD2       |
      | Internal Engineer                 | 12.5 A -  TL Report                                  | Total Loss Queue          | HAD2       |
      | Internal Engineer                 | 12.6 B -  TL Report                                  | Total Loss Queue          | HAD2       |
      | Internal Engineer                 | 12.7 C - TL Report                                   | Total Loss Queue          | HAD2       |
      | Internal Engineer                 | 12.8 D -TL Report                                    | Total Loss Queue          | HAD2       |
      | Internal Engineer                 | 12.9 Retaining -  TL Report                          | Total Loss Queue          | HAD2       |
      | Internal Engineer                 | 12.12 HPI Report                                     | Total Loss Queue          | HAD2       |
      | Internal Engineer                 | 12.14 General Correspondence                         | Total Loss Queue          | HAD2       |
      | Our Investigators                 | 13.2 General Correspondence                          | Customer Operations Queue | HAD2       |
      | Lyons Davidson Solicitors         | 18.1 General Correspondence                          | Customer Operations Queue | HAD2       |
      | Enterprise                        | 26.3 General Correspondance                          | Customer Operations Queue | HAD2       |
      | Total Loss Mailbox                | 31.1 Insured General Correspondence                  | Total Loss Queue          | HAD2       |
      | Witness                           | 33.2 Witness Correspondence                          | Customer Operations Queue | HAD2       |
      | Police/Fire/Ambulance Service     | 34.1 Police/Emergency Services Report  - Front Mail  | Customer Operations Queue | HAD2       |
      | URGENT Front Office               | 37.1 Not otherwise categorised                       | Customer Operations Queue | HAD2       |
      | Returned Post / Undelivered Email | 38.1 Returned Post / Undelivered Email               | Customer Operations Queue | HAD2       |
      | Returned Cheque                   | 39.1 Returned Cheque                                 | Customer Operations Queue | HAD2       |
      | CCTV                              | 42.1 CCTV                                            | Customer Operations Queue | HAD2       |

  Scenario Outline: CBPCL-202 TC3 - Receipt of Document generates Activity for assignment to the Queue  (routed to Group Queue when no CH exposure present) and associated note
    # Given as a ClaimsHandler I am viewing an existing claim without an CH Exposure
    #  And I assign the claim to "<ClaimOwner>"
    #   And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<GroupQueue>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #  And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                   | DocSubType                           | GroupQueue        | ClaimOwner |
      | Credit Hire Organisations | 6.1 Notice of Hire                   | Credit Hire Queue | HAD2       |
      | Credit Hire Organisations | 6.2 Hire Payment Pack                | Credit Hire Queue | HAD2       |
      | Credit Hire Organisations | 6.3 CHO General Correspondance       | Credit Hire Queue | HAD2       |
      | Credit Hire Organisations | 6.4 Threat to Issue / section 152    | Credit Hire Queue | HAD2       |
      | Credit Hire Organisations | 6.5 Summons Received                 | Credit Hire Queue | HAD2       |
      | Credit Hire Organisations | 6.6 Ludo Report                      | Credit Hire Queue | HAD2       |
      | Validus                   | 8.1 TP Hire Settlement + Validus Fee | Credit Hire Queue | HAD2       |
      | DataForce                 | 9.1 DataForce General Correspondence | Credit Hire Queue | HAD2       |

  Scenario Outline: CBPCL-202 TC4 - Receipt of Document generates Activity for assignment to the Queue (routed to group queue when no PI exposure present) and associated note
    # Given as a ClaimsHandler I am viewing an existing claim without a PI Exposure
    # And I assign the claim to "<ClaimOwner>"
    #   And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<GroupQueue>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #  And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                | DocSubType                                     | GroupQueue                  | ClaimOwner |
      | Third Party Solicitors | 5.2 Medical                                    | Personal Injury - MOJ Queue | HAD2       |
      | Third Party Solicitors | 5.9 Part 8 Claim Form                          | Personal Injury - MOJ Queue | HAD2       |
      | Zest Legal             | 22.1 Zest Legal General Correspondence         | Personal Injury - MOJ Queue | HAD2       |
      | Zest Legal             | 22.2 Zest Legal Settlement Pack                | Personal Injury - MOJ Queue | HAD2       |
      | MOJ                    | 27.1 MOJ - CNF - Stage 1                       | Personal Injury - MOJ Queue | HAD2       |
      | MOJ                    | 27.2 MOJ - Stage 2 Pack                        | Personal Injury - MOJ Queue | HAD2       |
      | MOJ                    | 27.3 MOJ - Stage 2 Counter Offer               | Personal Injury - MOJ Queue | HAD2       |
      | MOJ                    | 27.4 MOJ - Stage 3                             | Personal Injury - MOJ Queue | HAD2       |
      | DWP Form               | 28.3 NHS100 - Nil certificate - Closed Claims  | Personal Injury - MOJ Queue | HAD2       |
      | DWP Form               | 28.4 CRU11 / NHS100 with amount owed           | Personal Injury - MOJ Queue | HAD2       |
      | DWP Form               | 28.6 CRU102/ CRU250 - Closed Claims            | Personal Injury - MOJ Queue | HAD2       |
      | DWP Form               | 28.7 CRU184A / CRU18S - CRU Demand for payment | Personal Injury - MOJ Queue | HAD2       |
      | DWP Form               | 28.8 DWP Correspondence - Any Other Code       | Personal Injury - MOJ Queue | HAD2       |

  Scenario Outline: CBPCL-202 TC5 - Receipt of Document generates Activity for assignment to the Queue  (routed to Group queue when no Protocol Hire exposure present) and associated note
    # Given as a ClaimsHandler I am viewing an existing claim without a Protocol Hire Exposure
    #And I assign the claim to "<ClaimOwner>"
    #And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<GroupQueue>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #  And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType              | DocSubType                   | GroupQueue                 | ClaimOwner |
      | Credit Hire Protocol | 7.1 Total Loss Authorisation | Credit Hire Protocol Queue | HAD2       |
      | Credit Hire Protocol | 7.2 General Correspondence   | Credit Hire Protocol Queue | HAD2       |

  Scenario Outline: CBPCL-202 TC6 - Receipt of Document generates Activity for assignment to the Queue  (routed to group queue when no TPC Capture exposure present) and associated note
    # Given as a ClaimsHandler I am viewing an existing claim without a TPC Capture Exposure
    # And I assign the claim to "<ClaimOwner>"
    # And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<GroupQueue>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #  And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                     | DocSubType                        | GroupQueue                | ClaimOwner |
      | Third Party Capture Mailbox | 30.1 Action 365 Update            | Third Party Capture Queue | HAD2       |
      | Third Party Capture Mailbox | 30.2 Capture Hire invoice         | Third Party Capture Queue | HAD2       |
      | Third Party Capture Mailbox | 30.3 Capture repair invoice       | Third Party Capture Queue | HAD2       |
      | Third Party Capture Mailbox | 30.4 Capture engineer report      | Third Party Capture Queue | HAD2       |
      | Third Party Capture Mailbox | 30.5 Capture TP Repair            | Third Party Capture Queue | HAD2       |
      | Third Party Capture Mailbox | 30.6 Capture TP Total Loss report | Third Party Capture Queue | HAD2       |
      | Third Party Capture Mailbox | 30.7 Capture General              | Third Party Capture Queue | HAD2       |

  Scenario Outline: CBPCL-202 TC7 - Receipt of Document generates Activity for assignment to the Queue  (always routed to group queue regardless of whether exposure present) and associated note
    # Given as a ClaimsHandler I am viewing an existing claim with exposures
    # And I assign the claim to "<ClaimOwner>"
    # And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<GroupQueue>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #  And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                     | DocSubType                                   | GroupQueue                      | ClaimOwner |
      | Third Party Solicitors      | 5.12 TPS Scottish Gen Correspondence         | Personal Injury - Non MOJ Queue | HAD2       |
      | Internal Engineer           | 12.13 TL Valuation Examples                  | Engineers Queue                 | HAD2       |
      | Third Party Capture Mailbox | 30.8 Action 365 Update - Injury Capture Only | Claims Support Queue            | HAD2       |
      | Complaint                   | 36.1 Insured                                 | Customer Queue                  | HAD2       |
      | Complaint                   | 36.2 Third Party                             | Claimant Queue                  | HAD2       |
      | Admin                       | 40.1 Blank Document                          | Claims Support Queue            | HAD2       |
      | BACs details                | 44.1 BACs Information                        | Customer Queue                  | HAD2       |
      | Subject Access Request      | 43.3 Subject Access Request                  | Customer Queue                  | HAD2       |

  Scenario Outline: CBPCL-202 TC8 -Receipt of Document generates Activity for assignment to the ADClaimsHandler and associated note when AD Exposure is present
    #Given as a ClaimsHandler I am viewing an existing claim with an AD Exposure
    #And I assign the claim to "<ClaimOwner>"
    #And I assign the AD Exposure to "<ExposureOwner>"
    #And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<ExposureOwner>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                           | DocSubType                                           | ClaimOwner | ExposureOwner |
      | Insured                           | 1.2 Diagram & Statement  / Statement of Fact /Images | HAD2       | HAD1          |
      | Insured                           | 1.3 Vehicle Docs - Total Loss                        | HAD2       | HAD1          |
      | Insured                           | 1.4 General Correspondance                           | HAD2       | HAD1          |
      | Insured Representative            | 2.1 General Correspondance  - Front Office Mail      | HAD2       | HAD1          |
      | Third Party Insurers              | 4.4 General Correspondance                           | HAD2       | HAD1          |
      | Charles Trent                     | 10.1 General Correspondance                          | HAD2       | HAD1          |
      | Vehicle Damage Supplier           | 11.1 Vehicle Damage Report                           | HAD2       | HAD1          |
      | Vehicle Damage Supplier           | 11.2 Vehicle Total Report                            | HAD2       | HAD1          |
      | Vehicle Damage Supplier           | 11.4 General Correspondance - Front Office Mail      | HAD2       | HAD1          |
      | Vehicle Damage Supplier           | 11.6 Repair Invoice                                  | HAD2       | HAD1          |
      | Internal Engineer                 | 12.1 A/D Authorisation                               | HAD2       | HAD1          |
      | Internal Engineer                 | 12.3 A/D Engineers Report                            | HAD2       | HAD1          |
      | Internal Engineer                 | 12.5 A -  TL Report                                  | HAD2       | HAD1          |
      | Internal Engineer                 | 12.6 B -  TL Report                                  | HAD2       | HAD1          |
      | Internal Engineer                 | 12.7 C - TL Report                                   | HAD2       | HAD1          |
      | Internal Engineer                 | 12.8 D -TL Report                                    | HAD2       | HAD1          |
      | Internal Engineer                 | 12.9 Retaining -  TL Report                          | HAD2       | HAD1          |
      | Internal Engineer                 | 12.12 HPI Report                                     | HAD2       | HAD1          |
      | Internal Engineer                 | 12.14 General Correspondence                         | HAD2       | HAD1          |
      | Our Investigators                 | 13.2 General Correspondence                          | HAD2       | HAD1          |
      | Lyons Davidson Solicitors         | 18.1 General Correspondence                          | HAD2       | HAD1          |
      | Enterprise                        | 26.3 General Correspondance                          | HAD2       | HAD1          |
      | Total Loss Mailbox                | 31.1 Insured General Correspondence                  | HAD2       | HAD1          |
      | Witness                           | 33.2 Witness Correspondence                          | HAD2       | HAD1          |
      | Police/Fire/Ambulance Service     | 34.1 Police/Emergency Services Report  - Front Mail  | HAD2       | HAD1          |
      | URGENT Front Office               | 37.1 Not otherwise categorised                       | HAD2       | HAD1          |
      | Returned Post / Undelivered Email | 38.1 Returned Post / Undelivered Email               | HAD2       | HAD1          |
      | Returned Cheque                   | 39.1 Returned Cheque                                 | HAD2       | HAD1          |
      | CCTV                              | 42.1 CCTV                                            | HAD2       | HAD1          |

  Scenario Outline: CBPCL-202 TC9 -Receipt of Document generates Activity for assignment to the CHClaimsHandler and associated note when CH Exposure is present
    #Given as a ClaimsHandler I am viewing an existing claim with an CH Exposure
    #And I assign the claim to "<ClaimOwner>"
    #And I assign the AD Exposure to "<ExposureOwner>"
    #And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<ExposureOwner>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                   | DocSubType                           | ClaimOwner | ExposureOwner |
      | Credit Hire Organisations | 6.1 Notice of Hire                   | HAD2       | HCH1          |
      | Credit Hire Organisations | 6.2 Hire Payment Pack                | HAD2       | HCH1          |
      | Credit Hire Organisations | 6.3 CHO General Correspondance       | HAD2       | HCH1          |
      | Credit Hire Organisations | 6.4 Threat to Issue / section 152    | HAD2       | HCH1          |
      | Credit Hire Organisations | 6.5 Summons Received                 | HAD2       | HCH1          |
      | Credit Hire Organisations | 6.6 Ludo Report                      | HAD2       | HCH1          |
      | Validus                   | 8.1 TP Hire Settlement + Validus Fee | HAD2       | HCH1          |
      | DataForce                 | 9.1 DataForce General Correspondence | HAD2       | HCH1          |

  Scenario Outline: CBPCL-202 TC10 -Receipt of Document generates Activity for assignment to the PIClaimsHandler and associated note when PI Exposure is present
    #Given as a ClaimsHandler I am viewing an existing claim with an PI Exposure
    #And I assign the claim to "<ClaimOwner>"
    #And I assign the AD Exposure to "<ExposureOwner>"
    #And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<ExposureOwner>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                | DocSubType                                     | ClaimOwner | ExposureOwner |
      | Third Party Solicitors | 5.2 Medical                                    | HAD2       | HPI1          |
      | Third Party Solicitors | 5.9 Part 8 Claim Form                          | HAD2       | HPI1          |
      | Zest Legal             | 22.1 Zest Legal General Correspondence         | HAD2       | HPI1          |
      | Zest Legal             | 22.2 Zest Legal Settlement Pack                | HAD2       | HPI1          |
      | MOJ                    | 27.1 MOJ - CNF - Stage 1                       | HAD2       | HPI1          |
      | MOJ                    | 27.2 MOJ - Stage 2 Pack                        | HAD2       | HPI1          |
      | MOJ                    | 27.3 MOJ - Stage 2 Counter Offer               | HAD2       | HPI1          |
      | MOJ                    | 27.4 MOJ - Stage 3                             | HAD2       | HPI1          |
      | DWP Form               | 28.3 NHS100 - Nil certificate - Closed Claims  | HAD2       | HPI1          |
      | DWP Form               | 28.4 CRU11 / NHS100 with amount owed           | HAD2       | HPI1          |
      | DWP Form               | 28.6 CRU102/ CRU250 - Closed Claims            | HAD2       | HPI1          |
      | DWP Form               | 28.7 CRU184A / CRU18S - CRU Demand for payment | HAD2       | HPI1          |
      | DWP Form               | 28.8 DWP Correspondence - Any Other Code       | HAD2       | HPI1          |

  Scenario Outline: CBPCL-202 TC11 - Receipt of Document generates Activity for assignment to the ProtocolHire ClaimsHandler and associated note when Protocol Hire Exposure is present
    #Given as a ClaimsHandler I am viewing an existing claim with an Protocol Hire Exposure
    #And I assign the claim to "<ClaimOwner>"
    #And I assign the AD Exposure to "<ExposureOwner>"
    #And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<ExposureOwner>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType              | DocSubType                   | ClaimOwner | ExposureOwner |
      | Credit Hire Protocol | 7.1 Total Loss Authorisation | HAD2       | HPH1          |
      | Credit Hire Protocol | 7.2 General Correspondence   | HAD2       | HPH1          |

  Scenario Outline: CBPCL-202 TC12 - Receipt of Document generates Activity for assignment to the TPC ClaimsHandler and associated note when TPC Exposure is present
    #Given as a ClaimsHandler I am viewing an existing claim with an TPC Exposure
    #And I assign the claim to "<ClaimOwner>"
    #And I assign the AD Exposure to "<ExposureOwner>"
    #And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType> " is assigned to "<ExposureOwner>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                     | DocSubType                        | ClaimOwner | ExposureOwner |
      | Third Party Capture Mailbox | 30.1 Action 365 Update            | HAD2       | HTPC1         |
      | Third Party Capture Mailbox | 30.2 Capture Hire invoice         | HAD2       | HTPC1         |
      | Third Party Capture Mailbox | 30.3 Capture repair invoice       | HAD2       | HTPC1         |
      | Third Party Capture Mailbox | 30.4 Capture engineer report      | HAD2       | HTPC1         |
      | Third Party Capture Mailbox | 30.5 Capture TP Repair            | HAD2       | HTPC1         |
      | Third Party Capture Mailbox | 30.6 Capture TP Total Loss report | HAD2       | HTPC1         |
      | Third Party Capture Mailbox | 30.7 Capture General              | HAD2       | HTPC1         |

  Scenario Outline: CBPCL-202 TC13 - Receipt of Document creates Note for Claim (No activity created)
    # Given as a ClaimsHandler I am viewing an existing claim
    # And I assign the claim to "<ClaimOwner>"
    # And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    #  And I will NOT see the activity for "Post - <DocType> <DocSubType> " is assigned to "<ClaimOwner>" with no related exposure set
    And I select "Notes" on the Claim Navigator

    #  And I will see the note for "Post - <DocType> <DocSubType> "
    Examples: 
      | DocType                 | DocSubType                                           | ClaimOwner |
      | Third Party Insurers    | 4.1 Recovery Cheque Enclosed                         | HAD2       |
      | Third Party Solicitors  | 5.11 Medical Examination Date                        | HAD2       |
      | DataForce               | 9.2 DataForce Reference Number                       | HAD2       |
      | Charles Trent           | 10.2 New Uplift Instructions Reference               | HAD2       |
      | Our Investigators       | 13.3 Acknowledge of Instructions / Interview Date    | HAD2       |
      | Robertsons              | 14.1 Invoice                                         | HAD2       |
      | Defence Solicitors      | 16.2 Acceptance of Instructions (Nominations)        | HAD2       |
      | Defence Solicitors      | 16.3 Invoice                                         | HAD2       |
      | Rehabilitation Provider | 19.3 Acknowledge of Instructions                     | HAD2       |
      | Zest Legal              | 22.3 Zest Legal Advising of Medical Appointment Date | HAD2       |
      | Supplier  Invoices      | 25.1 Supplier  Invoices - Recovery                   | HAD2       |
      | Enterprise              | 26.1 Hire Accepted                                   | HAD2       |
      | Enterprise              | 26.2 Hire Declined                                   | HAD2       |
      | Enterprise              | 26.5 Policyholder Non-fault Referral                 | HAD2       |
      | Enterprise              | 26.6 Enterprise Rental Information Reservation       | HAD2       |
      | DWP Form                | 28.1 CRU5 - Certificate to Follow                    | HAD2       |
      | DWP Form                | 28.2 NHS 100 - Nil certificate - Open Claims         | HAD2       |
      | DWP Form                | 28.5 CRU102 / CRU250 - Open Claims                   | HAD2       |
      | New Claim Notification  | 35.1 New Claim Notification TP/TPI/TPS               | HAD2       |
      | New Claim Notification  | 35.2 New Claim Notification PH                       | HAD2       |
      | General Correspondence  | 41.1 No action needed                                | HAD2       |
