Feature: Login Functionality

  Scenario: Login Functionality
    Given Navigate to website
    And User click on sign in button
      | homepageSignIn |
    When User enter valid login credentials
      | emailInput    | grup1@techno.study |
      | passwordInput | grup1TechnoStudy1  |
    And User click on sign in button
      | signInButton |
    Then User should login successfully