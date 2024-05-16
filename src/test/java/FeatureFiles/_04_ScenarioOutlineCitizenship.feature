Feature: Citizenship with outline scenario


  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page

    #Scenario Outline: ------> data provider gibi çalışır ve datayı alttaki examples kısmından alır
  Scenario Outline: Citizenship create
    When User a Citizenship name as "<citizenshipName>" short name as "<shortName>"
    Then Success message should be displayed


    When User a Citizenship name as "<citizenshipName>" short name as "<shortName>"
    Then Already exist message should be displayed
    And Click on close button

    #Examples: -------> Scenario Outline kısmına datayı sağlar
    Examples:
      | citizenshipName | shortName |
      | vatandasl1k1 | fener1 |
      | vatandasl1k19 | fener19 |
      | vatandasl1k190 | fener190 |
      | vatandasl1k11907 | fener1907 |
