package com.cydeo.tests.DAY8_WebTables_Properties;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void javaPropertiesReadingTest(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        //System.getProperty("os.name") = Windows 10
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        //System.getProperty("user.name") = bulen
    }











}
