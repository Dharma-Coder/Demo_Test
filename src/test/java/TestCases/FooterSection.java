package TestCases;

import Base.Baseopencart;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orgexamples.Footerpage;

public class FooterSection extends Baseopencart {

    private Footerpage Footerpage;

    @BeforeMethod(description = "This is the login test cases")
    public void VerfiyFooterPageSetup() {
        super.setup();
        Footerpage = new Footerpage(driver);
    }

    @Test(description = "Verify the Sitemap", priority = 0)
    public void VerifySitemap() {
        Footerpage.ClickOnSitemap();
        String url = Footerpage.getNextTabUrl();
        if (!url.contains("sitemap")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the shippingreturns", priority = 0)
    public void VerifyShippingReturns(){
        Footerpage.ClickOnShippingReturn();
        String url = Footerpage.getNextTabUrl();
        if (!url.contains("shipping-returns")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the privacy-notice", priority = 0)
      public void VerifyPrivacyNotice(){
        Footerpage.ClickOnPrivacy();
        String url = Footerpage.getNextTabUrl();
        if (!url.contains("privacy-notice")){
            Assert.fail();
        }
    }
    @Test(description = "Verify the Conditions-of-use", priority = 0)
    public void VerifyConditions() {
        Footerpage.ClickOnConditionUsers();
        String url = Footerpage.getNextTabUrl();
        if (!url.contains("conditions-of-use")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the About-of-use", priority = 0)
    public void VerifyAbout() {
        Footerpage.ClickOnAboutUs();
        String url = Footerpage.getNextTabUrl();
        if (!url.contains("about-us")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Contact-of-use", priority = 0)
    public void VerifyContact() {
        Footerpage.ClickOnContactUs();
        String url = Footerpage.getNextTabUrl();
        if (!url.contains("contactus")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Search", priority = 0)
    public void VerifySearch() {
        Footerpage.ClickOnserach();
        String url = Footerpage.getNextTabUrl();
        if (!url.contains("search")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the News", priority = 0)
    public void VerifyNews() {
        Footerpage.ClickOnNews();
        String url = Footerpage.getNextTabUrl();
        if (!url.contains("news")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the blogs", priority = 0)
    public void VerifyBlogs() {
        Footerpage.ClickOnBlogs();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("blog")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the recently viewed products", priority = 0)
    public void VerifyRecentlyViewedProducts() {
        Footerpage.ClickOnRecentlyViewProducts();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("recentlyviewedproducts")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the compareproducts", priority = 0)
    public void VerifyCompareProducts() {
        Footerpage.ClickOnCompareProductsList();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("compareproducts")) {
            Assert.fail();
        }
    }

    @Test(description = "Verify the New products ", priority = 0)
    public void VerifyNewproducts() {
        Footerpage.ClickOnNewProducts();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("newproducts")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Shopping cart ", priority = 0)
    public void VerifyShoppingCart() {
        Footerpage.ClickOnShoppingCart();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("cart")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the wishlist ", priority = 0)
    public void VerifyWishlist() {
        Footerpage.ClickOnWishlist();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("wishlist")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Facebook ", priority = 0)
    public void VerifyFacebook() {
        Footerpage.ClickOnFacebook();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("facebook")) {
            Assert.fail("The URL does not contain 'facebook'. Actual URL: " + url);
        }
    }
    @Test(description = "Verify the Youtube ", priority = 0)
    public void VerifyYoutube() {
        Footerpage.ClickOnYoutube();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("Youtube")) {
            Assert.fail("The URL does not contain 'Youtube'. Actual URL: " + url);
        }
    }
    @Test(description = "Verify the Twitter ", priority = 0)
    public void VerifyTwitter() {
        Footerpage.ClickOnTwitter();
        String url = Footerpage.getNextTabUrl();
        if(!url.contains("twitter")) {
            Assert.fail("The URL does not contain 'twitter'. Actual URL: " + url);
        }
    }
}

