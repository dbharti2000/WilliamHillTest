$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("williamHill.betting/features/PlaceBetOnFootball.feature");
formatter.feature({
  "line": 2,
  "name": "Place a bet",
  "description": "  As a WH Customer\n  I want the ability to place a bet on a English Premier League event\n  So that i can get returns which are visible at the moment",
  "id": "place-a-bet",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PlaceBet"
    }
  ]
});
formatter.before({
  "duration": 8294862526,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#Money has been parameterized as being asked"
    }
  ],
  "line": 8,
  "name": "Place a bet on English Premium League",
  "description": "",
  "id": "place-a-bet;place-a-bet-on-english-premium-league",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I navigate to william hill website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I navigate to English Premier League league in UK",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I place a bet of 0.05 pounds for the home team to win",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see the 7/10 returns",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see this error message \u0027You must be logged in to place a bet, please log in and try again\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "PlaceBetOnFootballStepDefinition.navigate_to_william_hill_website()"
});
formatter.result({
  "duration": 6388773060,
  "status": "passed"
});
formatter.match({
  "location": "PlaceBetOnFootballStepDefinition.navigate_to_english_premier_league()"
});
formatter.result({
  "duration": 7683873173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 17
    }
  ],
  "location": "PlaceBetOnFootballStepDefinition.i_place_a_bet_for_home_team_to_win(String)"
});
formatter.result({
  "duration": 2404206472,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7/10",
      "offset": 17
    }
  ],
  "location": "PlaceBetOnFootballStepDefinition.i_should_see_the_expected_return(String)"
});
formatter.result({
  "duration": 323874835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You must be logged in to place a bet, please log in and try again",
      "offset": 33
    }
  ],
  "location": "PlaceBetOnFootballStepDefinition.i_should_see_this_error_message(String)"
});
formatter.result({
  "duration": 64687834,
  "status": "passed"
});
formatter.after({
  "duration": 1284169053,
  "status": "passed"
});
});