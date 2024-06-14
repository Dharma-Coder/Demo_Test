package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class BooksPage {

        private static WebDriver driver;

        private WebDriverWait wait;

        public BooksPage(WebDriver driver){
            this.driver = driver;
            this.wait= new WebDriverWait(driver, Duration.ofSeconds(100));
        }
    private By Books = By.xpath("//a[@href='/books']");

    private By CartButtonOne = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");

    private By CartButtonTwo = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");

    private By CartButtonThree = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[3]");

    private By ComparelistOne = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[1]");

    private By ComparelistTwo = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[2]");

    private By ComparelistThree = By.xpath("(//button[@class='button-2 add-to-compare-list-button'])[3]");

    private By ShoppingCart = By.xpath("(//a[@href=\"/cart\"])[1]");
    
    private By CompareProductsList = By.xpath("//a[@href='/compareproducts']");

    private By Wishlist = By.xpath("(//a[@href='/wishlist'])[1]");

    private By SelectPosition = By.xpath("//select[@id='products-orderby']");

    private By SelectDisplay = By.xpath("//select[@id='products-pagesize']");

    private By ViewGrid = By.xpath("//a[contains(text(),'Grid')]");

    private By ViewList = By.xpath("//a[contains(text(),'List')]");


    public void ClickOnBooks(){driver.findElement(Books).click();}

    public boolean AddToCart(int i)  {
        String xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[" + i + "]";
        driver.findElement(By.xpath(xpath)).click();
        if (driver.findElement(ShoppingCart).getText().equalsIgnoreCase("shopping cart (0)")){
            return true;
        } else {
            return false;

        }
}
    public boolean ProductCompareList(int i) {
        String xpath = "(//button[@class='button-2 add-to-compare-list-button'])[" + i + "]";
        driver.findElement(By.xpath(xpath)).click();
        if (driver.findElement(CompareProductsList).getText().equalsIgnoreCase("Compare products list")) {
            return true;
        } else {
            return false;

        }
    }
    public boolean WhiteList(int i) {
        String xpath = "(//button[@class='button-2 add-to-wishlist-button'])[" + i + "]";
        driver.findElement(By.xpath(xpath)).click();
        if (driver.findElement(Wishlist).getText().equalsIgnoreCase("Wishlist (0)")) {
            return true;
        } else {
            return false;

        }
    }
    public void ClickOnViewGridButton(){driver.findElement(ViewGrid).click();}

    public void ClickOnViewListButton(){driver.findElement(ViewList).click();}

    public void Position(String value){
        WebElement DropdownPosition = driver.findElement(SelectPosition);
        Select Positionselect = new Select(DropdownPosition);
        Positionselect.selectByValue(value);
    }
    public void Display(String value){
        WebElement DropdownSize  = driver.findElement(SelectDisplay);
        Select SizeDisplay = new Select(DropdownSize);
        SizeDisplay.selectByValue(value);
    }
    public String getNextTabUrl() {
        ArrayList<String> wins = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(wins.get(wins.size()-1 ));
        return driver.getCurrentUrl();

    }

}


