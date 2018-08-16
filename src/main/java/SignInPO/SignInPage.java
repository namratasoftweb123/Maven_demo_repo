package SignInPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    public WebDriver driver;

    public SignInPage()
    {

    }

    public SignInPage(WebDriver driver)
    {
        this.driver = driver;
    }

    // ******************** Locators

    By username = By.xpath("//input[@id='Username']");
    By password = By.xpath("//input[@id='Password']");
    By loginBtn = By.xpath("//button[@id='btnSignin']");


    // *****************    methods

    public void typeUsername()
    {
        WebElement username1 = driver.findElement(username);
        username1.sendKeys("Nseth5");

    }

    public void typePassword() {
        WebElement password1 = driver.findElement(password);
        password1.sendKeys("India@2018");

    }

    public void clickOnLoginBtn() {
        WebElement login = driver.findElement(loginBtn);
        login.click();

    }
}
