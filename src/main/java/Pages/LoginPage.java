package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;

public class LoginPage {

    private WebDriver driver;

    @FindBy (xpath = "//div[2]/div/form/button")
    WebElement loginBtn;

    @FindBy (xpath = "//div[2]/div/div[1]/strong/span")
    WebElement account;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseYourName(String userSelect){
        List<WebElement> listCustomerYourName = driver.findElements(By.tagName("option"));
        for(WebElement e : listCustomerYourName){
            if (e.getText().equalsIgnoreCase(userSelect)){
                e.click();
                break;
            }
        }
    }

    public void clickLogBtn() throws InterruptedException {
        Thread.sleep(3000);
        loginBtn.click();
        System.out.println("click success");
    }


    public boolean checkAccount() {
        try {
            driver.findElement(By.xpath("//div[3]/div/div[1]/button[2]"));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

}

