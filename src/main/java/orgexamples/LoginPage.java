package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private static WebDriver driver;

    private WebDriverWait wait;


    public LoginPage(WebDriver driver) {
       this.driver =driver;
       this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
   private By username = By.xpath("//input[@name='userName']");

   private By password = By.xpath("//input[@name='password']");

   private By SubmitButton =By.xpath("//input[@name='submit']");

   public By loginSuccessfully =By.xpath("//h3[contains(text(),'Login Successfully')]");


   public void testcases(){
       driver.findElement(username).sendKeys("QQQQQ");
       driver.findElement(password).sendKeys("qqqqq");
       driver.findElement(SubmitButton).click();

   }
   public void loginsucessfully(){
       driver.findElement(loginSuccessfully);
   }
}