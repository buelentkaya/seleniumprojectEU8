package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method is running now.......");


    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After Method is running now.......");
    }
    @BeforeClass
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");

    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }

    @Test (priority=1)
    public void test1() {
        System.out.println("Test 1 is running now.......");
        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);

    }


    @Test (priority=2)// written to let it work in which place.
    public void test2() {
        System.out.println("Test 2 is running now.......");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected), "your message will go here");

    }


}
