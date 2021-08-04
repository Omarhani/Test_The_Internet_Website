package DropDown;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDownTests extends BaseTests {
        @Test
        public void testSelectFromDropDownList(){
            var dropdownPage = homePage.clickDropdownLink();
            dropdownPage.selectDropdownList("Option 1");
            assertEquals(dropdownPage.getDropdownElementOfList(),"Option 1");
        }
}
