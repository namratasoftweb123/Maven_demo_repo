package HomePageTC;

import CommonPO.BaseTest;
import HomePagePO.HomePage;
import SignInTC.SignInTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class HomePageTest extends BaseTest
    {

        public HomePageTest() {

        }

        public HomePageTest(WebDriver driver) {

            this.driver = driver;
        }

        @Test
        public void verifyLogoOfHomePage() throws Exception {

            SignInTest signInTest = new SignInTest(driver);
            signInTest.SignInTest();
            HomePage homePage = new HomePage(driver);
            Assert.assertTrue(homePage.verifyLogoAtHomePage(), "Unable to verify home page");
        }
    }

