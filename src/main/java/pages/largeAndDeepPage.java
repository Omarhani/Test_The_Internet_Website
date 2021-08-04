package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class largeAndDeepPage {

    private WebDriver driver;
    private By largeTable = By.id("large-table");

    public largeAndDeepPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollIntoTable(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(largeTable));
    }

}
