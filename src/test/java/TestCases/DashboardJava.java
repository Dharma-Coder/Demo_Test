package TestCases;

import Base.Baseopencart;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orgexamples.Dashboard;

public class DashboardJava extends Baseopencart {

    private Dashboard Dashboard;
    @BeforeMethod(description = "This is the login test cases ")
    public void setDashboard(){
        super.setup();
        Dashboard = new Dashboard(driver);
    }

    @Test(description = "Verify the Computer page", priority = 0)
    public void VerifyComputerPage() {
        Dashboard.ClickOnComputer();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("computers")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Electronics page", priority = 0)
    public void VerifyElectronicPage() {
        Dashboard.ClickOnElectronics();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("electronics")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Apparel page", priority = 0)
    public void VerifyApparelPage() {
        Dashboard.ClickOnApparel();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("apparel")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Digital Downloads page", priority = 0)
    public void VerifyDigitalDownloadsPage() {
        Dashboard.ClickOnDigitalDownloads();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("digital-downloads")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Book page", priority = 0)
    public void VerifyBooksPage() {
        Dashboard.ClickOnBooks();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("books")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the jewelry page", priority = 0)
    public void VerifyJewelryPage() {
        Dashboard.ClickOnJewelry();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("jewelry")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the gift-cards page", priority = 0)
    public void VerifyGiftCardsPage() {
        Dashboard.ClickOnGiftCard();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("gift-cards")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Documentation page", priority = 0)
    public void VerifyClickOnDocumentationPage() {
        if(!Dashboard.ClickOnDocumentation() ){
            Assert.fail("Documentation page is not Displayed");
        }
    }
    @Test(description = "Verify the Forum page", priority = 0)
    public void VerifyClickOnForumPage() {
        if(!Dashboard.ClickOnForum() ){
            Assert.fail("Forum page is not Displayed");
        }
    }
    @Test(description = "Verify the nopcommerce page", priority = 0)
    public void VerifyNopCommercePage() {
        Dashboard.ClickOnNopCommerceCom();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("nopcommerce")) {
            Assert.fail("The URL does not contain 'nopcommerce'. Actual URL: " + url);
        }
    }
    @Test(description = "Verify the Electronics2 page", priority = 0)
    public void VerifyElectronics2Page() {
        Dashboard.ClickOnElectronics2();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("electronics")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the Apparel2 page", priority = 0)
    public void VerifyApparel2Page() {
        Dashboard.ClickOnApparel2();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("apparel")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the DigitalDownloads2 page", priority = 0)
    public void VerifyDigitalDownloads2Page() {
        Dashboard.ClickOnDigitalDownloads2();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("digital-downloads")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the DetailButtonOne page", priority = 0)
    public void VerifyDetailButtonOnePage() {
        Dashboard.ClickOnDetailButtonOne();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("new-online-store-is-open")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the DetailButtonTwo page", priority = 0)
    public void VerifyDetailButtonTwoPage() {
        Dashboard.ClickOnDetailButtonTwo();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("nopcommerce-new-release")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the DetailButtonThree page", priority = 0)
    public void VerifyDetailButtonThreePage() {
        Dashboard.ClickOnDetailButtonThree();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("about-nopcommerce")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the ViewNewsArchive page", priority = 0)
    public void VerifyViewNewsArchivePage() {
        Dashboard.ClickOnViewNewsArchive();
        String url = Dashboard.getNextTabUrl();
        if (!url.contains("news")) {
            Assert.fail();
        }
    }

}

