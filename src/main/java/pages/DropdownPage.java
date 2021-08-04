package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private WebDriver driver;
    private By dropdownList = By.id("dropdown");
    public Select select ;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectDropdownList(String option){
        select = new Select(dropdownList());
        select.selectByVisibleText(option);
    }
    public String getDropdownElementOfList(){
        return select.getFirstSelectedOption().getText();
    }
    private WebElement dropdownList(){
        return driver.findElement(dropdownList);
    }

}
