package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  {

        private WebDriver driver;

        public HomePage(WebDriver driver){
            this.driver = driver;
        }

        public LoginPage clickFormAuthenticationLink(){
            setLinks("Form Authentication").click();
            return new LoginPage(driver);
        }
        public DropdownPage clickDropdownLink(){
            setLinks("Dropdown").click();
            return new DropdownPage(driver);
        }
        public HoversPage clickHoversLink(){
            setLinks("Hovers").click();
            return new HoversPage(driver);
        }
        public keyPressesPage clickKeyPressesLink(){
            setLinks("Key Presses").click();
            return new keyPressesPage(driver);
        }
        public horizontalSliderPage clickSliderLink(){
            setLinks("Horizontal Slider").click();
            return new horizontalSliderPage(driver);
        }
        public javaScriptAlertPage clickAlertLink(){
            setLinks("JavaScript Alerts").click();
            return new javaScriptAlertPage(driver);
        }
        public uploadFilePage clickUploadFile(){
            setLinks("File Upload").click();
            return new uploadFilePage (driver);
        }
        public dynamicLoadingPage clickDynamicLoading(){
            setLinks("Dynamic Loading").click();
            return new dynamicLoadingPage(driver);
        }
        public largeAndDeepPage clickLargeAndDeep(){
            setLinks("Large & Deep DOM").click();
            return new largeAndDeepPage(driver);
        }
        private WebElement setLinks(String link){
            return driver.findElement(By.linkText(link));
        }
}
