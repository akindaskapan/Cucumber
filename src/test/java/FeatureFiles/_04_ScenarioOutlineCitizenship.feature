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

    When User delete the "<citizenshipName>"

    #Examples: -------> Scenario Outline kısmına datayı sağlar
    Examples:
      | citizenshipName | shortName |
      | fbctiznshp112 | fbfbt594 |
      | fbctiznshp123 | fbfbt593 |
      | fbctiznshp124 | fbfbt592 |
      | fbctiznshp125 | fbfbt591 |