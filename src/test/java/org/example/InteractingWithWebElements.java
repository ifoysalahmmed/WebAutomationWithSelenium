package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class InteractingWithWebElements extends DriverSetup {

    @Test
    public void testWebElements () throws InterruptedException {
        driver.get ("https://rahulshettyacademy.com/AutomationPractice/");

        /*
         // Suggession Class Example
         WebElement inputText = driver.findElement (By.xpath ("//input[@id='autocomplete']"));
         inputText.sendKeys ("Automation");
         Thread.sleep (2500);
         inputText.clear ();~
         Thread.sleep (2500);
         String placeholderText = inputText.getAttribute ("placeholder");
         Assert.assertEquals (placeholderText, "Type to Select Countries");
        */

        /*
        // Radio Button Example
        WebElement radioButton1 = driver.findElement (By.xpath ("//input[@value='radio1']"));
        radioButton1.click ();
        Boolean radioButton1Selected = radioButton1.isSelected ();
        System.out.println (radioButton1Selected);
        Thread.sleep (2500);

        driver.findElement (By.xpath ("//input[@value='radio2']")).click ();
        radioButton1Selected = radioButton1.isSelected ();
        System.out.println (radioButton1Selected);
        Thread.sleep (2500);
        */

        /*
        // Element Displayed Example
        Boolean displayState = driver.findElement (By.xpath ("//input[@id='displayed-text']")).isDisplayed ();
        System.out.println ("Before hide: " + displayState);
        driver.findElement (By.xpath ("//input[@id='hide-textbox']")).click ();
        Thread.sleep (2500);
        displayState = driver.findElement (By.xpath ("//input[@id='displayed-text']")).isDisplayed ();
        System.out.println ("After hide: " + displayState);
        */

        /*
        // Check for enabled or disabled
        Boolean state = driver.findElement (By.xpath ("//a[@id='opentab']")).isEnabled ();
        System.out.println (state);
        Assert.assertTrue (state);
        Thread.sleep (2500);
        */

        String backgroundColor = driver.findElement (By.xpath ("//a[@id='opentab']")).getCssValue ("background-color");
        System.out.println (backgroundColor);

        List<WebElement> courses = driver.findElements (By.xpath ("//table[@name='courses'] //td[2]"));

        int count = 0;

        for (WebElement course : courses) {
            count++;
            System.out.println (course.getText ());
        }

        System.out.println ("Total number of courses: " + count);
    }
}