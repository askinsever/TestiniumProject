package Constants;

import org.openqa.selenium.By;

public class Constants
{
    public static final By USER_MENU = By.cssSelector("[data-cy='header-user-menu']");
    public static final By SIGN_IN = By.cssSelector("[data-cy='header-login-button']");
    public static final By EMAIL_AREA = By.id("L-UserNameField");
    public static final By PASSWORD_AREA = By.id("L-PasswordField");
    public static final By SIGN_IN_ENTER = By.id("gg-login-enter");
    public static final By SEARCH = By.cssSelector("[data-cy='header-search-input']");
    public static final By FIND = By.cssSelector("[data-cy='search-find-button']");
    public static final By NEXT_PAGE = By.className("next-link");
    public static final By PRODUCT_LIST = By.className("product-hslider-container");
    public static final By INCREASE_PRODUCT = By.xpath("//a[@aria-label='Adeti Artır']");
    public static final By ADD_BASKET = By.id("add-to-basket");
    public static final By GO_TO_BASKET = By.xpath("//span[text()='Sepetim']");
    public static final By TOTAL_PRICE = By.xpath("//div[@class='total-price']");
    public static final By PRODUCT_PRICE = By.xpath("(//p)[14]");
    public static final By PRODUCT_COUNT = By.xpath("//div[@class='gg-d-16 detail-text']");
    public static final By TRASH_BUTTON = By.className("gg-icon-bin-medium");
    public static String GG_LINK = "https://www.gittigidiyor.com/";
    public static String TITLE = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
    public static String EMAIL = "severaskin1@gmail.com";
    public static String PASSWORD = "1234asdf";
    public static String PRODUCT = "bilgisayar";
    public static String NEXT_PAGE_CONTROL = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";
}
