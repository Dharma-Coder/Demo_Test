package orgexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class NewRegistrationopencart {

    private static WebDriver driver;

    private WebDriverWait wait;

    public NewRegistrationopencart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By Registration = By.xpath("//a[@href='/register?returnUrl=%2F']");

    private By Gender = By.xpath("//input[@id='gender-male']");

    private By GenderFemale = By.xpath("//input[@id='gender-female']");

    private By firstname = By.xpath("//input[@id='FirstName']");

    private By lastname = By.xpath("//input[@id='LastName']");

    private By date = By.xpath("//select[@name='DateOfBirthDay']");

    private By month = By.xpath("//select[@name='DateOfBirthMonth']");

    private By year = By.xpath("//select[@name='DateOfBirthYear']");

    private By email = By.xpath("//input[@id='Email']");

    private By comapnyname = By.xpath("//input[@id='Company']");

    private By password = By.xpath("//input[@id='Password']");

    private By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");

    private By registrationbutton = By.xpath("//button[@id='register-button']");

    private By firstnameEmptyError = By.xpath("//span[@id='FirstName-error']");

    private By LastnameEmptyEror = By.xpath("//span[@id='LastName-error']");

    private By EmailemptyError = By.xpath("//span[@id='Email-error']");

    private By PasswordEmptyError = By.xpath("//span[@id='Password-error']");

    private By PasswordDoNotMatch = By.xpath("//span[contains(text(),'The password and confirmation password do not match')]");


    public void NewRegistrationCustomer() {
        driver.findElement(Registration).click();
    }

    public void selectGender() {
        driver.findElement(Gender).click();
    }

    public void selectGenderFemale() {
        driver.findElement(GenderFemale).click();
    }
    public void EnterFirstName() {
        driver.findElement(firstname).sendKeys("testabc");
    }

    public void Enterlastname() {
        driver.findElement(lastname).sendKeys("testing");
    }

    public void setDate() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(date));
        WebElement dropcountry = driver.findElement(date);
        Select dropcountrys = new Select(dropcountry);
        dropcountrys.selectByVisibleText("12");
    }

    public void setMonth() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(month));
        WebElement dropdownformonth = driver.findElement(month);
        Select dropdownformonths = new Select(dropdownformonth);
        dropdownformonths.selectByIndex(3);
    }

    public void setYear() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(year));
        WebElement dropdownforyear = driver.findElement(year);
        Select dropdownforyears = new Select(dropdownforyear);
        dropdownforyears.selectByIndex(15);
    }

    public void EnterEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        driver.findElement(email).sendKeys("testing1104@mailinator.com");
    }

    public void EnterPasword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys("Test@1234");
    }

    public void EnterConfirmPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPassword));
        driver.findElement(ConfirmPassword).sendKeys("Test@1234");
    }

    public void Clickonregistrationbutton() {
        driver.findElement(registrationbutton).click();
    }

    public String firstNameEmpty() {
        return driver.findElement(firstnameEmptyError).getText();
    }

    public String lastNameEmpty() {
        return driver.findElement(LastnameEmptyEror).getText();
    }

    public String EmailFiledEmpty() {
        return driver.findElement(EmailemptyError).getText();
    }

    public String PasswordEmpty() {
        return driver.findElement(PasswordEmptyError).getText();
    }

    public String PasswordNotMatch() {
        return driver.findElement(PasswordDoNotMatch).getText();
    }

    public void EnterConfirmPasswordNotMatch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPassword));
        driver.findElement(ConfirmPassword).sendKeys("Test@123467");
    }
    public boolean GenderSelected() {
        driver.findElement(Gender).click();
      return driver.findElement(Gender).isSelected();
    }

}

