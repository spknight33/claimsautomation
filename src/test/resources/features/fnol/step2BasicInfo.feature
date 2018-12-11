@Ignore
Feature: Feature: CBPCL-112 As a claims handler I want to see ITB specific options so that I can complete the 'How Reported' and 'Relation to Insured' capture correctly.
  I also require the 'Involved Vehicle' to be defaulted, as we will only be covering a single vehicle.
  Also As a claims handler we require the ability to choose the reporter of a new claim to be a company. This is so that when a third party insurer/solicitors, etc report a claim we are able to record their information and reference.

  Background: 
    Given As a ClaimsHandler I am at step2 for FNOL

  @Ignore
  Scenario: CBPCL-112 TC1 Valid options are shown in the 'How reported' question
    Then the "How Reported" list on step2 will contain options
      | Phone | Letter | Email | Portal |

  @Ignore
  Scenario: CBPCL-112 TC8 PolicyHolder can still be selected as reporter
    Then I select "John Smith" from "name" field on step2
    And I select "Named Driver" from "relationship to insured" field on step2
    And I click next button on step2
    Then I will be on step3 for FNOL

  @Ignore
  Scenario: CBPCL-112 TC9 ClaimsHandler can progress to step3 of FNOL if reportby name and relation are completed
    Then I select "John Smith" from "name" field on step2
    And I select "Policyholder" from "relationship to insured" field on step2
    And I click next button on step2
    Then I will be on step3 for FNOL

  @Ignore
  Scenario: CBPCL-112 TC?? ClaimsHandler Claim Fields are mandatory after selecting a policy
    When I click next button on step2
    Then Mandatory field error messages will be shown for step2
      | Name : Missing required field "Name" | Relation to Insured : Missing required field "Relation to Insured" |
