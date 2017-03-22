package williamHill.betting.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import williamHill.betting.PropertyReaders;

import java.util.concurrent.TimeUnit;

/**
 * Created by dbharti on 21/03/2017.
 * This is the base class which all the page classes will extend, this should not be instantiated.
 */
public abstract class BasePage {

    protected String URL;
    protected WebDriver driver;
    protected String pageTitle;


    public BasePage(WebDriver myDriver) {
        this.driver=myDriver;
    }

    public boolean isMobile() {
        String browser = new PropertyReaders().readProperty("browser");
        if (browser.equals("true"))
            return true;
        else
            return false;
    }

    public void open() {
        driver.get(URL);
    }


    //using this wait because elements sometimes appear to be on the page but they are not click-able.
    public WebElement waitForElement(WebDriver driver, final By by) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
    }

    //using this wait as we won't be able to click at Competitions link until overlay disappears
    public void waitForOverlayDisappears(){
         new WebDriverWait(driver, 15).until(ExpectedConditions.invisibilityOfElementLocated(By.id("wh-global-overlay")));
    }


}


