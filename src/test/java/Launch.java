import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
    public static void main(String[] args) {

        System.setProperty("web driver.chrome.driver","D:\\Testing\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/login.php");

        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("QQQQQ");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qqqqq");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.findElement(By.xpath("//h3[contains(text(),'Login Successfully')]")).isDisplayed();
        driver.quit();

    }
}