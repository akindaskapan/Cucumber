# 1 sınav girişi yapınız
# sonra siliniz

  Feature: Entrance Exam Functionality
    Background:
      Given Navigate to campus
      When Enter username and password and click login button
      Then User should login successfully


    Scenario: Create Entrance Exam
      And Click on the element in the Left Nav
      |entranceExam1|
      |setup2|
      |entranceExam2|
      And Click on the element in the Dialog
      |add|
      And User sending the keys in Form Content
      |nameInput|akin1907|
      And Click on the element in the Form Content
      |academicPeriod|
      |internship|
      |gradeLevel|
      |luciano|
      And Click on the element in the Dialog
      |save|
      And Click on the element in the Left Nav
        |entranceExam1|
        |setup2|
        |entranceExam2|
      And User delete item from Form Content
      |akin1907|
      And Success message should be displayed



