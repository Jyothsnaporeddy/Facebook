Feature: feature to test login functionally

  @smokeTest
  Scenario: Check login is successful with valid credentials.
    Given User in facebook login home page
    When User enters Username and Password
    And Click on login button
    Then user navigated to facebook home page
