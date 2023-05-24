@Register
Feature: Register
  As a user
  I want to register
  So that I can register my account

  @SuccessToRegister
  Scenario: Success To Register
    Given Account created
    Given Application opened
    Given Account not registered
    When I click skip
    And I click masuk
    And I click daftar
    And I input email "fakemail@gmail.com"
    And I click checkbox syarat dan ketentuan
    And I click checkbox i am not robot
    And I click daftar
    Then Success to register