package Keys;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class keyTest extends BaseTests {

    @Test
    public void testBackSpace(){
        var keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getText(),"You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterPi();
    }
}
