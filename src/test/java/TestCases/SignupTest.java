package TestCases;

import Base.BaseTestTwo;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orgexamples.SignupPage;

public class SignupTest extends BaseTestTwo {

    private SignupPage SignupPage;
    @BeforeMethod(description ="This is the login test cases")
    public void Signupsetuptest(){
        super.setup();
        SignupPage = new SignupPage(driver);
    }
    //@Test(description ="Verify the login page",priority = 0)
    public void Verifysignup() throws InterruptedException {
        SignupPage.newsignup();
        SignupPage.signupsucessfully();
    }
    @Test(description ="Verify the withoutpassword",priority = 0)
    public  void Verifywithoutpassword(){
        SignupPage.withoutpassword();
        String str = SignupPage.errormessagewithoutpassword();
        if (!str.equals("This field is required.")) {
            Assert.fail();
            System.out.println("Error : It is continuing with empty phoneNumber field");


    }

   // @AfterMethod()
   // public void cleartests(){
    //    driver.quit();
    }


}
