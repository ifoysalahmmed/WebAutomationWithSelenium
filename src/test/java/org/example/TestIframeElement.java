package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestIframeElement extends DriverSetup {
    @Test
    public void testScroll () throws InterruptedException {
        driver.get ("https://rahulshettyacademy.com/AutomationPractice/");

        driver.switchTo ().frame (0);
        String email = driver.findElement (By.xpath ("//*[text()=' contact@rahulshettyacademy.com']")).getText ();
        System.out.println (email);
        Thread.sleep (3000);

//        driver.switchTo ().parentFrame ();

        driver.switchTo ().defaultContent ();
        driver.findElement (By.xpath ("//button[@id='mousehover']"));
    }
}