package org.example;

import org.testng.annotations.Test;

public class ManageBrowser extends DriverSetup {

    @Test
    public void testBrowser() throws InterruptedException {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title + " : " + url);
        Thread.sleep(2000);

//        example of navigating another url
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        title = driver.getTitle();
//        url = driver.getCurrentUrl();
//        System.out.println(title + " : " + url);
//        Thread.sleep(2000);

//        example of navigating another url (another way)
//        driver.navigate().to("https://www.facebook.com/");
//        title = driver.getTitle();
//        url = driver.getCurrentUrl();
//        System.out.println(title + " : " + url);
//        Thread.sleep(2000);

//        example of navigating to previous url
//        driver.navigate().back();
//        title = driver.getTitle();
//        url = driver.getCurrentUrl();
//        System.out.println(title + " : " + url);
//        Thread.sleep(2000);

//        example of navigating to forward url
//        driver.navigate().forward();
//        title = driver.getTitle();
//        url = driver.getCurrentUrl();
//        System.out.println(title + " : " + url);
//        Thread.sleep(2000);

//        example of reload current url
//        driver.navigate().refresh();
//        title = driver.getTitle();
//        url = driver.getCurrentUrl();
//        System.out.println(title + " : " + url);
//        Thread.sleep(2000);

//        example of opening new tab
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.navigate().to("https://www.amazon.com/");
//        title = driver.getTitle();
//        url = driver.getCurrentUrl();
//        System.out.println(title + " : " + url);
//        Thread.sleep(2000);

//        example of opening new window
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.navigate().to("https://www.amazon.com/");
//        title = driver.getTitle();
//        url = driver.getCurrentUrl();
//        System.out.println(title + " : " + url);
//        Thread.sleep(2000);

//        example of maximize a window
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        title = driver.getTitle();
        url = driver.getCurrentUrl();
        System.out.println(title + " : " + url);
        Thread.sleep(2000);

//        example of maximize a window
        driver.manage().window().minimize();
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        Thread.sleep(2000);
    }
}
