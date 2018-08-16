package SignInTC;


import CommonPO.BaseTest;
import SignInPO.SignInPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    public SignInTest()
    {

    }
    public SignInTest(WebDriver driver)
    {
        this.driver = driver;
    }

    @Test
    public void SignInTest() throws  Exception
    {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.typeUsername();
        signInPage.typePassword();
        signInPage.clickOnLoginBtn();

    }
}
