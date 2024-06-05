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
      |nameInput|testingz1907|
      |codeInput|190719071|
      And Click on the element in the Dialog
      |save|
      And Success message should be displayed

      And User delete item from Dialog
        |testingz1907|
      And Success message should be displayed



      Scenario: Create a Nationality
        And Click on the element in the Left Nav
          | setup1     |
          | parameters |
          | nationalities  |
        And Click on the element in the Dialog
        |add|
        And User sending the keys in Dialog Content
        |nameInput|testinGIst190|
        And Click on the element in the Dialog
        |save|
        And Success message should be displayed

        And User delete item from Dialog
        |testinGIst190|
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
          |nameInput|190testingfEE|
          |codeInput|19071907|
          |integrationCode|343419|
          |priority|9019989190|
          #priority kısmı için parent classındaki sendKeysFunction metodundaki .clear komutunun devre  dışı bırakılması gerekiyor
          And Click on the element in the Dialog
          |toggleBar|
          |saveAndClose|
          And User delete item from Dialog
          |190testingfEE|
          And Success message should be displayed