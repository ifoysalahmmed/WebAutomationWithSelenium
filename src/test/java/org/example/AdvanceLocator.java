package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AdvanceLocator extends DriverSetup {
    @Test
    public void testAdvanceLocator () throws InterruptedException {
        driver.get ("https://www.google.com");

        /*WebElement title = driver.findElement (By.cssSelector ("textarea"));
        title.sendKeys ("Hello Foysal");
        Thread.sleep (2500);*/

        /*title = driver.findElement (By.xpath ("//textarea"));
        title.clear ();
        Thread.sleep (2000);*/

        /*String value = driver.findElement (By.cssSelector (".gNO89b")).getAttribute ("value");
        System.out.println (value);*/

        /*title = driver.findElement (By.cssSelector ("#APjFqb"));
        title.sendKeys ("Hello Foysal");
        Thread.sleep (2500);*/

        /*System.out.println (driver.findElement (By.cssSelector ("div[class='KxwPGc SSwjIe'] > div > " + "a[href" +
                "='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1" +
                "']")).getText ());*/
        /*System.out.println (driver.findElement (By.xpath ("//div[@class='KxwPGc SSwjIe']/div / " + "a[@href" +
                "='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1" +
                "']")).getText ());*/

        // using and for joining
        /*System.out.println (driver.findElement (By.cssSelector ("div[class='KxwPGc SSwjIe'] > div > " + "a[class" +
                "='pHiOh'][href" + "='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign" +
                "=hp-footer&fg=1" + "']")).getText ());*/
        /*System.out.println (driver.findElement (By.xpath ("//div[@class='KxwPGc SSwjIe']/div / " + "a[@class='pHiOh' "
                + "and @href" + "='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp" +
                "-footer&fg=1" + "']")).getText ());*/

        // using starts-with
        /*System.out.println (driver.findElement (By.cssSelector ("div[class^='KxwPGc'] > div > " + "a[class" +
                "='pHiOh'][href" + "='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign" +
                "=hp-footer&fg=1" + "']")).getText ());*/
        /*System.out.println (driver.findElement (By.xpath ("//div[starts-with(@class,'KxwPGc')]/div / " +
        "a[@class='pHiOh' "
                + "and @href" + "='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp" +
                "-footer&fg=1" + "']")).getText ());*/

        // using contains~
       /* System.out.println (driver.findElement (By.cssSelector ("div[class*='KxwPGc'] > div > " + "a[class" +
                "='pHiOh'][href" + "='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign" +
                "=hp-footer&fg=1" + "']")).getText ());*/
        /*System.out.println (driver.findElement (By.xpath ("//div[contains(@class,'KxwPGc')]/div / " + "a[@class" +
                "='pHiOh' " + "and @href" + "='https://about.google/?utm_source=google-BD&utm_medium=referral" +
                "&utm_campaign=hp" + "-footer&fg=1" + "']")).getText ());*/


        // //table[@id="product"]/tbody/tr/th

        driver.get ("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println (driver.findElement (By.cssSelector ("tr > th:nth-child(4)")).getText ());
        System.out.println (driver.findElement (By.xpath ("//tr/th[3]")).getText ());

        System.out.println (driver.findElement (By.cssSelector ("tr > th:first-child")).getText ());
        System.out.println (driver.findElement (By.xpath ("//tr/th[1]")).getText ());

        System.out.println (driver.findElement (By.cssSelector ("tr > th:last-child")).getText ());
        System.out.println (driver.findElement (By.xpath ("//tr/th[last()]")).getText ());


        Thread.sleep (2500);
    }
}