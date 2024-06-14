package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Baseopencart {
    public static WebDriver driver;

    public void setup(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options =new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.nopcommerce.com/");

    }
    public  static WebDriver getDriver() {return driver;}



}
