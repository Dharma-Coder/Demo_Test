package TestCases;

import Base.Baseopencart;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import orgexamples.ComputerPage;

public class Computer extends Baseopencart {

    private ComputerPage ComputerPage;

    @BeforeMethod(description = "This is the login test cases")
    public void setComputers() {
        super.setup();
        ComputerPage = new ComputerPage(driver);
    }

    @Test(description = "Verify the Computer page", priority = 0)
    public void VerifyComputerPage() {
        ComputerPage.ClickOnComputer();
        String url = ComputerPage.getNextTabUrl();
        if (!url.contains("computers")) {
            Assert.fail();
        }
    }
    @Test(description = "Verify the desktops page", priority = 0)
    public void VerifyDesktopsPage() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnDesktops();
        String url = ComputerPage.getNextTabUrl();
        if (!url.contains("desktops")){
            Assert.fail();

        }
    }
    @Test(description = "Verify the Notebooks page", priority = 0)
    public void VerifyNotebooksPage() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnNotebooks();
        String url = ComputerPage.getNextTabUrl();
        if (!url.contains("notebooks")){
            Assert.fail();
        }
    }
    @Test(description = "Verify the Software page", priority = 0)
    public void VerifySoftware() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnSoftware();
        String url = ComputerPage.getNextTabUrl();
        if (!url.contains("software")){
            Assert.fail();
        }
    }

    @Test(description = "Verify the Dropdown Option", priority = 0)
    public void VerifySelectDropdownOption() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnDesktops();
        String[] valuesToTest = {"10", "5", "6", "11", "15"};
        for (String value : valuesToTest) {
            ComputerPage.Position(value);
        }
    }
    @Test(description = "Verify the Display Size", priority = 0)
    public void VerifyDisplaySize() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnDesktops();
        String[] valuesToTest = {"3", "6", "9"};
        for (String value : valuesToTest) {
            ComputerPage.Display(value);
        }
    }
    @Test(description = "Verify the GridButton", priority = 0)
    public void VerifyGridButton() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnDesktops();
        ComputerPage.ClickOnViewListButton();
        ComputerPage.ClickOnViewGridButton();
        String url = ComputerPage.getNextTabUrl();
        if (!url.contains("viewmode=grid")) {
            Assert.fail("The URL does not contain 'viewmode=grid'. Actual URL: " + url);
        }
    }
    @Test(description = "Verify the GridButton", priority = 0)
    public void VerifyListButton() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnDesktops();
        ComputerPage.ClickOnViewListButton();
        String url = ComputerPage.getNextTabUrl();
        if (!url.contains("viewmode=list")) {
            Assert.fail("The URL does not contain 'viewmode=list'. Actual URL: " + url);
        }
    }
    @Test(description = "Verify the AddButton", priority = 0)
    public void VerifyADDButtonOne() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnDesktops();
        if (!ComputerPage.clickAddButtons(1)) {
            Assert.fail();
        }

    }
    @Test(description = "Verify the AddButton", priority = 0)
    public void VerifyADDButtonTWo() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnDesktops();
        if (!ComputerPage.clickAddButtons(2)) {
            Assert.fail();
       }

    }
    @Test(description = "Verify the AddButton", priority = 0)
    public void VerifyADDButtonThree() {
        ComputerPage.ClickOnComputer();
        ComputerPage.ClickOnDesktops();
        if (!ComputerPage.clickAddButtons(3)) {
            Assert.fail();
        }
    }
}