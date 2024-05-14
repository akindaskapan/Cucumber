Feature: Country Functionality

  Scenario: Create Country
    Given navigate to campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page
    When Create a country
    Then Success message should be displayed