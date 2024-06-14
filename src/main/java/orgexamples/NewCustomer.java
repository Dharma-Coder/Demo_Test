package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewCustomer {
    private static WebDriver driver;

    private WebDriverWait wait;

   public NewCustomer(WebDriver driver){
       this.driver=driver;
       this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   }
    private By newcustomer = By.xpath("//a[contains(text(),'New Customer')]");

    private By customername =By.xpath("//input[@name='name']");

    private By radiobutton = By.xpath("//input[@value='m']");

    private By dod =By.xpath("//input[@name='dob']");

    private By address = By.xpath("//textarea[@name='addr']");

    private By city = By.xpath("//input[@name='city']");

    private By state = By.xpath("//input[@name='state']");

    private By pin =By.xpath("//input[@name='pinno']");

    private By phonenumber=By.xpath("//input[@name='telephoneno']");

    private By email =By.xpath("//input[@name='emailid']");

    private By password =By.xpath("//input[@name='password']");

    private By submitbutton = By.xpath("//input[@type='submit']");


    public void Createcustomer() throws InterruptedException {
        driver.findElement(newcustomer).click();
        driver.findElement(customername).sendKeys("Testabc");
        driver.findElement(radiobutton).click();
        Thread.sleep(1000);
        driver.findElement(dod).sendKeys("11022024");
        driver.findElement(address).sendKeys("Hyderabad");
        driver.findElement(city).sendKeys("Hyderabad");
        driver.findElement(state).sendKeys("Hyderabad");
        driver.findElement(pin).sendKeys("500057");
        driver.findElement(phonenumber).sendKeys("7441247451");
        driver.findElement(email).sendKeys("test2345up@malinator.com");
        driver.findElement(password).sendKeys("test@123");
    }


}




