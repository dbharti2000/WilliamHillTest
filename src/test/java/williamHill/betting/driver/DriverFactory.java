package williamHill.betting.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dbharti on 21/03/2017.
 */
public class DriverFactory {

    static WebDriver driver = null;
    static DesiredCapabilities capabilities;

    static WebDriver createInstance(String browserName) throws IOException {

        if (browserName.toLowerCase().contains("firefox")) {
            driver = getFireFoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
            driver = getChromeDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("local")) {
            driver = new FirefoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("mobile")) {
            capabilities=getMobileCapabilities();
            driver = new FirefoxDriver(capabilities);
            driver.manage().window().maximize();
            return driver;
        }
        return driver;
    }

    public static WebDriver getFireFoxDriver() {
        WebDriver firefoxDriver = new FirefoxDriver();
        // maximize window
        firefoxDriver.manage().window().maximize();
        return firefoxDriver;

    }

    public static WebDriver getChromeDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/WilliamHill/src/test/resources/williamHill.betting/testDrivers/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }

    //Being used for instantiating a mobile browser
    private static DesiredCapabilities getMobileCapabilities(){
        System.setProperty("mobile", "true");
        Map<String, Object> deviceMetrics = new HashMap<String, Object>();
        deviceMetrics.put("width", 640);
        deviceMetrics.put("height", 640);
        deviceMetrics.put("pixelRatio", 3.0);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, new ChromeOptions() {
            {
                setExperimentalOption("mobileEmulation", new HashMap<String, Object>() {
                    { put("deviceMetrics", deviceMetrics);
                        put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
                    } });
            }
        });
        return capabilities;
    }
}
