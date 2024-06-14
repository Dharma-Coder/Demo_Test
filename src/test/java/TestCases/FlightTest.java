package TestCases;

import Base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import  orgexamples.FlightPage;
import orgexamples.LoginPage;


public class FlightTest extends BaseTest {

    private LoginPage loginPage;
    private FlightPage flightPage;

    @BeforeMethod(description = "This is the login test cases")
    public void FlightBookingTest() {
        super.setup();
        loginPage =new LoginPage(driver);
        loginPage.testcases();
        flightPage =new FlightPage(driver);

    }

    @Test(description = "Verify the FlightBookingTest", priority = 0)
    public void VerifyFlightBookingTest() {
        flightPage.booking();

    }
    }
