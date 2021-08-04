package Uploads;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadFileTest extends BaseTests {

    @Test
    public void testUploadFile(){
        var uploadFilePage = homePage.clickUploadFile();
        String file = "D:\\demo\\demoTAU\\demoTAU4\\webdriver_java2\\resources\\Screenshot.png";
        uploadFilePage.uploadFile(file);

        assertEquals(uploadFilePage.getFileUploadedName(),"Screenshot.png");
    }
}
