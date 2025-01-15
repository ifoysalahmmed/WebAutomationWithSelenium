package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDifferentAlerts extends DriverSetup {

    @Test
    public void testAlert () throws InterruptedException {
        driver.get ("https://the-internet.herokuapp.com/javascript_alerts");

        By alertButton = By.xpath ("//button[@onclick='jsAlert()']");
        By confirmButton = By.xpath ("//button[@onclick='jsConfirm()']");
        By promptAlertButton = By.xpath ("//button[@onclick='jsPrompt()']");
        By resultText = By.xpath ("//p[@id='result']");

        Thread.sleep (2500);
        driver.findElement (alertButton).click ();
        Alert alert = driver.switchTo ().alert ();
        String alertText = alert.getText ();
        System.out.println (alertText);
        Thread.sleep (2500);
        alert.accept ();
        Assert.assertEquals (driver.findElement (resultText).getText (), "You successfully clicked an alert");
        Thread.sleep (2500);

        driver.findElement (confirmButton).click ();
        alert = driver.switchTo ().alert ();
        alertText = alert.getText ();
        System.out.println (alertText);
        Thread.sleep (2500);
        alert.dismiss ();
        Assert.assertEquals (driver.findElement (resultText).getText (), "You clicked: Cancel");
        Thread.sleep (2500);
        driver.findElement (confirmButton).click ();
        alert = driver.switchTo ().alert ();
        Thread.sleep (2500);
        alert.accept ();
        Assert.assertEquals (driver.findElement (resultText).getText (), "You clicked: Ok");

        Thread.sleep (2500);
        driver.findElement (promptAlertButton).click ();
        alert = driver.switchTo ().alert ();
        alertText = alert.getText ();
        System.out.println (alertText);
        alert.sendKeys ("Automation");
        Thread.sleep (2500);
        alert.accept ();
        Assert.assertEquals (driver.findElement (resultText).getText (), "You entered: Automation");
        Thread.sleep (2500);
    }
}