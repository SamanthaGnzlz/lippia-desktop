@Smoke
Feature: As a potential client i need to open a calculator and do math operations

  @Plus
  Scenario: Plus operation
    When 7 plus 8
    Then Result is 15

  @Minus
  Scenario: Minus operation
    When 8 minus 7
    Then Result is 1

  @Multi
  Scenario: Multiplication operation
    When 10 multi 8
    Then Result is 80

  @Div
  Scenario: Division operation
    When 150 divided 30
    Then Result is 5

