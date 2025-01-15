package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleActionItems extends DriverSetup {

    @Test
    public void testDifferentActions () throws InterruptedException {
        driver.get ("https://rahulshettyacademy.com/AutomationPractice/");

        Actions action = new Actions (driver);
        action.scrollByAmount (0, 1000).build ().perform ();
        // action.scrollToElement (driver.findElement (By.xpath ("//legend[normalize-space()='Mouse Hover Example']")
        // )).build ().perform ();
        Thread.sleep (2000);
        action.clickAndHold (driver.findElement (By.xpath ("//button[@id='mousehover']"))).build ().perform ();
        Thread.sleep (2000);
        action.click (driver.findElement (By.xpath ("//a[normalize-space()='Top']"))).build ().perform ();
        Thread.sleep (2000);

        action.sendKeys (driver.findElement (By.xpath ("//input[@id='autocomplete']")), "Bangladesh").build ().perform ();
        Thread.sleep (2000);

        action.keyDown (Keys.CONTROL).sendKeys ("A").build ().perform ();
        Thread.sleep (2000);
        action.keyDown (Keys.CONTROL).sendKeys ("X").build ().perform ();
        Thread.sleep (2000);
        action.click (driver.findElement (By.xpath ("//input[@id='name']"))).keyDown (Keys.CONTROL).sendKeys ("V").build ().perform ();
        Thread.sleep (2000);
    }
}