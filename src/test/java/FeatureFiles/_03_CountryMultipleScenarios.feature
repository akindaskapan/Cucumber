Feature: Country Multi Scenario



  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create a country
    When  Create a country
    Then  Success message should be displayed

    Scenario: Create a country parameter data
      When Create a country name as "Akın" code as "1907"
      Then Success message should be displayed