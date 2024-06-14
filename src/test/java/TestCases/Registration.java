package TestCases;


import Base.Baseopencart;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orgexamples.NewRegistrationopencart;

public class Registration extends Baseopencart {

    private NewRegistrationopencart NewRegistrationopencart;

    @BeforeMethod(description = "This is the login test cases")
    public void RegistrationSetupTest() {
        super.setup();
        NewRegistrationopencart = new NewRegistrationopencart (driver);
    }

    @Test(description = "Verify the login page", priority = 0)
    public void VerifyNewRegistration() {
        NewRegistrationopencart.NewRegistrationCustomer();
        NewRegistrationopencart.selectGender();
        NewRegistrationopencart.EnterFirstName();
        NewRegistrationopencart.Enterlastname();
        NewRegistrationopencart.setDate();
        NewRegistrationopencart.setMonth();
        NewRegistrationopencart.setYear();
        NewRegistrationopencart.EnterEmail();
        NewRegistrationopencart.EnterPasword();
        NewRegistrationopencart.EnterConfirmPassword();
    }

    @Test(description = "Test:creating Account Without First Name")
    public void LeaveFirstName() throws InterruptedException {
        NewRegistrationopencart.NewRegistrationCustomer();
        NewRegistrationopencart.selectGender();
        NewRegistrationopencart.Enterlastname();
        NewRegistrationopencart.setDate();
        NewRegistrationopencart.setMonth();
        NewRegistrationopencart.setYear();
        NewRegistrationopencart.EnterEmail();
        NewRegistrationopencart.EnterPasword();
        NewRegistrationopencart.EnterConfirmPassword();
        NewRegistrationopencart.Clickonregistrationbutton();
        String str = NewRegistrationopencart.firstNameEmpty();
        if (!str.equals("First name is required.")) {
            Assert.fail();
            System.out.println("Error : It is continuing with empty first name field");
        }
    }

    @Test(description = "Test:creating Account Without Last Name")
    public void LasttName() throws InterruptedException {
        NewRegistrationopencart.NewRegistrationCustomer();
        NewRegistrationopencart.selectGender();
        NewRegistrationopencart.EnterFirstName();
        NewRegistrationopencart.setDate();
        NewRegistrationopencart.setMonth();
        NewRegistrationopencart.setYear();
        NewRegistrationopencart.EnterEmail();
        NewRegistrationopencart.EnterPasword();
        NewRegistrationopencart.EnterConfirmPassword();
        NewRegistrationopencart.Clickonregistrationbutton();
        String str = NewRegistrationopencart.lastNameEmpty();
        if (!str.equals("Last name is required.")) {
            Assert.fail();
            System.out.println("Error : It is continuing with empty Last name field");
        }
    }

    @Test(description = "Test:creating Account Without Email Name")
    public void leaveEmailFiled() throws InterruptedException {
        NewRegistrationopencart.NewRegistrationCustomer();
        NewRegistrationopencart.selectGender();
        NewRegistrationopencart.EnterFirstName();
        NewRegistrationopencart.Enterlastname();
        NewRegistrationopencart.setDate();
        NewRegistrationopencart.setMonth();
        NewRegistrationopencart.setYear();
        NewRegistrationopencart.EnterPasword();
        NewRegistrationopencart.EnterConfirmPassword();
        NewRegistrationopencart.Clickonregistrationbutton();
        String Str = NewRegistrationopencart.EmailFiledEmpty();
        if (!Str.equals("Email is required.")) {
            Assert.fail();
            System.out.println("Error : It is continuing with empty Last name field");
        }
    }

    @Test(description = "Test:creating Account Without Password Name")
    public void leavePasswordFiled() throws InterruptedException {
        NewRegistrationopencart.NewRegistrationCustomer();
        NewRegistrationopencart.selectGender();
        NewRegistrationopencart.EnterFirstName();
        NewRegistrationopencart.Enterlastname();
        NewRegistrationopencart.setDate();
        NewRegistrationopencart.setMonth();
        NewRegistrationopencart.EnterEmail();
        NewRegistrationopencart.Clickonregistrationbutton();
        String Str = NewRegistrationopencart.PasswordEmpty();
        if (!Str.equals("Password is required.")) {
            Assert.fail();
            System.out.println("Error : It is continuing with empty Last name field");
        }
    }

    @Test(description = "Test:creating Account Without Password Name")
    public void PasswordWithIncorrectRePassword() throws InterruptedException {
        NewRegistrationopencart.NewRegistrationCustomer();
        NewRegistrationopencart.selectGender();
        NewRegistrationopencart.EnterFirstName();
        NewRegistrationopencart.Enterlastname();
        NewRegistrationopencart.setDate();
        NewRegistrationopencart.setMonth();
        NewRegistrationopencart.EnterEmail();
        NewRegistrationopencart.EnterPasword();
        NewRegistrationopencart.EnterConfirmPasswordNotMatch();
        NewRegistrationopencart.Clickonregistrationbutton();
        String Str = NewRegistrationopencart.PasswordNotMatch();
        if (!Str.equals("The password and confirmation password do not match.")) {
            Assert.fail();
            System.out.println("Error : It is continuing with empty Last name field");
        }
    }
    @Test(description = "Verify the login page", priority = 0)
    public void VerifyNewRegistrationFemale() {
        NewRegistrationopencart.NewRegistrationCustomer();
        NewRegistrationopencart.selectGenderFemale();
        NewRegistrationopencart.EnterFirstName();
        NewRegistrationopencart.Enterlastname();
        NewRegistrationopencart.setDate();
        NewRegistrationopencart.setMonth();
        NewRegistrationopencart.setYear();
        NewRegistrationopencart.EnterEmail();
        NewRegistrationopencart.EnterPasword();
        NewRegistrationopencart.EnterConfirmPassword();
    }
    @Test(description = "Verify the login page", priority = 0)
    public void VerifyGenderSelectedOrNot() {
        NewRegistrationopencart.NewRegistrationCustomer();
        boolean isMaleSelected = NewRegistrationopencart.GenderSelected();
        if (isMaleSelected) {
            Assert.assertTrue(isMaleSelected);
        } else {
            Assert.assertFalse(isMaleSelected);
        }
    }
}


