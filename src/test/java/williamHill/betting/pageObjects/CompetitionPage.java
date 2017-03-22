package williamHill.betting.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import williamHill.betting.ui.PlaceBetPageUi;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by dbharti on 22/03/2017.
 */
public class CompetitionPage extends BasePage implements PlaceBetPageUi {


    public CompetitionPage(WebDriver myDriver) {
        super(myDriver);
    }

    public void navigateToEPL(){
        waitForOverlayDisappears();
        WebElement englishPremierLeagueLink = waitForElement(driver, By.cssSelector(ENGLISH_PREMIER_LEAGUE_LINK_CSS));
        englishPremierLeagueLink.click();
    }

    public void placeBet(String betPrice) throws Exception {
        WebElement winButton = waitForElement(driver, By.cssSelector(HOME_TEAM_SELECTION_BTN_CSS));
        winButton.click();

        WebElement betPriceInputField = waitForElement(driver, By.cssSelector(BET_PRICE_INPUT_BOX_CSS));
        betPriceInputField.sendKeys(betPrice);

        WebElement placeBetButton = waitForElement(driver, By.cssSelector(PLACE_BET_BTN_CSS));
        placeBetButton.click();
    }

    public void assertOddsAndReturns(String expectedReturns) throws Exception {

        WebElement placeBetErrorField = driver.findElement(By.cssSelector(BET_SLIP_SELECTION_ODDS_CSS));
        assertTrue(placeBetErrorField.getText().toString().equals(expectedReturns));

    }

    public void assertErrorMessage(String expectedError) throws Exception {

        WebElement placeBetErrorField = driver.findElement(By.cssSelector(PLACE_BET_ERROR_CSS));
        assertTrue(placeBetErrorField.getText().contains(expectedError));
    }

}
