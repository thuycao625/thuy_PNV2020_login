package tests;

import Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import MyRunner.*;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;
import static tests.providerTest.getLoginPage;


public class loginTest extends TestRunner {



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
    public void i_click_Login() throws Exception {
        getLoginPage().clickLogBtn();
    }

    @Then("^I verify Harry Potter is selected$")
    public void i_verify_Harry_Potter_is_selected() throws Exception {
        sleep(5000);
        getLoginPage().checkAccount();
     
    }




}