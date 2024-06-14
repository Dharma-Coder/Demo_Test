package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class ComputerPage {

    private static WebDriver driver;

    private WebDriverWait wait;

    public ComputerPage(WebDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(100));
    }
    private By Computer = By.xpath("//a[@href='/computers']");

    private By Desktops = By.xpath("(//a[contains(text(),'Desktops')])[3]");

    private By Notebooks = By.xpath("(//a[contains(text(),'Notebooks')])[3]");

    private By Software = By.xpath("(//a[contains(text(),'Software')])[3]");

    private By SelectPosition = By.xpath("//select[@id='products-orderby']");

    private By SelectDisplay = By.xpath("//select[@id='products-pagesize']");

    private By ViewGrid = By.xpath("//a[contains(text(),'Grid')]");

    private By ViewList = By.xpath("//a[contains(text(),'List')]");

    private By ShoppingCart = By.xpath("(//a[@href=\"/cart\"])[1]");




    public void ClickOnComputer(){driver.findElement(Computer).click();}

    public void ClickOnDesktops(){driver.findElement(Desktops).click();}

    public void ClickOnNotebooks(){driver.findElement(Notebooks).click();}

    public void ClickOnSoftware(){driver.findElement(Software).click();}

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
    public boolean clickAddButtons(int i)  {
            String xpath = "(//button[@type='button'][contains(text(),'Add to cart')])[" + i + "]";
            driver.findElement(By.xpath(xpath)).click();
        if (driver.findElement(ShoppingCart).getText().equalsIgnoreCase("shopping cart (0)")){
            return true;
        } else {
            return false;

        }
    }


}
