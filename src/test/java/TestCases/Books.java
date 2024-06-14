package TestCases;

import Base.Baseopencart;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orgexamples.BooksPage;

public class Books extends Baseopencart {

    private BooksPage BooksPage;

    @BeforeMethod(description = "This is the login test cases")
    public void setCBooks() {
        super.setup();
        BooksPage = new BooksPage(driver);
    }

    @Test(description = "Verify the AddButton", priority = 0)
    public void VerifyADDButtonOne() {
        BooksPage.ClickOnBooks();
        if(!BooksPage.AddToCart(1)){
            Assert.fail();
        }

    }

    @Test(description = "Verify the AddButton", priority = 0)
    public void VerifyADDButtonTwo() {
        BooksPage.ClickOnBooks();
        if(!BooksPage.AddToCart(2)){
            Assert.fail();
        }
    }

    @Test(description = "Verify the AddButton", priority = 0)
    public void VerifyADDButtonThree() {
        BooksPage.ClickOnBooks();
        if(!BooksPage.AddToCart(3)){
            Assert.fail();
        }
    }
    @Test(description = "Verify the ProductCompare List", priority = 0)
    public void VerifyCompareListOne() {
        BooksPage.ClickOnBooks();
        if (!BooksPage.ProductCompareList(1)) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the ProductCompare List", priority = 0)
    public void VerifyCompareListTWo() {
        BooksPage.ClickOnBooks();
        if (!BooksPage.ProductCompareList(2)) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the ProductCompare List", priority = 0)
    public void VerifyCompareListThree() {
        BooksPage.ClickOnBooks();
        if (!BooksPage.ProductCompareList(3)) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the ProductCompare List", priority = 0)
    public void VerifyWhiteListOne() {
        BooksPage.ClickOnBooks();
        if (!BooksPage.WhiteList(1)) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the ProductCompare List", priority = 0)
    public void VerifyWhiteListTwO() {
        BooksPage.ClickOnBooks();
        if (!BooksPage.WhiteList(2)) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the ProductCompare List", priority = 0)
    public void VerifyWhiteListThree() {
        BooksPage.ClickOnBooks();
        if (!BooksPage.WhiteList(3)) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the GridButton", priority = 0)
    public void VerifyGridButton() {
        BooksPage.ClickOnBooks();
        BooksPage.ClickOnViewListButton();
        BooksPage.ClickOnViewGridButton();
        String url = BooksPage.getNextTabUrl();
        if (!url.contains("viewmode=grid")) {
            Assert.fail("The URL does not contain 'viewmode=grid'. Actual URL: " + url);
        }
    }
    @Test(description = "Verify the GridButton", priority = 0)
    public void VerifyListButton() {
        BooksPage.ClickOnBooks();
        BooksPage.ClickOnViewListButton();
        String url = BooksPage.getNextTabUrl();
        if (!url.contains("viewmode=list")) {
            Assert.fail("The URL does not contain 'viewmode=list'. Actual URL: " + url);
        }
    }
}