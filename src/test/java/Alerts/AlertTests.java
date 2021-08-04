package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {


    @Test
    public void  testAlert(){
        var javaScriptAlert =homePage.clickAlertLink();
        javaScriptAlert.clickAlertButton();
        javaScriptAlert.alert_acceptAlert();
        assertEquals(javaScriptAlert.getMassage(),"You successfully clicked an alert");
    }
    @Test
    public void testConfirm(){
        var javaScriptAlert = homePage.clickAlertLink();
        javaScriptAlert.clickConfirmButton();
        javaScriptAlert.alert_dismissAlert();
        assertEquals(javaScriptAlert.getMassage(),"You clicked: Cancel");
    }
    @Test
    public void testPrompt(){
        var javaScriptALert = homePage.clickAlertLink();
        javaScriptALert.clickPromptButton();
        String text = "TAU Course!";
        javaScriptALert.alert_sendKeysAlert(text);
        javaScriptALert.alert_acceptAlert();
        assertEquals(javaScriptALert.getMassage(),"You entered: TAU Course!");
    }

}
