package Waits;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class waitTests extends BaseTests {

    @Test
    public void explicitWaitTest(){
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        dynamicLoadingPage.clickOnLink();
        dynamicLoadingPage.clickOnStartButton();
        assertEquals(dynamicLoadingPage.getText(),"Hello World!");
    }
}
