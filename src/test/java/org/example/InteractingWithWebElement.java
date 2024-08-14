package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup {

    @Test
    public void testWebElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//        example of entering text in input field
        WebElement inputTextBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        inputTextBox.sendKeys("Automation");
        Thread.sleep(2000);

//        example of clearing text from input field
        inputTextBox.clear();
        Thread.sleep(2000);

//        example of getting attribute value
        String placeholderText = inputTextBox.getAttribute("placeholder");
        System.out.println(placeholderText);
        Assert.assertEquals(placeholderText, "Type to Select Countries");

//        example of selecting radio button
        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        radioButton1.click();

//        example of getting radio button state
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
        Thread.sleep(2000);
        boolean selectedState = radioButton1.isSelected();
        System.out.println(selectedState);

//        example of getting display state
        boolean displayState = driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("Before Hide: " + displayState);
        driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
        displayState = driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("After Hide: " + selectedState);

//        example of getting state of enabled or not
        boolean state = driver.findElement(By.xpath("//a[@id='opentab']")).isEnabled();
        Assert.assertTrue(state);
//        Assert.assertFalse(state);


//        example of getting css value
        String backgroundColor = driver.findElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color");
        System.out.println(backgroundColor);
    }
}
