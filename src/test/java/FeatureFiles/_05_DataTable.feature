Feature: Datatable Functionality

    Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Create Country
      And  Click on the element in the Left Nav
        | setup1     |
        | parameters |
        | countries  |
      And Click on the element in the Dialog
      |add|
      And User sending the keys in Dialog Content
      |nameInput|testingakin|
      |codeInput|19071907190701|
      And Click on the element in the Dialog
      |save|
      And Success message should be displayed

      And User delete item from Dialog
        |testingakin|
      And Success message should be displayed



      Scenario: Create a Nationality
        And Click on the element in the Left Nav
          | setup1     |
          | parameters |
          | nationalities  |
        And Click on the element in the Dialog
        |add|
        And User sending the keys in Dialog Content
        |nameInput|testinGIst190akin|
        And Click on the element in the Dialog
        |save|
        And Success message should be displayed

        And User delete item from Dialog
        |testinGIst190akin|
        And Success message should be displayed


        #Scenario Outline:'da verilen değerler için tüm senaryo her satır kadar tekrar çalışır.
        #DataTable'da ise sadece ilgili step için toplu veri gönderme imkanı oluşturuyor.

        Scenario: Create Fee, delete Fee
          And Click on the element in the Left Nav
            | setup1     |
            | parameters |
            |fees|
          And Click on the element in the Dialog
          |add|
          And User sending the keys in Dialog Content
          |nameInput|190testingfEEakin|
          |codeInput|190719071907|
          |integrationCode|3434191907|
          |priority|121907|
          #priority kısmı için parent classındaki sendKeysFunction metodundaki .clear komutunun devre  dışı bırakılması gerekiyor
          And Click on the element in the Dialog
          |toggleBar|
          |saveAndClose|
          And User delete item from Dialog
          |190testingfEEakin|
          And Success message should be displayed