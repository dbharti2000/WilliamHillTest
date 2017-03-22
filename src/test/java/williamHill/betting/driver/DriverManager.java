package williamHill.betting.driver;


import org.openqa.selenium.WebDriver;
import williamHill.betting.PropertyReaders;

import java.io.IOException;

public class DriverManager {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() throws IOException {
        String browser = new PropertyReaders().readProperty("browser");
        setWebDriver(DriverFactory.createInstance(browser));
        return webDriver.get();
    }

    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }


    public static void destroyDriver(WebDriver driver) {
        driver.quit();
        driver = null;
    }
}
