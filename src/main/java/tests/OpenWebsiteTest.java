package tests;

import MyRunner.TestRunner;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OpenWebsiteTest {


    @Given("I Open website (.*)$")
    public void openWebsite(String website) {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();

    }



}
