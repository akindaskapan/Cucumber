#Employe menüsü için  Create-Exist-Delete  bölümleri olan senaryoyu yazınız.
#Daha sonra aynı senaryoyu 5 farklı değerler için çalıştırıınız.


Feature: New Custom Field

  Background:
    Given  Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create new custom
    And Click on the element in the Left Nav
      | setup1       |
      | parameters   |
      | customFields |
    And Click on the element in the Dialog
      | add |
    And User sending the keys in Dialog Content
      | nameInput | <name> |
      | codeInput | <code> |
      And Click on the element in the Dialog
      |save|
    And User delete item from Dialog
    |<name>|
    Examples:
      | name  | code |
      | akin  | 1907 |
      | fener | 3434 |
      | bahce | 12   |