package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By userOne = By.xpath("//img[@alt='User Avatar']");
    private By valueOfUser = By.tagName("h5");
    private By link = By.linkText("View profile");
    Actions actions;

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }
    public void hoverOverFigure(){
         actions = new Actions(driver);
         actions.moveToElement(driver.findElement(userOne)).build().perform();
    }
    public String nameOfUser(){
        return driver.findElement(valueOfUser).getText();
    }
    public String InfoOfUser(){
        return driver.findElement(link).getText();
    }

}
