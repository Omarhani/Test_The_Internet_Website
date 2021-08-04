package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class horizontalSliderPage {

    private WebDriver driver;


    private By slider = By.xpath("//input[@type='range']");
    private By checkNumberOfSlider = By.xpath("//span[@id='range']");

    public horizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider(){
        for(int i = 0 ;i<8;i++){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
//        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,
//                Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT);

    }
    public String checkSliderNumber(){
        return driver.findElement(checkNumberOfSlider).getText();
    }

}
