Feature: Add Address Functionality

  Background:
    Given Navigate to website
    And User click on sign in button
      | homepageSignIn |
    When User enter valid login credentials
      | emailInput    | grup1@techno.study |
      | passwordInput | grup1TechnoStudy1  |
    And User click on sign in button
      | signInButton |
    Then User should login successfully

  Scenario Outline: Add Address Functionality
    And User goes to my account page
      | homepageHeader |
      | myAccount      |
    And User clicks on address book and add new address
      | addressBook |
      | addNewAddressButton |
    When User enter valid address info
      | telephone | <telephone> |
      | street    | <street>    |
      | city      | <city>      |
    And User chooses state
      | region      |
      | stateChoice |
    And User enters zipCode
      | zipCode | <zipCode> |
    When User clicks on save button
      | saveAddressButton |
    Then User should add an address successfully
    Examples:
      | telephone | street        | city        | zipCode |
      | 154488795 | James Street  | Austin      | 12234  |
      | 24548878  | Baker Street  | Houston     | 12334  |
      | 11445266  | Pamela Street | San Antonio | 12344  |

