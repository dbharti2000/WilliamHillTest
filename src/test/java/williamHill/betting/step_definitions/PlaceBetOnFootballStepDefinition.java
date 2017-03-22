package williamHill.betting.step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import williamHill.betting.driver.DriverManager;
import williamHill.betting.pageObjects.CompetitionPage;
import williamHill.betting.pageObjects.FootballPage;
import williamHill.betting.pageObjects.HomePage;

import java.io.IOException;

/**
 * Created by dbharti on 21/03/2017.
 */
public class PlaceBetOnFootballStepDefinition {
    private static HomePage homePage;
    private static FootballPage footballPage;
    private static CompetitionPage competitionPage;
    private WebDriver driver;


    @Before
    public void beforeScenario() throws IOException {
        driver = new DriverManager().getDriver();
        System.out.println("this will run before the actual scenario");
    }

    @After
    public void afterScenario() {
        DriverManager.destroyDriver(driver);
        System.out.println("this will run after scneario is finished, even if it failed");
    }


    @Given("^I navigate to william hill website$")
    public void navigate_to_william_hill_website() {
        homePage = new HomePage(driver);
        homePage.open();
    }

    @Given("^I navigate to English Premier League league in UK$")
    public void navigate_to_english_premier_league() throws Exception {
        homePage.navigateToPremierLeagueMatches();
        footballPage=new FootballPage(driver);
        footballPage.navigateToCompetitions();
        competitionPage=new CompetitionPage(driver);
        competitionPage.navigateToEPL();
    }

    @When("^I place a bet of (.*) pounds for the home team to win$")
    public void i_place_a_bet_for_home_team_to_win(String betPrice) throws Exception {
        competitionPage.placeBet(betPrice);
    }

    @Then("^I should see the (.*) returns$")
    public void i_should_see_the_expected_return(String expectedReturn) throws Exception {
        competitionPage.assertOddsAndReturns(expectedReturn);
    }

    @Then("^I should see this error message '(.*)'$")
    public void i_should_see_this_error_message(String expectedErrorMsg) throws Exception {
        competitionPage.assertErrorMessage(expectedErrorMsg);
    }
}
