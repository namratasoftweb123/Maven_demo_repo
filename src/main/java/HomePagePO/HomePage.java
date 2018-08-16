package HomePagePO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {


    public WebDriver driver;

    public HomePage() {

    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // ******************** Locators

    By logoImg = By.xpath("//img[@id='logo-img-home']");

    // ********************* Methods

    public boolean verifyLogoAtHomePage()

    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(logoImg));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(logoImg)));
        WebElement logo = driver.findElement(logoImg);
        if(logo.isDisplayed())
        {
            return true;
        }
        else return false;
    }
}
