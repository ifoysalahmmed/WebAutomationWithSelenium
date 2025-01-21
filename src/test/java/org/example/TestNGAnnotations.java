package org.example;

import org.testng.annotations.*;

public class TestNGAnnotations {
    @Test(priority = 0)
    public void testCase2 () {
        System.out.println ("Test case 2");
    }

    @Test(priority = 1)
    public void testCase1 () {
        System.out.println ("Test case 1");
    }

    @BeforeMethod
    public void beforeMethod () {
        System.out.println ("This is will execute before method");
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println ("This is will execute after method");
    }

    @BeforeClass
    public void beforeClass () {
        System.out.println ("This is will execute before class");
    }

    @AfterClass
    public void afterClass () {
        System.out.println ("This is will execute after class");
    }

    @BeforeTest
    public void beforeTest () {
        System.out.println ("This is will execute before test");
    }

    @AfterTest
    public void afterTest () {
        System.out.println ("This is will execute after test");
    }

    @BeforeSuite
    public void beforeSuite () {
        System.out.println ("This is will execute before suite");
    }

    @AfterSuite
    public void afterSuite () {
        System.out.println ("This is will execute after suite");
    }
}