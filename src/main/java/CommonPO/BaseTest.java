package CommonPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;


    @BeforeMethod
    public void beforeTest()
    {
        System.out.println("in");
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://saqat.t-mobile.com/sites/RIOT/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void AfterTest()
    {
        System.out.println("out");
        driver.quit();
    }
}
