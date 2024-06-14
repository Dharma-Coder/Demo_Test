package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import javax.swing.text.html.Option;

public class BaseTest {

    public static WebDriver driver;

    public void setup(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options =new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.guru99.com/test/newtours/login.php");

    }
     public  static WebDriver getDriver() {return driver;}

}
