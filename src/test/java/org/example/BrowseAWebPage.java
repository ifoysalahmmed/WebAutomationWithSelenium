package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowseAWebPage extends DriverSetup {
    @Test
    public void loadAPage() throws InterruptedException {
        // load URL
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

        driver.findElement(By.id("APjFqb")).sendKeys("Hello");
        driver.findElement(By.name("q")).sendKeys("Hello");
        driver.findElement(By.className("gLFyf")).sendKeys("Hello");
        driver.findElement(By.tagName("textarea")).sendKeys("Hello");
        driver.findElement(By.linkText("About")).click();
        driver.findElement(By.partialLinkText("How")).click();
        driver.findElement(By.cssSelector("textarea[aria-label='Search']")).sendKeys("Hello Foysal");
        driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("Hello Foysal");

        Thread.sleep(5000);
    }
}
