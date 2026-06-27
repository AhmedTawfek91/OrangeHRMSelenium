Feature: Login

  Scenario: Login valid Case
    When User insert user name and password and click login
    Then User should navigate to dashboard screen