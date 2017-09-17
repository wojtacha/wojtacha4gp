@grandparade
Feature:  Prize is correctly calculated against bet slip

  John a WH Customer
  he wants the ability to place a bet on a English Premier League event

  Scenario:
    Given that John opens William Hill premier league betting page
    And he selects 'any' football event with "Home" outcome
    When he bets £ '0.05' for the home team to 'Win'
    Then user's prize should be properly calculated against the odds
