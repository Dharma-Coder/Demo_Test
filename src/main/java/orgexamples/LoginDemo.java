package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginDemo {
    private static WebDriver driver;

    private WebDriverWait wait;


    public LoginDemo(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By login= By.xpath("//input[@name='uid']");

    private By pswd = By.xpath("//input[@name='password']");

    private By loginbutton = By.xpath("//input[@name='btnLogin']");

    private By loginSuccessfullyDashboard = By.xpath("//marquee[@class='heading3' and contains(text(),'Welcome')]");


    public void Loginfunctionality(){
        driver.findElement(login).sendKeys("mngr559844");
        driver.findElement(pswd).sendKeys("jAhaqAs");
        driver.findElement(loginbutton).click();
    }

    public boolean loginSuccessfullypage(){
        return driver.findElement(loginSuccessfullyDashboard).isDisplayed();
    }
}


