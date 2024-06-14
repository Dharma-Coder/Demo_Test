package orgexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlightPage {
    private static WebDriver driver;

    private WebDriverWait wait;


    public FlightPage(WebDriver driver) {
        this.driver =driver;
    }
    private By flight=By.xpath("//a[normalize-space()='Flights']");
    private By Type= By.xpath("//input[@value='oneway']");

    private By passengers =By.xpath("//select[@name='passCount']");

    private By departing =By.xpath("//select[@name='fromPort']");


   public void booking(){
       driver.findElement(flight).click();

       WebElement droptype =driver.findElement(Type);
       Select droptypecategory=new Select(droptype);
       droptypecategory.selectByValue("3");


   }


}
