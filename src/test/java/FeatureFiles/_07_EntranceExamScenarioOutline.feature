#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption      | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | gradeLevel4  |
#| IT exam is1     | academicPeriod2              | gradeLevel2  |
#| Oracle exam is1 | academicPeriod2              | gradeLevel3  |
#| Math exam  is1  | academicPeriod2              | gradeLevel1  |

Feature: Entrance Exam Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Create Entrance Exam
    And Click on the element in the Left Nav
      | entranceExam1 |
      | setup2        |
      | entranceExam2 |
    And Click on the element in the Dialog
      | add |
    And User sending the keys in Form Content
      | nameInput | <ExamName> |
    And Click on the element in the Form Content
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |
    And Click on the element in the Dialog
      | save |
    And Click on the element in the Left Nav
      | entranceExam1 |
      | setup2        |
      | entranceExam2 |
    And User delete item from Form Content
      | <ExamName> |
    And Success message should be displayed
    Examples:
      | ExamName        | AcademicPeriodOption | GradeLevelOption |
      | Math exam ak1   | internship      | luciano          |
      | IT exam ak1     | internship      | spinka           |
      | Oracle exam ak1 | internship      | murphy           |
      | Test exam ak1   | internship      | skiles           |


