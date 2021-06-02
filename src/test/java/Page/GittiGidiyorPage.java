package Page;

import Base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static Constants.Constants.*;

/**
 * @author  Aşkın SEVER
 * @since   2021-06-02
 */

public class GittiGidiyorPage extends BasePage
{
    public GittiGidiyorPage(WebDriver driver)
    {
        super(driver);
    }

    private static Logger logger = LogManager.getLogger(GittiGidiyorPage.class);

    public GittiGidiyorPage hoverToUserMenu()
    {
        logger.info("******** test starting ********");
        assertionPage(TITLE);
        hoverElement(USER_MENU);
        return this;
    }

    public GittiGidiyorPage signIn() throws InterruptedException
    {
        logger.info("******** sign in process starting ********");
        click(SIGN_IN);
        sendKeys(EMAIL_AREA,EMAIL);
        sendKeys(PASSWORD_AREA,PASSWORD);
        click(SIGN_IN_ENTER);
        Thread.sleep(5000);
        assertionPage(TITLE);
        logger.info("******** successfulSly sign in ********");
        return this ;
    }

    public GittiGidiyorPage search()
    {
        logger.info("******** the product"+ PRODUCT + "has been written in that field ********");
        findElement(SEARCH);
        sendKeys(SEARCH,PRODUCT);
        click(FIND);
        logger.info(PRODUCT + " found.");
        return this ;
    }

    public GittiGidiyorPage nextPage()
    {
        logger.info("******** switching to the next page ********");
        scrollToElement(NEXT_PAGE);
        click(NEXT_PAGE);
        assertionUrl(NEXT_PAGE_CONTROL);
        logger.info("******** successfully switched ********");
        return this;
    }

    public GittiGidiyorPage randomClick()
    {
        randomItemClick(PRODUCT_LIST);
        logger.info("******** random product list ********");
        return this;
    }

    public GittiGidiyorPage deleteProduct()
    {
        click(TRASH_BUTTON);
        logger.info("******** product deleted ********");
        return this;
    }

    public GittiGidiyorPage increaseProductCount()
    {
        logger.info("******** product increase start ********");
        scrollToElement(INCREASE_PRODUCT);
        click(INCREASE_PRODUCT);
        logger.info("******** product increase finished ********");
        return this;
    }

    public GittiGidiyorPage addBasket()
    {
        logger.info("******** add basket process start ********");
        click(ADD_BASKET);
        click(GO_TO_BASKET);
        Assert.assertEquals(findElement(TOTAL_PRICE).getText(), findElement(PRODUCT_PRICE).getText());
        Assert.assertEquals(findElement(PRODUCT_COUNT).getText(), "Ürün Toplamı (2 Adet)");
        logger.info("******** add basket process finished ********");
        return this;
    }
}

