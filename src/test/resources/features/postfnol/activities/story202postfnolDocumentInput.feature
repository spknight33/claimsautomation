@Ignore @inprogress
Feature: CBPCL-202

  Background: 
    Given I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000017"

  Scenario Outline: CBPCL-202 TC1 - Receipt of Document generates Activity for assignment to the Claim Owner
    # And I assign the claim to "<ClaimOwner>"
    # And a document for "<DocType>" and "<DocSubType>" is received from the Post for an existing Claim
    And I select "Workplan" on the Claim Navigator
    And I will see the activity for "Post - <DocType> <DocSubType>" is assigned to "<ClaimOwner>" with no related exposure set

    Examples: 
      | DocType                           | DocSubType                                         | ClaimOwner |
      | Insured                           | Diagram & Statement / Statement of Fact /Images    | HAD2       |
      | Insured                           | General Correspondence                             | HAD2       |
      | Insured Representative            | General Correspondence - General Handler           | HAD2       |
      | Third Party                       | General Correspondance                             | HAD2       |
      | Third Party                       | Accident Description / Images                      | HAD2       |
      | Third Party                       | Estimates                                          | HAD2       |
      | Third Party                       | Vehicle Documents                                  | HAD2       |
      | Third Party Insurers              | Request for Payment                                | HAD2       |
      | Third Party Insurers              | General Correspondance                             | HAD2       |
      | Third Party Insurers              | Threat to Issue / Selection 152                    | HAD2       |
      | Third Party Solicitors            | Request for Payment                                | HAD2       |
      | Third Party Solicitors            | General Correspondance                             | HAD2       |
      | Third Party Solicitors            | Threat to Issue / Selection 152                    | HAD2       |
      | Third Party Solicitors            | Summons Received                                   | HAD2       |
      | Third Party Solicitors            | Eng Report (24 hour)                               | HAD2       |
      | Third Party Solicitors            | Litigation - Consent Order                         | HAD2       |
      | Third Party Solicitors            | Part 36 Offer                                      | HAD2       |
      | Vehicle Damage Supplier           | Vehicle Total Report                               | HAD2       |
      | Vehicle Damage Supplier           | General Correspondance - General Handler           | HAD2       |
      | Internal Engineer                 | T/P Authorisation                                  | HAD2       |
      | Internal Engineer                 | T/P Engineers Report                               | HAD2       |
      | Internal Engineer                 | Eng TL Report - T/P                                | HAD2       |
      | Our Investigators                 | General Correspondence                             | HAD2       |
      | Property Adjusters                | General Correspondence                             | HAD2       |
      | Defence Solicitors                | General Correspondence                             | HAD2       |
      | Defence Solicitors                | Urgent Payment Request                             | HAD2       |
      | Defence Solicitors                | Request for File                                   | HAD2       |
      | Defence Solicitors                | Urgent Instructions                                | HAD2       |
      | Hill Dickinson                    | Data Wash Red/Amber                                | HAD2       |
      | Lyons Davidson Solicitors         | General Correspondence                             | HAD2       |
      | Rehabilitation Provider           | Report                                             | HAD2       |
      | Rehabilitation Provider           | General Correspondence                             | HAD2       |
      | Premex                            | General Correspondence                             | HAD2       |
      | Coris                             | General Correspondence                             | HAD2       |
      | Van Ameyde                        | General Correspondence                             | HAD2       |
      | Enterprise                        | Credit Hire Correspondence - General Handler       | HAD2       |
      | Court                             | Judgement or Order                                 | HAD2       |
      | Court                             | Court Funds Office                                 | HAD2       |
      | ITB Recovery Department           | Recovery Email                                     | HAD2       |
      | Witness                           | Witness Correspondence                             | HAD2       |
      | Police/Fire/Ambulance Service     | Police/Emeregncy Services Report - General Handler | HAD2       |
      | URGENT Back Office                | Not otherwise categorised                          | HAD2       |
      | Returned Post / Undelivered Email | Returned Post / Undelivered Email                  | HAD2       |
      | Returned Cheque                   | Returned Cheque                                    | HAD2       |
      | CCTV                              | CCTV                                               | HAD2       |
      | Data Requests                     | Section 29 Request                                 | HAD2       |
      | Box Data Requests Only            | Section 35 Request                                 | HAD2       |
