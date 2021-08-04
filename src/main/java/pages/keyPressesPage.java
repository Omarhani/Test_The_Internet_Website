package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class keyPressesPage {

    private WebDriver driver;
    private By textField = By.id("target");
    private By result = By.id("result");

    public keyPressesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterText(String text){
        driver.findElement(textField).sendKeys(text);
    }
    public String getText(){
        return driver.findElement(result).getText();
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"277") +"=3.14");
    }
}
