package tests;

import Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import MyRunner.*;
import org.openqa.selenium.support.PageFactory;


public class loginTest extends TestRunner {

    private static LoginPage loginPage;


    @Given("Open website (.*)$")
    public void openWebsite(String website) {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();

    }

    @When("^I select username (.*)$")
    public void i_select_username_Harry_Potter(String userSelect) throws Throwable {
        getLoginPage().chooseYourName(userSelect);
    }



    @When("^I click Login$")
    public void i_click_Login() throws Throwable {
        getLoginPage().clickLogBtn();
        Thread.sleep(3000);
        throw new PendingException();

    }

    @Then("^I verify Harry Potter is selected$")
    public void i_verify_Harry_Potter_is_selected() throws Throwable {
        getLoginPage().checkAccount();
        throw new PendingException();
    }

    public static LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        }
        return loginPage;
    }


}