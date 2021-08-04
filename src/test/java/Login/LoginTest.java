package Login;

import Base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {

        @Test
        public void testSuccessfulLogin(){
            LoginPage loginPage = homePage.clickFormAuthenticationLink();
            loginPage.setUsername("tomsmith");
            loginPage.serPassword("SuperSecretPassword!");
            SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
            assertTrue(secureAreaPage.getAlertMassage().contains("You logged into a secure area!"));
        }
}
