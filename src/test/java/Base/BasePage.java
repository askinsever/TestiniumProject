package Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

/**
 * @author  Aşkın SEVER
 * @since   2021-06-02
 */

public class BasePage
    {
    private static Logger logger = LogManager.getLogger(BasePage.class);
    WebDriver driver = null;
    WebDriverWait wait = null;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public WebElement findElement(By by)
    {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by)
    {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElements(by);
    }

    public void sendKeys(By by, String text)
    {
        findElement(by).sendKeys(text);
        logger.info("******** in this area "+ text + " wrote. ********");
    }


    public void click(By by)
    {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void hoverElement(By by)
    {
        logger.info("******** hover to element ********");
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void assertionPage(String text)
    {
        logger.info("******** page check starts ********");
        Assert.assertEquals(text, driver.getTitle());
        logger.info("******** page checked ********");
    }

    public void assertionUrl(String text)
    {
        logger.info("******** link check starts ********");
        Assert.assertEquals(text, driver.getCurrentUrl());
        logger.info("******** link checked ********");
    }

    public void scrollToElement(By by) {
        logger.info("******** element scroll starts ********");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", findElement(by));
        logger.info("******** element scroll succesfully finished ********");
    }

    public void randomItemClick(By by) {
        logger.info("******** random item click ********");
        Random rand = new Random();
        findElements(by).get(rand.nextInt(findElements(by).size())).click();
    }

}
