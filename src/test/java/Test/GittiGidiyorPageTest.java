package Test;

import Base.BaseTest;
import Page.GittiGidiyorPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author  Aşkın SEVER
 * @since   2021-06-02
 */

public class GittiGidiyorPageTest extends BaseTest
    {
    GittiGidiyorPage GittiGidiyorPage;
    private static Logger logger = LogManager.getLogger(GittiGidiyorPageTest.class);

    @Before
    public void before()
    {
        GittiGidiyorPage = new GittiGidiyorPage(getWebDriver());
    }

    @Test
    public void testLogin() throws InterruptedException
    {
        logger.info("******** gittigidiyor test scenario starting ********");
        GittiGidiyorPage.hoverToUserMenu().signIn().search().nextPage().randomClick().increaseProductCount().addBasket().deleteProduct();
        logger.info("******** mission completed ********");
    }

    @After
    public void after() throws InterruptedException
    {
        tearDown();
    }
}