package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdvanceLocators extends DriverSetup {

    @Test
    public void testAdvanceLocator() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement title = driver.findElement(By.cssSelector("textarea"));
//        System.out.println(title.getText());
        title.sendKeys("ADDED CSS SELECTOR");
        Thread.sleep(2000);
        title = driver.findElement(By.xpath("//textarea"));
        title.clear();
        Thread.sleep(2000);

        String value = driver.findElement(By.cssSelector(".gNO89b")).getAttribute("value");
        System.out.println(value);

        title = driver.findElement(By.cssSelector("#APjFqb"));
        title.sendKeys("ID AS A CSS SELECTOR");
        Thread.sleep(1000);

        System.out.println(driver.findElement(By.cssSelector("div[class=\"KxwPGc SSwjIe\"] > div > a[href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class=\"KxwPGc SSwjIe\"]/div/a[@href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText());

//        with multiple attribute (cssSelector)
        System.out.println(driver.findElement(By.cssSelector("div[class=\"KxwPGc SSwjIe\"] > div > a[class=\"pHiOh\"][href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText());

//        with multiple attribute (xpath)
        System.out.println(driver.findElement(By.xpath("//div[@class=\"KxwPGc SSwjIe\"]/div/a[@class=\"pHiOh\" and @href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText());

//        starts with
        System.out.println(driver.findElement(By.cssSelector("div[class^=\"KxwPGc SSwj\"] > div > a[class=\"pHiOh\"][href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[starts-with(@class, \"KxwPGc SSw\")]/div/a[@class=\"pHiOh\" and @href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText());

//        contains
        System.out.println(driver.findElement(By.cssSelector("div[class *=\"xwPGc SSwj\"] > div > a[class=\"pHiOh\"][href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[contains(@class, \"xwPGc SSw\")]/div/a[@class=\"pHiOh\" and @href=\"https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1\"]")).getText());

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//        using cssSelector
//        if you do not know the last child number
        System.out.println(driver.findElement(By.cssSelector("table[id=\"product\"] > tbody > tr > th:last-child")).getText());
//        if you know child number
        System.out.println(driver.findElement(By.cssSelector("table[id=\"product\"] > tbody > tr > th:nth-child(3)")).getText());

//        using xpath
        System.out.println(driver.findElement(By.xpath("//table[@id=\"product\"]/thead/tr/th[4]")).getText());

//        using preceding & following sibling
        System.out.println(driver.findElement(By.xpath("//tr/th[text()=\"Price\"]/preceding-sibling::th[last()]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr/th[text()=\"City\"]/following-sibling::th[last()]")).getText());
        System.out.println(driver.findElement(By.xpath("//tr/th[text()=\"Name\"]/following-sibling::th[2]")).getText());
    }

}
