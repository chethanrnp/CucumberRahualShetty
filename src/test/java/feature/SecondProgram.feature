Feature: Application Login

  Background: 
    When Launch the browser from Config Variable
    And Hit thee home page Url of the Banking Page

  @MobileTest @NetBanking
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User Signup into application with "user" password "6196"
    Then Home Page is displayed
    And Cards are displayed

  @SokeTest @RegressionTest @Mortgage
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
