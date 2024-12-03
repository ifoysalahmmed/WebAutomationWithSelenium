package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDifferentAlerts extends DriverSetup {
    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        By alertButton = By.xpath("//button[normalize-space()='Click for JS Alert']");
        By confirmAlertButton = By.xpath("//button[normalize-space()='Click for JS Confirm']");
        By promptAlertButton = By.xpath("//button[normalize-space()='Click for JS Prompt']");
        By alertMessage = By.xpath("//p[@id='result']");

        driver.findElement(alertButton).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
        Assert.assertEquals(driver.findElement(alertMessage).getText(), "You successfully clicked an alert");

        Thread.sleep(3000);

        driver.findElement(confirmAlertButton).click();
        alert = driver.switchTo().alert();
        alertText = alert.getText();
        System.out.println(alertText);
        alert.dismiss();
        Assert.assertEquals(driver.findElement(alertMessage).getText(), "You clicked: Cancel");

        Thread.sleep(3000);

        driver.findElement(promptAlertButton).click();
        alert = driver.switchTo().alert();
        alertText = alert.getText();
        System.out.println(alertText);
        alert.sendKeys("Automation");
        alert.accept();
        Assert.assertEquals(driver.findElement(alertMessage).getText(), "You entered: Automation");

        Thread.sleep(3000);
    }
}
