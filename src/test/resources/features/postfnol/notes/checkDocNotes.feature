@Ignore @InProgress
Feature: POST FNOL check auto generated document notes

  Background:
    Given I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000017"
    And I select "Notes" on the Claim Navigator
    And I will see post FNOL Notes screen


  Scenario Outline: check auto generated notes
    And I set the find text box to Doc Type: "<DocType>" with the Subtype: "<DocSubType>" on post FNOL Notes Screen
    And I click search button on Notes screen for post FNOL



    Examples:

      | DocType                           | DocSubType                                         |
      | Insured                           | Diagram & Statement / Statement of Fact /Images    |
      | Insured                           | General Correspondence                             |
      | Insured Representative            | General Correspondence - General Handler           |
      | Third Party                       | General Correspondance                             |
      | Third Party                       | Accident Description / Images                      |
      | Third Party                       | Estimates                                          |
      | Third Party                       | Vehicle Documents                                  |
      | Third Party Insurers              | Request for Payment                                |
      | Third Party Insurers              | General Correspondance                             |
      | Third Party Insurers              | Threat to Issue / Selection 152                    |
      | Third Party Solicitors            | Request for Payment                                |
      | Third Party Solicitors            | General Correspondance                             |
      | Third Party Solicitors            | Threat to Issue / Selection 152                    |
      | Third Party Solicitors            | Summons Received                                   |
      | Third Party Solicitors            | Eng Report (24 hour)                               |
      | Third Party Solicitors            | Litigation - Consent Order                         |
      | Third Party Solicitors            | Part 36 Offer                                      |
      | Vehicle Damage Supplier           | Vehicle Total Report                               |
      | Vehicle Damage Supplier           | General Correspondance - General Handler           |
      | Internal Engineer                 | T/P Authorisation                                  |
      | Internal Engineer                 | T/P Engineers Report                               |
      | Internal Engineer                 | Eng TL Report - T/P                                |
      | Our Investigators                 | General Correspondence                             |
      | Property Adjusters                | General Correspondence                             |
      | Defence Solicitors                | General Correspondence                             |
      | Defence Solicitors                | Urgent Payment Request                             |
      | Defence Solicitors                | Request for File                                   |
      | Defence Solicitors                | Urgent Instructions                                |
      | Hill Dickinson                    | Data Wash Red/Amber                                |
      | Lyons Davidson Solicitors         | General Correspondence                             |
      | Rehabilitation Provider           | Report                                             |
      | Rehabilitation Provider           | General Correspondence                             |
      | Premex                            | General Correspondence                             |
      | Coris                             | General Correspondence                             |
      | Van Ameyde                        | General Correspondence                             |
      | Enterprise                        | Credit Hire Correspondence - General Handler       |
      | Court                             | Judgement or Order                                 |
      | Court                             | Court Funds Office                                 |
      | ITB Recovery Department           | Recovery Email                                     |
      | Witness                           | Witness Correspondence                             |
      | Police/Fire/Ambulance Service     | Police/Emeregncy Services Report - General Handler |
      | URGENT Back Office                | Not otherwise categorised                          |
      | Returned Post / Undelivered Email | Returned Post / Undelivered Email                  |
      | Returned Cheque                   | Returned Cheque                                    |
      | CCTV                              | CCTV                                               |
      | Data Requests                     | Section 29 Request                                 |
      | Box Data Requests Only            | Section 35 Request                                 |



