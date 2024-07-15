Feature: deneme

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: ulke ekleme
    And Click on the element in the Left Nav
      | setup1     |
      | parameters |
      | countries  |
    And Click on the element in the Dialog
      | add |
    And User sending the keys in Dialog Content
      | nameInput | zazamingo |
      | codeInput | kod       |
    And Click on the element in the Dialog
      | save |
    And User delete item from Dialog
    |zazamingo|

  Scenario: Nationalities
    And Click on the element in the Left Nav
      | setup1        |
      | parameters    |
      | nationalities |
    And Click on the element in the Dialog
      | add |
    And User sending the keys in Dialog Content
      | nameInput | akin |
    And Click on the element in the Dialog
      | save |
    And User delete item from Dialog
      | akin |

  Scenario: Fee
    And Click on the element in the Left Nav
      | setup1     |
      | parameters |
      | fees       |
    And Click on the element in the Dialog
      | add |
    And User sending the keys in Dialog Content
      | nameInput       | akinFeev |
      | codeInput       | 23       |
      | integrationCode | 1986     |
      | priority        | 1        |
    And Click on the element in the Dialog
    |save|
    And User delete item from Dialog
    |akinFeev|