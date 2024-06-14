package TestCases;

import Base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orgexamples.LoginPage;


public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod(description ="This is the login test cases")
    public void LoginSetupTest(){
       super.setup();
        loginPage =new LoginPage(driver);
    }

    @Test(description ="Verify the login page",priority = 0)
    public void VerifyLogin(){
        loginPage.testcases();
        loginPage.loginsucessfully();
    }

    @AfterMethod()
    public void clearTests() {
        driver.quit();
    }
}
