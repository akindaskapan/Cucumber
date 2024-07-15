Feature: Fees Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Fees Functionality
    And Click on the element in the Left Nav
      | setup1     |
      | parameters |
      | fees       |
    And Click on the element in the Dialog
      | add |
    And User sending the keys in Dialog Content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priority        | <priority> |
    And Click on the element in the Dialog
      | switchBtn   |
      | save        |
      | closeDialog |
    And User delete item from Dialog
      | <name>       |
    Examples:
      | name       | code  | intCode | priority |
      | akin       | 19107 | 314     | 176033   |
      | fenerbahce | 19108 | 315     | 276033   |
      | sari       | 19109 | 316     | 376033   |
      | kanarya    | 19110 | 317     | 476033   |
      | lacivert   | 19111 | 318     | 576033   |