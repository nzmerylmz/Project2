Feature: Create an Account Functionality

  Scenario: Create an Account
    Given Navigate to website
    When User clicks on create account button
      | createAccount |
    And Enter registration info
      | firstName            | grup1TechnoStudy   |
      | lastname             | TechnoStudy        |
      | email_address        | grup1@techno.study |
      | password             | grup1TechnoStudy1  |
      | passwordConfirmation | grup1TechnoStudy1  |
    And User click on create button
      | createAccountButton |
    Then User should create an account successfully

