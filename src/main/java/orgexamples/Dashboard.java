package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Dashboard {

    private static WebDriver driver;

    private WebDriverWait wait;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(100));
    }
    private By Computer = By.xpath("//a[@href='/computers']");

    private By Electronics = By.xpath("//a[@href='/electronics']");

    private By Apparel = By.xpath("//a[@href='/apparel']");

    private By Digitaldownloads = By.xpath("//a[@href='/digital-downloads']");

    private By Books = By.xpath("//a[@href='/books']");

    private By Jewelry = By.xpath("//a[@href='/jewelry']");

    private By GiftCard =By.xpath("//a[@href='/gift-cards']");

    private By Documentation =By.xpath("//a[contains(text(),'Documentation')]");

    private By NopDocumentation = By.xpath("//h1[@id='nopcommerce-documentation']");

    private By Formus =By.xpath("//a[contains(text(),'Forums')]");

    private By NopFormus =By.xpath("//h1[contains(text(),'nopCommerce forums')]");

    private By nopCommerceCom = By.xpath("//a[contains(text(),'nopCommerce.com')]");

    private By Electronics2 = By.xpath("//a[contains(text(),' Electronics ')]");

    private By Apparel2 = By.xpath("//a[contains(text(),' Apparel ')]");

    private By Digitaldownloads2 = By.xpath("//a[contains(text(),' Digital downloads')]");

    private By DeatailButtonOne =By.xpath("//a[@href='/new-online-store-is-open' and contains(text(),'details')]");

    private By DeatailButtonTwo =By.xpath("//a[@href='/nopcommerce-new-release' and contains(text(),'details')]");

    private By DeatailButtonThree =By.xpath("//a[@href='/about-nopcommerce' and contains(text(),'details')]");

    private By ViewNewsArchive = By.xpath("//a[contains(text(),'View News Archive')]");

    private By Vote = By.xpath("//button[@id='vote-poll-1']");

    private By LogonopCommerce = By.xpath("//img[@alt='nopCommerce demo store']");


    public void ClickOnComputer(){
        driver.findElement(Computer).click();}

    public void ClickOnElectronics(){driver.findElement(Electronics).click();}

    public void ClickOnApparel(){driver.findElement(Apparel).click();}

    public void ClickOnDigitalDownloads(){driver.findElement(Digitaldownloads).click();}

    public void ClickOnBooks(){driver.findElement(Books).click();}

    public void ClickOnJewelry(){driver.findElement(Jewelry).click();}

    public void ClickOnGiftCard(){driver.findElement(GiftCard).click();}

    public boolean ClickOnDocumentation(){
        driver.findElement(Documentation).click();
        return driver.findElement(NopDocumentation).isDisplayed();
    }

    public boolean ClickOnForum(){
        driver.findElement(Formus).click();
        return driver.findElement(NopFormus).isDisplayed();
    }

    public void ClickOnNopCommerceCom(){driver.findElement(nopCommerceCom).click();}

    public void ClickOnElectronics2(){driver.findElement(Electronics2).click();}

    public void ClickOnApparel2(){driver.findElement(Apparel2).click();}

    public void ClickOnDigitalDownloads2(){driver.findElement(Digitaldownloads2).click();}

    public void ClickOnDetailButtonOne(){driver.findElement(DeatailButtonOne).click();}

    public void ClickOnDetailButtonTwo(){driver.findElement(DeatailButtonTwo).click();}

    public void ClickOnDetailButtonThree(){driver.findElement(DeatailButtonThree).click();}

    public void ClickOnViewNewsArchive(){driver.findElement(ViewNewsArchive).click();}

    public void ClickOnVote(){driver.findElement(Vote).click();}

    public void ClickLogonopCommerce(){driver.findElement(LogonopCommerce).click();}

    public String getNextTabUrl() {
        ArrayList<String> wins = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(wins.get(wins.size() - 1));
        return driver.getCurrentUrl();
    }
}
