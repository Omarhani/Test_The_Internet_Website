package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uploadFilePage {

    private WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By uploadButton = By.xpath("//input[@id='file-submit']");
    private By fileUploaded = By.id("uploaded-files");

    public uploadFilePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public void uploadFile(String file){
        driver.findElement(chooseFileButton).sendKeys(file);
        clickUploadButton();
    }
    public String getFileUploadedName(){
        return driver.findElement(fileUploaded).getText();
    }
}
