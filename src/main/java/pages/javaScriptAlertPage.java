package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class javaScriptAlertPage {

    private WebDriver driver;
    private By alertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By confirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By promptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By result = By.id("result");


    public javaScriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertButton (){
        driver.findElement(alertButton).click();
    }
    public void clickConfirmButton(){
        driver.findElement(confirmButton).click();
    }
    public void clickPromptButton(){
        driver.findElement(promptButton).click();
    }
    public void alert_acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void alert_dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void alert_sendKeysAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getMassage(){
        return driver.findElement(result).getText();
    }
}
