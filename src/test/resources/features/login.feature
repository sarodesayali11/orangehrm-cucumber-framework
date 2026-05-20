Feature: OrangeHRM Login Functionality

  Scenario: Valid Login

    Given User launches browser
    When User opens OrangeHRM application
    And User enters username and password
    And User clicks login button
    Then User should navigate to dashboard page