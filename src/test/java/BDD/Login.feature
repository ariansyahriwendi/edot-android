@Login
Feature: Login
  As a user
  I want to login
  So that I can login my account

  @SuccessToLogin
  Scenario: Success To Login
    Given Account created
    Given Application opened
    Given Account not logged in
    When I click skip
    And I click masuk
    And I input email "fakemail@gmail.com"
    And I click checkbox i am not robot
    And I click selanjutnya
    And I input password "password"
    And I click masuk login
    Then Success to login