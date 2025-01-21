package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentWaits extends DriverSetup {
    @Test
    public void testWait () throws InterruptedException {
        driver.get ("https://qavbox.github.io/demo/delay/");

        driver.findElement (By.xpath ("//input[@name='commit']")).click ();

        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds (10));
        wait.until (ExpectedConditions.textToBePresentInElementLocated (By.xpath ("//h2[@id='two']"), "I am here!"));
        Assert.assertEquals (driver.findElement (By.xpath ("//h2[@id='two']")).getText (), "I am here!");

        driver.findElement (By.xpath ("//input[@name='commit1']")).click ();
        // wait.until (ExpectedConditions.visibilityOfElementLocated (By.xpath ("//h2[@id='delay']")));
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (15));
        System.out.println (driver.findElement (By.xpath ("//h2[@id='delay']")).getText ());
    }
}