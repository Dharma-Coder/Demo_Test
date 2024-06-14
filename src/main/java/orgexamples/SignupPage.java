package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage {

    private static WebDriver driver;

    private WebDriverWait wait;

    public SignupPage(WebDriver driver) {
        this.driver =driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    private By loginbutton = By.xpath("//div[@class='bg-signin m-auto']");

    private By registerbutton = By.xpath("//button[contains(text(),'REGISTER')]");

    private By username = By.xpath("//input[@placeholder='Name']");

    private By phonenumber = By.xpath("//input[@placeholder='Enter your mobile number']");

    private By emailid = By.xpath("//input[@placeholder='Email']");

    private By password = By.xpath("//input[@placeholder='Password']");

    private By reenterpassword = By.xpath("//input[@placeholder='Re-enter Password']");

    private By rgbutton = By.xpath("//span[contains(text(),'REGISTER')]");

    private By signinuser = By.xpath("//span[contains(text(),'Hi')]");

    private By errormessagepwd = By.xpath("//small[contains(text(),'Please enter your password')]");


    public void newsignup() {
        driver.findElement(loginbutton).click();
        driver.findElement(registerbutton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username).sendKeys("tester");
        driver.findElement(phonenumber).sendKeys("9094421888");
        driver.findElement(emailid).sendKeys("abcdej14@gmail.com");
        driver.findElement(password).sendKeys("Test@123");
        driver.findElement(reenterpassword).sendKeys("Test@123");
        driver.findElement(rgbutton).click();

    }
    public void signupsucessfully(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(signinuser));
        driver.findElement(signinuser);

    }
    public void withoutpassword(){
        driver.findElement(loginbutton).click();
        driver.findElement(registerbutton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username).sendKeys("tester");
        driver.findElement(phonenumber).sendKeys("9094421888");
        driver.findElement(emailid).sendKeys("abcdej14@gmail.com");
        driver.findElement(password).sendKeys("123");
        driver.findElement(password).clear();
        driver.findElement(rgbutton).click();
    }
    public String errormessagewithoutpassword(){
        return driver.findElement(errormessagepwd).getText();
    }






}

