package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicLoadingPage {

    private WebDriver driver;
    private By linkExample1 = By.linkText("Example 1: Element on page that is hidden");
    private By startButton = By.cssSelector("#start button");
    private By loadingBar = By.id("loading");
    private By stringElement = By.cssSelector("#finish h4");

    public dynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLink (){
        driver.findElement(linkExample1).click();
    }
    public void clickOnStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver ,5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));
    }
    public String getText(){
        return driver.findElement(stringElement).getText();
    }


}
