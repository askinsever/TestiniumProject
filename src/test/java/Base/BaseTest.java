package Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Constants.Constants;

import java.util.concurrent.TimeUnit;

/**
 * @author  Aşkın SEVER
 * @since   2021-06-02
 */

public class BaseTest
{
    static WebDriver webDriver=null;
    private static Logger logger = LogManager.getLogger(BaseTest.class);

    @Before
    public void setUp()
    {
        logger.info("******** driver activation started ********");
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(Constants.GG_LINK);
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getWebDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        logger.info("******** driver activated ********");
    }

    public void tearDown()
    {
        logger.info("******** driver shutting down starting ********");
        getWebDriver().quit();
        logger.info("******** driver succesfully shut down  ********");
    }

    public static WebDriver getWebDriver()
    {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver)
    {
        BaseTest.webDriver = webDriver;
    }
}
