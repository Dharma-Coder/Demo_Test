package TestCases;

import Base.BaseTest;
import Base.BaseTestThree;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orgexamples.LoginDemo;

import static Base.BaseTestTwo.driver;

public class LoginDemoTest extends BaseTestThree {

    private LoginDemo loginDemo;

    @BeforeMethod(description = "This is the login test cases")
    public void LoginSetupTest() {
        super.setup();
        loginDemo = new LoginDemo(driver);
    }

    @Test(description = "Verify the login page", priority = 0)
    public void VerifyLogin() {
        loginDemo.Loginfunctionality();
        if (loginDemo.loginSuccessfullypage()) {
            System.out.println("Welcome To Manager's Page of Guru99 Banks");
        } else {
            System.out.println("Unable to Login to DashboardPage");

        }

    }
}