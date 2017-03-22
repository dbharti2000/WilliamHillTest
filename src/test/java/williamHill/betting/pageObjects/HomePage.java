package williamHill.betting.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import williamHill.betting.ui.PlaceBetPageUi;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by dbharti on 21/03/2017.
 */
public class HomePage extends BasePage implements PlaceBetPageUi {
    private final static String pageTitle = "Online Betting from William Hill - The Home of Betting";
    private HomePage homePage;

    public HomePage(WebDriver driver) {
        super(driver);
        URL = "http://sports.williamhill.com/sr-admin-set-white-list-cookie.html";
    }

//this method takes control to premier league matches
    public void navigateToPremierLeagueMatches() throws Exception {

        assertTrue(driver.getTitle().contains(pageTitle)); //to make sure we are at the right page

        if(isMobile()) {
            WebElement footBallLink = waitForElement(driver, By.id(FOOTBALL_LINK_ID_MOBILE));
            footBallLink.click();
        }
        else{
            waitForOverlayDisappears();
            WebElement footBallLink = waitForElement(driver, By.cssSelector(FOOTBALL_LINK_CSS));
            footBallLink.click();
        }


    }

}
