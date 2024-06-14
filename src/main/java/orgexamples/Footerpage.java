package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Footerpage {
    private static WebDriver driver;

    private WebDriverWait wait;

    public Footerpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By Sitemap = By.xpath("//a[@href='/sitemap']");

    private By ShippingReturn = By.xpath("//a[@href='/shipping-returns']");

    private By Privacy = By.xpath("//a[@href='/privacy-notice']");

    private By ConditionUsers = By.xpath("//a[@href='/conditions-of-use']");

    private By AboutUs = By.xpath("//a[@href='/about-us']");

    private By ContactUs = By.xpath("//a[@href='/contactus']");

    private By Serach = By.xpath("//a[@href='/search']");

    private By News = By.xpath("//a[@href='/news']");

    private By Blogs = By.xpath("//a[@href='/blog']");

    private By RecentlyViewedProducts = By.xpath("//a[@href='/recentlyviewedproducts']");

    private By CompareProductsList = By.xpath("//a[@href='/compareproducts']");

    private By NewProducts = By.xpath("//a[@href='/newproducts']");

    private By ShoppingCart = By.xpath("//a[@href='/cart']");

    private By Wishlist = By.xpath("//a[@href='/wishlist']");

    private By Facebook = By.xpath("//a[contains(text(),'Facebook')]");

    private By Twitter = By.xpath("//a[contains(text(),'Twitter')]");

    private By Youtube = By.xpath("//a[contains(text(),'YouTube')]");

    private By NewsRss = By.xpath("//a[@href='/news/rss/1']");

    public void ClickOnSitemap(){driver.findElement(Sitemap).click(); }

    public void ClickOnShippingReturn(){driver.findElement(ShippingReturn).click();}

    public void ClickOnPrivacy(){driver.findElement(Privacy).click();}

    public void ClickOnConditionUsers(){driver.findElement(ConditionUsers).click();}

    public void ClickOnAboutUs(){driver.findElement(AboutUs).click();}

    public void ClickOnContactUs(){driver.findElement(ContactUs).click();}

    public void ClickOnserach(){driver.findElement(Serach).click();}

    public void ClickOnNews(){driver.findElement(News).click();
    }
    public void ClickOnBlogs(){driver.findElement(Blogs).click();}

    public void ClickOnRecentlyViewProducts(){driver.findElement(RecentlyViewedProducts).click();}

    public void ClickOnCompareProductsList(){driver.findElement(CompareProductsList).click();}

    public void ClickOnNewProducts(){driver.findElement(NewProducts).click();}

    public void ClickOnWishlist(){driver.findElement(Wishlist).click();}

    public void ClickOnShoppingCart(){driver.findElement(ShoppingCart).click();}

    public void ClickOnFacebook(){driver.findElement(Facebook).click();}

    public void ClickOnTwitter(){driver.findElement(Twitter).click();}

    public void ClickOnYoutube(){driver.findElement(Youtube).click();}

    public void ClickOnNewsRss(){driver.findElement(NewsRss).click();}

    public String getNextTabUrl() {
        ArrayList<String> wins = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(wins.get(wins.size() - 1));
        return driver.getCurrentUrl();
    }

}
