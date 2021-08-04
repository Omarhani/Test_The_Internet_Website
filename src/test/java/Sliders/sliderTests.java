package Sliders;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class sliderTests extends BaseTests {

    @Test public void testSlider(){
        var horizontalSliderPage = homePage.clickSliderLink();
        horizontalSliderPage.moveSlider();
        assertEquals(horizontalSliderPage.checkSliderNumber(),"4");
    }
}
