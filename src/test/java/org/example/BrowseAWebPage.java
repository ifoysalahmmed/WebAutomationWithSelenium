package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowseAWebPage extends DriverSetup {

    @Test
    public void loadAPage() throws InterruptedException {

        // Load URL https://www.google.com
        driver.get("https://www.google.com/");

        // TEST TITLE
        Assert.assertEquals(driver.getTitle(), "Google");
        //TEST URL
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

//        driver.findElement(By.id("APjFqb")).sendKeys("Hello John");
//        driver.findElement(By.name("q")).sendKeys("Hello John");
//        driver.findElement(By.className("gLFyf")).sendKeys("Hello John");
//        driver.findElement(By.tagName("textarea")).sendKeys("Hello John");
//        driver.findElement(By.linkText("About")).click();
//        driver.findElement(By.partialLinkText("How Search")).click();
//        driver.findElement(By.cssSelector("textarea[aria-label='Search']")).sendKeys("Hello John");
        driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("Hello John");

        Thread.sleep(8000);
    }
}
