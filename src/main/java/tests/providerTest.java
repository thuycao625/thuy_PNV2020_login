package tests;

import MyRunner.TestRunner;
import Pages.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class providerTest {
    private static LoginPage loginPage;

    public static LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        }
        return loginPage;
    }
}
