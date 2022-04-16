Feature: Users should be able to login

  @wip
    Scenario: User can navigate to facebook
    Given the user can navigates to facebook page
    Then the user is on the login page

  Scenario: User should be able to login
    Given the user can navigates to facebook page
    When the user enters the user information
    Then the user should be able to login

  Scenario: User should be able to login
    Given the user can navigates to facebook page
    When the user enters the user information
    Then the user should be able to login
    Then the user clicks on Personal Profile Option
    And the user clicks on SignOut Button

