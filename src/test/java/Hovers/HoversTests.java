package Hovers;

import Base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HoversTests extends BaseTests {

    private WebDriver driver;
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHoversLink();
        hoversPage.hoverOverFigure();
        assertEquals(hoversPage.nameOfUser(),"name: user1");
        assertEquals(hoversPage.InfoOfUser(),"View profile");
    }


}
