package Scrolls;

import Base.BaseTests;
import org.testng.annotations.Test;

public class ScrollTests extends BaseTests {

    @Test
    public void testScrollDownToTable(){
        homePage.clickLargeAndDeep().scrollIntoTable();

    }
}
