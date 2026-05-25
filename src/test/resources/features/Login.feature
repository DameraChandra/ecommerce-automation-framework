Feature: Login Functionality

  Scenario: Valid Login

    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User should navigate to home page