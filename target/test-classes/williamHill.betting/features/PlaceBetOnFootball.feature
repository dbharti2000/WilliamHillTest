@PlaceBet
Feature:Place a bet
    As a WH Customer
    I want the ability to place a bet on a English Premier League event
    So that i can get returns which are visible at the moment

    #Money has been parameterized as being asked
    Scenario: Place a bet on English Premium League
        Given I navigate to william hill website
        And I navigate to English Premier League league in UK
        When I place a bet of 0.05 pounds for the home team to win
        Then I should see the 7/10 returns
        And I should see this error message 'You must be logged in to place a bet, please log in and try again'
