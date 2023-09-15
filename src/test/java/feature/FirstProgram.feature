Feature: Application Login

  Background: 
    Given set up the entries in the data base
    When Launch the browser from Config Variable
    And Hit thee home page Url of the Banking Page

  @RegressionTest
  Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When User Signup into application with "admin" password "1234"
    Then Home Page is displayed
    And Cards are displayed

  @MobileTest
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User Signup into application with "user" password "6196"
    Then Home Page is displayed
    And Cards are displayed

  @SokeTest @RegressionTest
  Scenario Outline: 
    :  Mortage User Page default login

    Given User is on NetBanking landing page
    When User Signup into application with "<usn>" password "<psw>"
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | usn    | psw  |
      | debit  | 123@ |
      | credit | 619@ |

  @SokeTest
  Scenario: User Page default SignUp
    Given User is on Practice landing page
    When User Signup into application
      | chethan           |
      | Shetty            |
      | chethan@gamil.com |
      |        9620711665 |
    Then Home Page is displayed
    And Cards are displayed
