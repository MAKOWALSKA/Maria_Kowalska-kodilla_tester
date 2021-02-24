Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: No withdrawal from a wallet in credit
    Given I have deposited $100 in my wallet
    When I don't request any withdrawal
    Then $0 should be dispensed
    And the balance of my wallet should be $100

  Scenario: Complete withdrawal from a wallet in credit
    Given I have deposited $1000 in my wallet
    When I request $1000
    Then $1000 should be dispensed
    And the balance of my wallet should be $0