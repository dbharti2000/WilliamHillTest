package williamHill.betting.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import williamHill.betting.ui.PlaceBetPageUi;

/**
 * Created by dbharti on 22/03/2017.
 */
public class FootballPage extends BasePage implements PlaceBetPageUi {


    public FootballPage(WebDriver myDriver) {
        super(myDriver);
    }

    public void navigateToCompetitions(){
        waitForOverlayDisappears();
        WebElement competitionsLink = waitForElement(driver, By.cssSelector(COMPETITIONS_LINK_CSS));
        competitionsLink.click();
    }
}
